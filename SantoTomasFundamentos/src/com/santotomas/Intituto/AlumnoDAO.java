package com.santotomas.Intituto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlumnoDAO implements ModeloDAO<Alumno>{

	private static final String SQL_INSERT=
            "INSERT INTO Alumno "
            + "(aluCodigo, aluNombre, aluApellido) "
            + "VALUES (?,?,?)";
            
  	private static final String SQL_UPDATE=
            "UPDATE Alumno "
            + "SET aluNombre=?, aluApellido=? "
            + "WHERE aluCodigo=?";     
	
  	private static final String SQL_DELETE=
            "DELETE FROM Alumno "
            + "WHERE aluCodigo=?";
  	
  	private static final String SQL_READ=
            "SELECT * FROM Alumno "
             + "WHERE aluCodigo=?";
  	 
  	private static final String SQL_READALL=
            "SELECT * FROM Alumno";
  	
  	private static final Conexion cnn=Conexion.estado();
  	
	@Override
	public boolean create(Alumno a) {

		PreparedStatement pst;
		try {
            pst=cnn.getCnn().prepareStatement(SQL_INSERT);
            pst.setInt(1, a.getAluCodigo());
            pst.setString(2, a.getAluNombre());
            pst.setString(3, a.getAluApellido());
            if(pst.executeUpdate()>0)
            {
                return true;
            }
       	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
            cnn.cerrarConexion();
        }
        return false;
		
	}

	@Override
	public boolean update(Alumno a) {
		PreparedStatement pst;
        try {
            pst=cnn.getCnn().prepareStatement(SQL_UPDATE);
            pst.setString(1, a.getAluNombre());
            pst.setString(2, a.getAluApellido());
            pst.setInt(3, a.getAluCodigo());
            if(pst.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        } finally {
            cnn.cerrarConexion();
        }
        return false;
	}

	@Override
	public boolean delete(Object llave) {
		PreparedStatement pst;
	    try {
	    	pst = cnn.getCnn().prepareStatement(SQL_DELETE);
		    pst.setInt(1, Integer.parseInt(llave.toString()));
		    if(pst.executeUpdate()>0){
		        return true;
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		    cnn.cerrarConexion();
		}
		return false;
	}

	@Override
	public Alumno read(Object llave) {
		
		PreparedStatement pst;
        ResultSet res;
        Alumno alu = null;
        try {
            pst = cnn.getCnn().prepareStatement(SQL_READ);
            pst.setInt(1, Integer.parseInt(llave.toString()));
            res = pst.executeQuery();
            while(res.next()){
                alu=new Alumno(res.getInt(1), res.getString(2), res.getString(3));
            }
            return alu;    
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        } finally {
            cnn.cerrarConexion();
        }
        return alu;

		
	}

	@Override
	public ArrayList<Alumno> readAll() {
		PreparedStatement pst;
        ResultSet res;
        ArrayList<Alumno> empresas=new ArrayList<Alumno>();
        try {
            pst=cnn.getCnn().prepareStatement(SQL_READALL);
            res=pst.executeQuery();
            while(res.next()){
                empresas.add(new Alumno(res.getInt(1), res.getString(2), res.getString(3)));
            }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        } finally {
            cnn.cerrarConexion();
        }
        return empresas;	  
	}


}
