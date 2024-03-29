/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.view;

import app.dao.DeptoDao;
import app.model.Deptos;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jvazq
 */
public class NewJInternalFrameDepto extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrameDepto
     */
    public NewJInternalFrameDepto() {
        initComponents();
        
        ListSelectionModel cellSelectionModel = tabladepto.getSelectionModel();
    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     DeptoDao DeptoDao = new DeptoDao();
    
        
cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
  public void valueChanged(ListSelectionEvent e) {
    String selectedData = null;

    int[] selectedRow = tabladepto.getSelectedRows();
    int[] selectedColumns = tabladepto.getSelectedColumns();

    for (int i = 0; i < selectedRow.length; i++) {
        id.setText( tabladepto.getValueAt(selectedRow[i], 0)+"");
        id.repaint();
        nombre.setText( tabladepto.getValueAt(selectedRow[i], 1)+"");
        nombre.repaint();
        pasillo.setText( tabladepto.getValueAt(selectedRow[i], 2)+"");
        pasillo.repaint();
        proveedores.setText( tabladepto.getValueAt(selectedRow[i], 3)+"");
        proveedores.repaint();
        prodmax.setText( tabladepto.getValueAt(selectedRow[i], 4)+"");
        prodmax.repaint();
        ultimafecha.setText( tabladepto.getValueAt(selectedRow[i], 5)+"");
        ultimafecha.repaint();
        prodesca.setText( tabladepto.getValueAt(selectedRow[i], 6)+"");
        prodesca.repaint();
        prodexis.setText( tabladepto.getValueAt(selectedRow[i], 7)+"");
        prodexis.repaint();
       
           }
    }
     });

 DeptoDao = new DeptoDao();  
        List<Deptos> deptos=DeptoDao.buscaDeptos();
        int row=0;
        
        for(Deptos Deptos: deptos){
            tabladepto.getModel().setValueAt(Deptos.getIdDepto(), row, 0);
            tabladepto.getModel().setValueAt(Deptos.getNombreDepto(), row, 1);
            tabladepto.getModel().setValueAt(Deptos.getPasillo(), row, 2);
            tabladepto.getModel().setValueAt(Deptos.getProveedores(), row, 3);
            tabladepto.getModel().setValueAt(Deptos.getProdmas(), row, 4);
            tabladepto.getModel().setValueAt(Deptos.getUltifecha(), row, 5);
            tabladepto.getModel().setValueAt(Deptos.getProdesca(), row, 6);
            tabladepto.getModel().setValueAt(Deptos.getProdexis(), row, 7);
           
            row++;
        }

        this.tabladepto.repaint();
        this.tabladepto.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladepto = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        pasillo = new javax.swing.JTextField();
        proveedores = new javax.swing.JTextField();
        prodmax = new javax.swing.JTextField();
        ultimafecha = new javax.swing.JTextField();
        prodesca = new javax.swing.JTextField();
        prodexis = new javax.swing.JTextField();
        insertar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        quitar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel10.setText("jLabel10");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Departamento");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/imagenes/icons8-lista-de-quehaceres-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));

        tabladepto.setBackground(new java.awt.Color(255, 51, 51));
        tabladepto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "pasillo", "proveedores", "prod mas vendido", "ultima fecha", "producto en escases", "producto con mas existencia"
            }
        ));
        jScrollPane1.setViewportView(tabladepto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 300, 800, 170));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("id departamento");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("nombre");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 26, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("pasillo");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 58, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("proveedores");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("producto mas vendido");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 122, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("ultima fecha de inventario");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 154, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("producto en escaces");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 186, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("producto con mas existencias");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 218, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 250));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setText("id");
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel4.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 290, -1));

        pasillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasilloActionPerformed(evt);
            }
        });
        jPanel4.add(pasillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, -1));
        jPanel4.add(proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 290, -1));

        prodmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodmaxActionPerformed(evt);
            }
        });
        jPanel4.add(prodmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 290, -1));
        jPanel4.add(ultimafecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 290, -1));
        jPanel4.add(prodesca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 290, -1));
        jPanel4.add(prodexis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 290, -1));

        insertar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        insertar.setText("Agregar");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });
        jPanel4.add(insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 90, -1));

        modificar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel4.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        quitar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        quitar.setText("Eliminar");
        quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarActionPerformed(evt);
            }
        });
        jPanel4.add(quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 90, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 600, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void pasilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasilloActionPerformed

    private void prodmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodmaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodmaxActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        DeptoDao DeptoDao = new DeptoDao();
      
         
        DeptoDao.updateRegistro(
                this.nombre.getText(),
                Integer.parseInt(this.pasillo.getText()),
                this.proveedores.getText(),
                this.prodmax.getText(),
                this.ultimafecha.getText(),
                this.prodesca.getText(),
                this.prodexis.getText(),
                Integer.parseInt(id.getText()));
                
      
         List<Deptos> deptos=DeptoDao.buscaDeptos();
        int row=0;
        
        for(Deptos Deptos: deptos){
            tabladepto.getModel().setValueAt(Deptos.getIdDepto(), row, 0);
            tabladepto.getModel().setValueAt(Deptos.getNombreDepto(), row, 1);
            tabladepto.getModel().setValueAt(Deptos.getPasillo(), row, 2);
            tabladepto.getModel().setValueAt(Deptos.getProveedores(), row, 3);
            tabladepto.getModel().setValueAt(Deptos.getProdmas(), row, 4);
            tabladepto.getModel().setValueAt(Deptos.getUltifecha(), row, 5);
            tabladepto.getModel().setValueAt(Deptos.getProdesca(), row, 6);
            tabladepto.getModel().setValueAt(Deptos.getProdexis(), row, 7);
           
            row++;
        }

        this.tabladepto.repaint();
        this.tabladepto.revalidate();
    }//GEN-LAST:event_modificarActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        // TODO add your handling code here:
        DeptoDao DeptoDao = new DeptoDao();
      
         
        DeptoDao.insertaRegistro(
                this.nombre.getText(),
                Integer.parseInt(this.pasillo.getText()),
                this.proveedores.getText(),
                this.prodmax.getText(),
                this.ultimafecha.getText(),
                this.prodesca.getText(),
                this.prodexis.getText());
                
                
      
         List<Deptos> deptos=DeptoDao.buscaDeptos();
        int row=0;
        
        for(Deptos Deptos: deptos){
            tabladepto.getModel().setValueAt(Deptos.getIdDepto(), row, 0);
            tabladepto.getModel().setValueAt(Deptos.getNombreDepto(), row, 1);
            tabladepto.getModel().setValueAt(Deptos.getPasillo(), row, 2);
            tabladepto.getModel().setValueAt(Deptos.getProveedores(), row, 3);
            tabladepto.getModel().setValueAt(Deptos.getProdmas(), row, 4);
            tabladepto.getModel().setValueAt(Deptos.getUltifecha(), row, 5);
            tabladepto.getModel().setValueAt(Deptos.getProdesca(), row, 6);
            tabladepto.getModel().setValueAt(Deptos.getProdexis(), row, 7);
           
            row++;
        }

        this.tabladepto.repaint();
        this.tabladepto.revalidate();
    }//GEN-LAST:event_insertarActionPerformed

    private void quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarActionPerformed
        // TODO add your handling code here:
        DeptoDao DeptoDao = new DeptoDao();
      
         
        DeptoDao.deletRegistro(
                
                Integer.parseInt(id.getText()));
        
        
        DefaultTableModel dm = (DefaultTableModel) tabladepto.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
            tabladepto.getModel().setValueAt("", i, 0);
            tabladepto.getModel().setValueAt("", i, 1);
            tabladepto.getModel().setValueAt("", i, 2);
            tabladepto.getModel().setValueAt("", i, 3);
            tabladepto.getModel().setValueAt("", i, 4);
            tabladepto.getModel().setValueAt("", i, 5);
            tabladepto.getModel().setValueAt("", i, 6);
            tabladepto.getModel().setValueAt("", i, 7);
            
        
        
        
        
        
        
        
        
                
      
         List<Deptos> deptos=DeptoDao.buscaDeptos();
        int row=0;
        
        for(Deptos Deptos: deptos){
            tabladepto.getModel().setValueAt(Deptos.getIdDepto(), row, 0);
            tabladepto.getModel().setValueAt(Deptos.getNombreDepto(), row, 1);
            tabladepto.getModel().setValueAt(Deptos.getPasillo(), row, 2);
            tabladepto.getModel().setValueAt(Deptos.getProveedores(), row, 3);
            tabladepto.getModel().setValueAt(Deptos.getProdmas(), row, 4);
            tabladepto.getModel().setValueAt(Deptos.getUltifecha(), row, 5);
            tabladepto.getModel().setValueAt(Deptos.getProdesca(), row, 6);
            tabladepto.getModel().setValueAt(Deptos.getProdexis(), row, 7);
           
            row++;
        }

        this.tabladepto.repaint();
        this.tabladepto.revalidate();
}
    }//GEN-LAST:event_quitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id;
    private javax.swing.JButton insertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pasillo;
    private javax.swing.JTextField prodesca;
    private javax.swing.JTextField prodexis;
    private javax.swing.JTextField prodmax;
    private javax.swing.JTextField proveedores;
    private javax.swing.JButton quitar;
    private javax.swing.JTable tabladepto;
    private javax.swing.JTextField ultimafecha;
    // End of variables declaration//GEN-END:variables
}
