/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gurpreet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gurpreet
 */
public class NewChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form NewChangePassword
     */
    public NewChangePassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tf2 = new javax.swing.JPasswordField();
        tf3 = new javax.swing.JPasswordField();
        tf4 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(580, 150, 0, 0));
        setMinimumSize(new java.awt.Dimension(725, 715));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 340, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 460, 250, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 400, 190, 29);
        getContentPane().add(tf1);
        tf1.setBounds(330, 280, 320, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 280, 140, 20);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 560, 490, 60);

        tf2.setBorder(null);
        getContentPane().add(tf2);
        tf2.setBounds(330, 340, 320, 30);

        tf3.setBorder(null);
        getContentPane().add(tf3);
        tf3.setBounds(330, 400, 320, 30);

        tf4.setBorder(null);
        getContentPane().add(tf4);
        tf4.setBounds(330, 460, 320, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gurpreet\\Desktop\\project\\New folder\\finallytwitter.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 210, 700, 450);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\ch pass.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           try
      {
          if(tf1.getText().equals("")||tf2.getText().equals("")||tf3.getText().equals("")||tf4.getText().equals(""))
          {
              JOptionPane.showMessageDialog(this,"please enter complete information");
              
          }
          else
          {
              if(tf3.getText().equals(tf3.getText()))
              {
               Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
                 PreparedStatement ps=con.prepareStatement("update final set password =? where email=? and password=?");
                 ps.setString(1,tf3.getText());
                 ps.setString(2,tf1.getText());
                 ps.setString(3,tf2.getText());
                
                 //ps.setString(5,tf5.getText());
                // ps.setString(6,tf6.getText());
                              
                 int x=ps.executeUpdate();
                 if(x==1)
                 {
                     JOptionPane.showMessageDialog(this,"Password change Sucesfully");
                     
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(this,"Sorry Problem Occure");
                 }
          }
           else
           {
               JOptionPane.showMessageDialog(this,"password not match");
                   }
              
                
          }
                      
      }
      catch(Exception e)
      {
           JOptionPane.showMessageDialog(this,""+e);
      }
                                   
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tf1;
    private javax.swing.JPasswordField tf2;
    private javax.swing.JPasswordField tf3;
    private javax.swing.JPasswordField tf4;
    // End of variables declaration//GEN-END:variables
}
