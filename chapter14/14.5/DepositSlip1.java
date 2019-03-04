public class DepositSlip1 implements DepositSlip{
    String clientNumber;
    String clientName;
    int money;
    DepositSlip1(String clientNumber,String clientName,int money){
       this.clientNumber=clientNumber;
       this.clientName=clientName;
       this.money=money;
    }
    public String getBankName(){
       return "中国银行";
    }
    public String getClientName(){
       return clientName;
    }
    public String getClientNumber(){
       return clientNumber;
    }
    public int getAmountOfMoney(){
       return money;
    }
}
