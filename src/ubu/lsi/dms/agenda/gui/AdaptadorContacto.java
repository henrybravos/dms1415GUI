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

	/**
	 * @return the totalContactos
	 */
	public Collection<Contacto> getTotalContactos() {
		return totalContactos;
	}
	
	
	public int getHigherID(){
		int higherID=-1;
		//Conseguimos el contacto deseado	
		Iterator<Contacto> iterador = totalContactos.iterator();
		Contacto contacto=null;
		for (int i = 0; i <= totalContactos.size()-1; i++) {
			contacto = (Contacto) iterador.next();
			if(higherID<contacto.getIdContacto())
				higherID=contacto.getIdContacto();
		}
		return higherID;
	}
	

	public void actualizarRow(Contacto contactoActualizar) {
		//Conseguimos el contacto deseado	
		Iterator<Contacto> iterador = totalContactos.iterator();
		Contacto contactoActual=null;
		for (int i = 0; i <= totalContactos.size()-1; i++) {
			contactoActual = iterador.next();
			if(contactoActual.getIdContacto()==contactoActualizar.getIdContacto()){
				totalContactos.remove(contactoActual);
				totalContactos.add(contactoActualizar);
				return;
			}
			
		}
		
		
	}


	

	
	
	
}
