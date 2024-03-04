package touristyv1;
/**
 *
 * @author Acer
 */
public class InformationPage extends javax.swing.JFrame {

    /**
     * Creates new form InformationPage
     */
    public InformationPage(String loc) {
        initComponents();
        String desc = Database.DBLocation.getLocationDescription(loc);
        System.out.println(desc);
        jTextAreaInformation.setLineWrap(true);
        jTextAreaInformation.setText(desc); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ipMapBtn = new javax.swing.JButton();
        ipExitBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInformation = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ipMapBtn.setBackground(new java.awt.Color(255, 255, 255));
        ipMapBtn.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        ipMapBtn.setForeground(new java.awt.Color(0, 0, 0));
        ipMapBtn.setText("MAP");
        ipMapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipMapBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ipMapBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, -1, -1));

        ipExitBtn1.setBackground(new java.awt.Color(255, 255, 255));
        ipExitBtn1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        ipExitBtn1.setForeground(new java.awt.Color(0, 0, 0));
        ipExitBtn1.setText("EXIT");
        ipExitBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipExitBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(ipExitBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, -1, -1));

        jTextAreaInformation.setColumns(20);
        jTextAreaInformation.setLineWrap(true);
        jTextAreaInformation.setRows(5);
        jTextAreaInformation.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaInformation);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 720, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ipExitBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipExitBtn1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_ipExitBtn1ActionPerformed

    private void ipMapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipMapBtnActionPerformed
        LandingPage lp = new LandingPage();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ipMapBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InformationPage ip = new InformationPage("");
                ip.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
                ip.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ipExitBtn1;
    private javax.swing.JButton ipMapBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInformation;
    // End of variables declaration//GEN-END:variables
}
