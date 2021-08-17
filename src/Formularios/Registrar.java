/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import Usuarios.Usuarios;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.border.LineBorder;
    
/**
 *
 * @author Diego
 */
public class Registrar extends javax.swing.JFrame {

    private Usuarios usuario;
    
    public Registrar() {
        initComponents();
        usuario = new Usuarios();
        setLocationRelativeTo(null);
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
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        txtConfContraseña = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 50, 54));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("REGISTRO");
        jLabel1.setToolTipText("");

        txtApellido.setBackground(new java.awt.Color(204, 204, 204));
        txtApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(51, 51, 51));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido.setText("Apellido");
        txtApellido.setToolTipText("Ingresa el nombre de usuario");
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApellidoMouseClicked(evt);
            }
        });
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setText("Nombre");
        txtNombre.setToolTipText("Ingresa el nombre de usuario");
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtTelefono.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono.setText("Teléfono");
        txtTelefono.setToolTipText("Ingresa el nombre de usuario");
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseClicked(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });

        txtCorreo.setBackground(new java.awt.Color(204, 204, 204));
        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreo.setText("Correo electrónico");
        txtCorreo.setToolTipText("Ingresa el nombre de usuario");
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoMouseClicked(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });

        txtContraseña.setBackground(new java.awt.Color(204, 204, 204));
        txtContraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(51, 51, 51));
        txtContraseña.setEchoChar((char)0);
        txtContraseña.setText("Contraseña");
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyReleased(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsuario.setText("Nombre de usuario");
        txtUsuario.setToolTipText("Ingresa el nombre de usuario");
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });

        txtConfContraseña.setBackground(new java.awt.Color(204, 204, 204));
        txtConfContraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtConfContraseña.setForeground(new java.awt.Color(51, 51, 51));
        txtConfContraseña.setEchoChar((char)0);
        txtConfContraseña.setText("Confirmar contraseña");
        txtConfContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfContraseñaFocusLost(evt);
            }
        });
        txtConfContraseña.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtConfContraseñaInputMethodTextChanged(evt);
            }
        });
        txtConfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfContraseñaActionPerformed(evt);
            }
        });
        txtConfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfContraseñaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfContraseñaKeyTyped(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(255, 0, 0));
        btnRegistrar.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(204, 204, 204));
        btnRegistrar.setText("REGISTRARSE");
        btnRegistrar.setBorder(null);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("<html> <a><i>¿Tienes una cuenta yá?</i><br>Pulsa aquí para iniciar sesión</a </html>");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono)
                            .addComponent(txtContraseña)
                            .addComponent(txtCorreo)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(txtUsuario)
                            .addComponent(txtConfContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtConfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusGained
        if (txtApellido.getText().trim().equals("Apellido")){
            txtApellido.setText("");

        }
        txtApellido.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtApellidoFocusGained

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        if(txtApellido.getText().equals("")){
            txtApellido.setText("Apellido");

        }
        txtApellido.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_txtApellidoFocusLost

    private void txtApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMouseClicked

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        if (txtNombre.getText().trim().equals("Nombre")){
            txtNombre.setText("");

        }
        txtNombre.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Nombre");

        }
        txtNombre.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        if (txtTelefono.getText().trim().equals("Teléfono")){
            txtTelefono.setText("");

        }
        txtTelefono.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if(txtTelefono.getText().equals("")){
            txtTelefono.setText("Teléfono");
        }
            txtTelefono.setForeground(Color.DARK_GRAY);
        
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoMouseClicked

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        if (txtCorreo.getText().equals("Correo electrónico")){
            txtCorreo.setText("");

        }
        txtCorreo.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if(txtCorreo.getText().equals("")){
            txtCorreo.setText("Correo electrónico");
        }
            txtCorreo.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMouseClicked

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained

        String pass = String.valueOf(txtContraseña.getPassword());

        if (pass.trim().equals("Contraseña")){
            txtContraseña.setText("");
            txtContraseña.setEchoChar('\u2022');
        }

        txtContraseña.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        if(String.valueOf(txtContraseña.getPassword()).equals("")){
            txtContraseña.setText("Contraseña");
            txtContraseña.setEchoChar((char)0);
        }
        txtContraseña.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed

    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if (txtUsuario.getText().equals("Nombre de usuario")){
            txtUsuario.setText("");

        }
        txtUsuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if(txtUsuario.getText().equals("")){
            txtUsuario.setText("Nombre de usuario");

        }
        txtUsuario.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtConfContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfContraseñaFocusGained
        if (String.valueOf(txtConfContraseña.getPassword()).equals("Confirmar contraseña")){
            txtConfContraseña.setText("");
            txtConfContraseña.setEchoChar('\u2022');
        }

        txtConfContraseña.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_txtConfContraseñaFocusGained

    private void txtConfContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfContraseñaFocusLost
        if(String.valueOf(txtConfContraseña.getPassword()).equals("")){
            txtConfContraseña.setText("Confirmar contraseña");
            txtConfContraseña.setEchoChar((char)0);
        }
        txtConfContraseña.setForeground(Color.DARK_GRAY);
     
              
        
   
     
        
        
        
        
    }//GEN-LAST:event_txtConfContraseñaFocusLost

    private void txtConfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfContraseñaActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked

    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        usuario = recuperarDatos();
        int ver = verificarCampos();
        System.out.println(ver);
        int exis;
        switch (ver) {
            case 1:
                exis = usuario.Registro(usuario.getNombreUsuario());
                if(exis==2){
                    usuario.insertar(usuario.getNombre(), usuario.getApellido(), usuario.getNombreUsuario(), usuario.getContraseña(), usuario.getTelefono(), usuario.getCorreo());
                    txtUsuario.setBorder(BorderFactory.createLineBorder(Color.white));
                    txtConfContraseña.setBorder(BorderFactory.createLineBorder(Color.white));
                    Login login = new Login();
                    login.setVisible(true);
                    this.dispose();
                }else if(exis==1){
                    txtUsuario.setBorder(new LineBorder(Color.RED,2));
                    txtUsuario.requestFocus();
                }break;
            case 2:
                txtConfContraseña.setBorder(new LineBorder(Color.RED,2));
                txtConfContraseña.requestFocus();
                break;
            default:
                if(ver == 0){
                    JOptionPane.showMessageDialog(null, "No has completado el campo Usuario","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtUsuario.requestFocus();
                }else if(ver == -1){
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Nombre","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtNombre.requestFocus();
                }else if(ver == -2){
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Apellido","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtApellido.requestFocus();
                }else if(ver == -3){
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Telefono","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtTelefono.requestFocus();
                }else if(ver == -4){
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Correo","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtCorreo.requestFocus();
                }else if(ver == -5){
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Contrasña","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtContraseña.requestFocus();
                }else {
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Confirmar contraseña","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtConfContraseña.requestFocus();
                }
                break;
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtConfContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfContraseñaKeyTyped
        
    }//GEN-LAST:event_txtConfContraseñaKeyTyped

    private void txtConfContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfContraseñaKeyPressed
        
    }//GEN-LAST:event_txtConfContraseñaKeyPressed

    private void txtConfContraseñaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtConfContraseñaInputMethodTextChanged
        
    }//GEN-LAST:event_txtConfContraseñaInputMethodTextChanged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
           
        }
    }//GEN-LAST:event_jPanel1KeyReleased

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
         char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
           txtNombre.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
           txtApellido.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
           txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
           txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
           txtContraseña.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
           txtConfContraseña.requestFocus();
        }
    }//GEN-LAST:event_txtContraseñaKeyReleased

    private void txtConfContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfContraseñaKeyReleased
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            usuario = recuperarDatos();
        int ver = verificarCampos();
        int exis;
        switch (ver) {
            case 1:
                exis = usuario.Registro(usuario.getNombreUsuario());
                if(exis==2){
                    usuario.insertar(usuario.getNombre(), usuario.getApellido(), usuario.getNombreUsuario(), usuario.getContraseña(), usuario.getTelefono(), usuario.getCorreo());
                    txtUsuario.setBorder(BorderFactory.createLineBorder(Color.white));
                    txtConfContraseña.setBorder(BorderFactory.createLineBorder(Color.white));
                    Login login = new Login();
                    login.setVisible(true);
                    this.dispose();
                }else if(exis==1){
                    txtUsuario.setBorder(new LineBorder(Color.RED,2));
                    txtUsuario.requestFocus();
                }break;
            case 2:
                txtConfContraseña.setBorder(new LineBorder(Color.RED,2));
                txtConfContraseña.requestFocus();
                break;
            default:
                if(ver == 0){
                    JOptionPane.showMessageDialog(null, "No has completado el campo Usuario","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtUsuario.requestFocus();
                }else if(ver == -1){
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Nombre","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtNombre.requestFocus();
                }else if(ver == -2){
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Apellido","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtApellido.requestFocus();
                }else if(ver == -3){
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Telefono","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtTelefono.requestFocus();
                }else if(ver == -4){
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Correo","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtCorreo.requestFocus();
                }else if(ver == -5){
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Contrasña","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtContraseña.requestFocus();
                }else {
                    JOptionPane.showMessageDialog(null, "No has llenado el campo Confirmar contraseña","Info",JOptionPane.INFORMATION_MESSAGE);
                    txtConfContraseña.requestFocus();
                }
                break;
        }
        
        }
    }//GEN-LAST:event_txtConfContraseñaKeyReleased

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtConfContraseña;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables


private int verificarCampos(){
    String contra = String.valueOf(txtContraseña.getPassword());
    String confContra = String.valueOf(txtConfContraseña.getPassword());
    int pos  = 0;
    
    String[] campos = {txtUsuario.getText(),txtNombre.getText(),txtApellido.getText(),txtTelefono.getText(),txtCorreo.getText(),contra,confContra};
    String[] defaults = {"Nombre de usuario","Nombre","Apellido","Teléfono","Correo electrónico","Contraseña","Confirmar contraseña"};
    boolean verificar = true;
    for(int i = 0;i<campos.length;i++){
        if(!campos[i].isEmpty()){
           if(campos[i].equals(defaults[i])){
               verificar = false;
               pos = i;
               System.out.println("Pos en el if: "+i);
               break;
           }
        }else{
            System.out.println("Pos en el else: "+i);
            pos = i;
            break;
        }
    } 
    System.out.println(contra);
    System.out.println(confContra);
    System.out.println(pos);
    if (verificar == true ){
        if(contra.equals(confContra)){
            return 1;
        }else{
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden","Error",JOptionPane.ERROR_MESSAGE);
            return 2;
        }
    }else {
        return pos*-1;
    }
    
    }

public Usuarios recuperarDatos() {
    
    usuario.setNombre(txtNombre.getText());
    usuario.setApellido(txtApellido.getText());
    usuario.setNombreUsuario(txtUsuario.getText());
    usuario.setContraseña(String.valueOf(txtContraseña.getPassword()));
    usuario.setTelefono(txtTelefono.getText());
    usuario.setCorreo(txtCorreo.getText());
    
    return usuario;
}
}

    
