package ubu.lsi.dms.agenda.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import ubu.lsi.dms.agenda.modelo.Contacto;
import ubu.lsi.dms.agenda.modelo.TipoContacto;


public class ContactPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel westPane;

	private JPanel eastPane;

	private JPanel southPane;
	
	private JPanel northPane;

	private FilterPanel filterPanel;
	
	private TablePanel tablePanel;

	private ContactDataPanel contactDataPanel;

	private String[] filterOptions;

	private InsertButtonsPanel insertButtonsPanel;

	private AddChangeButtonPanel addChangeButtonPanel;
	
	
	private AdaptadorTipoContacto adaptadorTipoContacto;
	private AdaptadorContacto adaptadorContacto;
	private AdaptadorLlamada adaptadorLlamada;
	

	public ContactPanel(AdaptadorContacto adaptadorContacto, AdaptadorLlamada adaptadorLlamada, AdaptadorTipoContacto adaptadorTipoContacto) {

		this.adaptadorContacto = adaptadorContacto;
		this.adaptadorLlamada = adaptadorLlamada;
		this.adaptadorTipoContacto = adaptadorTipoContacto;
		
		setLayout(new BorderLayout());

		filterOptions = new String[] { "Surname" };
		filterPanel = new FilterPanel(filterOptions);
		tablePanel =  new TablePanel(adaptadorContacto);
		contactDataPanel = new ContactDataPanel(adaptadorTipoContacto);
		insertButtonsPanel = new InsertButtonsPanel();
		addChangeButtonPanel = new AddChangeButtonPanel();

		westPane = new JPanel();
		eastPane = new JPanel();
		southPane = new JPanel();
		northPane =  new JPanel();

		initComponents();
		
		insertButtonsPanel.setInsertarContactoListener(new InsertarContactoListener());
		filterPanel.setFiltrarContactoListener(new FiltrarContactoListener());
		filterPanel.setLimpiarFiltroContactoListener(new LimpiarFiltroContactoListener());
		add(westPane, BorderLayout.WEST);
		add(eastPane, BorderLayout.EAST);
		add(southPane, BorderLayout.SOUTH);
		add(northPane, BorderLayout.NORTH);

	}

	private void initComponents() {

		// WEST PANE INITIALIZATION
		westPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		westPane.setPreferredSize(new Dimension(650, 340));
		westPane.setBorder(new TitledBorder(null, "Contact",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));

		westPane.add(contactDataPanel);
		westPane.add(insertButtonsPanel);

		// EAST PANE INITIALIZATION
		eastPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		westPane.setPreferredSize(new Dimension(650, 340));
		eastPane.setBorder(new TitledBorder(null, "Contact type",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		eastPane.add(addChangeButtonPanel);

		// SOUTH PANE INITIALIZATION
		southPane.setLayout(new GridLayout(3, 1, 5, 5));
		southPane.add(filterPanel);
		
		//NORTH PANE
		northPane.setLayout(new GridLayout(1,0));
		northPane.add(tablePanel);
		
	}
	
	private class InsertarContactoListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//Cogemos el modelo de la tabla
			TableModel modelo = tablePanel.getTablaPrueba().getModel();
			//Para calcular el ID cogemos el ID del último contacto añadido y le vamos a sumar uno
			int idContacto = (int) modelo.getValueAt(modelo.getRowCount()-1, 0) + 1;
			String nombre = contactDataPanel.getNameField().getText();
			String apellidos = contactDataPanel.getSurnameField().getText();
			String estimado = contactDataPanel.getTitleField().getText();
			String direccion = contactDataPanel.getAddressField().getText();
			String ciudad = contactDataPanel.getCityField().getText();
			String provincia = contactDataPanel.getProvinceField().getText();
			String codProv = contactDataPanel.getPostalCodeField().getText();
			String region = contactDataPanel.getRegionField().getText();
			String pais = contactDataPanel.getCountryField().getText();
			String nombreCompania = contactDataPanel.getCompanyField().getText();
			String cargo = contactDataPanel.getPositionField().getText();
			String telfTrabajo = contactDataPanel.getWorkPhoneField().getText();
			String ExtensionTrabajo = contactDataPanel.getExtensionField().getText();
			String telfMovil = contactDataPanel.getMobilePhoneField().getText();
			String numFax = contactDataPanel.getFaxField().getText();
			String nomCorreo = contactDataPanel.getEmailField().getText();
			String notas = contactDataPanel.getNotesField().getText();
			
			TipoContacto tipoContacto = buscarTipoContacto();

			
			Contacto contacto = new Contacto(idContacto,nombre,apellidos,estimado,direccion,ciudad,provincia,
					codProv,region,pais,nombreCompania,cargo,telfTrabajo,ExtensionTrabajo,telfMovil,numFax,
					nomCorreo,notas,tipoContacto);
			
			adaptadorContacto.addRow(contacto);
			
		}

		private TipoContacto buscarTipoContacto() {
			TipoContacto tipoBuscado=null;
			java.util.Iterator<TipoContacto> iterador = adaptadorTipoContacto.getTotalTipoContacto().iterator();
			for(int i=0;i<adaptadorTipoContacto.getRowCount();i++){
				TipoContacto tipo = iterador.next();
				if((String)contactDataPanel.getContactTypeComboBox().getSelectedItem()==(String)tipo.getTipoContacto())
					tipoBuscado = tipo;
			}
			return tipoBuscado;
		}
	}
	
	private class FiltrarContactoListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			TableRowSorter<AdaptadorContacto> contactosFiltradosApellido = new TableRowSorter<AdaptadorContacto>(adaptadorContacto);
			tablePanel.getTablaPrueba().setRowSorter(contactosFiltradosApellido);
			
			contactosFiltradosApellido.setRowFilter(RowFilter.regexFilter((String)filterPanel.getFilterText().getText(), 2));
			
		}
		
	}
	
	private class LimpiarFiltroContactoListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			TableRowSorter<AdaptadorContacto> contactosFiltradosApellido = new TableRowSorter<AdaptadorContacto>(adaptadorContacto);
			tablePanel.getTablaPrueba().setRowSorter(contactosFiltradosApellido);
			
			contactosFiltradosApellido.setRowFilter(RowFilter.regexFilter("", 0));
			
		}
		
	}
	
	

}
