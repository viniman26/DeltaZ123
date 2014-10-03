/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deltaz123.apresentacao;

import br.com.deltaz123.negocio.Equipamento;
import br.com.deltaz123.negocio.Fixo;
import br.com.deltaz123.negocio.Portatil;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ruan
 */
public class fmCadEquipamento extends JFrame{ 
    
    fmPrincipal cadastro = new fmPrincipal();
    /**
     * Creates new form fmCodEquipamento
     */
    public fmCadEquipamento() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodEquipamento = new javax.swing.JTextField();
        txtCodPatrimonial = new javax.swing.JTextField();
        txtAcessorio = new javax.swing.JTextField();
        cbTipoRede = new javax.swing.JComboBox();
        txtMatUsuario = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox();
        cbUso = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btExibir = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();

        setTitle("Cadastro de Equipamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código");

        jLabel2.setText("Código Patrimonial");

        jLabel3.setText("Tipo");

        jLabel4.setText("Acessório");

        jLabel5.setText("Uso");

        jLabel6.setText("Rede");

        jLabel7.setText("Matrícula Usuário");

        cbTipoRede.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Wirelles", "Rádio Frequência", "Fixo" }));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fixo", "Portátil" }));

        cbUso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Coletivo", "Individual" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbTipoRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addComponent(txtCodPatrimonial)
                        .addComponent(txtAcessorio)
                        .addComponent(txtMatUsuario))
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodPatrimonial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbTipoRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMatUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExibir.setText("Exibir");
        btExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpar)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar)
                    .addComponent(btExibir))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        Component components[] = jPanel1.getComponents();  
        for (Component component : components)  
        {  
            if (component instanceof JTextField)  
            {  
                ((JTextField)component).setText(null);  
            }  
        } 
        txtCodEquipamento.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed
      
    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        
        String tipo = (String) cbTipo.getSelectedItem();
        if(null != tipo)switch (tipo) {
            
            case "Fixo":
                Fixo fixo = new Fixo(txtCodEquipamento.getText(), txtCodPatrimonial.getText(), (String) cbTipo.getSelectedItem(), txtAcessorio.getText(),(String) cbUso.getSelectedItem(), (String) cbTipoRede.getSelectedItem(), txtMatUsuario.getText());
                cadastro.inserirEquipamento(fixo);
                JOptionPane.showMessageDialog(null, "Equipamento Fixo adiconado com sucesso!");
                //cadastroEquipamento = new Cadastro(fixo);
                //JOptionPane.showMessageDialog(null, "Valor do id na tela principal ");
                break;
            case "Portátil":
                Portatil portatil = new Portatil(txtCodEquipamento.getText(), txtCodPatrimonial.getText(), (String) cbTipo.getSelectedItem(), txtAcessorio.getText(),(String) cbUso.getSelectedItem(), (String) cbTipoRede.getSelectedItem(), txtMatUsuario.getText()) ;
                cadastro.inserirEquipamento(portatil);
                JOptionPane.showMessageDialog(null, "Equipamento portátil adiconado com sucesso!");

                //cadastroEquipamento = new Cadastro(portatil);
                //JOptionPane.showMessageDialog(null, "Tamanho do meu cadastro "+cadastroEquipamento.index);
                break;
            
            
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExibirActionPerformed
        // TODO add your handling code here:
        String valorPesquisado = JOptionPane.showInputDialog(null, "Digite o código do equipamento a ser pesquisado: ");
        Equipamento equipamento = new Equipamento(){};
        equipamento = cadastro.cadastroEquipamento.exibirEquipamento(valorPesquisado);
        
        if(equipamento.getCodEquipamento().equals(valorPesquisado)){
            
            txtCodEquipamento.setText(equipamento.getCodEquipamento());
            txtCodPatrimonial.setText(equipamento.getCodPatrimonial());
            //Tipo de equipamento
            String tipoEquipamento = equipamento.getTipo();
            if(null != tipoEquipamento)switch (tipoEquipamento) {
                
                case "Fixo": 
                    cbTipo.setSelectedItem("Fixo");
                    break;
                case "Portátil":
                    cbTipo.setSelectedItem("Portátil");
                    break;
            }
            txtAcessorio.setText(equipamento.getAcesorio());
            //Tipo de uso
            String tipoUso = equipamento.getTipoUso();
            if(null != tipoUso)switch (tipoUso) {
                
                case "Coletivo": 
                    cbUso.setSelectedItem("Coletivo");
                    break;
                case "Individual":
                    cbUso.setSelectedItem("Individual");
                    break;
            }
            //Tipo de rede
            String tipoRede = equipamento.getTipoRede();
            if(null != tipoRede)switch (tipoRede) {
                
                case "Wirelles": 
                    cbTipoRede.setSelectedItem("Wirelles");
                    break;
                case "Rádio Frequência":
                    cbTipoRede.setSelectedItem("Rádio Frequência");
                    break;
                case "Fixo":
                    cbTipoRede.setSelectedItem("Fixo");
                    break;
            }
            txtMatUsuario.setText(equipamento.getMatUsuario());
        } else{
            JOptionPane.showMessageDialog(null, "Valor não encontrado. Por favor faça uma nova busca!!!");
        }
    }//GEN-LAST:event_btExibirActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        String valorPesquisado = JOptionPane.showInputDialog(null, "Digite o código do equipamento a ser Excluido: ");
        Equipamento equipamento = new Equipamento(){};
        equipamento = cadastro.cadastroEquipamento.exibirEquipamento(valorPesquisado);
        if(equipamento.getCodEquipamento().equals(valorPesquisado)){
            cadastro.cadastroEquipamento.exclusaoEquipamento(valorPesquisado);
        }else {
            JOptionPane.showMessageDialog(null, "Não existe este Equipamento");    
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        // TODO add your handling code here:

        // Buscar o equipamento e exibir na tela .
        // btExibirActionPerformed(evt);
        // salvar a alteração

        //btCadastrarActionPerformed(evt);
        if (!" ".equals(txtCodEquipamento.getText())){
        cadastro.cadastroEquipamento.exclusaoEquipamento(txtCodEquipamento.getText());
        btCadastrarActionPerformed(evt);
        }else {
            JOptionPane.showMessageDialog( null , "Nenhum equipamento cadastrado no sistema");
        }
    }//GEN-LAST:event_btAlterarActionPerformed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmCadEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new fmCadEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btExibir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JComboBox cbTipoRede;
    private javax.swing.JComboBox cbUso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAcessorio;
    private javax.swing.JTextField txtCodEquipamento;
    private javax.swing.JTextField txtCodPatrimonial;
    private javax.swing.JTextField txtMatUsuario;
    // End of variables declaration//GEN-END:variables


}
