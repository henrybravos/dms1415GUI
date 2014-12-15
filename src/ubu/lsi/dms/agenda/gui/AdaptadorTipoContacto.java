package ubu.lsi.dms.agenda.gui;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import ubu.lsi.dms.agenda.modelo.TipoContacto;

public class AdaptadorTipoContacto extends AbstractTableModel{
	
	Collection<TipoContacto> totalTipoContacto;
	List<String> nombreColumnas;


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Número de columnas
	 */
	private final int NUMCOLUMNAS = 2;
	
	
	/**
	 * Constructor
	 */
	public AdaptadorTipoContacto(Collection<TipoContacto> totalTipoDeContacto){
		this.totalTipoContacto = totalTipoDeContacto;
		
		nombreColumnas = new ArrayList<String>();
		nombreColumnas.add("Id Llamada");
		nombreColumnas.add("Contacto");
	}
	

	@Override
	public int getColumnCount() {
		return NUMCOLUMNAS;
	}

	@Override
	public int getRowCount() {
		return totalTipoContacto.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		
		Iterator<TipoContacto> iterador = totalTipoContacto.iterator();
		TipoContacto llamada=null;
		for (int i = 0; i == arg0; i++) {
			llamada = (TipoContacto) iterador.next();
		}
		//Elegimos el atributo deseado indicado
		switch (arg1) {
		case 0:
			return llamada.getIdTipoContacto();
		case 1:
			return llamada.getTipoContacto();
		}
		
		return null;
	}
	
	@Override
	public String getColumnName(int column){
		return nombreColumnas.get(column);
		
	}



}
