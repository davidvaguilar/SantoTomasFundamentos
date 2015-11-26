package com.santotomas.Intituto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CursoDAO implements ModeloDAO<Curso> {

	private static final String SQL_INSERT=
            "INSERT INTO Curso "
            + "(curNombre) "
            + "VALUES (?)";
            
  	private static final String SQL_UPDATE=
            "UPDATE Curso "
            + "SET curNombre=?"
            + "WHERE curNombre=?";     
	
  	private static final String SQL_DELETE=
            "DELETE FROM Curso "
            + "WHERE curNombre=?";
  	
  	private static final String SQL_READ=
             "SELECT * FROM Curso "
             + "WHERE curNombre=?";
  	 
  	private static final String SQL_READALL=
              "SELECT * FROM Curso";
  	
  	private static final Conexion cnn=Conexion.estado();
	
	@Override
	public boolean create(Curso c) {
		PreparedStatement pst;
		try {
            pst=cnn.getCnn().prepareStatement(SQL_INSERT);
            pst.setString(1, c.getCurNombre());
            if(pst.executeUpdate()>0)
            {
                return true;
            }
       	} catch (SQLException e) {
			e.printStackTrace();
		}finally {
            cnn.cerrarConexion();
        }
        return false;
	}

	@Override
	public boolean update(Curso c) {
		PreparedStatement pst;
        try {
            pst=cnn.getCnn().prepareStatement(SQL_UPDATE);
            pst.setString(1, c.getCurNombre());
            if(pst.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
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
			pst.setString(1, llave.toString());
			if(pst.executeUpdate()>0){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		    cnn.cerrarConexion();
		}
		return false;
	}

	@Override
	public Curso read(Object llave) {
		PreparedStatement pst;
        ResultSet res;
        Curso cur = null;
        try {
            pst = cnn.getCnn().prepareStatement(SQL_READ);
            pst.setInt(1, Integer.parseInt(llave.toString()));
            res = pst.executeQuery();
            while(res.next()){
                cur=new Curso(res.getString(1));
            }
            return cur;    
        } catch (SQLException e) {
			e.printStackTrace();
        } finally {
            cnn.cerrarConexion();
        }
        return cur;
	}

	@Override
	public ArrayList<Curso> readAll() {
		PreparedStatement pst;
        ResultSet res;
        ArrayList<Curso> cursos=new ArrayList<Curso>();
        try {
            pst=cnn.getCnn().prepareStatement(SQL_READALL);
            res=pst.executeQuery();
            while(res.next()){
                cursos.add(new Curso(res.getString(1)));
            }
        } catch (SQLException e) {
			e.printStackTrace();
        } finally {
            cnn.cerrarConexion();
        }
        return cursos;	
	}
}
