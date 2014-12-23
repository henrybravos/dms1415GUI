package ubu.lsi.dms.agenda.gui;

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

public class TablePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTable tablaPrueba;

	private JPanel tablePanel;

	public TablePanel(AdaptadorContacto adaptadorContacto) {

		
		tablaPrueba = new JTable(adaptadorContacto);

		tablePanel = new JPanel();

		setLayout(new GridLayout(1, 0));
		setBorder(new TitledBorder(null, "Tabla", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));

		initComponents();
		
	    
		add(tablePanel);

	}

	private void initComponents() {

		tablePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		tablePanel.add(tablaPrueba);

	}

	
	/**
	 * @return the tablaPrueba
	 */
	public JTable getTablaPrueba() {
		return tablaPrueba;
	}

	
	
}
