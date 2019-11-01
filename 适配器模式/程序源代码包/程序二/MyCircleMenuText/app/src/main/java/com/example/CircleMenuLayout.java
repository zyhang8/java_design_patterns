package com.example;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Package: example
 * Created by zyh
 * on 2019/5/26
 */

public class CircleMenuLayout extends ViewGroup {

    //变量
    private int mRadius;//直径
    private static final float RADIO_DEFAULT_CHILD_DIMENSION = 1 / 4f;//默认child item尺寸
    private static final float RADIO＿PADDING_LAYOUT = 1 / 12f;  //内边距
    private float mPadding;
    private double mStartAngle = 0;//开始角度

    private String[] mItemTexts;//菜单项文本
    private int[] mItemImgs;//菜单项图片
    private int mMenuItemCount;
    /**
     * MenuItem的点击事件接口
     */
    private OnMenuItemClickListener mOnItemClickListener;
    /**
     * 检测按下到抬起时旋转的角度
     */
    private float mTmpAngle;
    /**
     * 检测按下到抬起时使用的时间
     */
    private long mDownTime;

    /**
     * 判断是否正在自动滚动
     */
    private boolean isFling;

    /**
     * 当每秒移动角度达到该值时，认为是快速移动
     */
    private static final int FLINGABLE_VALUE = 300;
    private int mFlingableValue = FLINGABLE_VALUE;
    /**
     * 如果移动角度达到该值，则屏蔽点击
     */
    private static final int NOCLICK_VALUE = 3;

    private int mMenuItemLayoutId = R.layout.circle_menu_item;

    public CircleMenuLayout(Context context) {
        super(context);
    }

    public CircleMenuLayout(Context context, AttributeSet attrs) {

        super(context, attrs);
        // 无视padding
        setPadding(0, 0, 0, 0);
    }

    public CircleMenuLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CircleMenuLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //测量布局
        measureLayoutView(widthMeasureSpec, heightMeasureSpec);
        //测量子控件
        measureChildViews();
    }

    private void measureLayoutView(int widthMeasureSpec, int heightMeasureSpec) {
        int resWidth = 0;
        int resHeight = 0;

        //根据传入参数，获得测量值和模式
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);

        int height = MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        //是否设置精确值
        if (widthMode != MeasureSpec.EXACTLY || heightMode != MeasureSpec.EXACTLY) {
            resWidth = getSuggestedMinimumWidth();
            resWidth = (resWidth == 0 ? getDefaultWidth() : resWidth);

            resHeight = getSuggestedMinimumHeight();
            resHeight = (resHeight == 0 ? getDefaultWidth() : resHeight);
        } else {
            resWidth = resHeight = Math.min(width, height);
        }
        setMeasuredDimension(resWidth, resHeight);
    }

    /**
     * 获得默认该layout的尺寸
     *
     * @return
     */
    private int getDefaultWidth() {
        WindowManager wm = (WindowManager) getContext().getSystemService(
                Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return Math.min(outMetrics.widthPixels, outMetrics.heightPixels);
    }

    private void measureChildViews() {
        mRadius = Math.max(getMeasuredWidth(), getMeasuredHeight());//获取半径
        final int count = getChildCount();//获取menu item个数
        int childSize = (int) (mRadius * RADIO_DEFAULT_CHILD_DIMENSION);//menu item 尺寸
        int childMode = MeasureSpec.EXACTLY;

        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
            if (child.getVisibility() == GONE) {
                continue;
            }

            //计算menu item 的尺寸，模式，去对item测量
            int makeMeasureSpec = -1;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(childSize, childMode);
            child.measure(makeMeasureSpec, makeMeasureSpec);
        }
        mPadding = RADIO＿PADDING_LAYOUT * mRadius;
    }

    //设置menu item监听
    public interface OnMenuItemClickListener {
        void itemClick(View view, int position);

        void itemCenterClick(View view);
    }

    public void setOnItemclickListener(OnMenuItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    /**
     * 布局view item的位置
     *
     * @param changed
     * @param l
     * @param t
     * @param r
     * @param b
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int layoutRadius = mRadius;
        final int childCount = getChildCount();
        int left, top;
        int itemwidth = (int) (layoutRadius * RADIO_DEFAULT_CHILD_DIMENSION); //item尺寸
        // 根据menu item的个数，计算角度
        float angleDelay = 360 / (getChildCount() - 1);
        //遍历布局item
        for (int i = 0; i < childCount; i++) {
            final View child = getChildAt(i);

            if (child.getId() == R.id.id_circle_menu_item_center)
                continue;

            if (child.getVisibility() == GONE) {
                continue;
            }

            mStartAngle %= 360;//菜单的起始角度

            //中心到menu item的距离
            float distanceeFromCenter = layoutRadius / 2f - itemwidth / 2 - mPadding;
            //left坐标
            left = layoutRadius / 2 + (int) Math.round(distanceeFromCenter * Math.cos(Math.toRadians(mStartAngle)) - 1 / 2f * itemwidth);
            //top坐标
            top = layoutRadius / 2 + (int) Math.round(distanceeFromCenter * Math.sin(Math.toRadians(mStartAngle)) - 1 / 2f * itemwidth);

            //布局 child view
            child.layout(left, top, left + itemwidth, top + itemwidth);
            //
            mStartAngle += angleDelay;
        }

        // 找到中心的view，如果存在设置onclick事件
        final View centerView = findViewById(R.id.id_circle_menu_item_center);
        if (centerView != null) {
            centerView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mOnItemClickListener != null) {
                        mOnItemClickListener.itemCenterClick(v);
                    }
                }
            });

            //设置center item位置
            int cl = layoutRadius / 2 - centerView.getMeasuredWidth() / 2;
            int cr = cl + centerView.getMeasuredWidth();
            centerView.layout(cl, cl, cr, cr);
        }
    }

    /**
     * 设置adpater
     */
//    public void setAdapter(ListAdapter adapter) {
//        this.mAdapter = adapter;
//    }

    /**
     * 设置菜单条目的图标和文本
     *
     * @param resIds
     */
    public void setMenuItemIconsAndTexts(int[] resIds, String[] texts) {
        mItemImgs = resIds;
        mItemTexts = texts;

        // 参数检查
        if (resIds == null && texts == null) {
            throw new IllegalArgumentException("菜单项文本和图片至少设置其一");
        }

        // 初始化mMenuCount
        mMenuItemCount = resIds == null ? texts.length : resIds.length;

        if (resIds != null && texts != null) {
            mMenuItemCount = Math.min(resIds.length, texts.length);
        }

        addMenuItems();

    }


    /**
     * 设置MenuItem的布局文件，必须在setMenuItemIconsAndTexts之前调用
     *
     * @param mMenuItemLayoutId
     */
    public void setMenuItemLayoutId(int mMenuItemLayoutId) {
        this.mMenuItemLayoutId = mMenuItemLayoutId;
    }


    /**
     * 构建菜单项
     */
    private void addMenuItems() {
        LayoutInflater mInflater = LayoutInflater.from(getContext());

        //        // 根据用户的参数，初始化menu item
        //        for (int i = 0; i < mAdapter.getCount(); i++) {
        //            final View itemView = mAdapter.getView(i, null, this);
        //            final int position = i;
        //            itemView.setOnClickListener(new OnClickListener() {
        //                @Override
        //                public void onClick(View v) {
        //                    if (mOnItemClickListener != null) {
        //                        mOnItemClickListener.onClick(itemView, position);
        //                    }
        //                }
        //            });
        //            addView(itemView);
        //
        //        }

        for (int i = 0; i < mMenuItemCount; i++) {
            final int j = i;
            View view = mInflater.inflate(mMenuItemLayoutId, this, false);
            ImageView img = (ImageView) view.findViewById(R.id.id_circle_menu_item_image);
            TextView tv = (TextView) view.findViewById(R.id.id_circle_menu_item_text);
            if (img != null) {
                img.setVisibility(View.VISIBLE);
                img.setImageResource(mItemImgs[i]);
                img.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mOnItemClickListener != null) {
                            mOnItemClickListener.itemClick(v, j);
                        }

                    }
                });
            }
            if (tv != null) {
                tv.setVisibility(View.VISIBLE);
                tv.setText(mItemTexts[i]);
            }
            addView(view);
        }
    }

    /**
     * 设置内边距的比例
     *
     * @param mPadding
     */
    public void setPadding(float mPadding) {
        this.mPadding = mPadding;
    }


    /**
     * 记录上一次的x，y坐标
     */
    private float mLastX;
    private float mLastY;
    /**
     * 自动滚动的Runnable
     */
    private AutoFlingRunnable mFlingRunnable;

    /**
     * 自动滚动的任务
     *
     * @author zhy
     */
    private class AutoFlingRunnable implements Runnable {

        private float angelPerSecond;

        public AutoFlingRunnable(float velocity) {
            this.angelPerSecond = velocity;
        }

        public void run() {
            // 如果小于20,则停止
            if ((int) Math.abs(angelPerSecond) < 20) {
                isFling = false;
                return;
            }
            isFling = true;
            // 不断改变mStartAngle，让其滚动，/30为了避免滚动太快
            mStartAngle += (angelPerSecond / 30);
            // 逐渐减小这个值
            angelPerSecond /= 1.0666F;
            postDelayed(this, 30);
            // 重新布局
            requestLayout();
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mLastX = x;
                mLastY = y;
                mDownTime = System.currentTimeMillis();
                mTmpAngle = 0;
                // 如果当前已经在快速滚动
                if (isFling) {
                    // 移除快速滚动的回调
                    removeCallbacks(mFlingRunnable);
                    isFling = false;
                    return true;
                }


                break;
            case MotionEvent.ACTION_MOVE:
                /**
                 * 获得开始的角度
                 */
                float start = getAngle(mLastX, mLastY);
                /**
                 * 获得当前的角度
                 */
                float end = getAngle(x, y);
                // 如果是一、四象限，则直接end-start，角度值都是正值
                if (getQuadrant(x, y) == 1 || getQuadrant(x, y) == 4) {
                    mStartAngle += end - start;
                    mTmpAngle += end - start;
                } else { // 二、三象限，色角度值是付值
                    mStartAngle += start - end;
                    mTmpAngle += start - end;
                }
                // 重新布局
                requestLayout();
                mLastX = x;
                mLastY = y;

                break;

            case MotionEvent.ACTION_UP:
                // 计算，每秒移动的角度
                float anglePerSecond = mTmpAngle * 1000 / (System.currentTimeMillis() - mDownTime);
                // 如果达到该值认为是快速移动
                if (Math.abs(anglePerSecond) > mFlingableValue && !isFling) {
                    // post一个任务，去自动滚动
                    post(mFlingRunnable = new AutoFlingRunnable(anglePerSecond));

                    return true;
                }
                // 如果当前旋转角度超过NOCLICK_VALUE屏蔽点击
                if (Math.abs(mTmpAngle) > NOCLICK_VALUE) {
                    return true;
                }
                break;
        }

        return super.dispatchTouchEvent(event);
    }

    /**
     * 主要为了action_down时，返回true
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    /**
     * 根据触摸的位置，计算角度
     *
     * @param xTouch
     * @param yTouch
     * @return
     */
    private float getAngle(float xTouch, float yTouch) {
        double x = xTouch - (mRadius / 2d);
        double y = yTouch - (mRadius / 2d);
        return (float) (Math.asin(y / Math.hypot(x, y)) * 180 / Math.PI);
    }

    /**
     * 根据当前位置计算象限
     *
     * @param x
     * @param y
     * @return
     */
    private int getQuadrant(float x, float y) {
        int tmpX = (int) (x - mRadius / 2);
        int tmpY = (int) (y - mRadius / 2);
        if (tmpX >= 0) {
            return tmpY >= 0 ? 4 : 1;
        } else {
            return tmpY >= 0 ? 3 : 2;
        }

    }
}

























