/**
 * 
 */
package com.santotomas.Intituto;

import java.util.ArrayList;

/**
 * @author David
 *
 */
public interface ModeloDAO<Algo> {

	public boolean create(Algo c);
    public boolean update(Algo c);
    public boolean delete(Object llave);
    public Algo read(Object llave);
    public ArrayList<Algo> readAll();
}
