/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginsystem;

/**
 *
 * @author PC
 */
public class loadingScreenFrame extends javax.swing.JFrame {

    /**
     * Creates new form loadingScreenFrame
     */
    public loadingScreenFrame() {
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

        loadingScreenPanel = new javax.swing.JPanel();
        loadingScreenLogo = new javax.swing.JLabel();
        loadingPercentage = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        loadingScreenPanel.setBackground(new java.awt.Color(0, 0, 0));

        loadingScreenLogo.setForeground(new java.awt.Color(255, 255, 255));
        loadingScreenLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadingScreenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginsystem/Logo V3.png"))); // NOI18N

        loadingPercentage.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        loadingPercentage.setForeground(new java.awt.Color(255, 255, 255));
        loadingPercentage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadingPercentage.setText("0%");

        loadingBar.setBackground(new java.awt.Color(255, 255, 255));
        loadingBar.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loadingScreenPanelLayout = new javax.swing.GroupLayout(loadingScreenPanel);
        loadingScreenPanel.setLayout(loadingScreenPanelLayout);
        loadingScreenPanelLayout.setHorizontalGroup(
            loadingScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadingScreenLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(loadingPercentage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loadingScreenPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(loadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loadingScreenPanelLayout.setVerticalGroup(
            loadingScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadingScreenPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(loadingScreenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingPercentage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadingScreenPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadingScreenPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(600, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(loadingScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loadingScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loadingScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loadingScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                                   
        // Instatiating loadingScreenFrame as loadingScreenForm
        loadingScreenFrame loadingScreenForm = new loadingScreenFrame();
        loadingScreenForm.setVisible(true);
        
        // Instatiating loginFrame as loginForm
        loginFrame loginForm = new loginFrame();
        
        
            try{
                for(int i = 0; i <= 100; i++){
                    Thread.sleep(10);
                    loadingScreenForm.loadingBar.setValue(i);
                    loadingScreenForm.loadingPercentage.setText(Integer.toString(i)+ "%");
                    if(i == 100) {
                        loginForm.setVisible(true);
                        loadingScreenForm.setVisible(false);
                    }
                }
            }catch(Exception e) {
                
            }
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingPercentage;
    private javax.swing.JLabel loadingScreenLogo;
    private javax.swing.JPanel loadingScreenPanel;
    // End of variables declaration//GEN-END:variables
}
