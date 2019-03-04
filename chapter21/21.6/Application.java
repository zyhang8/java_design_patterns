public class Application{
   public static void main(String args[]) {
     OperationDatabase operation1=new OperationAccessDatabase("moon","chengjibiao");
     OperationDatabase operation2=new OperationSQLServerDatabase("teacher","wagesTable");
     System.out.println("查询到的记录:");
     operation1.lookResult(); 
     System.out.println("查询到的记录:");
     operation2.lookResult();     
   }
}
