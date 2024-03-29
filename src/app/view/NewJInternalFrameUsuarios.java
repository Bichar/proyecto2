/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.view;

import app.dao.UserDao;
import app.model.Usuario;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jvazq
 */
public class NewJInternalFrameUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrameUsuarios
     */
    public NewJInternalFrameUsuarios() {
        initComponents();

        ListSelectionModel cellSelectionModel = tablaUsuarios.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        UserDao userDao = new UserDao();
        //DeptoDao deptodao = new DeptoDao();

        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String selectedData = null;

                int[] selectedRow = tablaUsuarios.getSelectedRows();
                int[] selectedColumns = tablaUsuarios.getSelectedColumns();

                for (int i = 0; i < selectedRow.length; i++) {

                    nombre.setText(tablaUsuarios.getValueAt(selectedRow[i], 0) + "");
                    nombre.repaint();
                    ApellidoPa.setText(tablaUsuarios.getValueAt(selectedRow[i], 1) + "");
                    ApellidoPa.repaint();
                    ApellidoMa.setText(tablaUsuarios.getValueAt(selectedRow[i], 2) + "");
                    ApellidoMa.repaint();
                    Contrasena.setText(tablaUsuarios.getValueAt(selectedRow[i], 3) + "");
                    Contrasena.repaint();
                    Rol.setText(tablaUsuarios.getValueAt(selectedRow[i], 4) + "");
                    Rol.repaint();
                    Usuario.setText(tablaUsuarios.getValueAt(selectedRow[i], 5) + "");
                    Usuario.repaint();
                    id.setText(tablaUsuarios.getValueAt(selectedRow[i], 6) + "");
                    id.repaint();

                }
            }
        });

        userDao = new UserDao();
        List<Usuario> usuarios = userDao.buscaUsuarios();
        int row = 0;

        for (Usuario usuario : usuarios) {
            tablaUsuarios.getModel().setValueAt(usuario.getNombre(), row, 0);
            tablaUsuarios.getModel().setValueAt(usuario.getApellidoPa(), row, 1);
            tablaUsuarios.getModel().setValueAt(usuario.getApellidoMa(), row, 2);
            tablaUsuarios.getModel().setValueAt(usuario.getContrasena(), row, 3);
            tablaUsuarios.getModel().setValueAt(usuario.getRolId(), row, 4);
            tablaUsuarios.getModel().setValueAt(usuario.getUsuario(), row, 5);
            tablaUsuarios.getModel().setValueAt(usuario.getIdUsuario(), row, 6);

            row++;
        }

        this.tablaUsuarios.repaint();
        this.tablaUsuarios.revalidate();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        ApellidoPa = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        ApellidoMa = new javax.swing.JTextField();
        Rol = new javax.swing.JTextField();
        Usuario = new javax.swing.JTextField();
        Contrasena = new javax.swing.JTextField();
        actualizar = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Apellido materno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Rol");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Id");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Apellido paterno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 270));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setText("id");
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, -1, -1));

        ApellidoPa.setBackground(new java.awt.Color(204, 204, 255));
        ApellidoPa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoPaActionPerformed(evt);
            }
        });
        jPanel2.add(ApellidoPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 110, 300, -1));

        nombre.setBackground(new java.awt.Color(204, 204, 255));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 300, -1));

        ApellidoMa.setBackground(new java.awt.Color(204, 204, 255));
        ApellidoMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoMaActionPerformed(evt);
            }
        });
        jPanel2.add(ApellidoMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, 300, -1));

        Rol.setBackground(new java.awt.Color(204, 204, 255));
        Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolActionPerformed(evt);
            }
        });
        jPanel2.add(Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 201, 300, -1));

        Usuario.setBackground(new java.awt.Color(204, 204, 255));
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 229, 300, -1));

        Contrasena.setBackground(new java.awt.Color(204, 204, 255));
        Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaActionPerformed(evt);
            }
        });
        jPanel2.add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 167, 300, 28));

        actualizar.setBackground(new java.awt.Color(204, 204, 255));
        actualizar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 81, -1, -1));

        crear.setBackground(new java.awt.Color(204, 204, 255));
        crear.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        jPanel2.add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 138, 91, -1));

        borrar.setBackground(new java.awt.Color(204, 204, 255));
        borrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel2.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 193, 91, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/imagenes/icons8-usuario-30.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Usuarios");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 570, 270));

        tablaUsuarios.setBackground(new java.awt.Color(204, 204, 255));
        tablaUsuarios.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "ApellidoPa", "ApellidoMa", "Contraseña", "Rol", "Usuario", "Id"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 270, 790, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApellidoPaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoPaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoPaActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void ApellidoMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoMaActionPerformed

    private void RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RolActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenaActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // TODO add your handling code here:

        if (this.nombre.getText().isBlank()
                || this.nombre.getText().isBlank()
                || this.ApellidoPa.getText().isBlank()
                || this.ApellidoMa.getText().isBlank()
                || this.Usuario.getText().isBlank()
                || this.Contrasena.getText().isBlank())
                 {
            String message = "No dejar campos en blanco";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
                    JOptionPane.ERROR_MESSAGE);

        } else {

            try {
                Integer.parseInt(this.Rol.getText());
            } catch (NumberFormatException nfe) {
                String message = "La cantidad debe ser numerico";
                JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
                        JOptionPane.ERROR_MESSAGE);
            }
            UserDao userDao = new UserDao();

            try {
                userDao.insertaRegistro(
                        this.ApellidoMa.getText(),
                        this.ApellidoPa.getText(),
                        this.nombre.getText(),
                        Integer.parseInt(this.Rol.getText()),
                        this.Usuario.getText(),
                        this.Contrasena.getText());

            } catch (java.sql.SQLIntegrityConstraintViolationException c) {
                String message = "El usuario ya existe";
                JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
                        JOptionPane.ERROR_MESSAGE);
            }

            List<Usuario> usuarios = userDao.buscaUsuarios();
            int row = 0;

            for (Usuario usuario : usuarios) {
                tablaUsuarios.getModel().setValueAt(usuario.getNombre(), row, 0);
                tablaUsuarios.getModel().setValueAt(usuario.getApellidoPa(), row, 1);
                tablaUsuarios.getModel().setValueAt(usuario.getApellidoMa(), row, 2);
                tablaUsuarios.getModel().setValueAt(usuario.getContrasena(), row, 3);
                tablaUsuarios.getModel().setValueAt(usuario.getRolId(), row, 4);
                tablaUsuarios.getModel().setValueAt(usuario.getUsuario(), row, 5);
                tablaUsuarios.getModel().setValueAt(usuario.getIdUsuario(), row, 6);

                row++;
            }

            this.tablaUsuarios.repaint();
            this.tablaUsuarios.revalidate();

        }
    }//GEN-LAST:event_crearActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:

        UserDao userDao = new UserDao();

        userDao.updateRegistro(
                this.ApellidoMa.getText(),
                this.ApellidoPa.getText(),
                this.nombre.getText(),
                Integer.parseInt(this.Rol.getText()),
                this.Usuario.getText(),
                this.Contrasena.getText(),
                Integer.parseInt(id.getText()));

        List<Usuario> usuarios = userDao.buscaUsuarios();
        int row = 0;

        for (Usuario usuario : usuarios) {
            tablaUsuarios.getModel().setValueAt(usuario.getNombre(), row, 0);
            tablaUsuarios.getModel().setValueAt(usuario.getApellidoPa(), row, 1);
            tablaUsuarios.getModel().setValueAt(usuario.getApellidoMa(), row, 2);
            tablaUsuarios.getModel().setValueAt(usuario.getContrasena(), row, 3);
            tablaUsuarios.getModel().setValueAt(usuario.getRolId(), row, 4);
            tablaUsuarios.getModel().setValueAt(usuario.getUsuario(), row, 5);
            tablaUsuarios.getModel().setValueAt(usuario.getIdUsuario(), row, 6);

            row++;
        }

        this.tablaUsuarios.repaint();
        this.tablaUsuarios.revalidate();
    }//GEN-LAST:event_actualizarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // TODO add your handling code here:

        UserDao userDao = new UserDao();

        userDao.deletRegistro(
                Integer.parseInt(id.getText()));

        DefaultTableModel dm = (DefaultTableModel) tablaUsuarios.getModel();
        int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            tablaUsuarios.getModel().setValueAt("", i, 0);
            tablaUsuarios.getModel().setValueAt("", i, 1);
            tablaUsuarios.getModel().setValueAt("", i, 2);
            tablaUsuarios.getModel().setValueAt("", i, 3);
            tablaUsuarios.getModel().setValueAt("", i, 4);
            tablaUsuarios.getModel().setValueAt("", i, 5);
            tablaUsuarios.getModel().setValueAt("", i, 6);
        }

        List<Usuario> usuarios = userDao.buscaUsuarios();

        int row = 0;

        for (Usuario usuario : usuarios) {
            tablaUsuarios.getModel().setValueAt(usuario.getNombre(), row, 0);
            tablaUsuarios.getModel().setValueAt(usuario.getApellidoPa(), row, 1);
            tablaUsuarios.getModel().setValueAt(usuario.getApellidoMa(), row, 2);
            tablaUsuarios.getModel().setValueAt(usuario.getContrasena(), row, 3);
            tablaUsuarios.getModel().setValueAt(usuario.getRolId(), row, 4);
            tablaUsuarios.getModel().setValueAt(usuario.getUsuario(), row, 5);
            tablaUsuarios.getModel().setValueAt(usuario.getIdUsuario(), row, 6);

            row++;
        }

        this.tablaUsuarios.repaint();
        this.tablaUsuarios.revalidate();
    }//GEN-LAST:event_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoMa;
    private javax.swing.JTextField ApellidoPa;
    private javax.swing.JTextField Contrasena;
    private javax.swing.JTextField Rol;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton borrar;
    private javax.swing.JButton crear;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
