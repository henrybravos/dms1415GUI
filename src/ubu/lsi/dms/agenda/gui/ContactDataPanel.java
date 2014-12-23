package ubu.lsi.dms.agenda.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class ContactDataPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField titleField;
	private JTextField nameField;
	private JTextField surnameField;
	private JTextField addressField;
	private JTextField cityField;
	private JTextField provinceField;
	private JTextField regionField;
	private JTextField countryField;
	private JTextField postalCodeField;
	private JTextField companyField;
	private JTextField positionField;
	private JTextField workPhoneField;
	private JTextField extensionField;
	private JTextField mobilePhoneField;
	private JTextField notesField;
	private JTextField faxField;
	private JTextField emailField;
	private JComboBox<String> ContactTypeComboBox;
	
	private AdaptadorTipoContacto adaptadorTipoContacto;
	

	private JTable tablaPrueba;

	private GridBagConstraints constraints;

	private JPanel personalInfoPanel;
	private JPanel workInfoPanel;

	public ContactDataPanel(AdaptadorTipoContacto adaptadorTipoContacto) {

		this.adaptadorTipoContacto = adaptadorTipoContacto;
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		setPreferredSize(new Dimension(640, 270));

		initComponents();

		add(personalInfoPanel);

		add(workInfoPanel);

	}

	private void initComponents() {

		personalInfoPanel = new JPanel();
		workInfoPanel = new JPanel();
		constraints = new GridBagConstraints();

		/* INITIALIZATION OF PERSONAL INFO PANEL */
		personalInfoPanel.setLayout(new GridBagLayout());
		personalInfoPanel.setPreferredSize(new Dimension(620, 130));
		personalInfoPanel.setBorder(new TitledBorder(null,
				"Personal Information", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));

		// Title label
		setConstraints(0, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		personalInfoPanel.add(new JLabel("Title:"), constraints);

		// Title text field
		titleField = new JTextField(3);
		setConstraints(1, 0, 1, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		personalInfoPanel.add(titleField, constraints);

		// Name label
		setConstraints(2, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		personalInfoPanel.add(new JLabel("Name:"), constraints);

		// Name text field
		nameField = new JTextField(12);
		setConstraints(3, 0, 1, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		personalInfoPanel.add(nameField, constraints);

		// Surname label
		setConstraints(4, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		personalInfoPanel.add(new JLabel("Surname:"), constraints);

		// Surname text field
		surnameField = new JTextField(18);
		setConstraints(5, 0, 3, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		personalInfoPanel.add(surnameField, constraints);

		// Address label
		setConstraints(0, 1, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		personalInfoPanel.add(new JLabel("Address:"), constraints);

		// Address text field
		addressField = new JTextField(30);
		setConstraints(1, 1, 5, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		personalInfoPanel.add(addressField, constraints);

		// Postal Code label
		setConstraints(6, 1, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		personalInfoPanel.add(new JLabel("Postal Code:"), constraints);

		// Postal Code text field
		postalCodeField = new JTextField(5);
		setConstraints(7, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		personalInfoPanel.add(postalCodeField, constraints);

		// City label
		setConstraints(0, 2, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		personalInfoPanel.add(new JLabel("City:"), constraints);

		// City text field
		cityField = new JTextField(18);
		setConstraints(1, 2, 3, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		personalInfoPanel.add(cityField, constraints);

		// Province label
		setConstraints(4, 2, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		personalInfoPanel.add(new JLabel("Province:"), constraints);

		// Province text field
		provinceField = new JTextField(16);
		setConstraints(5, 2, 3, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		personalInfoPanel.add(provinceField, constraints);

		// Region label
		setConstraints(0, 3, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		personalInfoPanel.add(new JLabel("Region:"), constraints);

		// Region text field
		regionField = new JTextField(18);
		setConstraints(1, 3, 3, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		personalInfoPanel.add(regionField, constraints);

		// Country label
		setConstraints(4, 3, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		personalInfoPanel.add(new JLabel("Country:"), constraints);

		// Country text field
		countryField = new JTextField(16);
		setConstraints(5, 3, 3, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		personalInfoPanel.add(countryField, constraints);

		/* INITIALIZATION OF PROFESSIONAL INFO PANEL */
		workInfoPanel.setLayout(new GridBagLayout());
		workInfoPanel.setPreferredSize(new Dimension(620, 130));
		workInfoPanel.setBorder(new TitledBorder(null,
				"Professional Information", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));

		// Company label
		setConstraints(0, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		workInfoPanel.add(new JLabel("Company:"), constraints);

		// Company text field
		companyField = new JTextField(20);
		setConstraints(1, 0, 5, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		workInfoPanel.add(companyField, constraints);

		// Position label
		setConstraints(6, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		workInfoPanel.add(new JLabel("Position:"), constraints);

		// Position text field
		positionField = new JTextField(20);
		setConstraints(7, 0, 3, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		workInfoPanel.add(positionField, constraints);

		// Work Phone label
		setConstraints(0, 1, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		workInfoPanel.add(new JLabel("Work Phone:"), constraints);

		// Work Phone text field
		workPhoneField = new JTextField(9);
		setConstraints(1, 1, 3, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		workInfoPanel.add(workPhoneField, constraints);

		// Extension label
		setConstraints(4, 1, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		workInfoPanel.add(new JLabel("Extension:"), constraints);

		// Extension text field
		extensionField = new JTextField(4);
		setConstraints(5, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		workInfoPanel.add(extensionField, constraints);

		// Fax label
		setConstraints(6, 1, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		workInfoPanel.add(new JLabel("Fax:"), constraints);

		// Fax text field
		faxField = new JTextField(15);
		setConstraints(7, 1, 2, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		workInfoPanel.add(faxField, constraints);

		// Mobile Phone label
		setConstraints(0, 2, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		workInfoPanel.add(new JLabel("Mobile Phone:"), constraints);

		// Mobile Phone text field
		mobilePhoneField = new JTextField(9);
		setConstraints(1, 2, 3, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		workInfoPanel.add(mobilePhoneField, constraints);

		// E-Mail label
		setConstraints(4, 2, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		workInfoPanel.add(new JLabel("E-Mail:"), constraints);

		// E-Mail text field
		emailField = new JTextField(25);
		setConstraints(5, 2, 5, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		workInfoPanel.add(emailField, constraints);

		// Notes label
		setConstraints(0, 3, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		workInfoPanel.add(new JLabel("Notes:"), constraints);

		// Notes text field
		notesField = new JTextField(45);
		setConstraints(1, 3, 4, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		workInfoPanel.add(notesField, constraints);
		
		
		//TODO
		// Notes label
		setConstraints(0, 4, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		workInfoPanel.add(new JLabel("Tipo contacto:"), constraints);
		
		//ComboBox
		ContactTypeComboBox = new JComboBox<String>(cogerTiposDeContacto());
		setConstraints(5, 4, 3, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL);
		workInfoPanel.add(ContactTypeComboBox);

	} // initPanels
	
	
	
	private String[] cogerTiposDeContacto(){
		String[] tiposDeContacto = new String[adaptadorTipoContacto.getRowCount()];
		
		for(int i=0;i<adaptadorTipoContacto.getRowCount();i++)
			tiposDeContacto[i] = (String) adaptadorTipoContacto.getValueAt(i, 1);
		
		return tiposDeContacto;
	}
	

	/**
	 * Sets different parameters of the GridBagConstraints instance used in
	 * GridBagLayout manager.
	 * 
	 * @param gridx
	 *            the column of the GridBagLayout
	 * @param gridy
	 *            the row of the GridBagLayout
	 * @param gridWidth
	 *            the number of columns that occupies an item in the grid
	 * @param anchor
	 *            the position of an item
	 * @param fill
	 *            the fill of the item in its display area
	 */
	private void setConstraints(int gridx, int gridy, int gridWidth,
			int anchor, int fill) {
		constraints.gridx = gridx;
		constraints.gridy = gridy;
		constraints.gridwidth = gridWidth;
		constraints.anchor = anchor;
		constraints.fill = fill;
		constraints.insets = new Insets(0, 0, 5, 5);
	} // setConstraints

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the titleField
	 */
	public JTextField getTitleField() {
		return titleField;
	}

	/**
	 * @return the nameField
	 */
	public JTextField getNameField() {
		return nameField;
	}

	/**
	 * @return the surnameField
	 */
	public JTextField getSurnameField() {
		return surnameField;
	}

	/**
	 * @return the addressField
	 */
	public JTextField getAddressField() {
		return addressField;
	}

	/**
	 * @return the cityField
	 */
	public JTextField getCityField() {
		return cityField;
	}

	/**
	 * @return the provinceField
	 */
	public JTextField getProvinceField() {
		return provinceField;
	}

	/**
	 * @return the regionField
	 */
	public JTextField getRegionField() {
		return regionField;
	}

	/**
	 * @return the countryField
	 */
	public JTextField getCountryField() {
		return countryField;
	}

	/**
	 * @return the postalCodeField
	 */
	public JTextField getPostalCodeField() {
		return postalCodeField;
	}

	/**
	 * @return the companyField
	 */
	public JTextField getCompanyField() {
		return companyField;
	}

	/**
	 * @return the positionField
	 */
	public JTextField getPositionField() {
		return positionField;
	}

	/**
	 * @return the workPhoneField
	 */
	public JTextField getWorkPhoneField() {
		return workPhoneField;
	}

	/**
	 * @return the extensionField
	 */
	public JTextField getExtensionField() {
		return extensionField;
	}

	/**
	 * @return the mobilePhoneField
	 */
	public JTextField getMobilePhoneField() {
		return mobilePhoneField;
	}

	/**
	 * @return the notesField
	 */
	public JTextField getNotesField() {
		return notesField;
	}

	/**
	 * @return the faxField
	 */
	public JTextField getFaxField() {
		return faxField;
	}

	/**
	 * @return the emailField
	 */
	public JTextField getEmailField() {
		return emailField;
	}

	/**
	 * @return the tablaPrueba
	 */
	public JTable getTablaPrueba() {
		return tablaPrueba;
	}

	/**
	 * @return the constraints
	 */
	public GridBagConstraints getConstraints() {
		return constraints;
	}

	/**
	 * @return the personalInfoPanel
	 */
	public JPanel getPersonalInfoPanel() {
		return personalInfoPanel;
	}

	/**
	 * @return the workInfoPanel
	 */
	public JPanel getWorkInfoPanel() {
		return workInfoPanel;
	}

	/**
	 * @return the contactTypeComboBox
	 */
	public JComboBox<String> getContactTypeComboBox() {
		return ContactTypeComboBox;
	}



}
