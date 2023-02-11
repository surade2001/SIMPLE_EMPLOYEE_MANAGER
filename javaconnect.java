
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Naim
 */
public class javaconnect {
    Connection conn;
public static java.sql.Connection ConnecrDb(){
  try{
     
     java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
     return conn;
  } catch(Exception e){
      
  }
        return null;
}
}
