/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import conexion.Conexion;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import microsoft.sql.Types;

/**
 *
 * @author Diego
 */
public class Usuarios {
    Conexion CN = new Conexion();
    private String SQL_INSERT;
    private String SQL_UPDATE;
    private String SQL_DELETE;
    private String SQL_SELECT;
    private PreparedStatement PS;
    private DefaultTableModel DT;
    private ResultSet RS;
    //getter
    private String Nombre,Apellido,nombreUsuario,contraseña,telefono,correo;


    public Usuarios() {
        this.SQL_INSERT = "";
        this.SQL_UPDATE = "";
        this.SQL_DELETE = "";
        this.SQL_SELECT = "";
    }
    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //Insertar registros
    public int insertar(String nombre, String apellido,String nombreUsuario,String contraseña,String telefono, String correo){
        SQL_INSERT = "INSERT INTO usuarios (Nombre, Apellido,nombreUsuario,contraseña,telefono,correo) VALUES (?,?,?,?,?,?)";
        
        try {
                PS = CN.getConnection().prepareStatement(SQL_INSERT);
                PS.setString(1, nombre);
                PS.setString(2, apellido);
                PS.setString(3, nombreUsuario);
                PS.setString(4, contraseña);
                PS.setString(5, telefono);
                PS.setString(6, correo);
                int resultado = PS.executeUpdate();
                if (resultado > 0){
                    JOptionPane.showMessageDialog(null, "Registro guardado..");
                }
            
        }catch (Exception e){
            System.err.println("Error al insertar en la base de datos: " + e.getMessage());
        }finally{
            PS = null;
            CN.close();
        }
        return 0;
    }
    
    public int insertar(String nombre, String apellido,String telefono, String correo){
        
        SQL_INSERT = "INSERT INTO usuarios (Nombre, Apellido,telefono,correo) VALUES (?,?,?,?)";
        Conexion CN = new Conexion();
        int resultado = 0;
        try {
            PS = CN.getConnection().prepareStatement(SQL_INSERT);
            PS.setString(1, nombre);
            PS.setString(2, apellido);
            PS.setString(3, telefono);
            PS.setString(4, correo);
            
            resultado = PS.executeUpdate();
            if (resultado > 0){
                JOptionPane.showMessageDialog(null, "Registro guardado..");
            }
            
        }catch (SQLException ex){
            System.err.println("Error al insertar en la base de datos: " + ex);
        }finally{
                PS = null;
                CN.close();
        }
        System.out.println(resultado);
        return resultado; 
    }
    
    public int actualizar(String nombre, String apellido,String telefono, String correo,String buscar){
        
        SQL_UPDATE = "UPDATE usuarios SET Nombre=?,Apellido=?,telefono=?,correo=? WHERE idUsuario=?";
        Conexion CN = new Conexion();
        int resultado = 0;
        try {
            PS = CN.getConnection().prepareStatement(SQL_UPDATE);
            PS.setString(1, nombre);
            PS.setString(2, apellido);
            PS.setString(3, telefono);
            PS.setString(4, correo);
            PS.setString(5, buscar);
            resultado = PS.executeUpdate();
            if (resultado > 0){
                JOptionPane.showMessageDialog(null, "Registro modificado..");
            }
            
        }catch (Exception e){
            System.err.println("Error al modificar en la base de datos :" + e.getMessage());
        }finally{
            PS = null;
            CN.close();
        }
        return resultado;
    }
    
    public int eliminar(String id){
        
        SQL_DELETE = "delete from usuarios where idUsuario=" + id;
        Conexion CN = new Conexion();   
        int res = 0;
        try {
            PS = CN.getConnection().prepareStatement(SQL_DELETE);
            res = PS.executeUpdate();
            if (res > 0){
                JOptionPane.showMessageDialog(null, "registro eliminado..");
            }
             
        }catch (SQLException e){
            System.err.println("Error al eliminar en la base de datos :" + e.getMessage());
        }finally{
            PS = null;
            CN.close();
        }
        
        return res;
    }
    
    private DefaultTableModel setTitulos(){
        DT = new DefaultTableModel();
        DT.addColumn("Id");
        DT.addColumn("Nombre");
        DT.addColumn("Apelldio");
        DT.addColumn("Telefono");
        DT.addColumn("Correo");
        return DT;
    }
      
    public DefaultTableModel getDatos(int crt,String buscar) {
        Conexion CN = new Conexion();
        if (crt == 0){
            SQL_SELECT = "SELECT idUsuario,Nombre,Apellido,telefono,correo FROM usuarios";
        } else{
            if (buscar.matches("[0-9]*")) {
                SQL_SELECT = "SELECT idUsuario,Nombre,Apellido,telefono,correo FROM usuarios WHERE idUsuario='"+buscar+"'";
            } else {
                SQL_SELECT = "SELECT idUsuario,Nombre,Apellido,telefono,correo FROM usuarios WHERE Nombre='"+buscar+"'";	
            }
        }
        try{
             setTitulos();
             PS = CN.getConnection().prepareStatement(SQL_SELECT);   
             RS = PS.executeQuery();
             Object[] fila = new Object[5];

             while (RS.next()){
                 fila[0] = RS.getInt(1); 
                 fila[1] = RS.getString(2); 
                 fila[2] = RS.getString(3); 
                 fila[3] = RS.getString(4); 
                 fila[4] = RS.getString(5);
                 DT.addRow(fila);
             }
         
        }catch(SQLException ex){
            System.err.println("Error al listar los datos : " + ex.getMessage());
        } finally {
            PS = null;
            RS = null;  
        }
            return DT;
    }
     
    public int Login(String usuario,String contra){
        Conexion CN = new Conexion();
           int resultado = 0;
           try{
               Statement sentencia = CN.getConnection().createStatement();
               ResultSet rs = sentencia.executeQuery("SELECT nombreUsuario,contraseña  FROM usuarios where nombreUsuario='"+usuario+"' AND contraseña='"+contra+"'");
               
               if(rs.next()){
                  JOptionPane.showMessageDialog(null, "Bienvenido " + usuario  );
                  resultado = 1;
                  CN.close();
                 
               }else {
                   JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
                   resultado = 0;
               }
           } catch(Exception e){
               JOptionPane.showMessageDialog(null, "Error al conectar" + e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
           }
           return resultado;
       }
    
    public int Registro(String Usuario){
        Conexion CN = new Conexion();
        SQL_SELECT = "SELECT nombreUsuario FROM usuarios WHERE nombreUsuario='"+Usuario+"'";
        int existe = 0;
        
        try{
            PS = CN.getConnection().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            if(RS.next()){
                existe = 1;
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe","Aviso",JOptionPane.INFORMATION_MESSAGE);
            } else {
                existe = 2;
            }
            
        } catch(SQLException e){
            existe = 0;
            JOptionPane.showMessageDialog(null, "Error al intentar registrar" + e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
             
        }
        return existe;
        
    }
}

