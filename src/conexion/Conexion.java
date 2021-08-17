package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;


public class Conexion {
   
    Connection conn = null; 
    
     public Connection getConnection(){
           
         String conexionUrl = "jdbc:sqlserver://localhost:1433;"
            + "database=DB_Usuarios;"
            + "user=sa;"
            + "password=diego12;"
            + "loginTimeout=30;";
         
        if(conn == null){ 
         try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             conn = DriverManager.getConnection(conexionUrl);
             System.out.println("Conexión establecida");
            
         }catch(ClassNotFoundException | SQLException ex){
             JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al conectar con la base de datos", JOptionPane.ERROR_MESSAGE);
             System.exit(0);
             
        }
      }
        return conn;
     }
      
     public void close(){
         try{
             conn.close();
             System.out.println("Se ha cerrado la conexion");
         } catch(SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage(),"Error al cerrar la conexion con la base de datos", JOptionPane.ERROR);
         }
     }
}
