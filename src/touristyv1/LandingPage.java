/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package touristyv1;

import CommonClasses.location;
import java.util.HashMap;
import javax.swing.JLabel;

/**
 *
 * @author Acer
 */
public class LandingPage extends javax.swing.JFrame {

    /**
     * Creates new form LandingPage
     */
    public LandingPage() {
        initComponents();
        
        labelVisible();
        
        location []arr = Database.DBLocation.getLocationNames();
        HashMap<String, JLabel> labels = new HashMap<String,JLabel>();
        labels.put("SIGIRIYA", jLblSIGIRIYA);
        labels.put("PINNAWELA", jLblPINNAWELA);
        labels.put("KANDY", jLblKANDY);
        labels.put("ANURAPURA", jLblANURAPURA);
        labels.put("COLOMBO", jLblCOLOMBO);
        labels.put("GALLE", jLblGALLE);
        labels.put("HAMBANTHOTA", jLblHAMBANTHOTA);
        labels.put("HIKKADUWA", jLblHIKKADUWA);
        labels.put("KATHARAGAMA", jLblKATHARAGAMA);
        labels.put("MATARA", jLblMATARA);
        labels.put("POLONNARUWA", jLblPOLONNARUWA);
        labels.put("RATNAPURA", jLblRATNAPURA);
        labels.put("TANGALLE", jLblTANGALLE);
        labels.put("TRINCOMALEE", jLblTRINCOMALEE);
        labels.put("WELIGAMA", jLblWELIGAMA);
        labels.put("YALA", jLblYALA);
        
        for (location loc: arr) {
            labels.get(loc.location).setVisible(true);
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

        jLabel2 = new javax.swing.JLabel();
        lpExitBtn = new javax.swing.JButton();
        lpBackBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLblSIGIRIYA = new javax.swing.JLabel();
        jLblPINNAWELA = new javax.swing.JLabel();
        jLblKANDY = new javax.swing.JLabel();
        jLblANURAPURA = new javax.swing.JLabel();
        jLblCOLOMBO = new javax.swing.JLabel();
        jLblGALLE = new javax.swing.JLabel();
        jLblHAMBANTHOTA = new javax.swing.JLabel();
        jLblHIKKADUWA = new javax.swing.JLabel();
        jLblKATHARAGAMA = new javax.swing.JLabel();
        jLblMATARA = new javax.swing.JLabel();
        jLblPOLONNARUWA = new javax.swing.JLabel();
        jLblRATNAPURA = new javax.swing.JLabel();
        jLblTANGALLE = new javax.swing.JLabel();
        jLblTRINCOMALEE = new javax.swing.JLabel();
        jLblWELIGAMA = new javax.swing.JLabel();
        jLblYALA = new javax.swing.JLabel();
        jLblANURADHAPURA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sri Lankan Map");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        lpExitBtn.setBackground(new java.awt.Color(204, 204, 204));
        lpExitBtn.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        lpExitBtn.setForeground(new java.awt.Color(0, 0, 0));
        lpExitBtn.setText("EXIT");
        lpExitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lpExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lpExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(lpExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        lpBackBtn.setBackground(new java.awt.Color(204, 204, 204));
        lpBackBtn.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        lpBackBtn.setForeground(new java.awt.Color(0, 0, 0));
        lpBackBtn.setText("BACK");
        lpBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lpBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lpBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(lpBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 40));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 20, 90));

        jLblSIGIRIYA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblSIGIRIYA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblSIGIRIYAMouseClicked(evt);
            }
        });
        getContentPane().add(jLblSIGIRIYA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 70, 30));

        jLblPINNAWELA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblPINNAWELA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblPINNAWELAMouseClicked(evt);
            }
        });
        getContentPane().add(jLblPINNAWELA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 70, 70));

        jLblKANDY.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblKANDY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblKANDYMouseClicked(evt);
            }
        });
        getContentPane().add(jLblKANDY, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 80, 70));

        jLblANURAPURA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblANURAPURA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblANURAPURAMouseClicked(evt);
            }
        });
        getContentPane().add(jLblANURAPURA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 90, 80));

        jLblCOLOMBO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblCOLOMBO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblCOLOMBOMouseClicked(evt);
            }
        });
        getContentPane().add(jLblCOLOMBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 130, 50));

        jLblGALLE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblGALLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblGALLEMouseClicked(evt);
            }
        });
        getContentPane().add(jLblGALLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, 40, 40));

        jLblHAMBANTHOTA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblHAMBANTHOTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblHAMBANTHOTAMouseClicked(evt);
            }
        });
        getContentPane().add(jLblHAMBANTHOTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, 120, 20));

        jLblHIKKADUWA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblHIKKADUWA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblHIKKADUWAMouseClicked(evt);
            }
        });
        getContentPane().add(jLblHIKKADUWA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 80, 20));

        jLblKATHARAGAMA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblKATHARAGAMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblKATHARAGAMAMouseClicked(evt);
            }
        });
        getContentPane().add(jLblKATHARAGAMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 120, 20));

        jLblMATARA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblMATARA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblMATARAMouseClicked(evt);
            }
        });
        getContentPane().add(jLblMATARA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 60, 20));

        jLblPOLONNARUWA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblPOLONNARUWA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblPOLONNARUWAMouseClicked(evt);
            }
        });
        getContentPane().add(jLblPOLONNARUWA, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 265, 110, 90));

        jLblRATNAPURA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblRATNAPURA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblRATNAPURAMouseClicked(evt);
            }
        });
        getContentPane().add(jLblRATNAPURA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 100, 60));

        jLblTANGALLE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblTANGALLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblTANGALLEMouseClicked(evt);
            }
        });
        getContentPane().add(jLblTANGALLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 630, 80, 20));

        jLblTRINCOMALEE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblTRINCOMALEE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblTRINCOMALEEMouseClicked(evt);
            }
        });
        getContentPane().add(jLblTRINCOMALEE, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 120, 20));

        jLblWELIGAMA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblWELIGAMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblWELIGAMAMouseClicked(evt);
            }
        });
        getContentPane().add(jLblWELIGAMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, 90, 40));

        jLblYALA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblYALA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblYALAMouseClicked(evt);
            }
        });
        getContentPane().add(jLblYALA, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 70, 100));

        jLblANURADHAPURA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/touristyv1/slmap.JPG"))); // NOI18N
        getContentPane().add(jLblANURADHAPURA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 600, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelVisible() {
        jLblSIGIRIYA.setVisible(false);
        jLblPINNAWELA.setVisible(false);
        jLblKANDY.setVisible(false);
        jLblANURAPURA.setVisible(false);
        jLblCOLOMBO.setVisible(false);
        jLblGALLE.setVisible(false);
        jLblHAMBANTHOTA.setVisible(false);
        jLblHIKKADUWA.setVisible(false);
        jLblKATHARAGAMA.setVisible(false);
        jLblMATARA.setVisible(false);
        jLblPOLONNARUWA.setVisible(false);
        jLblRATNAPURA.setVisible(false);
        jLblTANGALLE.setVisible(false);
        jLblTRINCOMALEE.setVisible(false);
        jLblWELIGAMA.setVisible(false);
        jLblYALA.setVisible(false);
    }
    private void lpExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lpExitBtnActionPerformed
        this.dispose(); 
    }//GEN-LAST:event_lpExitBtnActionPerformed

    private void lpBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lpBackBtnActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
                
            }
        });
        this.dispose();
    }//GEN-LAST:event_lpBackBtnActionPerformed

    private void setGamePage (String loc) {
        GamePage gp = new GamePage(loc);
        gp.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        gp.setVisible(true);
        this.dispose();
    }
    
    private void jLblSIGIRIYAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblSIGIRIYAMouseClicked
        setGamePage("SIGIRIYA");
    }//GEN-LAST:event_jLblSIGIRIYAMouseClicked

    private void jLblPINNAWELAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblPINNAWELAMouseClicked
        setGamePage("PINNAWELA");
    }//GEN-LAST:event_jLblPINNAWELAMouseClicked

    private void jLblKANDYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblKANDYMouseClicked
        setGamePage("KANDY");
    }//GEN-LAST:event_jLblKANDYMouseClicked

    private void jLblANURAPURAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblANURAPURAMouseClicked
        setGamePage("ANURAPURA");
    }//GEN-LAST:event_jLblANURAPURAMouseClicked

    private void jLblCOLOMBOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblCOLOMBOMouseClicked
        setGamePage("COLOMBO");
    }//GEN-LAST:event_jLblCOLOMBOMouseClicked

    private void jLblGALLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblGALLEMouseClicked
        setGamePage("GALLE");
    }//GEN-LAST:event_jLblGALLEMouseClicked

    private void jLblHAMBANTHOTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblHAMBANTHOTAMouseClicked
        setGamePage("HAMBANTHOTA");
    }//GEN-LAST:event_jLblHAMBANTHOTAMouseClicked

    private void jLblHIKKADUWAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblHIKKADUWAMouseClicked
        setGamePage("HIKKADUWA");
    }//GEN-LAST:event_jLblHIKKADUWAMouseClicked

    private void jLblKATHARAGAMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblKATHARAGAMAMouseClicked
        setGamePage("KATHARAGAMA");
    }//GEN-LAST:event_jLblKATHARAGAMAMouseClicked

    private void jLblMATARAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblMATARAMouseClicked
        setGamePage("MATARA");
    }//GEN-LAST:event_jLblMATARAMouseClicked

    private void jLblPOLONNARUWAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblPOLONNARUWAMouseClicked
        setGamePage("POLONNARUWA");
    }//GEN-LAST:event_jLblPOLONNARUWAMouseClicked

    private void jLblRATNAPURAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblRATNAPURAMouseClicked
        setGamePage("RATnAPURA");
    }//GEN-LAST:event_jLblRATNAPURAMouseClicked

    private void jLblTANGALLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblTANGALLEMouseClicked
        setGamePage("TANGALLE");
    }//GEN-LAST:event_jLblTANGALLEMouseClicked

    private void jLblTRINCOMALEEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblTRINCOMALEEMouseClicked
        setGamePage("TRINCOMALEE");
    }//GEN-LAST:event_jLblTRINCOMALEEMouseClicked

    private void jLblWELIGAMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblWELIGAMAMouseClicked
        setGamePage("WELIGAMA");
    }//GEN-LAST:event_jLblWELIGAMAMouseClicked

    private void jLblYALAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblYALAMouseClicked
        setGamePage("YALA");
    }//GEN-LAST:event_jLblYALAMouseClicked

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
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LandingPage lp = new LandingPage();
                lp.pack();
                lp.setLocationRelativeTo(null);
                lp.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
                lp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblANURADHAPURA;
    private javax.swing.JLabel jLblANURAPURA;
    private javax.swing.JLabel jLblCOLOMBO;
    private javax.swing.JLabel jLblGALLE;
    private javax.swing.JLabel jLblHAMBANTHOTA;
    private javax.swing.JLabel jLblHIKKADUWA;
    private javax.swing.JLabel jLblKANDY;
    private javax.swing.JLabel jLblKATHARAGAMA;
    private javax.swing.JLabel jLblMATARA;
    private javax.swing.JLabel jLblPINNAWELA;
    private javax.swing.JLabel jLblPOLONNARUWA;
    private javax.swing.JLabel jLblRATNAPURA;
    private javax.swing.JLabel jLblSIGIRIYA;
    private javax.swing.JLabel jLblTANGALLE;
    private javax.swing.JLabel jLblTRINCOMALEE;
    private javax.swing.JLabel jLblWELIGAMA;
    private javax.swing.JLabel jLblYALA;
    private javax.swing.JButton lpBackBtn;
    private javax.swing.JButton lpExitBtn;
    // End of variables declaration//GEN-END:variables
}