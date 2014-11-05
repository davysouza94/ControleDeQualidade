/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.de.qualidade;

/**
 *
 * @author davys_000
 */
public class LoginCliente extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginCliente() {
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
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        warningLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boxCPF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnProsseguir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.GridLayout(4, 1));

        jLabel2.setText("Faça seu Login:");
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1);

        jPanel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 0));

        warningLabel.setForeground(new java.awt.Color(233, 13, 13));
        jPanel4.add(warningLabel);

        getContentPane().add(jPanel4);

        jLabel1.setText("CPF:");
        jPanel2.add(jLabel1);

        boxCPF.setColumns(20);
        boxCPF.setToolTipText("Digite seu CPF...");
        boxCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxCPFKeyPressed(evt);
            }
        });
        jPanel2.add(boxCPF);

        getContentPane().add(jPanel2);

        btnProsseguir.setText("Prosseguir");
        btnProsseguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProsseguirMouseClicked(evt);
            }
        });
        btnProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsseguirActionPerformed(evt);
            }
        });
        jPanel3.add(btnProsseguir);

        getContentPane().add(jPanel3);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsseguirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProsseguirActionPerformed

    private void btnProsseguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProsseguirMouseClicked
        // TODO add your handling code here:

        String cpf;
        int tam;

        cpf = boxCPF.getText();
        tam = cpf.length();

        if ((tam != 11 && !cpf.matches("[0-9]+")) || tam == 0) {
            warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve ter 11 dígitos e apenas números.</html>");
        } else if (tam != 11) {
            warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve ter 11 dígitos.</html>");
        } else if (!cpf.matches("[0-9]+")) {
            warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve conter apenas números.</html>");
        } else {
            c = new Cliente();
            c.setCpf(boxCPF.getText());
            c.setNome("José");
            c.setEndereco("Buraco Negro, 987");

            MenuCliente m = new MenuCliente(c);
            m.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_btnProsseguirMouseClicked

    private void boxCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxCPFKeyPressed

        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            String cpf;
            int tam;

            cpf = boxCPF.getText();
            tam = cpf.length();

            if ((tam != 11 && !cpf.matches("[0-9]+")) || tam == 0) {
                warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve ter 11 dígitos e apenas números.</html>");
            } else if (tam != 11) {
                warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve ter 11 dígitos.</html>");
            } else if (!cpf.matches("[0-9]+")) {
                warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve conter apenas números.</html>");
            } else {
                c = new Cliente();
                c.setCpf(boxCPF.getText());
                c.setNome("José");
                c.setEndereco("Buraco Negro, 987");

                MenuCliente m = new MenuCliente(c);
                m.setVisible(true);
                setVisible(false);
            }
        }
    }//GEN-LAST:event_boxCPFKeyPressed

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
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxCPF;
    private javax.swing.JButton btnProsseguir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
    private Cliente c;
}