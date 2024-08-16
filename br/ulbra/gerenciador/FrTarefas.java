/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.gerenciador;

import java.awt.event.KeyEvent;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author thain
 */
public class FrTarefas extends javax.swing.JFrame {

    /**
     * Creates new form FrTarefas
     */
    public FrTarefas() {
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtLista = new javax.swing.JTextArea();
        btnListar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnOrdemAlfabetica = new javax.swing.JButton();
        btnExcluirTudo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        edtQuantidade = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtTarefa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel3.setText("RELAÇÃO DE TAREFAS:");

        edtLista.setColumns(20);
        edtLista.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        edtLista.setRows(5);
        jScrollPane1.setViewportView(edtLista);

        btnListar.setFont(new java.awt.Font("Noto Serif Georgian", 2, 24)); // NOI18N
        btnListar.setText("LISTAR TAREFAS");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Noto Serif Georgian", 2, 24)); // NOI18N
        btnEditar.setText("EDITAR TAREFA");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Noto Serif Georgian", 2, 24)); // NOI18N
        btnRemover.setText("REMOVER TAREFA");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnOrdemAlfabetica.setFont(new java.awt.Font("Noto Serif Georgian", 2, 24)); // NOI18N
        btnOrdemAlfabetica.setText("LISTA EM ORDEM ALFABÉTICA");
        btnOrdemAlfabetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdemAlfabeticaActionPerformed(evt);
            }
        });

        btnExcluirTudo.setFont(new java.awt.Font("Noto Serif Georgian", 2, 24)); // NOI18N
        btnExcluirTudo.setText("EXCLUIR TUDO");
        btnExcluirTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTudoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("QUANTIDADE DE TAREFAS:");

        edtQuantidade.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        edtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnListar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnOrdemAlfabetica)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemover)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirTudo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel3)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdemAlfabetica)
                    .addComponent(btnRemover)
                    .addComponent(btnEditar)
                    .addComponent(btnListar)
                    .addComponent(btnExcluirTudo))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 193, 1430, 590));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 3, 36)); // NOI18N
        jLabel1.setText("GERENCIADOR DE TAREFAS");

        edtTarefa.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        edtTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTarefaActionPerformed(evt);
            }
        });
        edtTarefa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtTarefaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("INFORME A TAREFA:");

        btnSalvar.setFont(new java.awt.Font("Noto Serif Georgian", 2, 24)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(jLabel1)
                .addContainerGap(541, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(edtTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnSalvar))
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTarefaActionPerformed
    GerenciadorDeTarefas t = new GerenciadorDeTarefas();
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        t.salvar(edtTarefa.getText());
        edtTarefa.setText("");
        edtTarefa.requestFocus();
        edtQuantidade.setText(String.valueOf(t.lista.size()));
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        edtLista.setText(t.listar());
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnListar.doClick();
        int cod;
        String novaTarefa;
        cod = Integer.parseInt(JOptionPane.showInputDialog("Qual o código da tarefa?"));
        novaTarefa = JOptionPane.showInputDialog("Nova tarefa");
        t.editar((cod - 1), novaTarefa);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        btnListar.doClick();
        int cod;
        cod = Integer.parseInt(JOptionPane.showInputDialog("Qual o código da tarefa?"));
        t.remover((cod - 1));
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnOrdemAlfabeticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdemAlfabeticaActionPerformed
        Collections.sort(t.lista);
        btnListar.doClick();
    }//GEN-LAST:event_btnOrdemAlfabeticaActionPerformed

    private void edtTarefaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTarefaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvar.doClick();
        }
    }//GEN-LAST:event_edtTarefaKeyPressed

    private void btnExcluirTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTudoActionPerformed
        btnListar.doClick();
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o código:"));
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?", "confirme", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            t.lista.clear();
            edtLista.setText(t.listar());
            edtQuantidade.setText(t.listar());
            edtTarefa.setText(t.listar());
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada com sucesso!");
        }
        t.lista.clear();
        btnListar.doClick();

    }//GEN-LAST:event_btnExcluirTudoActionPerformed

    private void edtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtQuantidadeActionPerformed

    }//GEN-LAST:event_edtQuantidadeActionPerformed

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
            java.util.logging.Logger.getLogger(FrTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrTarefas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluirTudo;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnOrdemAlfabetica;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextArea edtLista;
    private javax.swing.JTextField edtQuantidade;
    private javax.swing.JTextField edtTarefa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
