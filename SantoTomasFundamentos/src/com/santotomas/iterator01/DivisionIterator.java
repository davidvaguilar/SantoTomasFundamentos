/**
 * 
 */
package com.santotomas.iterator01;

import java.util.Iterator;

/**
 * @author David
 *
 */
public class DivisionIterator implements Iterator<Empleado> {

	private Empleado[] empleado;
	private int location=0;
	
	public DivisionIterator(Empleado[] e) {
		empleado=e;
	}
	
	@Override
	public boolean hasNext() {
		if(location<empleado.length&&empleado[location]!=null){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Empleado next() {
		// TODO Auto-generated method stub
		return empleado[location++];
	}

}
