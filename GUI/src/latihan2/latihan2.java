/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author NIA
 */
public class latihan2 extends javax.swing.JFrame {

    /**
     * Creates new form latihan2
     */
    public latihan2() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nama1 = new javax.swing.JTextField();
        absen1 = new javax.swing.JTextField();
        kelas1 = new javax.swing.JTextField();
        alamat1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(131, 162, 0, 0);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(91, 136, 0, 0);

        jLabel6.setText("Alamat");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 160, 40, 20);

        jLabel7.setText("formulir");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 30, 50, 14);

        jLabel8.setText("Kelas");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 130, 40, 20);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 70, 40, 20);

        jLabel1.setText("Absen");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 100, 40, 20);
        getContentPane().add(nama1);
        nama1.setBounds(260, 70, 60, 20);

        absen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absen1ActionPerformed(evt);
            }
        });
        getContentPane().add(absen1);
        absen1.setBounds(260, 100, 60, 20);

        kelas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelas1ActionPerformed(evt);
            }
        });
        getContentPane().add(kelas1);
        kelas1.setBounds(260, 130, 60, 20);
        getContentPane().add(alamat1);
        alamat1.setBounds(260, 160, 60, 20);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 250, 220, 130);

        jButton1.setText("oke");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 210, 49, 23);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 490, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void absen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_absen1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Nama = nama1.getText();
        String Absen = absen1.getText();
        String Kelas = kelas1.getText();
        String Alamat = alamat1.getText();
        
        TA.setText("Nama Siswa : "+nama1+"\n"+"Absen:"+absen1+"\n"+"Kelas :"+kelas1+"\n"+"Alamat siswa : "+alamat1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kelas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelas1ActionPerformed

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
            java.util.logging.Logger.getLogger(latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA;
    private javax.swing.JTextField absen1;
    private javax.swing.JTextField alamat1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kelas1;
    private javax.swing.JTextField nama1;
    // End of variables declaration//GEN-END:variables
}
