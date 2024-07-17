
package doc;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class ConnectionProvider {
    public static java.sql.Connection getCon(){
        
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_mgtstm ?useSSL=false","root","mysql@@@12345");

            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
            
        }
        
        
    }
    
}
