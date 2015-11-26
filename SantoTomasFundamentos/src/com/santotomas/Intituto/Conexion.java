package com.santotomas.Intituto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Conexion instance;
    private Connection cnn;
    
    private Conexion() {
  
            try {
				Class.forName("com.mysql.jdbc.Driver");
				
					cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/INSTITUTO?zeroDateTimeBehavior=convertToNull", "root", "mysql");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		  } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}      
       
        
    }
    
    public synchronized static Conexion estado(){
        if (instance==null) {
            //System.out.println("Conexion RE-Establecida");
            instance=new Conexion();
        }
        //System.out.println("Conexion Estable...");
        return instance;
    }
    
    public Connection getCnn(){
        //System.out.println("Recojiendo la Conexion");
        return cnn;
    }
    
    public void cerrarConexion(){
        instance=null;
       //System.out.println("Desconexion de la Base de Datos");
    }

}
