package touristyv1;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class showPhoto extends javax.swing.JFrame {
    public showPhoto(BufferedImage image)  {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        double reqRatio = 800 / 600d;
        double imgRatio = (double) image.getWidth() / (double) image.getHeight();

        if (imgRatio != reqRatio) {
            if (imgRatio > reqRatio) {
                double maxWidth = Math.floor(image.getHeight() * reqRatio);
                image = CommonClasses.Scalr.crop(image, (image.getWidth() / 2) - ((int) maxWidth / 2), 0, (int) maxWidth, image.getHeight());
                image = CommonClasses.Scalr.resize(image, 800, 600);
            } else {
                double maxHeight = Math.floor(image.getWidth() * (600 / 800d));
                System.out.println(maxHeight);
                image = CommonClasses.Scalr.crop(image, 0, (image.getHeight() / 2) - ((int) maxHeight / 2), image.getWidth(), (int) maxHeight);
                image = CommonClasses.Scalr.resize(image, 800, 600);
            }
        }
        jLabel1.setIcon(new ImageIcon(image));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        siBackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 800, 570));

        siBackBtn.setBackground(new java.awt.Color(255, 255, 255));
        siBackBtn.setFont(new java.awt.Font("Brush Script MT", 1, 24)); // NOI18N
        siBackBtn.setForeground(new java.awt.Color(0, 0, 0));
        siBackBtn.setText("BACK");
        siBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(siBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siBackBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_siBackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(showPhoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showPhoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showPhoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showPhoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            showPhoto sp = new showPhoto(null);
            sp.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
            sp.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton siBackBtn;
    // End of variables declaration//GEN-END:variables
}
