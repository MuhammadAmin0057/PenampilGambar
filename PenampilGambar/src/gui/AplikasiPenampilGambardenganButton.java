/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author Asus
 */
public class AplikasiPenampilGambardenganButton extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPenampilGambardenganButton
     */
    public AplikasiPenampilGambardenganButton() {
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

        jPanel1 = new javax.swing.JPanel();
        btnGlassFish = new javax.swing.JButton();
        btnJavaEE = new javax.swing.JButton();
        btnPostgreSQL = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        LBglassfish = new javax.swing.JLabel();
        LBJavaEE = new javax.swing.JLabel();
        LBPostgreSQL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnGlassFish.setText("GlassFish");
        btnGlassFish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlassFishActionPerformed(evt);
            }
        });
        jPanel1.add(btnGlassFish);

        btnJavaEE.setText("JavaEE");
        btnJavaEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJavaEEActionPerformed(evt);
            }
        });
        jPanel1.add(btnJavaEE);

        btnPostgreSQL.setText("PostgreSQL");
        btnPostgreSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostgreSQLActionPerformed(evt);
            }
        });
        jPanel1.add(btnPostgreSQL);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        LBglassfish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/1.png"))); // NOI18N
        imagePanel.add(LBglassfish, "0");

        LBJavaEE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/11.png"))); // NOI18N
        imagePanel.add(LBJavaEE, "1");

        LBPostgreSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/14.png"))); // NOI18N
        imagePanel.add(LBPostgreSQL, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGlassFishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlassFishActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_btnGlassFishActionPerformed

    private void btnJavaEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJavaEEActionPerformed
       CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_btnJavaEEActionPerformed

    private void btnPostgreSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostgreSQLActionPerformed
       CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_btnPostgreSQLActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AplikasiPenampilGambardenganButton fullFrame = new  AplikasiPenampilGambardenganButton();
                
                GraphicsDevice device =
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBJavaEE;
    private javax.swing.JLabel LBPostgreSQL;
    private javax.swing.JLabel LBglassfish;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGlassFish;
    private javax.swing.JButton btnJavaEE;
    private javax.swing.JButton btnPostgreSQL;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
