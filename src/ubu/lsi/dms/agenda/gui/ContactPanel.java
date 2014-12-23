package ubu.lsi.dms.agenda.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
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

	private FilterPanel filterPanel;

	private ContactTable contactTable;
	private ContactTypeTable contactTypeTable;

	private ContactDataPanel contactDataPanel;

	private String[] filterOptions;

	private InsertButtonsPanel insertButtonsPanel;

	private AddChangeButtonPanel addChangeButtonPanel;

	private AdaptadorTipoContacto adaptadorTipoContacto;
	private AdaptadorContacto adaptadorContacto;
	private AdaptadorLlamada adaptadorLlamada;
	int IDContactoActualizado;
	int IDTipoContactoActualizado;

	public ContactPanel(AdaptadorContacto adaptadorContacto,
			AdaptadorLlamada adaptadorLlamada,
			AdaptadorTipoContacto adaptadorTipoContacto) {

		this.adaptadorContacto = adaptadorContacto;
		this.adaptadorLlamada = adaptadorLlamada;
		this.adaptadorTipoContacto = adaptadorTipoContacto;

		setLayout(new BorderLayout());

		filterOptions = new String[] { "Surname" };
		filterPanel = new FilterPanel(filterOptions);

		contactTable = new ContactTable(adaptadorContacto);
		contactTypeTable = new ContactTypeTable(adaptadorTipoContacto);
		// callTable = new CallTable(adaptadorLLamada);

		contactDataPanel = new ContactDataPanel(adaptadorTipoContacto);
		insertButtonsPanel = new InsertButtonsPanel();
		addChangeButtonPanel = new AddChangeButtonPanel();

		westPane = new JPanel();
		eastPane = new JPanel();
		southPane = new JPanel();

		initComponents();

		insertButtonsPanel
				.setInsertarListener(new InsertarContactoListener());
		insertButtonsPanel
				.setLimpiarListener(new LimpiarContactoListener());
		insertButtonsPanel
				.setActualizarListener(new ActualizarContactoListener());

		filterPanel.setFiltrarContactoListener(new FiltrarContactoListener());
		filterPanel.setLimpiarFiltroContactoListener(new LimpiarFiltroContactoListener());
		
		addChangeButtonPanel.setInsertarTipoContactoListener(new InsertarTipoContactoListener());
		addChangeButtonPanel.setAcualizarTipoContactoListener(new ActualizarTipoContactoListener());



		add(westPane, BorderLayout.WEST);
		add(eastPane, BorderLayout.EAST);
		add(southPane, BorderLayout.SOUTH);

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
		eastPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		eastPane.setPreferredSize(new Dimension(240, 200));
		eastPane.setBorder(new TitledBorder(null, "Contact type",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contactTypeTable.setPreferredScrollableViewportSize(new Dimension(200,
				80));
		eastPane.add(new JScrollPane(contactTypeTable));

		contactTypeTable.addMouseListener(new clickSobreTablaTipoContactoListener());
		eastPane.add(addChangeButtonPanel);

		// SOUTH PANE INITIALIZATION
		southPane.setLayout(new GridLayout(2, 1));
		southPane.setPreferredSize(new Dimension(650, 200));
		southPane.add(new JScrollPane(contactTable));
		contactTable.addMouseListener(new clickSobreTablaListener());
		southPane.add(filterPanel);

	}

	private class InsertarContactoListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Cogemos el modelo de la tabla
			TableModel modelo = contactTable.getModel();
			// Para calcular el ID cogemos el ID del último contacto añadido y
			// le vamos a sumar uno
			int idContacto = ((AdaptadorContacto) modelo).getHigherID() + 1;
			String nombre = contactDataPanel.getNameField().getText();
			String apellidos = contactDataPanel.getSurnameField().getText();
			String estimado = contactDataPanel.getTitleField().getText();
			String direccion = contactDataPanel.getAddressField().getText();
			String ciudad = contactDataPanel.getCityField().getText();
			String provincia = contactDataPanel.getProvinceField().getText();
			String codProv = contactDataPanel.getPostalCodeField().getText();
			String region = contactDataPanel.getRegionField().getText();
			String pais = contactDataPanel.getCountryField().getText();
			String nombreCompania = contactDataPanel.getCompanyField()
					.getText();
			String cargo = contactDataPanel.getPositionField().getText();
			String telfTrabajo = contactDataPanel.getWorkPhoneField().getText();
			String ExtensionTrabajo = contactDataPanel.getExtensionField()
					.getText();
			String telfMovil = contactDataPanel.getMobilePhoneField().getText();
			String numFax = contactDataPanel.getFaxField().getText();
			String nomCorreo = contactDataPanel.getEmailField().getText();
			String notas = contactDataPanel.getNotesField().getText();

			TipoContacto tipoContacto = buscarTipoContacto();

			Contacto contacto = new Contacto(idContacto, nombre, apellidos,
					estimado, direccion, ciudad, provincia, codProv, region,
					pais, nombreCompania, cargo, telfTrabajo, ExtensionTrabajo,
					telfMovil, numFax, nomCorreo, notas, tipoContacto);

			adaptadorContacto.addRow(contacto);

		}

		private TipoContacto buscarTipoContacto() {
			TipoContacto tipoBuscado = null;
			java.util.Iterator<TipoContacto> iterador = adaptadorTipoContacto
					.getTotalTipoContacto().iterator();
			for (int i = 0; i < adaptadorTipoContacto.getRowCount(); i++) {
				TipoContacto tipo = iterador.next();
				if ((String) contactDataPanel.getContactTypeComboBox()
						.getSelectedItem() == (String) tipo.getTipoContacto())
					tipoBuscado = tipo;
			}
			return tipoBuscado;
		}
	}

	private class LimpiarContactoListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Cogemos el modelo de la tabla
			TableModel modelo = contactTable.getModel();
			// Para calcular el ID cogemos el ID del último contacto añadido y
			// le vamos a sumar uno
			contactDataPanel.getNameField().setText("");
			contactDataPanel.getSurnameField().setText("");
			contactDataPanel.getTitleField().setText("");
			contactDataPanel.getAddressField().setText("");
			contactDataPanel.getCityField().setText("");
			contactDataPanel.getProvinceField().setText("");
			contactDataPanel.getPostalCodeField().setText("");
			contactDataPanel.getRegionField().setText("");
			contactDataPanel.getCountryField().setText("");
			contactDataPanel.getCompanyField().setText("");
			contactDataPanel.getPositionField().setText("");
			contactDataPanel.getWorkPhoneField().setText("");
			contactDataPanel.getExtensionField().setText("");
			contactDataPanel.getMobilePhoneField().setText("");
			contactDataPanel.getFaxField().setText("");
			contactDataPanel.getEmailField().setText("");
			contactDataPanel.getNotesField().setText("");

		}
	}

	private class clickSobreTablaListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				// Cogemos el modelo de la tabla
				TableModel modelo = contactTable.getModel();

				int fila = contactTable.rowAtPoint(e.getPoint());

				IDContactoActualizado = ((int) modelo.getValueAt(fila, 0));

				if ((fila > -1)) {
					contactDataPanel.getNameField().setText(
							(String) modelo.getValueAt(fila, 1));
					contactDataPanel.getSurnameField().setText(
							(String) modelo.getValueAt(fila, 2));
					contactDataPanel.getTitleField().setText(
							(String) modelo.getValueAt(fila, 3));
					contactDataPanel.getAddressField().setText(
							(String) modelo.getValueAt(fila, 4));
					contactDataPanel.getCityField().setText(
							(String) modelo.getValueAt(fila, 5));
					contactDataPanel.getProvinceField().setText(
							(String) modelo.getValueAt(fila, 5));
					contactDataPanel.getPostalCodeField().setText(
							(String) modelo.getValueAt(fila, 7));
					contactDataPanel.getRegionField().setText(
							(String) modelo.getValueAt(fila, 8));
					contactDataPanel.getCountryField().setText(
							(String) modelo.getValueAt(fila, 9));
					contactDataPanel.getCompanyField().setText(
							(String) modelo.getValueAt(fila, 10));
					contactDataPanel.getPositionField().setText(
							(String) modelo.getValueAt(fila, 11));
					contactDataPanel.getWorkPhoneField().setText(
							(String) modelo.getValueAt(fila, 12));
					contactDataPanel.getExtensionField().setText(
							(String) modelo.getValueAt(fila, 13));
					contactDataPanel.getMobilePhoneField().setText(
							(String) modelo.getValueAt(fila, 14));
					contactDataPanel.getFaxField().setText(
							(String) modelo.getValueAt(fila, 15));
					contactDataPanel.getEmailField().setText(
							(String) modelo.getValueAt(fila, 16));
					contactDataPanel.getNotesField().setText(
							(String) modelo.getValueAt(fila, 17));
					contactDataPanel.getContactTypeComboBox().setSelectedItem(
							((TipoContacto) modelo.getValueAt(fila, 18))
									.getTipoContacto());
				}
			}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}

	private class ActualizarContactoListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Cogemos el modelo de la tabla
			TableModel modelo = contactTable.getModel();
			// Para calcular el ID cogemos el ID del último contacto añadido y
			// le vamos a sumar uno
			int idContacto = IDContactoActualizado;
			String nombre = contactDataPanel.getNameField().getText();
			String apellidos = contactDataPanel.getSurnameField().getText();
			String estimado = contactDataPanel.getTitleField().getText();
			String direccion = contactDataPanel.getAddressField().getText();
			String ciudad = contactDataPanel.getCityField().getText();
			String provincia = contactDataPanel.getProvinceField().getText();
			String codProv = contactDataPanel.getPostalCodeField().getText();
			String region = contactDataPanel.getRegionField().getText();
			String pais = contactDataPanel.getCountryField().getText();
			String nombreCompania = contactDataPanel.getCompanyField()
					.getText();
			String cargo = contactDataPanel.getPositionField().getText();
			String telfTrabajo = contactDataPanel.getWorkPhoneField().getText();
			String ExtensionTrabajo = contactDataPanel.getExtensionField()
					.getText();
			String telfMovil = contactDataPanel.getMobilePhoneField().getText();
			String numFax = contactDataPanel.getFaxField().getText();
			String nomCorreo = contactDataPanel.getEmailField().getText();
			String notas = contactDataPanel.getNotesField().getText();

			TipoContacto tipoContacto = buscarTipoContacto();

			Contacto contacto = new Contacto(idContacto, nombre, apellidos,
					estimado, direccion, ciudad, provincia, codProv, region,
					pais, nombreCompania, cargo, telfTrabajo, ExtensionTrabajo,
					telfMovil, numFax, nomCorreo, notas, tipoContacto);

			adaptadorContacto.actualizarRow(contacto);

		}

		private TipoContacto buscarTipoContacto() {
			TipoContacto tipoBuscado = null;
			java.util.Iterator<TipoContacto> iterador = adaptadorTipoContacto
					.getTotalTipoContacto().iterator();
			for (int i = 0; i < adaptadorTipoContacto.getRowCount(); i++) {
				TipoContacto tipo = iterador.next();
				if ((String) contactDataPanel.getContactTypeComboBox()
						.getSelectedItem() == (String) tipo.getTipoContacto())
					tipoBuscado = tipo;
			}
			return tipoBuscado;
		}

	}

	private class FiltrarContactoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			TableRowSorter<AdaptadorContacto> contactosFiltradosApellido = new TableRowSorter<AdaptadorContacto>(
					adaptadorContacto);
			contactTable.setRowSorter(contactosFiltradosApellido);

			contactosFiltradosApellido.setRowFilter(RowFilter.regexFilter(
					(String) filterPanel.getFilterText().getText(), 2));

		}
	}

	private class LimpiarFiltroContactoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			TableRowSorter<AdaptadorContacto> contactosFiltradosApellido = new TableRowSorter<AdaptadorContacto>(
					adaptadorContacto);
			contactTable.setRowSorter(contactosFiltradosApellido);

			contactosFiltradosApellido.setRowFilter(RowFilter
					.regexFilter("", 0));

		}
	}
	
	private class InsertarTipoContactoListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Cogemos el modelo de la tabla
			TableModel modelo = contactTypeTable.getModel();
			// Para calcular el ID cogemos el ID del último contacto añadido y
			// le vamos a sumar uno
			int idTipoContacto = (int) modelo.getValueAt(modelo.getRowCount()-1, 0) +1;
			String tipoContacto = addChangeButtonPanel.getContactTypeField().getText();
		
			TipoContacto tipodecontacto = new TipoContacto(idTipoContacto,tipoContacto);

			adaptadorTipoContacto.addRow(tipodecontacto);

		}
	}
	
	private class clickSobreTablaTipoContactoListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				// Cogemos el modelo de la tabla
				TableModel modelo = contactTypeTable.getModel();

				int fila = contactTable.rowAtPoint(e.getPoint());

				IDTipoContactoActualizado = ((int) modelo.getValueAt(fila, 0));

				System.out.println(IDTipoContactoActualizado);
				if ((fila > -1)) {
					addChangeButtonPanel.getContactTypeField().setText(
							(String) modelo.getValueAt(fila, 1));
				}
			}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {			
		}
	
	
	}
	
	
	private class ActualizarTipoContactoListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Cogemos el modelo de la tabla
			TableModel modelo = contactTable.getModel();
			// Para calcular el ID cogemos el ID del último contacto añadido y
			// le vamos a sumar uno
			int idContacto = IDTipoContactoActualizado;
			String tipoContacto = addChangeButtonPanel.getContactTypeField().getText();;

			TipoContacto tipodecontacto = new TipoContacto(idContacto,tipoContacto);

			adaptadorTipoContacto.actualizarRow(tipodecontacto);

		}
	}
	
	

}