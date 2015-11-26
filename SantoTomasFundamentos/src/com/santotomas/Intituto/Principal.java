package com.santotomas.Intituto;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args)
    {
        Conexion miConexion;
        miConexion=Conexion.estado();
      
       
        
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
        ModeloDAO alu1=new AlumnoDAO();
      //  alu1.create(new Alumno(534,"JUSDA","SDASD"));
       // alu1.delete(4);
        System.out.println(alu1.read(4));
      //  Alumno alu2 =new Alumno(23,"David","Vilegas");
        //System.out.println(alu1.equals(alu2));
        ModeloDAO cur1=new CursoDAO();
     //   cur1.create(new Curso("3243"));
//        
        ModeloDAO tel=new TelefonoDAO();
     //tel.create(new Telefono(2,222333));
        
        
        
    }

}
