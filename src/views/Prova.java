/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;


import controllers.DisciplinaController;
import controllers.ProvaController;
import controllers.QuestaoAbertaController;
import controllers.QuestaoController;
import java.awt.event.ItemListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Questao;

/**
 *
 * @author Paulo Henrique
 */
public class Prova extends javax.swing.JFrame {
    private ArrayList<models.Questao> listaDeModelsQuestoes;
    
    
    /**
     * Creates new form Prova
     */
    public Prova() {
      
        listaDeModelsQuestoes = new ArrayList<>();
        
        initComponents();
        setResizable(false);
        listarQuestoes();
        listarDisciplina();
        
    }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProvasTela = new javax.swing.JTextArea();
        tituloP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        idRemove = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        questoes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        disciplina = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        titulo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idGeraPDF = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setTitle("Provas");

        listaProvasTela.setEditable(false);
        listaProvasTela.setColumns(20);
        listaProvasTela.setRows(5);
        jScrollPane2.setViewportView(listaProvasTela);

        tituloP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloPActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        idRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRemoveActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Titulo");

        questoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questoesActionPerformed(evt);
            }
        });

        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Questões");

        jLabel6.setText("Disciplina");

        disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplinaActionPerformed(evt);
            }
        });

        jButton4.setText("Salvar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Titulo");

        jLabel5.setText("ID");

        idGeraPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idGeraPDFActionPerformed(evt);
            }
        });

        jButton6.setText("Gerar PDF");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idGeraPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tituloP, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disciplina, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(questoes, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(titulo))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(questoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idGeraPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jButton6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jButton2)))
                        .addGap(11, 11, 11))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tituloPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloPActionPerformed

    private void idRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idRemoveActionPerformed

    private void questoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questoesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            if(questoes.getSelectedItem().toString().trim().equals("")){
                JOptionPane.showMessageDialog(this, "Não existe questões para serem adicionadas", "Erro!", HEIGHT, null);
                return;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Não existe questões para serem adicionadas", "Erro!", HEIGHT, null);
            return;
        }
        
        String questao = questoes.getSelectedItem().toString();
        questao=questao.split(" -")[0];
        System.out.println(questao);
        ArrayList<String> keys = new ArrayList<>();
        keys.add("id");
        ArrayList<String> values = new ArrayList<>();
        values.add(questao);
        List<models.Questao> q = (new QuestaoController()).buscar("Questao.findById", keys, values);
        this.listaDeModelsQuestoes.add(q.get(0));
        questoes.removeItemAt(questoes.getSelectedIndex());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void disciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disciplinaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
  
        if( titulo.getText().trim().equals("") || listaDeModelsQuestoes.size()<=0){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Erro!", HEIGHT, null);
            return ;
        }
        
        
        String disciplinaLocal = disciplina.getSelectedItem().toString();
        disciplinaLocal=disciplinaLocal.split(" -")[0];
        
        ArrayList<String> values= new ArrayList<>();
        values.add(disciplinaLocal);
        ArrayList<String> keys= new ArrayList<>();
        keys.add("id");
        List<models.Disciplina> d = (new DisciplinaController()).buascar("Disciplina.findById", keys, values);
        
        ProvaController prova = new ProvaController();
        prova.setDisciplina(d.get(0));
        prova.setQuestoes(listaDeModelsQuestoes);
        prova.setTitulo(titulo.getText());
        
        if(prova.cadastrar()){
            JOptionPane.showMessageDialog(this, "Salvo com sucesso!", "Sucesso!", HEIGHT, null);
        }else{
            JOptionPane.showMessageDialog(this, "Erro no cadastro, verifique sua conexao", "Erro!", HEIGHT, null);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void idGeraPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idGeraPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idGeraPDFActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            new ProvaController().exportarParaPDF(idGeraPDF.getText());
            JOptionPane.showMessageDialog(this, "PDF Gerado com Sucesso!", "Sucesso!", HEIGHT, null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Verifique se digitou o ID correto!", "Erro!", HEIGHT, null);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        listar();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            ProvaController d = new ProvaController();
            d.deletar(Integer.parseInt(this.idRemove.getText()));
            listar();
        }catch(Exception e){
               JOptionPane.showMessageDialog(this, "Verifique se digitou o ID Correto!", "Erro!", HEIGHT, null);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void listar(){
        //enunciadoP.setText(d.getEnunciado());
        ProvaController p = new ProvaController();
        p.setTitulo(tituloP.getText());
        ArrayList keys = new ArrayList();
        keys.add("titulo");
        ArrayList values = new ArrayList();
        values.add("%"+p.getTitulo()+"%");
        List<models.Prova> lista = p.buscar("Prova.findByTituloLike",keys,values);
        String dados="";
        for(models.Prova l: lista){
            dados+="ID: "+l.getId()+" Titulo: "+l.getTitulo()+"\n";
        }
        this.listaProvasTela.setText(dados);
        p=null;
    }
    
    
   
    private void listarQuestoes(){
        QuestaoController q =new QuestaoController();
        List<Questao> questoesListaLocal = q.buscar("Questao.findAll",null,null);
        ArrayList<String> listaLocalDeQuestoes=new ArrayList();
        questoesListaLocal.forEach((questaoUnitaria) -> {
            listaLocalDeQuestoes.add(questaoUnitaria.getId()+" - "+questaoUnitaria.getEnunciado());
        });
        String[] stringLista = new String[listaLocalDeQuestoes.size()];
        int i=0;
        for (String v : listaLocalDeQuestoes){
            stringLista[i]=v;
            i++;
        }
        questoes.setModel(new javax.swing.DefaultComboBoxModel<>(stringLista));
    }
    
    private void listarDisciplina(){
        DisciplinaController d =new DisciplinaController();
        List<models.Disciplina> disciplinasListaLocal = d.buascar("Disciplina.findAll",null,null);
        ArrayList<String> listaLocalDeDisciplina=new ArrayList();
        disciplinasListaLocal.forEach((disciplinaUnitaria) -> {
            listaLocalDeDisciplina.add(disciplinaUnitaria.getId()+" - "+disciplinaUnitaria.getNome());
        });
        String[] stringLista = new String[listaLocalDeDisciplina.size()];
        int i=0;
        for (String v : listaLocalDeDisciplina){
            stringLista[i]=v;
            i++;
        }
        disciplina.setModel(new javax.swing.DefaultComboBoxModel<>(stringLista));
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prova().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> disciplina;
    private javax.swing.JTextField idGeraPDF;
    private javax.swing.JTextField idRemove;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea listaProvasTela;
    private javax.swing.JComboBox<String> questoes;
    private javax.swing.JTextField titulo;
    private javax.swing.JTextField tituloP;
    // End of variables declaration//GEN-END:variables
}
