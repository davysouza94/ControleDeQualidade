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
public class MenuFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form LoginFuncionario
     */
    public MenuFuncionario() {
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

        VisSetorBGroup = new javax.swing.ButtonGroup();
        DadosSetorBGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        VisPane = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        VisGeralPane = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        VisClientePane = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        VisFuncionarioPane = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        VisProdPane = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        VisSetorPane = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        LimparPane = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        DadosPane = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerência de Histórico");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        VisPane.setLayout(new java.awt.GridLayout(1, 0));

        VisGeralPane.setLayout(new java.awt.GridLayout(5, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Data:");
        jPanel13.add(jLabel2);

        VisGeralPane.add(jPanel13);

        jLabel1.setText("De: ");
        jPanel14.add(jLabel1);

        jTextField1.setColumns(8);
        jPanel14.add(jTextField1);

        jLabel3.setText("Até: ");
        jPanel14.add(jLabel3);

        jTextField2.setColumns(8);
        jPanel14.add(jTextField2);

        VisGeralPane.add(jPanel14);
        VisGeralPane.add(jPanel15);
        VisGeralPane.add(jPanel16);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton3.setText("Confirmar");
        jPanel21.add(jButton3);

        VisGeralPane.add(jPanel21);

        jTabbedPane2.addTab("Geral", VisGeralPane);

        VisClientePane.setLayout(new java.awt.GridLayout(5, 0));
        VisClientePane.add(jPanel17);

        jLabel9.setText("CPF do Cliente:");
        jPanel20.add(jLabel9);

        jTextField6.setColumns(8);
        jPanel20.add(jTextField6);

        VisClientePane.add(jPanel20);
        VisClientePane.add(jPanel4);
        VisClientePane.add(jPanel5);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton2.setText("Confirmar");
        jPanel6.add(jButton2);

        VisClientePane.add(jPanel6);

        jTabbedPane2.addTab("Cliente", VisClientePane);

        VisFuncionarioPane.setLayout(new java.awt.GridLayout(5, 0));
        VisFuncionarioPane.add(jPanel22);

        jLabel10.setText("CPF do Funcionário:");
        jPanel23.add(jLabel10);

        jTextField7.setColumns(8);
        jPanel23.add(jTextField7);

        VisFuncionarioPane.add(jPanel23);
        VisFuncionarioPane.add(jPanel7);
        VisFuncionarioPane.add(jPanel8);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton4.setText("Confirmar");
        jPanel9.add(jButton4);

        VisFuncionarioPane.add(jPanel9);

        jTabbedPane2.addTab("Funcionario", VisFuncionarioPane);

        VisProdPane.setLayout(new java.awt.GridLayout(5, 0));
        VisProdPane.add(jPanel24);

        jLabel11.setText("Cod. Produto");
        jPanel25.add(jLabel11);

        jTextField8.setColumns(20);
        jPanel25.add(jTextField8);

        VisProdPane.add(jPanel25);
        VisProdPane.add(jPanel10);
        VisProdPane.add(jPanel11);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton5.setText("Confirmar");
        jPanel12.add(jButton5);

        VisProdPane.add(jPanel12);

        jTabbedPane2.addTab("Produto", VisProdPane);

        VisSetorPane.setLayout(new java.awt.GridLayout(5, 0));

        VisSetorBGroup.add(jRadioButton1);
        jRadioButton1.setText("Venda");
        jPanel26.add(jRadioButton1);

        VisSetorBGroup.add(jRadioButton2);
        jRadioButton2.setText("Atendimento");
        jPanel26.add(jRadioButton2);

        VisSetorBGroup.add(jRadioButton3);
        jRadioButton3.setText("Oficina");
        jPanel26.add(jRadioButton3);

        VisSetorPane.add(jPanel26);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Data:");
        jPanel18.add(jLabel4);

        VisSetorPane.add(jPanel18);

        jLabel5.setText("De: ");
        jPanel19.add(jLabel5);

        jTextField3.setColumns(8);
        jPanel19.add(jTextField3);

        jLabel6.setText("Até: ");
        jPanel19.add(jLabel6);

        jTextField4.setColumns(8);
        jPanel19.add(jTextField4);

        VisSetorPane.add(jPanel19);
        VisSetorPane.add(jPanel31);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton6.setText("Confirmar");
        jPanel32.add(jButton6);

        VisSetorPane.add(jPanel32);

        jTabbedPane2.addTab("Setor", VisSetorPane);

        VisPane.add(jTabbedPane2);

        jTabbedPane1.addTab("Visualizar", VisPane);

        LimparPane.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(5, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Data:");
        jPanel33.add(jLabel7);

        jPanel1.add(jPanel33);

        jLabel8.setText("De: ");
        jPanel34.add(jLabel8);

        jTextField5.setColumns(8);
        jPanel34.add(jTextField5);

        jLabel12.setText("Até: ");
        jPanel34.add(jLabel12);

        jTextField9.setColumns(8);
        jPanel34.add(jTextField9);

        jPanel1.add(jPanel34);
        jPanel1.add(jPanel35);
        jPanel1.add(jPanel36);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton7.setText("Confirmar");
        jPanel37.add(jButton7);

        jPanel1.add(jPanel37);

        LimparPane.add(jPanel1);

        jTabbedPane1.addTab("Limpar", LimparPane);

        DadosPane.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setLayout(new java.awt.GridLayout(4, 0));
        jPanel3.add(jPanel44);

        DadosSetorBGroup.add(jRadioButton7);
        jRadioButton7.setText("Geral");
        jPanel49.add(jRadioButton7);

        DadosSetorBGroup.add(jRadioButton4);
        jRadioButton4.setText("Venda");
        jPanel49.add(jRadioButton4);

        DadosSetorBGroup.add(jRadioButton5);
        jRadioButton5.setText("Atendimento");
        jPanel49.add(jRadioButton5);

        DadosSetorBGroup.add(jRadioButton6);
        jRadioButton6.setText("Oficina");
        jPanel49.add(jRadioButton6);

        jPanel3.add(jPanel49);
        jPanel3.add(jPanel50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Confirmar");
        jPanel51.add(jButton1);

        jPanel3.add(jPanel51);

        jTabbedPane3.addTab("Setores", jPanel3);

        jPanel38.setLayout(new java.awt.GridLayout(5, 0));
        jPanel38.add(jPanel39);

        jLabel13.setText("Cod. Produto");
        jPanel40.add(jLabel13);

        jTextField10.setColumns(20);
        jPanel40.add(jTextField10);

        jPanel38.add(jPanel40);
        jPanel38.add(jPanel41);
        jPanel38.add(jPanel42);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton8.setText("Confirmar");
        jPanel43.add(jButton8);

        jPanel38.add(jPanel43);

        jTabbedPane3.addTab("Produtos", jPanel38);

        jPanel2.add(jTabbedPane3);

        DadosPane.add(jPanel2);

        jTabbedPane1.addTab("Dados estatísticos", DadosPane);

        jPanel27.setLayout(new java.awt.GridLayout(5, 0));
        jPanel27.add(jPanel28);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setText("Deseja voltar ao menu inicial?");
        jPanel29.add(jLabel14);

        jPanel27.add(jPanel29);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("Confirmar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel30.add(jButton9);

        jPanel27.add(jPanel30);

        jTabbedPane1.addTab("Sair", jPanel27);

        getContentPane().add(jTabbedPane1);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton9MouseClicked

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
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DadosPane;
    private javax.swing.ButtonGroup DadosSetorBGroup;
    private javax.swing.JPanel LimparPane;
    private javax.swing.JPanel VisClientePane;
    private javax.swing.JPanel VisFuncionarioPane;
    private javax.swing.JPanel VisGeralPane;
    private javax.swing.JPanel VisPane;
    private javax.swing.JPanel VisProdPane;
    private javax.swing.ButtonGroup VisSetorBGroup;
    private javax.swing.JPanel VisSetorPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
