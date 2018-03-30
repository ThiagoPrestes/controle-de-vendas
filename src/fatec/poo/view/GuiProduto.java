
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoProduto;
import fatec.poo.model.Produto;
import fatec.poo.utils.Exceptions;
import fatec.poo.utils.StateJButtons;
import fatec.poo.utils.StateJtextFields;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.trim;

/**
 *
 * @authors Felipe, Thiago e Marcos
 */
public class GuiProduto extends javax.swing.JFrame{
    
    public GuiProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtQtdeDisp = new javax.swing.JTextField();
        txtPrecoUnit = new javax.swing.JTextField();
        txtEstoqueMin = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("Descrição");

        jLabel3.setText("Qtde. Disponível");

        jLabel4.setText("Preço Unitário");

        jLabel5.setText("Estoque Mínimo");

        txtDescricao.setEnabled(false);

        txtQtdeDisp.setEnabled(false);

        txtPrecoUnit.setEnabled(false);

        txtEstoqueMin.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQtdeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("system", "41793979");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoProduto = new DaoProduto(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened
	
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        conexao.fecharConexao();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int cod;
        String nameDialog = "Erro de entrada";
        
        if(!Exceptions.fieldIsEmpty(txtCodigo, "código", nameDialog) && Exceptions.convertStringToInt(txtCodigo, "código", nameDialog) && !Exceptions.numberNegative(txtCodigo, "código", nameDialog)){
            cod = Integer.parseInt(trim(txtCodigo.getText()));
            produto = daoProduto.consultar(cod);
            
            StateJtextFields.enableJFieldsFrame(this);
            txtCodigo.setEnabled(false);
            txtDescricao.requestFocus(); 
            
            if(produto == null){
                StateJButtons.consultaNaoEncontrada(btnConsultar, btnIncluir, btnAlterar, btnExcluir); 
            }else{
              txtDescricao.setText(produto.getDescricao());
              txtQtdeDisp.setText(Integer.toString(produto.getQtdeDisponivel()));
              txtPrecoUnit.setText(Double.toString(produto.getPrecoUnit()));
              txtEstoqueMin.setText(Integer.toString(produto.getEstoqueMin()));
              StateJButtons.consultaEncontrada(btnConsultar, btnIncluir, btnAlterar, btnExcluir);
            }
        }      
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        //fazendo a insercao no banco
        String nameDialog = "Erro de entrada";
        int cod = Integer.parseInt(txtCodigo.getText());
        
        if(!Exceptions.fieldIsEmpty(txtDescricao, "descricao", nameDialog)){
            if(!Exceptions.fieldIsEmpty(txtQtdeDisp, "Qtde. Disponível", nameDialog) && Exceptions.convertStringToInt(txtQtdeDisp, "Qtde. Disponível", nameDialog) && !Exceptions.numberNegative(txtQtdeDisp, "Qtde. Disponível", nameDialog)){
                if(!Exceptions.fieldIsEmpty(txtPrecoUnit, "Preço Unitário", nameDialog) && Exceptions.convertStringToDouble(txtPrecoUnit, "Preço Unitário", nameDialog) && !Exceptions.numberGreaterZero(txtPrecoUnit, "Preço Unitário", nameDialog)){
                    if(!Exceptions.fieldIsEmpty(txtEstoqueMin, "Estoque Mínimo", nameDialog) && Exceptions.convertStringToInt(txtEstoqueMin, "Estoque Mínimo", nameDialog) && !Exceptions.numberGreaterZero(txtEstoqueMin, "Estoque Mínimo", nameDialog)){
                        produto = new Produto(cod, trim(txtDescricao.getText()), Integer.parseInt(txtQtdeDisp.getText()),  Double.parseDouble(txtPrecoUnit.getText()),  Integer.parseInt(txtEstoqueMin.getText()));               
                        daoProduto.inserir(produto);

                        JOptionPane.showMessageDialog(null, "Produto inserido com sucesso", "Cadastro Finalizado", JOptionPane.INFORMATION_MESSAGE);
                        
                        StateJtextFields.clearFrame(this);
                        StateJtextFields.disableJFieldsFrame(this);
                        txtCodigo.setEnabled(true);
                        StateJButtons.incluir(btnConsultar, btnIncluir, btnAlterar, btnExcluir);
                        
                    }
                }
            }
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String nameDialog = "Erro de entrada";

        if(!Exceptions.fieldIsEmpty(txtDescricao, "descricao", nameDialog)){
            if(!Exceptions.fieldIsEmpty(txtQtdeDisp, "Qtde. Disponível", nameDialog) && Exceptions.convertStringToInt(txtQtdeDisp, "Qtde. Disponível", nameDialog) && !Exceptions.numberNegative(txtQtdeDisp, "Qtde. Disponível", nameDialog)){
                if(!Exceptions.fieldIsEmpty(txtPrecoUnit, "Preço Unitário", nameDialog) && Exceptions.convertStringToDouble(txtPrecoUnit, "Preço Unitário", nameDialog) && !Exceptions.numberGreaterZero(txtPrecoUnit, "Preço Unitário", nameDialog)){
                    if(!Exceptions.fieldIsEmpty(txtEstoqueMin, "Estoque Mínimo", nameDialog) && Exceptions.convertStringToInt(txtEstoqueMin, "Estoque Mínimo", nameDialog) && !Exceptions.numberGreaterZero(txtEstoqueMin, "Estoque Mínimo", nameDialog)){
                        produto = new Produto(Integer.parseInt(txtCodigo.getText()), trim(txtDescricao.getText()), Integer.parseInt(txtQtdeDisp.getText()),  Double.parseDouble(txtPrecoUnit.getText()),  Integer.parseInt(txtEstoqueMin.getText()));               
                        daoProduto.alterar(produto);

                        JOptionPane.showMessageDialog(null, "Produto alterado com sucesso", "ALteração Finalizado", JOptionPane.INFORMATION_MESSAGE);
                        StateJtextFields.clearFrame(this);
                        StateJtextFields.disableJFieldsFrame(this);
                        txtCodigo.setEnabled(true);
                        txtCodigo.requestFocus();
                        StateJButtons.incluir(btnConsultar, btnIncluir, btnAlterar, btnExcluir);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        produto = new Produto(Integer.parseInt(txtCodigo.getText()), trim(txtDescricao.getText()), Integer.parseInt(txtQtdeDisp.getText()),  Double.parseDouble(txtPrecoUnit.getText()),  Integer.parseInt(txtEstoqueMin.getText()));               
        
        int option = JOptionPane.showConfirmDialog(null, "Comfirma exclusão?\nProduto:\nCodigo: "+produto.getCodigo()+"\nDescrição: "+produto.getDescricao(), "Exclusão de Produto", JOptionPane.YES_NO_OPTION);
        
        if(option == JOptionPane.YES_OPTION){
        daoProduto.excluir(produto);
        JOptionPane.showMessageDialog(null, "Produto excluído com sucesso", "Exclusão Finalizado", JOptionPane.INFORMATION_MESSAGE);

        StateJtextFields.clearFrame(this);
        StateJtextFields.disableJFieldsFrame(this);
        txtCodigo.setEnabled(true);
        StateJButtons.incluir(btnConsultar, btnIncluir, btnAlterar, btnExcluir);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GuiProduto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueMin;
    private javax.swing.JTextField txtPrecoUnit;
    private javax.swing.JTextField txtQtdeDisp;
    // End of variables declaration//GEN-END:variables
    private Conexao conexao;
    private DaoProduto daoProduto;
    private Produto produto = null;
}
