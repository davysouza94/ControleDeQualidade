/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.de.qualidade;

/**
 *
 * @author Bruno
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public Login() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de controle de qualidade");
        getContentPane().setLayout(new java.awt.GridLayout(3, 0));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Faça seu Login:");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Digite seu cpf:");
        jPanel2.add(jLabel2);

        jTextField1.setColumns(11);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1);

        getContentPane().add(jPanel2);

        warningLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(warningLabel);

        getContentPane().add(jPanel3);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Cliente c;
        String cpf;
        int tam;

        cpf = jTextField1.getText();
        tam = cpf.length();

        if ((tam != 11 && !cpf.matches("[0-9]+")) || tam == 0) {
            warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve ter 11 dígitos e apenas números.</html>");
        } else if (tam != 11) {
            warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve ter 11 dígitos.</html>");
        } else if (!cpf.matches("[0-9]+")) {
            warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve conter apenas números.</html>");
        } else {
            c = new Cliente();
            c.setCpf(jTextField1.getText());
            c.setNome("Zeh");
            c.setEndereco("Buraco Negro, 42");

            setVisible(false);
            if (cpf.equals("00000000000")) {
                new MenuFuncionario().setVisible(true);
            } else {
                new MenuCliente(c).setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Cliente c;
            String cpf;
            int tam;

            cpf = jTextField1.getText();
            tam = cpf.length();

            if ((tam != 11 && !cpf.matches("[0-9]+")) || tam == 0) {
                warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve ter 11 dígitos e apenas números.</html>");
            } else if (tam != 11) {
                warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve ter 11 dígitos.</html>");
            } else if (!cpf.matches("[0-9]+")) {
                warningLabel.setText("<html>CPF Inválido!!! <br />O CPF deve conter apenas números.</html>");
            } else {
                c = new Cliente();
                c.setCpf(jTextField1.getText());
                c.setNome("Zeh");
                c.setEndereco("Buraco Negro, 42");

                setVisible(false);
                if (cpf.equals("00000000000")) {
                    new MenuFuncionario().setVisible(true);
                } else {
                    new MenuCliente(c).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
