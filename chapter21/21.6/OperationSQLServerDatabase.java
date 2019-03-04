import java.sql.*;
public class OperationSQLServerDatabase extends OperationDatabase{
    OperationSQLServerDatabase(String dataBase,String tableName){
       super(dataBase,tableName);
    }
    public void loadDriver(){
       try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
       }
       catch(ClassNotFoundException e){
             System.out.println(""+e);
       }
    }
    public void createConnection(){
        try{  
            String uri="jdbc:sqlserver://127.0.0.1:1433;DatabaseName="+dataBase; 
            String user="sa";
            String password="sa";
            con=DriverManager.getConnection(uri,user,password);
        }
        catch(SQLException exp){
            System.out.println(""+exp);
        }
    }
}
