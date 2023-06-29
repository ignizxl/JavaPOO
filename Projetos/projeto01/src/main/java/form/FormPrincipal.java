/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import com.mycompany.projeto01.Dados;

/**
 *
 * @author João Igor
 */
public class FormPrincipal extends javax.swing.JFrame {

    //atributo
    private Dados validarDados;
    
    //método set
    public void setValidarDados(Dados validarDados) {
        this.validarDados = validarDados;
    }
    
    public FormPrincipal() {
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

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuArquivoClientes = new javax.swing.JMenuItem();
        menuArquivoProdutos = new javax.swing.JMenuItem();
        menuArquivoUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuArquivoTrocarUsuario = new javax.swing.JMenuItem();
        menuArquivoTrocarSenha = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuArquivoSair = new javax.swing.JMenuItem();
        menuMovimentos = new javax.swing.JMenu();
        menuMovimentosNovaVenda = new javax.swing.JMenuItem();
        menuMovimentosRelatorioDeVenda = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuAjudaAjuda = new javax.swing.JMenuItem();
        menuAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas Simples");

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        menuArquivo.setText("Arquivo");

        menuArquivoClientes.setText("Clientes");
        menuArquivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoClientesActionPerformed(evt);
            }
        });
        menuArquivo.add(menuArquivoClientes);

        menuArquivoProdutos.setText("Produtos");
        menuArquivo.add(menuArquivoProdutos);

        menuArquivoUsuarios.setText("Usuários");
        menuArquivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoUsuariosActionPerformed(evt);
            }
        });
        menuArquivo.add(menuArquivoUsuarios);
        menuArquivo.add(jSeparator1);

        menuArquivoTrocarUsuario.setText("Trocar usuário");
        menuArquivoTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoTrocarUsuarioActionPerformed(evt);
            }
        });
        menuArquivo.add(menuArquivoTrocarUsuario);

        menuArquivoTrocarSenha.setText("Trocar senha");
        menuArquivoTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoTrocarSenhaActionPerformed(evt);
            }
        });
        menuArquivo.add(menuArquivoTrocarSenha);
        menuArquivo.add(jSeparator2);

        menuArquivoSair.setText("Sair");
        menuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuArquivoSair);

        jMenuBar1.add(menuArquivo);

        menuMovimentos.setText("Movimentos");

        menuMovimentosNovaVenda.setText("Nova Venda");
        menuMovimentosNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMovimentosNovaVendaActionPerformed(evt);
            }
        });
        menuMovimentos.add(menuMovimentosNovaVenda);

        menuMovimentosRelatorioDeVenda.setText("Relatório de Vendas");
        menuMovimentos.add(menuMovimentosRelatorioDeVenda);

        jMenuBar1.add(menuMovimentos);

        menuAjuda.setText("Ajuda");

        menuAjudaAjuda.setText("Ajuda");
        menuAjudaAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaAjudaActionPerformed(evt);
            }
        });
        menuAjuda.add(menuAjudaAjuda);

        menuAjudaSobre.setText("Sobre");
        menuAjuda.add(menuAjudaSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArquivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuArquivoClientesActionPerformed

    private void menuArquivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoUsuariosActionPerformed
        // Criando o objeto telaDeUsuários para depois 'chamar' o formulário
        FormUsuarios telaDeUsuarios = new FormUsuarios();
        //chamando o método set 
        telaDeUsuarios.setValidarDados(validarDados);
        desktopPane.add(telaDeUsuarios);
        // mostrando a tela de usuários 
        telaDeUsuarios.show();
    }//GEN-LAST:event_menuArquivoUsuariosActionPerformed

    private void menuArquivoTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoTrocarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuArquivoTrocarSenhaActionPerformed

    private void menuArquivoTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoTrocarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuArquivoTrocarUsuarioActionPerformed

    private void menuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuArquivoSairActionPerformed

    private void menuMovimentosNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMovimentosNovaVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMovimentosNovaVendaActionPerformed

    private void menuAjudaAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaAjudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAjudaAjudaActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjudaAjuda;
    private javax.swing.JMenuItem menuAjudaSobre;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuArquivoClientes;
    private javax.swing.JMenuItem menuArquivoProdutos;
    private javax.swing.JMenuItem menuArquivoSair;
    private javax.swing.JMenuItem menuArquivoTrocarSenha;
    private javax.swing.JMenuItem menuArquivoTrocarUsuario;
    private javax.swing.JMenuItem menuArquivoUsuarios;
    private javax.swing.JMenu menuMovimentos;
    private javax.swing.JMenuItem menuMovimentosNovaVenda;
    private javax.swing.JMenuItem menuMovimentosRelatorioDeVenda;
    // End of variables declaration//GEN-END:variables
}
