public class ChinaConstructionBank extends Bank{
    public DepositSlip createDepositSlip(String number,String name,int money){
       return new DepositSlip2(number,name,money);
    }
    public Seal createSeal(){
       return new SealTwo();
    }
}