
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Quora extends javax.swing.JFrame {

    /**
     * Creates new form Quora
     */
    public Quora() {
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

        closebtn = new javax.swing.JButton();
        question = new javax.swing.JTextField();
        answer = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        quora = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        chat = new javax.swing.JButton();
        map = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 670));
        setPreferredSize(new java.awt.Dimension(1100, 670));
        getContentPane().setLayout(null);

        closebtn.setText("jButton1");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn);
        closebtn.setBounds(999, 25, 50, 40);

        question.setText("jTextField1");
        question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionActionPerformed(evt);
            }
        });
        getContentPane().add(question);
        question.setBounds(180, 160, 480, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        answer.setViewportView(jTextArea1);

        getContentPane().add(answer);
        answer.setBounds(180, 330, 460, 260);

        quora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/anu rgemer.jpg"))); // NOI18N
        quora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quoraMouseClicked(evt);
            }
        });
        getContentPane().add(quora);
        quora.setBounds(0, 0, 1100, 650);

        home.setText("jButton1");
        getContentPane().add(home);
        home.setBounds(50, 210, 50, 40);

        chat.setText("jButton2");
        getContentPane().add(chat);
        chat.setBounds(50, 290, 50, 50);

        map.setText("jButton3");
        getContentPane().add(map);
        map.setBounds(50, 370, 40, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closebtnActionPerformed

    private void quoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quoraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_quoraMouseClicked

    private void questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionActionPerformed

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
            java.util.logging.Logger.getLogger(Quora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane answer;
    private javax.swing.JButton chat;
    private javax.swing.JButton closebtn;
    private javax.swing.JButton home;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton map;
    private javax.swing.JTextField question;
    private javax.swing.JLabel quora;
    // End of variables declaration//GEN-END:variables
}
