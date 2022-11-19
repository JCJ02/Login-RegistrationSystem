/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginsystem;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Jacobe
 */
public class registrationFrame extends javax.swing.JFrame {

    /**
     * Creates new form registrationFrame
     */
    public registrationFrame() {
        initComponents();
        Connection();
    }
    
    // Initialize variables for database connection
    Connection connection;
    PreparedStatement prepared_Statement;
    ResultSet result_Set;
    
    public void Connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/teknolohiyadb", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registrationFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registrationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderRBtnGrp = new javax.swing.ButtonGroup();
        registrationPanel = new javax.swing.JPanel();
        registrationSidePanel = new javax.swing.JPanel();
        registrationSidePanelLogo = new javax.swing.JLabel();
        registrationHeaderLabel = new javax.swing.JLabel();
        registrationSubHeaderLabel = new javax.swing.JLabel();
        registrationSubHeaderLabel1 = new javax.swing.JLabel();
        registrationExitBtn = new javax.swing.JLabel();
        registrationLNameLabel = new javax.swing.JLabel();
        registrationLNameField = new javax.swing.JTextField();
        registrationFNameLabel = new javax.swing.JLabel();
        registrationLoginBtn = new javax.swing.JButton();
        regstrationSignUpBtn = new javax.swing.JButton();
        registrationFNameField = new javax.swing.JTextField();
        registrationGenderLabel = new javax.swing.JLabel();
        femaleRadioBtn = new javax.swing.JRadioButton();
        maleRadioBtn = new javax.swing.JRadioButton();
        registrationPhoneNumField = new javax.swing.JTextField();
        registrationPhoneNumLabel1 = new javax.swing.JLabel();
        registrationUNameField = new javax.swing.JTextField();
        registrationUNameLabel1 = new javax.swing.JLabel();
        registrationPassLabel = new javax.swing.JLabel();
        registrationPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setUndecorated(true);
        setSize(new java.awt.Dimension(720, 600));

        registrationPanel.setBackground(new java.awt.Color(255, 255, 255));
        registrationPanel.setPreferredSize(new java.awt.Dimension(770, 590));
        registrationPanel.setRequestFocusEnabled(false);

        registrationSidePanel.setBackground(new java.awt.Color(0, 0, 0));

        registrationSidePanelLogo.setForeground(new java.awt.Color(255, 255, 255));
        registrationSidePanelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationSidePanelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginsystem/Logo V3.png"))); // NOI18N

        registrationHeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        registrationHeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        registrationHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationHeaderLabel.setText("Teknolohiya Software\n");

        registrationSubHeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrationSubHeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        registrationSubHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        registrationSubHeaderLabel.setText("Teknolohiya | Copyright 2022\n\n\n");

        registrationSubHeaderLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrationSubHeaderLabel1.setForeground(new java.awt.Color(255, 255, 255));
        registrationSubHeaderLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        registrationSubHeaderLabel1.setText("Teknolohiya Software Version 1");

        javax.swing.GroupLayout registrationSidePanelLayout = new javax.swing.GroupLayout(registrationSidePanel);
        registrationSidePanel.setLayout(registrationSidePanelLayout);
        registrationSidePanelLayout.setHorizontalGroup(
            registrationSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrationSidePanelLogo)
            .addComponent(registrationHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(registrationSidePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(registrationSubHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(registrationSidePanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(registrationSubHeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        registrationSidePanelLayout.setVerticalGroup(
            registrationSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationSidePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(registrationSidePanelLogo)
                .addGap(140, 140, 140)
                .addComponent(registrationHeaderLabel)
                .addGap(16, 16, 16)
                .addComponent(registrationSubHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(registrationSubHeaderLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        registrationExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrationExitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginsystem/24 pixel.png"))); // NOI18N
        registrationExitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrationExitBtn.setMaximumSize(new java.awt.Dimension(25, 25));
        registrationExitBtn.setMinimumSize(new java.awt.Dimension(25, 25));
        registrationExitBtn.setPreferredSize(new java.awt.Dimension(25, 25));
        registrationExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrationExitBtnMouseClicked(evt);
            }
        });

        registrationLNameLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        registrationLNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrationLNameLabel.setText("Lastname");

        registrationLNameField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        registrationFNameLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        registrationFNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrationFNameLabel.setText("Firstname");

        registrationLoginBtn.setBackground(new java.awt.Color(14, 19, 23));
        registrationLoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        registrationLoginBtn.setForeground(java.awt.Color.white);
        registrationLoginBtn.setText("Log in");
        registrationLoginBtn.setBorder(null);
        registrationLoginBtn.setBorderPainted(false);
        registrationLoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrationLoginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrationLoginBtn.setIconTextGap(5);
        registrationLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrationLoginBtnMouseClicked(evt);
            }
        });

        regstrationSignUpBtn.setBackground(new java.awt.Color(14, 19, 23));
        regstrationSignUpBtn.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        regstrationSignUpBtn.setForeground(java.awt.Color.white);
        regstrationSignUpBtn.setText("Sign up");
        regstrationSignUpBtn.setBorder(null);
        regstrationSignUpBtn.setBorderPainted(false);
        regstrationSignUpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regstrationSignUpBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        regstrationSignUpBtn.setIconTextGap(5);
        regstrationSignUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regstrationSignUpBtnMouseClicked(evt);
            }
        });

        registrationFNameField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        registrationGenderLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        registrationGenderLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrationGenderLabel.setText("Gender");

        genderRBtnGrp.add(femaleRadioBtn);
        femaleRadioBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        femaleRadioBtn.setText("Female");
        femaleRadioBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        femaleRadioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                femaleRadioBtnMouseClicked(evt);
            }
        });

        genderRBtnGrp.add(maleRadioBtn);
        maleRadioBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        maleRadioBtn.setText("Male");
        maleRadioBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maleRadioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maleRadioBtnMouseClicked(evt);
            }
        });

        registrationPhoneNumField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        registrationPhoneNumLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        registrationPhoneNumLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrationPhoneNumLabel1.setText("Phone Number");

        registrationUNameField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        registrationUNameLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        registrationUNameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrationUNameLabel1.setText("Username");

        registrationPassLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        registrationPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrationPassLabel.setText("Password");

        registrationPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        javax.swing.GroupLayout registrationPanelLayout = new javax.swing.GroupLayout(registrationPanel);
        registrationPanel.setLayout(registrationPanelLayout);
        registrationPanelLayout.setHorizontalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addComponent(registrationSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrationExitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationPanelLayout.createSequentialGroup()
                        .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(registrationLNameField)
                                .addComponent(registrationLNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrationFNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrationFNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(registrationPanelLayout.createSequentialGroup()
                                    .addComponent(registrationGenderLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                    .addComponent(maleRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(femaleRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(registrationPhoneNumLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrationPhoneNumField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registrationUNameLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registrationUNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registrationPasswordField)
                                    .addComponent(registrationPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(registrationPanelLayout.createSequentialGroup()
                                        .addComponent(registrationLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(regstrationSignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(57, 57, 57))))
        );
        registrationPanelLayout.setVerticalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addComponent(registrationExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(registrationLNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationLNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationFNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrationGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleRadioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(femaleRadioBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationPhoneNumLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationPhoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationUNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationUNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrationLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regstrationSignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addComponent(registrationSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(registrationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(770, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrationExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationExitBtnMouseClicked
        // Exit Button
        System.exit(0);

    }//GEN-LAST:event_registrationExitBtnMouseClicked

    private void registrationLoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationLoginBtnMouseClicked
        // Login Button
        loginFrame loginForm = new loginFrame();
        loginForm.show();
        dispose();
    }//GEN-LAST:event_registrationLoginBtnMouseClicked

    private void regstrationSignUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regstrationSignUpBtnMouseClicked
        // Sign up button
        
        // Initialize variables
        String lastName = registrationLNameField.getText();
        String firstName = registrationFNameField.getText();
        String phoneNum = registrationPhoneNumField.getText();
        String username = registrationUNameField.getText();
        String password = new String(registrationPasswordField.getPassword());
        
        try {
            prepared_Statement = connection.prepareStatement("INSERT INTO user_account_table(Lastname, Firstname, GENDER, Phone_Number, Username, Password) VALUES (?,?,?,?,?,?)");
            prepared_Statement.setString(1, lastName);
            prepared_Statement.setString(2, firstName);
            prepared_Statement.setString(3, gender);
            prepared_Statement.setString(4, phoneNum);
            prepared_Statement.setString(5, username);
            prepared_Statement.setString(6, password);
            
            // Instatiate prepared_Statement.executeUpdate() as executeUpdate
            int executeUpdate = prepared_Statement.executeUpdate();
            
            if(executeUpdate == 1) {
                JOptionPane.showMessageDialog(rootPane, "You have SUCCESSFULLY REGISTERED!", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                
                // Reset
                registrationFNameField.setText("");
                registrationLNameField.setText("");
                registrationPhoneNumField.setText("");
                registrationUNameField.setText("");
                registrationPasswordField.setText("");
                
            }else {
                JOptionPane.showMessageDialog(rootPane, "REGISTRATION FAILED!", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(registrationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }//GEN-LAST:event_regstrationSignUpBtnMouseClicked

    private void maleRadioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maleRadioBtnMouseClicked
        // Male Radiot Button
        gender = "Male";
        
    }//GEN-LAST:event_maleRadioBtnMouseClicked

    private void femaleRadioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femaleRadioBtnMouseClicked
        // Female Radiot Button
        gender = "Female";
    }//GEN-LAST:event_femaleRadioBtnMouseClicked
    
   
    
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
            java.util.logging.Logger.getLogger(registrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton femaleRadioBtn;
    public static javax.swing.ButtonGroup genderRBtnGrp;
    public static javax.swing.JRadioButton maleRadioBtn;
    public javax.swing.JLabel registrationExitBtn;
    public javax.swing.JTextField registrationFNameField;
    public javax.swing.JLabel registrationFNameLabel;
    public javax.swing.JLabel registrationGenderLabel;
    public javax.swing.JLabel registrationHeaderLabel;
    public javax.swing.JTextField registrationLNameField;
    public javax.swing.JLabel registrationLNameLabel;
    public javax.swing.JButton registrationLoginBtn;
    public static javax.swing.JPanel registrationPanel;
    public javax.swing.JLabel registrationPassLabel;
    public javax.swing.JPasswordField registrationPasswordField;
    public javax.swing.JTextField registrationPhoneNumField;
    public javax.swing.JLabel registrationPhoneNumLabel1;
    public static javax.swing.JPanel registrationSidePanel;
    public javax.swing.JLabel registrationSidePanelLogo;
    public javax.swing.JLabel registrationSubHeaderLabel;
    public javax.swing.JLabel registrationSubHeaderLabel1;
    public javax.swing.JTextField registrationUNameField;
    public javax.swing.JLabel registrationUNameLabel1;
    public javax.swing.JButton regstrationSignUpBtn;
    // End of variables declaration//GEN-END:variables
    
    //Instatiate maleRadioBtn and femaleRadioBtn as gender
    public String gender;

    private JTextField setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
