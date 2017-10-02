
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class score {
    public void insertUpdateDeleteStudent(char operation,Integer Sid, Integer Cid,double scr, String descp){
         Connection con = MyConnection.getConnection();
         PreparedStatement ps;
         
         if(operation == 'i'){
             try {
                 ps = con.prepareStatement("Insert into score(student_id,course_id,student_score,description) values(?,?,?,?)");
                 ps.setInt(1,Sid);
                 ps.setInt(2,Cid);
                 ps.setDouble(3, scr);
                 ps.setString(4,descp);
                 if(ps.executeUpdate()>0){
                     JOptionPane.showMessageDialog(null,"Score added");                    
                 }
             } catch (Exception ex) {
                // Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex); 
             }
             
         }
         
         
         if(operation == 'u'){
             try {
                 ps = con.prepareStatement("UPDATE score SET student_score = ? ,description= ? WHERE student_id = ? AND course_id = ?");
                 ps.setDouble(1,scr);
                 ps.setString(2,descp);
                 ps.setInt(3,Sid);
                 ps.setInt(4, Cid);
                
                 if(ps.executeUpdate()>0){
                     JOptionPane.showMessageDialog(null,"Score updated");                    
                 }
             } catch (Exception ex) {
                // Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex); 
             }
             
         }
         
         if(operation == 'd'){
             try {
                 ps = con.prepareStatement("DELETE FROM score WHERE student_id  = ? AND course_id = ?");
                 
                 ps.setInt(1, Sid);
                 ps.setInt(2, Cid);
                 if(ps.executeUpdate()>0){
                     JOptionPane.showMessageDialog(null,"Score Deleted");                    
                 }
             } catch (Exception ex) {
                // Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex); 
             }
             
         }
 }
    
     public void fillScoreJtable(JTable table){
         Connection con = MyConnection.getConnection();
         PreparedStatement ps;
         try {
             ps = con.prepareStatement("SELECT *  FROM score");
            // ps.setString(1,"%"+valueToSearch+"%");
             
             ResultSet rs = ps.executeQuery();
            // rs.getBlob(1);
             
             DefaultTableModel model = (DefaultTableModel)table.getModel();
             Object[] row;
             while(rs.next()){
                 //rs.getBlob(1);
                 row = new Object[4];
                 row[0] = rs.getInt(1);
                 row[1] = rs.getInt(2);
                 row[2] = rs.getDouble(3);
                 row[3] = rs.getString(4);
//                 row[3] = rs.getString(4);
//                 row[4] = rs.getString(5);
//                 row[5] = rs.getString(6);
//                 row[6] = rs.getString(7);
                 
                 model.addRow(row);
                 
             }
         } catch (Exception ex) {
             //Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);
                    
         }
         
     }
     
     
     
     
     public void showAllScores(JTable table){
         Connection con = MyConnection.getConnection();
         PreparedStatement ps;
         try {
             ps = con.prepareStatement("SELECT `student_id`,first_name,last_name,label,student_score"
                                         + " FROM score "
                                         + "INNER JOIN student AS stab on stab.id= score.student_id "
                                         + "INNER JOIN course AS ctab on ctab.id = score.course_id ");
            // ps.setString(1,"%"+valueToSearch+"%");
             
             ResultSet rs = ps.executeQuery();
            // rs.getBlob(1);
             
             DefaultTableModel model = (DefaultTableModel)table.getModel();
             Object[] row;
             while(rs.next()){
                 //rs.getBlob(1);
                 row = new Object[5];
                 row[0] = rs.getInt(1);
                 row[1] = rs.getString(2);
                 row[2] = rs.getString(3);
                 row[3] = rs.getString(4);
                 row[4] = rs.getDouble(5);
                 
//                 row[3] = rs.getString(4);
//                 row[4] = rs.getString(5);
//                 row[5] = rs.getString(6);
//                 row[6] = rs.getString(7);
                 
                 model.addRow(row);
                 
             }
         } catch (Exception ex) {
             //Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);
                    
         }
         
     }
    
    
}

