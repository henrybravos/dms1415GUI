package ubu.lsi.dms.agenda.gui;

import java.awt.BorderLayout; 
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;

import ubu.lsi.dms.agenda.modelo.Contacto;
import ubu.lsi.dms.agenda.modelo.Llamada;

public class CallPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel westPane;

	private JPanel southPane;
	
	private JPanel eastPane;

	private FilterPanel filterPanel;

	private CallDataPanel callDataPanel;

	private String[] filterOptions;
	
	private JTable callsTable;

	private InsertButtonsPanel insertButtonsPanel;
	
	private AdaptadorTipoContacto adaptadorTipoContacto;
	private AdaptadorContacto adaptadorContacto;
	private AdaptadorLlamada adaptadorLlamada;

	public CallPanel(AdaptadorContacto adaptadorContacto, AdaptadorLlamada adaptadorLlamada, AdaptadorTipoContacto adaptadorTipoContacto) {

		this.adaptadorContacto = adaptadorContacto;
		this.adaptadorLlamada = adaptadorLlamada;
		this.adaptadorTipoContacto = adaptadorTipoContacto;
		
		setLayout(new BorderLayout());

		filterOptions = new String[] { "Contact" };
		filterPanel = new FilterPanel(filterOptions);
		callDataPanel = new CallDataPanel(adaptadorContacto);
		insertButtonsPanel = new InsertButtonsPanel();
		callsTable = new JTable(adaptadorLlamada);
		
		insertButtonsPanel.setInsertarListener(new InsertarLlamadaListener());
		
		

		westPane = new JPanel();
		southPane = new JPanel();
		eastPane = new JPanel();
		
		initComponents();

		add(westPane, BorderLayout.WEST);
		add(southPane, BorderLayout.SOUTH);
		add(eastPane, BorderLayout.CENTER);
	}

	private void initComponents() {

		// WEST PANE INITIALIZATION
		westPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		westPane.setPreferredSize(new Dimension(340, 280));
		westPane.setBorder(new TitledBorder(null, "Call", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		westPane.add(callDataPanel);
		westPane.add(insertButtonsPanel);
		
		//EAST PANE INITIALIZATION
		eastPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		westPane.setBorder(new TitledBorder(null, "Calls table", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		eastPane.add(callsTable);
		eastPane.add(new JScrollPane(callsTable));

		// SOUTH PANE INITIALIZATION
		southPane.setLayout(new GridLayout(3, 1, 5, 5));
		southPane.add(filterPanel);

	}

	
	private class InsertarLlamadaListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Cogemos el modelo de la tabla
			TableModel modelo = callsTable.getModel();
			// Para calcular el ID cogemos el ID del último contacto añadido y
			// le vamos a sumar uno
			int idLlamada = ((AdaptadorLlamada) modelo).getHigherID() + 1;
			Contacto contacto  = buscarTipoContacto();
			String fecha = callDataPanel.getDayField().getText() + "-" + callDataPanel.getMonthField().getText() + "-" + callDataPanel.getYearField().getText();
			String issue = callDataPanel.getIssueTextArea().getText();
			String notas = callDataPanel.getNotesTextArea().getText();
		

			Llamada llamada = new Llamada(idLlamada,contacto,fecha,issue,notas);

			adaptadorLlamada.addRow(llamada);

		}

		private Contacto buscarTipoContacto() {
			Contacto buscado = null;
			java.util.Iterator<Contacto> iterador = adaptadorContacto
					.getTotalContactos().iterator();
			for (int i = 0; i < adaptadorTipoContacto.getRowCount()-1; i++) {
				Contacto tipo = iterador.next();
				if ((String) callDataPanel.getContactComboBox()
						.getSelectedItem() == (String) tipo.getNombre())
					buscado = tipo;
			}
			return buscado;
		}
	}
	
	
	
	
	
}
