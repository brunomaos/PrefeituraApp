/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.Edicao;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno.schneider
 */
public class AdmTela extends javax.swing.JFrame {

    /**
     * Creates new form AdmTeLA
     */
    public AdmTela() {
        initComponents();
    }
    Edicao edit = new Edicao();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoAdobeAir = new javax.swing.JToggleButton();
        botaoAdobeR = new javax.swing.JToggleButton();
        botaoJava = new javax.swing.JToggleButton();
        botaoChrome = new javax.swing.JToggleButton();
        botaoMozilla = new javax.swing.JToggleButton();
        botaoVnc = new javax.swing.JToggleButton();
        botaoKaspersky = new javax.swing.JToggleButton();
        botaoALL = new javax.swing.JToggleButton();
        botaoWinrar = new javax.swing.JToggleButton();
        botaoWatch = new javax.swing.JToggleButton();
        btEditUrl = new javax.swing.JButton();
        btOutros = new javax.swing.JButton();
        btVoltar = new javax.swing.JLabel();
        iconAdobeAir = new javax.swing.JLabel();
        iconAdobeR = new javax.swing.JLabel();
        iconJava = new javax.swing.JLabel();
        iconWinrar = new javax.swing.JLabel();
        iconChrome = new javax.swing.JLabel();
        iconKaspersky = new javax.swing.JLabel();
        iconMozilla = new javax.swing.JLabel();
        iconWatchguard = new javax.swing.JLabel();
        iconVnc = new javax.swing.JLabel();
        iconFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoAdobeAir.setText("instalar");
        botaoAdobeAir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdobeAirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAdobeAir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 80, -1));

        botaoAdobeR.setText("instalar");
        botaoAdobeR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdobeRActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAdobeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 80, -1));

        botaoJava.setText("instalar");
        botaoJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJavaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoJava, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 80, -1));

        botaoChrome.setText("instalar");
        botaoChrome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChromeActionPerformed(evt);
            }
        });
        getContentPane().add(botaoChrome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 80, -1));

        botaoMozilla.setText("instalar");
        botaoMozilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMozillaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMozilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 80, -1));

        botaoVnc.setText("instalar");
        botaoVnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVncActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 80, -1));

        botaoKaspersky.setText("instalar");
        botaoKaspersky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoKasperskyActionPerformed(evt);
            }
        });
        getContentPane().add(botaoKaspersky, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 80, -1));

        botaoALL.setForeground(new java.awt.Color(255, 51, 51));
        botaoALL.setText("abrir todos!");
        botaoALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoALLActionPerformed(evt);
            }
        });
        getContentPane().add(botaoALL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 100, -1));

        botaoWinrar.setText("instalar");
        botaoWinrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoWinrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoWinrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 80, -1));

        botaoWatch.setText("instalar");
        botaoWatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoWatchActionPerformed(evt);
            }
        });
        getContentPane().add(botaoWatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 80, -1));

        btEditUrl.setText("Editar Urls");
        btEditUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditUrlActionPerformed(evt);
            }
        });
        getContentPane().add(btEditUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        btOutros.setText("outras funcionalidades");
        btOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOutrosActionPerformed(evt);
            }
        });
        getContentPane().add(btOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/setaLogo1.png"))); // NOI18N
        btVoltar.setText("      ");
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        iconAdobeAir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NadobeAir.png"))); // NOI18N
        getContentPane().add(iconAdobeAir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        iconAdobeR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NadobeAcrobatLogo.png"))); // NOI18N
        getContentPane().add(iconAdobeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        iconJava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NjavaLog.png"))); // NOI18N
        getContentPane().add(iconJava, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        iconWinrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NwinrarLogo.png"))); // NOI18N
        getContentPane().add(iconWinrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        iconChrome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NchormeLogo.png"))); // NOI18N
        getContentPane().add(iconChrome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        iconKaspersky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NkasperkyLogo.png"))); // NOI18N
        getContentPane().add(iconKaspersky, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        iconMozilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NmozilaLog.png"))); // NOI18N
        getContentPane().add(iconMozilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        iconWatchguard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/watchguardLogo.png"))); // NOI18N
        getContentPane().add(iconWatchguard, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        iconVnc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NultraVncLog.png"))); // NOI18N
        getContentPane().add(iconVnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        iconFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Pfundo3.png"))); // NOI18N
        iconFundo.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(iconFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdobeAirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdobeAirActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File(edit.getArquivo("url-AdobeAir.txt")));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao abrir o Adobe AIR!!");
        }
        iconAdobeAir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corretos/adobeAir.png")));
    }//GEN-LAST:event_botaoAdobeAirActionPerformed

    private void botaoAdobeRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdobeRActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File(edit.getArquivo("url-AdobeAcrobat.txt")));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao abrir o Adobe Acrobat Reader!!");
        }
        iconAdobeR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corretos/adobeAcrobatLogo.png")));
    }//GEN-LAST:event_botaoAdobeRActionPerformed

    private void botaoJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJavaActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File(edit.getArquivo("url-Java.txt")));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao abrir o Java!!");
        }
        iconJava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corretos/javaLog.png")));
    }//GEN-LAST:event_botaoJavaActionPerformed

    private void botaoChromeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChromeActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File(edit.getArquivo("url-Chrome.txt")));
            
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao abrir o Chrome!!");
        }
        iconChrome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corretos/chromeLogo.png")));
    }//GEN-LAST:event_botaoChromeActionPerformed

    private void botaoMozillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMozillaActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File(edit.getArquivo("url-Mozilla.txt")));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao abrir o Mozilla!!");
        }
        iconMozilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corretos/mozilaLog.png")));
    }//GEN-LAST:event_botaoMozillaActionPerformed

    private void botaoVncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVncActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File(edit.getArquivo("url-Vnc.txt")));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao abrir o VNC!!");
        }
        iconVnc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corretos/ultraVncLog.png")));
    }//GEN-LAST:event_botaoVncActionPerformed

    private void botaoKasperskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoKasperskyActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File(edit.getArquivo("url-Kaspersky.txt")));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao abrir o Kaspersky!!");
        }
        iconKaspersky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corretos/kasperskyLogo.png")));
    }//GEN-LAST:event_botaoKasperskyActionPerformed

    private void botaoWatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoWatchActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File(edit.getArquivo("url-Watchguard.txt")));
        
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao abrir o watchguard!!");
        }
        iconWatchguard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corretos/watchguardLogo.png")));
    }//GEN-LAST:event_botaoWatchActionPerformed

    private void botaoALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoALLActionPerformed
        botaoWatchActionPerformed(evt);
        botaoAdobeAirActionPerformed(evt);
        botaoAdobeRActionPerformed(evt);
        botaoJavaActionPerformed(evt);
        botaoWinrarActionPerformed(evt);
        botaoChromeActionPerformed(evt);
        botaoMozillaActionPerformed(evt);
        botaoVncActionPerformed(evt);
        botaoKasperskyActionPerformed(evt);
    }//GEN-LAST:event_botaoALLActionPerformed

    private void botaoWinrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoWinrarActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File(edit.getArquivo("url-Winrar.txt")));
        
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao abrir o winrar!!");
        }
        iconWinrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/corretos/winrarLogo.png")));
    }//GEN-LAST:event_botaoWinrarActionPerformed

    private void btVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseClicked
        TelaInicial tI = new TelaInicial();
        tI.setVisible(true);
        if(tI.isVisible()){
            this.dispose();
        }
    }//GEN-LAST:event_btVoltarMouseClicked

    private void btEditUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditUrlActionPerformed
        TelaEdit  te = new TelaEdit();
        te.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btEditUrlActionPerformed

    private void btOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOutrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btOutrosActionPerformed
    
    public void mudarUrlPadrao(String x){
       
    }
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
            java.util.logging.Logger.getLogger(AdmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoALL;
    private javax.swing.JToggleButton botaoAdobeAir;
    private javax.swing.JToggleButton botaoAdobeR;
    private javax.swing.JToggleButton botaoChrome;
    private javax.swing.JToggleButton botaoJava;
    private javax.swing.JToggleButton botaoKaspersky;
    private javax.swing.JToggleButton botaoMozilla;
    private javax.swing.JToggleButton botaoVnc;
    private javax.swing.JToggleButton botaoWatch;
    private javax.swing.JToggleButton botaoWinrar;
    private javax.swing.JButton btEditUrl;
    private javax.swing.JButton btOutros;
    private javax.swing.JLabel btVoltar;
    private javax.swing.JLabel iconAdobeAir;
    private javax.swing.JLabel iconAdobeR;
    private javax.swing.JLabel iconChrome;
    private javax.swing.JLabel iconFundo;
    private javax.swing.JLabel iconJava;
    private javax.swing.JLabel iconKaspersky;
    private javax.swing.JLabel iconMozilla;
    private javax.swing.JLabel iconVnc;
    private javax.swing.JLabel iconWatchguard;
    private javax.swing.JLabel iconWinrar;
    // End of variables declaration//GEN-END:variables
}
