
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MyFunction {
    public static int countData(String Tablename){
        int total = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM"+" "+ Tablename);
             
            while(rs.next()){
                total = rs.getInt(1);
            }
     
        } catch (Exception ex) {
           // Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,ex); 
        }
        
        
        return total;
    }
    
}
