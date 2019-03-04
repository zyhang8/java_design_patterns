public class Application{
    public static void main(String args[]){
       ClientServerFacade clientFacade;
       String clientAdvertisement="月光电脑，价格6356元，联系电话：1234567";
       clientFacade=new ClientServerFacade(clientAdvertisement);
       clientFacade.doAdvertisement();
   }
}
