import java.sql.Connection;
import java.sql.DriverManager;

public class conexaoBancodeDados{

    public Connection bdLink;
            
    public Connection getConnection(){
        String databaseName = "db_bloquim";
        String databaseUser = "postgres";
        String databasePassword = "9379";
        String url = "jbdc;mysql://localhost/" + databaseName;

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                bdLink=DriverManager.getConnection(url, databaseUser, databasePassword);

            }catch(Exception e){
                e.printStackTrace();
                e.getCause();
            }
        
        return bdLink;
    }
}