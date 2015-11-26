package com.santotomas.Intituto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TelefonoDAO implements ModeloDAO<Telefono> {

	private static final String SQL_INSERT=
            "INSERT INTO Telefono "
            + "(aluCodigo, telNumero) "
            + "VALUES (?,?)";
            
  	private static final String SQL_UPDATE=
            "UPDATE Telefono "
            + "SET telNumero=?"
            + "WHERE aluCodigo=?";     
	
  	private static final String SQL_DELETE=
            "DELETE FROM Telefono "
            + "WHERE aluCodigo=?";
  	  	
  	private static final String SQL_READ=
             "SELECT * FROM Telefono "
             + "WHERE aluCodigo=?";
  	 
  	private static final String SQL_READALL=
              "SELECT * FROM Telefono";
  	
  	private static final Conexion cnn=Conexion.estado();
  	
  	
	@Override
	public boolean create(Telefono t) {
		PreparedStatement pst;
		try {
            pst=cnn.getCnn().prepareStatement(SQL_INSERT);
            pst.setInt(1, t.getAluCodigo());
            pst.setInt(2, t.getTelNumero());
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
	public boolean update(Telefono t) {
		PreparedStatement pst;
        try {
            pst=cnn.getCnn().prepareStatement(SQL_UPDATE);
            pst.setInt(1, t.getTelNumero());
            pst.setInt(1, t.getAluCodigo());
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
	public Telefono read(Object llave) {
		PreparedStatement pst;
        ResultSet res;
        Telefono tel = null;
        try {
            pst = cnn.getCnn().prepareStatement(SQL_READ);
            pst.setInt(1, Integer.parseInt(llave.toString()));
            res = pst.executeQuery();
            while(res.next()){
                tel=new Telefono(res.getInt(1),res.getInt(2));
            }
            return tel;    
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        } finally {
            cnn.cerrarConexion();
        }
        return tel;
	}

	@Override
	public ArrayList<Telefono> readAll() {
		PreparedStatement pst;
        ResultSet res;
        ArrayList<Telefono> telefonos=new ArrayList<Telefono>();
        try {
            pst=cnn.getCnn().prepareStatement(SQL_READALL);
            res=pst.executeQuery();
            while(res.next()){
                telefonos.add(new Telefono(res.getInt(1),res.getInt(2)));
            }
        } catch (SQLException e) {
			e.printStackTrace();
        } finally {
            cnn.cerrarConexion();
        }
        return telefonos;
	}

}
