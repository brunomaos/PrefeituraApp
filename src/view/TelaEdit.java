
package view;

import Control.Edicao;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno.schneider
 */
public class TelaEdit extends javax.swing.JFrame {
    Edicao edit = new Edicao();
    /**
     * Creates new form TelaEdit
     */
    public TelaEdit() {
        initComponents();
        campoNumero.setBackground(new Color(0,0,0,0));
        campoUrl.setBackground(new Color(0,0,0,0));
        btAlterar.setBackground(new Color(0,0,0,0));
        btVoltar.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        txt8 = new javax.swing.JLabel();
        txt9 = new javax.swing.JLabel();
        iconWatchguard = new javax.swing.JLabel();
        iconMozilla = new javax.swing.JLabel();
        iconVnc = new javax.swing.JLabel();
        iconAdobeAir = new javax.swing.JLabel();
        iconAdobeR = new javax.swing.JLabel();
        iconKaspersky = new javax.swing.JLabel();
        iconWinrar = new javax.swing.JLabel();
        iconJava = new javax.swing.JLabel();
        iconChrome = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        campoNumero = new javax.swing.JTextField();
        campoUrl = new javax.swing.JTextField();
        planoFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 0, 0));
        txt1.setText("1");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        txt2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(0, 0, 0));
        txt2.setText("2");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 100, 20, -1));

        txt3.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 0, 0));
        txt3.setText("3");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        txt4.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        txt4.setForeground(new java.awt.Color(0, 0, 0));
        txt4.setText("4");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        txt5.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        txt5.setForeground(new java.awt.Color(0, 0, 0));
        txt5.setText("5");
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 20, 20));

        txt6.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        txt6.setForeground(new java.awt.Color(0, 0, 0));
        txt6.setText("7");
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        txt7.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        txt7.setForeground(new java.awt.Color(0, 0, 0));
        txt7.setText("8");
        getContentPane().add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        txt8.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        txt8.setForeground(new java.awt.Color(0, 0, 0));
        txt8.setText("9");
        getContentPane().add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        txt9.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        txt9.setForeground(new java.awt.Color(0, 0, 0));
        txt9.setText("6");
        getContentPane().add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        iconWatchguard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/watchguardLogo.png"))); // NOI18N
        getContentPane().add(iconWatchguard, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        iconMozilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NmozilaLog.png"))); // NOI18N
        getContentPane().add(iconMozilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        iconVnc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NultraVncLog.png"))); // NOI18N
        getContentPane().add(iconVnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        iconAdobeAir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NadobeAir.png"))); // NOI18N
        getContentPane().add(iconAdobeAir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        iconAdobeR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NadobeAcrobatLogo.png"))); // NOI18N
        getContentPane().add(iconAdobeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        iconKaspersky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NkasperkyLogo.png"))); // NOI18N
        getContentPane().add(iconKaspersky, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        iconWinrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NwinrarLogo.png"))); // NOI18N
        getContentPane().add(iconWinrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        iconJava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NjavaLog.png"))); // NOI18N
        getContentPane().add(iconJava, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        iconChrome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/normal/NchormeLogo.png"))); // NOI18N
        getContentPane().add(iconChrome, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        btAlterar.setText("Alterar!");
        btAlterar.setBorder(null);
        btAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAlterarMouseExited(evt);
            }
        });
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 80, 40));

        btVoltar.setText("voltar!");
        btVoltar.setBorder(null);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 80, 30));

        campoNumero.setText("Insira o numero para editar url. Ex : \"1\"");
        campoNumero.setBorder(null);
        getContentPane().add(campoNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 390, 40));

        campoUrl.setText("Insira a nova url para o watchguard!");
        campoUrl.setBorder(null);
        getContentPane().add(campoUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 390, 30));

        planoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PfundoEdit .png"))); // NOI18N
        getContentPane().add(planoFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int aux = Integer.parseInt(campoNumero.getText());
        if(aux == 1){
            edit.escrever("url-Watchguard.txt", campoUrl.getText());
            JOptionPane.showMessageDialog(this,"Url watchguard alterado!!");
        }else if(aux == 2){
            edit.escrever("url-AdobeAir.txt", campoUrl.getText());
            JOptionPane.showMessageDialog(this,"Url Adobe Air alterado!!");
        }else if(aux == 3){
            edit.escrever("url-AdobeAcrobat.txt", campoUrl.getText());
            JOptionPane.showMessageDialog(this,"Url Adobe Acrobat alterado!!");
        }else if(aux == 4){
            edit.escrever("url-Java.txt", campoUrl.getText());
            JOptionPane.showMessageDialog(this,"Url Java alterado!!");
        }else if(aux == 5 ){
            edit.escrever("url-Chrome.txt", campoUrl.getText());
            JOptionPane.showMessageDialog(this,"Url Chrome alterado!!");
        }else if(aux == 6){
            edit.escrever("url-Mozilla.txt", campoUrl.getText());
            JOptionPane.showMessageDialog(this,"Url Mozilla alterado!!");
        }else if(aux == 7){
            edit.escrever("url-Vnc.txt", campoUrl.getText());
            JOptionPane.showMessageDialog(this,"Url Ultra VNC alterado!!");
        }else if(aux == 8){
            edit.escrever("url-Kaspersky.txt", campoUrl.getText());
            JOptionPane.showMessageDialog(this,"Url Kaspersky alterado!!");
        }else if(aux == 9){
            edit.escrever("url-Winrar.txt", campoUrl.getText());
            JOptionPane.showMessageDialog(this,"Url Winrar alterado!!");
        }
        
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        AdmTela at = new AdmTela();
        at.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarMouseEntered
        btAlterar.setForeground(Color.blue);
    }//GEN-LAST:event_btAlterarMouseEntered

    private void btAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarMouseExited
        btAlterar.setForeground(Color.black);
    }//GEN-LAST:event_btAlterarMouseExited
    
    
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
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoUrl;
    private javax.swing.JLabel iconAdobeAir;
    private javax.swing.JLabel iconAdobeR;
    private javax.swing.JLabel iconChrome;
    private javax.swing.JLabel iconJava;
    private javax.swing.JLabel iconKaspersky;
    private javax.swing.JLabel iconMozilla;
    private javax.swing.JLabel iconVnc;
    private javax.swing.JLabel iconWatchguard;
    private javax.swing.JLabel iconWinrar;
    private javax.swing.JLabel planoFundo;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    private javax.swing.JLabel txt9;
    // End of variables declaration//GEN-END:variables
}
