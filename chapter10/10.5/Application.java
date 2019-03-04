public class Application{
    public static void main(String args[]){
       ReadAndWriteFacade clientFacade;
       clientFacade=new ReadAndWriteFacade();
       String readFlieName="index.html";
       String delContent="<[^>]*>";
       String savedFlieName="save.txt";
       clientFacade.doOption(readFlieName,delContent,savedFlieName); 
   }
}
