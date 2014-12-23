package ubu.lsi.dms.agenda.gui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import ubu.lsi.dms.agenda.modelo.Llamada;

public class AdaptadorLlamada extends AbstractTableModel{
	
	Collection<Llamada> totalLlamadas;
	List<String> nombreColumnas;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Número de columnas
	 */
	private final int NUMCOLUMNAS = 5;
	
	/**
	 * Constructor
	 */
	public AdaptadorLlamada(Collection<Llamada> totalLlamadas){
		this.totalLlamadas = totalLlamadas;
		

		nombreColumnas = new ArrayList<String>();
		nombreColumnas.add("Id Llamada");
		nombreColumnas.add("Contacto");
		nombreColumnas.add("Fecha LLamada");
		nombreColumnas.add("asunto");
		nombreColumnas.add("notas");
		
	}
	
	@Override
	public int getColumnCount() {
		return NUMCOLUMNAS;

	}

	@Override
	public int getRowCount() {
		return totalLlamadas.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		//Conseguimos el llamada deseado
		
		
		Iterator<Llamada> iterador = totalLlamadas.iterator();
		Llamada llamada=null;
		for (int i = 0; i <= arg0; i++) {
			llamada = (Llamada) iterador.next();
		}
		//Elegimos el atributo deseado indicado
		switch (arg1) {
		case 0:
			return llamada.getIdLlamada();
		case 1:
			return llamada.getContacto();
		case 2:
			return llamada.getFechaLlamada();
		case 3:
			return llamada.getAsunto();
		case 4:
			return llamada.getNotas();
		}
		return null;
	}
	
	@Override
	public String getColumnName(int column){
		return nombreColumnas.get(column);
		
	}


/*
	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		if(arg1==0)
			return false;
		return true;
	}


	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		//Conseguimos el llamada deseado
		
		
		Iterator<Llamada> iterador = totalLlamadas.iterator();
		Llamada llamada=null;
		for (int i = 0; i == arg1; i++) {
			llamada = (Llamada) iterador.next();
		}
		//Elegimos el atributo deseado indicado
		switch (arg1) {

		case 1:
			llamada.setContacto((Contacto) arg0);
			fireTableCellUpdated(arg1,arg2);
		case 2:
			llamada.setFechaLlamada((String) arg0);
			fireTableCellUpdated(arg1,arg2);
			
		case 3:
			llamada.setAsunto((String) arg0);
			fireTableCellUpdated(arg1,arg2);
		case 4:
			llamada.setNotas((String) arg0);
			fireTableCellUpdated(arg1,arg2);
		}
		
	}

	*/
	
}
