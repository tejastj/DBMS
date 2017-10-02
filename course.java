
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class course {
    
     public void insertUpdateDeleteStudent(char operation,Integer id, String label,Integer hours){
         Connection con = MyConnection.getConnection();
         PreparedStatement ps;
         
         if(operation == 'i'){
             try {
                 ps = con.prepareStatement("Insert into course(label,hours_number) values(?,?)");
                 ps.setString(1,label);
                 ps.setInt(2,hours);
                
                 if(ps.executeUpdate()>0){
                     JOptionPane.showMessageDialog(null,"New Course added");                    
                 }
             } catch (Exception ex) {
                // Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex); 
             }
             
         }
         
         
         if(operation == 'u'){
             try {
                 ps = con.prepareStatement("UPDATE course SET label = ? ,hours_number = ? WHERE id = ?");
                 ps.setString(1,label);
                 ps.setInt(2,hours);
                 ps.setInt(3,id);
                 
                
                 if(ps.executeUpdate()>0){
                     JOptionPane.showMessageDialog(null,"Course Data updated");                    
                 }
             } catch (Exception ex) {
                // Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex); 
             }
             
         }
         
         if(operation == 'd'){
             
              int YESorNO = JOptionPane.showConfirmDialog(null,"Scores will also be deleted","Delete Score",JOptionPane.OK_CANCEL_OPTION,0);
             if(YESorNO == JOptionPane.OK_OPTION){
                 try {
                 ps = con.prepareStatement("DELETE FROM course WHERE id  = ?");
                 
                 ps.setInt(1, id);
                 if(ps.executeUpdate()>0){
                     JOptionPane.showMessageDialog(null,"Course Deleted");                    
                 }
             } catch (Exception ex) {
                // Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex); 
                      }
              }
             
             
         }
 }
     
      public boolean isCourseExixt(String coursename){
         Connection con = MyConnection.getConnection();
         PreparedStatement ps;
         boolean isExist = false;
         try {
             ps = con.prepareStatement("SELECT *  FROM course  WHERE label LIKE ?");
             ps.setString(1,coursename);
             
             ResultSet rs = ps.executeQuery();
           
             
             while(rs.next()){
                 //rs.getBlob(1);
                 isExist = true;
                 
             }
         } catch (Exception ex) {
             //Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);
                    
            }
         return isExist;
        }

      public void fillCourseJtable(JTable table){
         Connection con = MyConnection.getConnection();
         PreparedStatement ps;
         try {
             ps = con.prepareStatement("SELECT *  FROM course");
            // ps.setString(1,"%"+valueToSearch+"%");
             
             ResultSet rs = ps.executeQuery();
            // rs.getBlob(1);
             
             DefaultTableModel model = (DefaultTableModel)table.getModel();
             Object[] row;
             while(rs.next()){
                 //rs.getBlob(1);
                 row = new Object[3];
                 row[0] = rs.getInt(1);
                 row[1] = rs.getString(2);
                 row[2] = rs.getInt(3);
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
      
     public int getCourseId(String courseLabel)
     {
         int courseId = 0;
         Connection con = MyConnection.getConnection();
         PreparedStatement ps;
          try {
             ps = con.prepareStatement("SELECT *  FROM course  WHERE label LIKE ?");
             ps.setString(1,courseLabel);
             
             ResultSet rs = ps.executeQuery();
           
             
             while(rs.next()){
                 //rs.getBlob(1);
                 //isExist = true;
                 courseId = rs.getInt("Id");
             }
         } catch (Exception ex) {
             //Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);
                    
            }
          return courseId;
     }
      
       public void fillCourseCombo(JComboBox combo){
         Connection con = MyConnection.getConnection();
         PreparedStatement ps;
         try {
             ps = con.prepareStatement("SELECT *  FROM course");
            // ps.setString(1,"%"+valueToSearch+"%");
             
             ResultSet rs = ps.executeQuery();
            // rs.getBlob(1);
             
           
             while(rs.next()){
                 //rs.getBlob(1);
                combo.addItem(rs.getString(2));
                
                 
             }
         } catch (Exception ex) {
             //Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);
                    
         }
         
     }
}
