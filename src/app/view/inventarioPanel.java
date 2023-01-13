/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app.view;

import app.dao.ProductoDao;

import app.model.Producto;

import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class inventarioPanel extends javax.swing.JPanel {

    /**
     * Creates new form inventarioPanel
     */
    public inventarioPanel() {
        initComponents();
        
         ListSelectionModel cellSelectionModel = tablainventario.getSelectionModel();
    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     ProductoDao ProductoDao = new ProductoDao();
     //DeptoDao deptodao = new DeptoDao();
        
cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
  public void valueChanged(ListSelectionEvent e) {
    String selectedData = null;

    int[] selectedRow = tablainventario.getSelectedRows();
    int[] selectedColumns = tablainventario.getSelectedColumns();

    for (int i = 0; i < selectedRow.length; i++) {
        id.setText( tablainventario.getValueAt(selectedRow[i], 0)+"");
        id.repaint();
        nombre.setText( tablainventario.getValueAt(selectedRow[i], 1)+"");
        nombre.repaint();      
        cantidad.setText( tablainventario.getValueAt(selectedRow[i], 2)+"");
        cantidad.repaint();
        area.setText(tablainventario.getValueAt(selectedRow[i], 3)+"");
        area.repaint();
        tipo.setText(tablainventario.getValueAt(selectedRow[i], 4)+"");
        tipo.repaint();
        unidad.setText(tablainventario.getValueAt(selectedRow[i], 5)+"");
        unidad.repaint();
        precio.setText(tablainventario.getValueAt(selectedRow[i], 6)+"");
        precio.repaint();
        
        
    }
    }
     });

 ProductoDao = new ProductoDao();  
        List<Producto> productos=ProductoDao.buscaProducto();
        int row=0;
        
        for(Producto producto: productos){
     tablainventario.getModel().setValueAt(producto.getIdProducto(), row, 0);
            tablainventario.getModel().setValueAt(producto.getNombre(), row, 1);
            tablainventario.getModel().setValueAt(producto.getCantidad(), row, 2);
            tablainventario.getModel().setValueAt(producto.getPrecio(), row, 3);
            tablainventario.getModel().setValueAt(producto.getArea(), row, 4);
            tablainventario.getModel().setValueAt(producto.getTipo(), row, 5);
            tablainventario.getModel().setValueAt(producto.getUnidaMedida(), row, 6);
           
            row++;
        }

        this.tablainventario.repaint();
        this.tablainventario.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        nombrer = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablainventario = new javax.swing.JTable();
        unidad = new javax.swing.JTextField();
        area = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Inventario");

        jLabel2.setText("idproducto");

        id.setText("id");

        nombrer.setText("Nombre");

        jLabel5.setText("Cantidad");

        jLabel6.setText("Precio");

        jLabel7.setText("Area");

        jLabel8.setText("Tipo");

        jLabel9.setText("Unidad de medida");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        tablainventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id producto", "Nombre", "Cantidad", "Precio", "Area", " Tipo", "Unidadmed"
            }
        ));
        jScrollPane2.setViewportView(tablainventario);

        unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(228, 228, 228))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrer)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(id))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(cantidad)
                            .addComponent(precio)
                            .addComponent(area)
                            .addComponent(tipo)
                            .addComponent(unidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(modificar)
                                .addComponent(agregar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(eliminar)))))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrer)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private void unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        
           ProductoDao ProductoDao = new ProductoDao();
      
         
        ProductoDao.insertaRegistro(
                this.nombre.getText(),
                Integer.parseInt(this.precio.getText()),
                Integer.parseInt(this.cantidad.getText()), 
                this.area.getText(), 
                this.tipo.getText(),
                this.unidad.getText());
      
         List<Producto> productos=ProductoDao.buscaProducto();
        int row=0;
        
        for(Producto producto: productos){
            tablainventario.getModel().setValueAt(producto.getIdProducto(), row, 0);
            tablainventario.getModel().setValueAt(producto.getNombre(), row, 1);
            tablainventario.getModel().setValueAt(producto.getCantidad(), row, 2);
            tablainventario.getModel().setValueAt(producto.getPrecio(), row, 3);
            tablainventario.getModel().setValueAt(producto.getArea(), row, 4);
            tablainventario.getModel().setValueAt(producto.getTipo(), row, 5);
            tablainventario.getModel().setValueAt(producto.getUnidaMedida(), row, 6);
           
            row++;
        }

        this.tablainventario.repaint();
        this.tablainventario.revalidate();
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        
            ProductoDao ProductoDao = new ProductoDao();
      
         
        ProductoDao.updateRegistro(
                this.nombre.getText(),
                Integer.parseInt(this.precio.getText()),
                Integer.parseInt(this.cantidad.getText()), 
                this.area.getText(), 
                this.tipo.getText(),
                this.unidad.getText(),
                Integer.parseInt(id.getText()));
      
         List<Producto> productos=ProductoDao.buscaProducto();
        int row=0;
        
        for(Producto producto: productos){
            tablainventario.getModel().setValueAt(producto.getIdProducto(), row, 0);
            tablainventario.getModel().setValueAt(producto.getNombre(), row, 1);
            tablainventario.getModel().setValueAt(producto.getCantidad(), row, 2);
            tablainventario.getModel().setValueAt(producto.getPrecio(), row, 3);
            tablainventario.getModel().setValueAt(producto.getArea(), row, 4);
            tablainventario.getModel().setValueAt(producto.getTipo(), row, 5);
            tablainventario.getModel().setValueAt(producto.getUnidaMedida(), row, 6);
           
            row++;
        }

        this.tablainventario.repaint();
        this.tablainventario.revalidate();
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
         ProductoDao ProductoDao = new ProductoDao();
      
         
        ProductoDao.deletRegistro(
                Integer.parseInt(id.getText()));
      
        
         DefaultTableModel dm = (DefaultTableModel) tablainventario.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
     tablainventario.getModel().setValueAt("", i, 0);
            tablainventario.getModel().setValueAt("", i, 1);
            tablainventario.getModel().setValueAt("", i, 2);
            tablainventario.getModel().setValueAt("", i, 3);
            tablainventario.getModel().setValueAt("", i, 4);
            tablainventario.getModel().setValueAt("", i, 5);
            tablainventario.getModel().setValueAt("", i, 6);
}
        
        
         List<Producto> productos=ProductoDao.buscaProducto();
        int row=0;
        
        for(Producto producto: productos){
            tablainventario.getModel().setValueAt(producto.getIdProducto(), row, 0);
            tablainventario.getModel().setValueAt(producto.getNombre(), row, 1);
            tablainventario.getModel().setValueAt(producto.getCantidad(), row, 2);
            tablainventario.getModel().setValueAt(producto.getPrecio(), row, 3);
            tablainventario.getModel().setValueAt(producto.getArea(), row, 4);
            tablainventario.getModel().setValueAt(producto.getTipo(), row, 5);
            tablainventario.getModel().setValueAt(producto.getUnidaMedida(), row, 6);
           
            row++;
        }

        this.tablainventario.repaint();
        this.tablainventario.revalidate();
    }//GEN-LAST:event_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField area;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombrer;
    private javax.swing.JTextField precio;
    private javax.swing.JTable tablainventario;
    private javax.swing.JTextField tipo;
    private javax.swing.JTextField unidad;
    // End of variables declaration//GEN-END:variables
}
