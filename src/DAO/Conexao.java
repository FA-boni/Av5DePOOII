
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao{
    
    public Connection conectaBD(){
        Connection conn = null;
        
        try{
            String url= "jdbc:mysql://localhost:3306/transportes?user=root&password=00Gugu00";
            conn = DriverManager.getConnection(url);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }
}
