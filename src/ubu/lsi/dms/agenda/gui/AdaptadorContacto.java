package ubu.lsi.dms.agenda.gui;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import ubu.lsi.dms.agenda.modelo.Contacto;

public class AdaptadorContacto extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	Collection<Contacto> totalContactos;
	List<String> nombreColumnas;

	/**
	 * Número de columnas
	 */
	private final int NUMCOLUMNAS = 19;

	/**
	 * Constructor
	 */
	public AdaptadorContacto(Collection<Contacto> totalContactos) {
		this.totalContactos = totalContactos;

		nombreColumnas = new ArrayList<String>();
		nombreColumnas.add("Id Contacto");
		nombreColumnas.add("Nombre");
		nombreColumnas.add("Apellidos");
		nombreColumnas.add("Estimado");
		nombreColumnas.add("Direccion");
		nombreColumnas.add("Ciudad");
		nombreColumnas.add("Prov.");
		nombreColumnas.add("Cod.Postal");
		nombreColumnas.add("Region");
		nombreColumnas.add("Pais");
		nombreColumnas.add("Nombre Compañia");
		nombreColumnas.add("Cargo");
		nombreColumnas.add("Telefono Trabajo");
		nombreColumnas.add("Extensión Trabajo");
		nombreColumnas.add("Telefono Movil");
		nombreColumnas.add("Fax");
		nombreColumnas.add("Correo Electronico");
		nombreColumnas.add("Notas");
		nombreColumnas.add("Tipo de contacto");

	}

	@Override
	public int getColumnCount() {
		return NUMCOLUMNAS;
	}
	
	@Override
	public String getColumnName(int column) {
		return nombreColumnas.get(column);
	}
	

	@Override
	public int getRowCount() {
		return totalContactos.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
	//Conseguimos el contacto deseado	
		Iterator<Contacto> iterador = totalContactos.iterator();
		Contacto contacto=null;
		for (int i = 0; i <= arg0; i++) {
			contacto = (Contacto) iterador.next();
		}
		//Elegimos el atributo deseado indicado
		switch (arg1) {
		case 0:
			return contacto.getIdContacto();
		case 1:
			return contacto.getNombre();
		case 2:
			return contacto.getApellidos();
		case 3:
			return contacto.getEstimado();
		case 4:
			return contacto.getDireccion();
		case 5:
			return contacto.getCiudad();
		case 6:
			return contacto.getProv();
		case 7:
			return contacto.getCodPostal();
		case 8:
			return contacto.getRegion();
		case 9:
			return contacto.getPais();
		case 10:
			return contacto.getNombreCompania();
		case 11:
			return contacto.getCargo();
		case 12:
			return contacto.getTelefonoTrabajo();
		case 13:
			return contacto.getExtensionTrabajo();
		case 14:
			return contacto.getTelefonoMovil();
		case 15:
			return contacto.getNumFax();
		case 16:
			return contacto.getNomCorreoElectronico();
		case 17:
			return contacto.getNotas();
		case 18:
			return contacto.getTipoContacto();
		}
		return null;
	}

	public void addRow(Contacto contacto) {
		totalContactos.add(contacto);
		
	}


	
	/*
	@Override
	public boolean isCellEditable(int row, int column){
		if(column==0)
			return false;
		return true;
	}
	
	public void setValueAt(Object valor, int fila, int columna){

		Iterator<Contacto> iterador = totalContactos.iterator();
		Contacto contacto=null;
		for (int i = 0; i == fila; i++) {
			contacto = (Contacto) iterador.next();
		}
		
		//Elegimos el atributo deseado indicado
		switch (columna) {
		case 1:
			contacto.setNombre((String) valor);
			fireTableCellUpdated(fila,columna);
		case 2:
			contacto.setApellidos((String) valor);
			fireTableCellUpdated(fila,columna);
		case 3:
			contacto.setEstimado((String) valor);
			fireTableCellUpdated(fila,columna);
		case 4:
			contacto.setDireccion((String) valor);
			fireTableCellUpdated(fila,columna);
		case 5:
			contacto.setCiudad((String) valor);
			fireTableCellUpdated(fila,columna);
		case 6:
			contacto.setProv((String) valor);
			fireTableCellUpdated(fila,columna);
		case 7:
			contacto.setCodPostal((String) valor);
			fireTableCellUpdated(fila,columna);
		case 8:
			contacto.setRegion((String) valor);
			fireTableCellUpdated(fila,columna);
		case 9:
			contacto.setPais((String) valor);
			fireTableCellUpdated(fila,columna);
		case 10:
			contacto.setNombreCompania((String) valor);
			fireTableCellUpdated(fila,columna);
		case 11:
			contacto.setCargo((String) valor);
			fireTableCellUpdated(fila,columna);
		case 12:
			contacto.setTelefonoTrabajo((String) valor);
			fireTableCellUpdated(fila,columna);
		case 13:
			contacto.setExtensionTrabajo((String) valor);
			fireTableCellUpdated(fila,columna);
		case 14:
			contacto.setTelefonoMovil((String) valor);
			fireTableCellUpdated(fila,columna);
		case 15:
			contacto.setNumFax((String) valor);
			fireTableCellUpdated(fila,columna);
		case 16:
			contacto.setNomCorreoElectronico((String) valor);
			fireTableCellUpdated(fila,columna);
		case 17:
			contacto.setNotas((String) valor);
			fireTableCellUpdated(fila,columna);
		case 18:
			contacto.setTipoContacto((TipoDeContacto) valor);
			fireTableCellUpdated(fila,columna);
		}
		
		
	}
	*/
	
	
	
}
