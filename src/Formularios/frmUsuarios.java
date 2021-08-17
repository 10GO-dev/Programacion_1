/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import Usuarios.Usuarios;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;


/**
 *
 * @author Diego
 */
public class frmUsuarios extends javax.swing.JFrame {
    
    private Usuarios usuario;
    private String nUsuario;
    /**
     * Creates new form frmUsuarios
     */
    frmUsuarios() {
        
        initComponents();
        usuario = new Usuarios();
        listar();
        this.setLocationRelativeTo(null);
        this.nUsuario = null;
    }

    protected void userName(String uName){
        this.nUsuario = uName;
        UserLabel.setText(this.nUsuario);
    }
    
    public void limpiar(){
    txtNombre.setText("");
    txtApellido.setText("");
    txtTelefono.setText("");
    txtCorreo.setText("");
    txtBuscar.setText("");
    
}
public boolean checkCampos(){
    usuario = recuperarDatos();
    String[] campos = {usuario.getNombre(),usuario.getApellido(),usuario.getTelefono(),usuario.getCorreo()};
    boolean check = true;
    int pos = 0;
    for (int i= 0;i<campos.length;i++){
        if(campos[i].isEmpty()){  
            check = false;
            pos = i;
            break;
        }
    }
    if(!check == true){
        switch(pos){
            case 0:
                JOptionPane.showMessageDialog(null, "No has llenado el campo Nombre","Info",JOptionPane.INFORMATION_MESSAGE);
                txtNombre.requestFocus();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "No has llenado el campo Apellido","Info",JOptionPane.INFORMATION_MESSAGE);
                txtApellido.requestFocus();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "No has llenado el campo Telefono","Info",JOptionPane.INFORMATION_MESSAGE);
                txtTelefono.requestFocus();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "No has llenado el campo Correo","Info",JOptionPane.INFORMATION_MESSAGE);
                txtCorreo.requestFocus();
                break;
        }
    }
    return check;
}    
    
private Usuarios recuperarDatos() {
    usuario.setNombre(txtNombre.getText());
    usuario.setApellido(txtApellido.getText());
    usuario.setTelefono(txtTelefono.getText());
    usuario.setCorreo(txtCorreo.getText());
    
    return usuario;
}

private void listar(){
   listar(0,"");
}
private void listar(int crt,String buscar){
   TableDatos.setModel(usuario.getDatos(crt,buscar));
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDatos = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCerrarSeccion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRefrescar = new javax.swing.JButton();
        UserLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtCorreo = new javax.swing.JTextField();
        Lnombre = new javax.swing.JLabel();
        Lapellido = new javax.swing.JLabel();
        Ltelefono = new javax.swing.JLabel();
        Lcorreo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        Panel2Label = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(13, 50, 54));
        setMaximumSize(new java.awt.Dimension(1117, 500));
        setMinimumSize(new java.awt.Dimension(750, 460));

        MainPanel.setBackground(new java.awt.Color(13, 50, 54));

        jPanel1.setBackground(new java.awt.Color(13, 50, 54));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 460));

        TableDatos.setBackground(new java.awt.Color(153, 153, 153));
        TableDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        TableDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TableDatos.setFocusable(false);
        TableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableDatos);

        btnNuevo.setText("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCerrarSeccion.setText("Cerrar Sesión");
        btnCerrarSeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSeccionMouseClicked(evt);
            }
        });
        btnCerrarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSeccionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(222, 222, 221));
        jLabel5.setText("Usuarios Registrados");

        btnRefrescar.setText("Refrescar");
        if(jPanel2.isShowing()){
            btnRefrescar.hide();
        }
        btnRefrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefrescarMouseClicked(evt);
            }
        });
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        UserLabel.setBackground(new java.awt.Color(0, 0, 0));
        UserLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(0, 153, 0));
        UserLabel.setText("Usuario");
        UserLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UserLabel.show();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar)
                        .addGap(246, 246, 246)
                        .addComponent(UserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrarSeccion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefrescar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnActualizar)
                    .addComponent(btnBorrar)
                    .addComponent(btnCerrarSeccion)
                    .addComponent(UserLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 97, 97));
        setSize(736, 401);
        MainPanel.setSize(736, 461);
        jPanel2.hide();

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));

        txtApellido.setBackground(new java.awt.Color(204, 204, 204));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtTelefono.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtCorreo.setBackground(new java.awt.Color(204, 204, 204));

        Lnombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Lnombre.setForeground(new java.awt.Color(222, 222, 221));
        Lnombre.setText("Nombre:");

        Lapellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Lapellido.setForeground(new java.awt.Color(222, 222, 221));
        Lapellido.setText("Apellido:");

        Ltelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Ltelefono.setForeground(new java.awt.Color(222, 222, 221));
        Ltelefono.setText("Teléfono:");

        Lcorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Lcorreo.setForeground(new java.awt.Color(222, 222, 221));
        Lcorreo.setText("Correo:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        Panel2Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Panel2Label.setForeground(new java.awt.Color(222, 222, 221));
        Panel2Label.setText("AGREGAR NUEVO USUARIO");

        txtBuscar.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscar.hide();
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.hide();
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnBuscarKeyReleased(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.hide();
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Ltelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(Lnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lapellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lcorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(txtTelefono)
                            .addComponent(txtApellido)
                            .addComponent(txtCorreo)))
                    .addComponent(Panel2Label))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(23, 23, 23)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtApellido, txtBuscar, txtCorreo, txtNombre, txtTelefono});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Panel2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ltelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addGap(24, 24, 24))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtApellido, txtBuscar, txtCorreo, txtNombre, txtTelefono});

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        setSize(1117,500);
       jPanel2.setVisible(true);
       Panel2Label.setText("AGREGAR NUEVO USUARIO");
       btnGuardar.show();
       btnLimpiar.show();
       btnModificar.hide();
       txtBuscar.hide();
       btnBuscar.hide();
       Lnombre.show();
       Lapellido.show();
       Ltelefono.show();
       Lcorreo.show();
       txtNombre.show();
       txtApellido.show();
       txtTelefono.show();
       txtCorreo.show();
       btnEliminar.hide();
       Lnombre.enable();
       Lapellido.enable();
       Ltelefono.enable();
       Lcorreo.enable();
       txtNombre.enable();
       txtApellido.enable();
       txtTelefono.enable();
       txtCorreo.enable();
       limpiar();
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
       
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        txtBuscar.hide();
        btnBuscar.hide();
        btnModificar.hide();
        limpiar();
        jPanel2.setVisible(false);
        setSize(760,500);
        MainPanel.setSize(getWidth(),getHeight());
        btnRefrescar.show();
        btnEliminar.hide();
        Lnombre.enable();
        Lapellido.enable();
        Ltelefono.enable();
        Lcorreo.enable();
        txtNombre.enable();
        txtApellido.enable();
        txtTelefono.enable();
        txtCorreo.enable();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnCerrarSeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSeccionMouseClicked
        
    }//GEN-LAST:event_btnCerrarSeccionMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        usuario = recuperarDatos();
        boolean chk = checkCampos();
        if (chk ==true){
        int resultado = usuario.insertar(usuario.getNombre(),usuario.getApellido(),"","",usuario.getTelefono(), usuario.getCorreo());
        System.out.println(resultado);
        listar();
        limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked

       
        
       
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        listar(1,txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked

       
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtBuscar.hide();
        btnBuscar.hide();
        btnModificar.hide();
        limpiar();
        jPanel2.setVisible(false);
        setSize(750,500);
        MainPanel.setSize(getWidth(),getHeight());
        btnRefrescar.show();
        btnEliminar.hide();
        Lnombre.enable();
        Lapellido.enable();
        Ltelefono.enable();
        Lcorreo.enable();
        txtNombre.enable();
        txtApellido.enable();
        txtTelefono.enable();
        txtCorreo.enable();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void TableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDatosMouseClicked
        int row = TableDatos.getSelectedRow();  
        txtNombre.setText(TableDatos.getValueAt(row, 1).toString());
        txtApellido.setText(TableDatos.getValueAt(row, 2).toString());
        txtTelefono.setText(TableDatos.getValueAt(row, 3).toString());
        txtCorreo.setText(TableDatos.getValueAt(row, 4).toString());
        txtBuscar.setText(TableDatos.getValueAt(row, 0).toString());
    }//GEN-LAST:event_TableDatosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        usuario = recuperarDatos();
        int row = TableDatos.getRowCount();
        boolean chk;
        if(!txtBuscar.getText().isEmpty()){
            chk = checkCampos();
            if(chk==true){
                int respuesta = usuario.actualizar(usuario.getNombre(),usuario.getApellido(),usuario.getTelefono(), usuario.getCorreo(),txtBuscar.getText());
            System.out.println(respuesta);
            if (respuesta > 0){
                if(row>1){
                listar();
                }else {
                    listar(1, txtBuscar.getText());
                }
            }
            }
        }else{
            JOptionPane.showMessageDialog(null, "No hay ningun registro especificado");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtBuscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
        }else {
            if (usuario.eliminar(TableDatos.getValueAt(TableDatos.getSelectedRow(), 0).toString())>0){
                limpiar();
                listar();
            } 
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        
        
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        listar();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyReleased
        
    }//GEN-LAST:event_btnBuscarKeyReleased

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            listar(1,txtBuscar.getText());
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefrescarMouseClicked
        listar();
    }//GEN-LAST:event_btnRefrescarMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       setSize(1117,500);
       jPanel2.setVisible(true);
       Panel2Label.setText("MODIFICAR USUARIO");
       btnModificar.show();
       txtBuscar.show();
       btnBuscar.show();
       btnGuardar.hide();
       btnLimpiar.hide();
       Lnombre.show();
       Lapellido.show();
       Ltelefono.show();
       Lcorreo.show();
       txtNombre.show();
       txtApellido.show();
       txtTelefono.show();
       txtCorreo.show();
       btnEliminar.hide();
       Lnombre.enable();
       Lapellido.enable();
       Ltelefono.enable();
       Lcorreo.enable();
       txtNombre.enable();
       txtApellido.enable();
       txtTelefono.enable();
       txtCorreo.enable();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        setSize(1117,500);
        jPanel2.setVisible(true);
        Panel2Label.setText("ELIMINAR USUARIO");
        txtBuscar.show();
        btnBuscar.show();
        btnGuardar.hide();
        btnLimpiar.hide();
        btnModificar.hide();
        Lnombre.disable();
        Lapellido.disable();
        Ltelefono.disable();
        Lcorreo.disable();
        btnEliminar.show();
        txtNombre.disable();
        txtApellido.disable();
        txtTelefono.disable();
        txtCorreo.disable();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCerrarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSeccionActionPerformed
        Login login = new Login();
        int cerrar = 
                JOptionPane.showConfirmDialog(this,"Seguro deseas cerrar sesión?", "Cerrando sesión...",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        switch(cerrar){
            case JOptionPane.YES_OPTION: 
                login.setVisible(true);
                this.dispose();
                break;
            case JOptionPane.NO_OPTION:
                break;
        }
    }//GEN-LAST:event_btnCerrarSeccionActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(() -> {
            new frmUsuarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lapellido;
    private javax.swing.JLabel Lcorreo;
    private javax.swing.JLabel Lnombre;
    private javax.swing.JLabel Ltelefono;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Panel2Label;
    private javax.swing.JTable TableDatos;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrarSeccion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables




}
