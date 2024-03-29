/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.view;

import app.dao.TipoDao;
import app.model.Tipos;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jvazq
 */
public class NewJInternalFrameTipo extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrameTipo
     */
    public NewJInternalFrameTipo() {
        initComponents();
        
         ListSelectionModel cellSelectionModel = tablatipo.getSelectionModel();
    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     TipoDao TipoDao = new TipoDao();
    
        
cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
  public void valueChanged(ListSelectionEvent e) {
    String selectedData = null;

    int[] selectedRow = tablatipo.getSelectedRows();
    int[] selectedColumns = tablatipo.getSelectedColumns();

    for (int i = 0; i < selectedRow.length; i++) {
        id.setText( tablatipo.getValueAt(selectedRow[i], 0)+"");
        id.repaint();
        nombre.setText( tablatipo.getValueAt(selectedRow[i], 1)+"");
        nombre.repaint();      
        dureza.setText( tablatipo.getValueAt(selectedRow[i], 2)+"");
        dureza.repaint();
        flexibilidad.setText(tablatipo.getValueAt(selectedRow[i], 3)+"");
        flexibilidad.repaint();
        conduccioncalor.setText(tablatipo.getValueAt(selectedRow[i], 4)+"");
        conduccioncalor.repaint();
        resistenciafrio.setText(tablatipo.getValueAt(selectedRow[i], 5)+"");
        resistenciafrio.repaint();
        conduccionelect.setText(tablatipo.getValueAt(selectedRow[i], 6)+"");
        conduccionelect.repaint();
        resistenciaexte.setText(tablatipo.getValueAt(selectedRow[i], 7)+"");
        resistenciaexte.repaint();
        
    }
    }
     });

 TipoDao = new TipoDao();  
        List<Tipos> tipos=TipoDao.buscaTipos();
        int row=0;
        
        for(Tipos Tipos: tipos){
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 0);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 1);
            tablatipo.getModel().setValueAt(Tipos.getDureza(), row, 2);
            tablatipo.getModel().setValueAt(Tipos.getFlexibilidad(), row, 3);
            tablatipo.getModel().setValueAt(Tipos.getConducalor(), row, 4);
            tablatipo.getModel().setValueAt(Tipos.getResistenciafrio(), row, 5);
            tablatipo.getModel().setValueAt(Tipos.getConduelect(), row, 6);
            tablatipo.getModel().setValueAt(Tipos.getResistenciaexte(), row, 7);
            
           
           
            row++;
        }

        this.tablatipo.repaint();
        this.tablatipo.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablatipo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        flexibilidad = new javax.swing.JTextField();
        conduccioncalor = new javax.swing.JTextField();
        resistenciafrio = new javax.swing.JTextField();
        conduccionelect = new javax.swing.JTextField();
        resistenciaexte = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        dureza = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Tipo");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/imagenes/icons8-lista-de-quehaceres-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tablatipo.setBackground(new java.awt.Color(102, 153, 255));
        tablatipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id Tipo", "nombre", "dureza", "flexibilidad", "conduccion de calor", "resistencia al frio", "conduccion de electricidad", "resistencia a exteriores"
            }
        ));
        jScrollPane1.setViewportView(tablatipo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 310, 790, 150));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("id Tipo");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("dureza");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("flexibilidad");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("conduccion de calor");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("resistencia al frio");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("conduccion de electricidad");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("resistencia a exteriores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 260));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        id.setText("id");

        nombre.setBackground(new java.awt.Color(153, 204, 255));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        flexibilidad.setBackground(new java.awt.Color(153, 204, 255));

        conduccioncalor.setBackground(new java.awt.Color(153, 204, 255));

        resistenciafrio.setBackground(new java.awt.Color(153, 204, 255));

        conduccionelect.setBackground(new java.awt.Color(153, 204, 255));

        resistenciaexte.setBackground(new java.awt.Color(153, 204, 255));
        resistenciaexte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resistenciaexteActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(153, 204, 255));
        eliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        dureza.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dureza, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(flexibilidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conduccioncalor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resistenciafrio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conduccionelect, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resistenciaexte, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dureza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flexibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conduccioncalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resistenciafrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conduccionelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resistenciaexte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 620, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void resistenciaexteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resistenciaexteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resistenciaexteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        TipoDao TipoDao = new TipoDao();
      
         
        TipoDao.insertaRegistro(
                this.nombre.getText(),
                this.dureza.getText(),
                this.flexibilidad.getText(),
                this.conduccioncalor.getText(),
                this.resistenciafrio.getText(),
                this.conduccionelect.getText(),
                this.resistenciaexte.getText());
                
      
         List<Tipos> tipos=TipoDao.buscaTipos();
        int row=0;
        
        for(Tipos Tipos: tipos){
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 0);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 1);
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 2);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 3);
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 4);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 5);
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 6);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 7);
            
           
            row++;
        }

        this.tablatipo.repaint();
        this.tablatipo.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        TipoDao TipoDao = new TipoDao();
      
         
        TipoDao.updateRegistro(
                this.nombre.getText(),
                this.dureza.getText(),
                this.flexibilidad.getText(),
                this.conduccioncalor.getText(),
                this.resistenciafrio.getText(),
                this.conduccionelect.getText(),
                this.resistenciaexte.getText(),
                Integer.parseInt(id.getText()));
      
         List<Tipos> tipos=TipoDao.buscaTipos();
        int row=0;
        
        for(Tipos Tipos: tipos){
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 0);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 1);
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 2);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 3);
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 4);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 5);
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 6);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 7);
            
           
            row++;
        }

        this.tablatipo.repaint();
        this.tablatipo.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        
        TipoDao TipoDao = new TipoDao();
      
         
        TipoDao.deletRegistro(
                Integer.parseInt(id.getText()));
      
        
         DefaultTableModel dm = (DefaultTableModel) tablatipo.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
            tablatipo.getModel().setValueAt("", i, 0);
            tablatipo.getModel().setValueAt("", i, 1);
             tablatipo.getModel().setValueAt("", i, 2);
            tablatipo.getModel().setValueAt("", i, 3);
             tablatipo.getModel().setValueAt("", i, 4);
            tablatipo.getModel().setValueAt("", i, 5);
             tablatipo.getModel().setValueAt("", i, 6);
            tablatipo.getModel().setValueAt("", i, 7);
            
            List<Tipos> tipos=TipoDao.buscaTipos();
        int row=0;
        
        for(Tipos Tipos: tipos){
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 0);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 1);
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 2);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 3);
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 4);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 5);
            tablatipo.getModel().setValueAt(Tipos.getIdTipo(), row, 6);
            tablatipo.getModel().setValueAt(Tipos.getNombreT(), row, 7);
            
           
            row++;
        }

        this.tablatipo.repaint();
        this.tablatipo.revalidate();
}     
    }//GEN-LAST:event_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField conduccioncalor;
    private javax.swing.JTextField conduccionelect;
    private javax.swing.JTextField dureza;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField flexibilidad;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField resistenciaexte;
    private javax.swing.JTextField resistenciafrio;
    private javax.swing.JTable tablatipo;
    // End of variables declaration//GEN-END:variables
}
