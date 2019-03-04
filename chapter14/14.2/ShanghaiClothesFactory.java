public class ShanghaiClothesFactory extends ClothesFactory {
    public UpperClothes createUpperClothes(int chestSize,int height){
         return new WesternUpperClothes("上海牌牛仔上衣",chestSize,height);
    }
    public Trousers createTrousers(int waistSize,int height){
         return new WesternTrousers("上海牌牛仔裤",waistSize,height);
    }
}
