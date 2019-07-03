/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.admin;

import coletainteligente.Coletor;
import coletainteligente.Lixeira;
import coletainteligente.SituacaoOperacional;
import coletainteligente.Status;
import coletainteligentedao.BairroDAO;
import coletainteligentedao.ColetorDAO;
import coletainteligentedao.LixeiraDAO;
import coletainteligentedao.SituacaoOperacionalDAO;
import coletainteligentedao.StatusDAO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class TelaCadastroSO extends javax.swing.JFrame {

    /**
     * Creates new form testeJframe
     */
    private List <Object> listaBairro;
    private List <Coletor> listaColetor;
    
    public TelaCadastroSO() {
        initComponents();
        
        BairroDAO bairrodao = new BairroDAO();
        listaBairro = bairrodao.selectListaBairro();
        
        ColetorDAO coletordao = new ColetorDAO();
        listaColetor = coletordao.listaColetoresList();
        
        jComboBoxColetor.removeAllItems();
        jComboBoxBairro.removeAllItems();
        
        listaBairro.forEach((bairro) -> {
            jComboBoxBairro.addItem((String) bairro);
        });
        
        listaColetor.forEach((coletor) -> {
            jComboBoxColetor.addItem(coletor.getPlaca());
        });
        
        
        
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
        jButtonRegistrar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListStatus = new javax.swing.JList();
        jComboBoxColetor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jButtonMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLixeira = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldSOAtual = new javax.swing.JTextField();
        jButtonVerifica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registra SO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Alteração de Situação Operacional");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 210, 20));

        jButtonRegistrar.setText("Cadastrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jLabel2.setText("Selecionar Coletor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Selecionar Lixeira");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel4.setText("Novo Status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 80, -1));

        jScrollPane3.setViewportView(jListStatus);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 85, 100));

        jComboBoxColetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBoxColetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, -1));

        jLabel5.setText("Selecionar Bairro");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jComboBoxBairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBoxBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 190, -1));

        jButtonMostrar.setText("Mostrar Lixeiras");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jScrollPane1.setViewportView(jListLixeira);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 100));

        jLabel6.setText("Status");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));
        jPanel1.add(jTextFieldSOAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, 40));

        jButtonVerifica.setText("Verificar SO Atual");
        jButtonVerifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVerifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 370));

        setSize(new java.awt.Dimension(457, 406));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        SituacaoOperacional so;
        SituacaoOperacionalDAO soDAO = new SituacaoOperacionalDAO();
        Lixeira lixeira = new Lixeira();
        Coletor coletor = new Coletor();
        Status status = new Status();
        StatusDAO statusDAO = new StatusDAO();
        if(jListStatus.getSelectedValue() != null){
            try {
            // TODO add your handling code here:
            lixeira.setCodigo(jListLixeira.getSelectedValue());
            coletor.setCodigo(Integer.toString(jComboBoxColetor.getSelectedIndex() + 1));
            status.setCodigo(Integer.toString(statusDAO.retornaCodigo((String) jListStatus.getSelectedValue())));
            so = new SituacaoOperacional(lixeira, coletor, status, Calendar.getInstance().getTime());
            soDAO.insere(so);
            JOptionPane.showMessageDialog(null, "Realizado o Registro");
            jTextFieldSOAtual.setText("");
            DefaultListModel model = new DefaultListModel();
            model.clear();
            jListStatus.setModel(model);
            
            
            
            // Contrutor SituacaoOperacional(Lixeira lixeira, Coletor coletor, Status status, Calendar data)
            } catch (Exception ex) {
                System.out.print(ex.getMessage());
                Logger.getLogger(TelaCadastroSO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Selecione 1 Novo Status para o Registro");
        }
        
        
        
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        // TODO add your handling code here:
        int codBairro;
        List<Integer> dados;
        BairroDAO bairrodao = new BairroDAO();
        LixeiraDAO lixeiradao = new LixeiraDAO();
        
        String nomeBairro = (String) listaBairro.get(jComboBoxBairro.getSelectedIndex());
        codBairro = bairrodao.codBairro(nomeBairro);
        dados = new ArrayList();
        dados = lixeiradao.listaLixeirasPorBairro(codBairro);
        String[] cod;
        cod = new String[dados.size()];
        
        for(int i=0; i<dados.size();i++) {
            cod[i] = Integer.toString(dados.get(i));
        }
        jListLixeira.setListData(cod);
        
        
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jButtonVerificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificaActionPerformed
        // TODO add your handling code here:
        StatusDAO statusdao = new StatusDAO();
        SituacaoOperacionalDAO soDAO = new SituacaoOperacionalDAO();
        if(jListLixeira.getSelectedValue() != null){
            int codLixeira = Integer.parseInt(jListLixeira.getSelectedValue());
            int codStatus = soDAO.verificaUltimoStatus(codLixeira);
            System.out.println(codStatus);
            String descricao;
            if(codStatus == 0){
                jTextFieldSOAtual.setText("Não há registro");
            }else {
                descricao = statusdao.retornaDescricao(codStatus);
                jTextFieldSOAtual.setText(descricao);
            }

            jListStatus.setListData(statusdao.selectDescricaoRestrita(codStatus).toArray());
            
        }else {
            JOptionPane.showMessageDialog(null, "Selecione 1 lixeira");
        }
        
        
        
    }//GEN-LAST:event_jButtonVerificaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroSO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonVerifica;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JComboBox<String> jComboBoxColetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListLixeira;
    private javax.swing.JList jListStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldSOAtual;
    // End of variables declaration//GEN-END:variables
}