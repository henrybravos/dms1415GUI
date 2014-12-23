package ubu.lsi.dms.agenda.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import ubu.lsi.dms.agenda.modelo.Contacto;
import ubu.lsi.dms.agenda.modelo.Llamada;
import ubu.lsi.dms.agenda.modelo.TipoContacto;

public class ContactTable extends JTable {

	private static final long serialVersionUID = 1L;

	private JTable tablaPrueba;

	private JPanel tablePanel;

	public ContactTable(AdaptadorContacto adaptadorContacto) {

		super(adaptadorContacto);
		initComponents();

	}

	private void initComponents() {

	}

	/**
	 * @return the tablaPrueba
	 */
	public JTable getTablaPrueba() {
		return tablaPrueba;
	}

}
