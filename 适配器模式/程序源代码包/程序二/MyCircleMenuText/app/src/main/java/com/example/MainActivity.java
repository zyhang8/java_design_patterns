package com.example;

/**
 * Package: example
 * Created by zyh
 * on 2019/5/26
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CircleMenuLayout circleMenuLayout;
    private String[] mItemTexts = new String[]{ "安全中心 ", "特色服务", "投资理财",
            "转账汇款", "我的账户", "信用卡" };

    private int[] mItemImgs = new int[]{R.mipmap.home_mbank_1_normal,
            R.mipmap.home_mbank_2_normal, R.mipmap.home_mbank_3_normal,
            R.mipmap.home_mbank_4_normal, R.mipmap.home_mbank_5_normal,
            R.mipmap.home_mbank_6_normal };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_cirlceMenu);
        circleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);
        circleMenuLayout.setOnItemclickListener(new CircleMenuLayout.OnMenuItemClickListener() {
            @Override
            public void itemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "选中："+mItemTexts[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void itemCenterClick(View view) {
                Toast.makeText(MainActivity.this, "选中：中间view", Toast.LENGTH_SHORT);
            }
        });
    }
}
