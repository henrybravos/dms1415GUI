package ubu.lsi.dms.agenda.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class CallPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel westPane;

	private JPanel southPane;

	private FilterPanel filterPanel;

	private CallDataPanel callDataPanel;

	private String[] filterOptions;

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
		callDataPanel = new CallDataPanel();
		insertButtonsPanel = new InsertButtonsPanel();

		westPane = new JPanel();
		southPane = new JPanel();
		
		initComponents();

		add(westPane, BorderLayout.WEST);
		add(southPane, BorderLayout.SOUTH);

	}

	private void initComponents() {

		// WEST PANE INITIALIZATION
		westPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		westPane.setPreferredSize(new Dimension(340, 280));
		westPane.setBorder(new TitledBorder(null, "Call", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		westPane.add(callDataPanel);
		westPane.add(insertButtonsPanel);

		// SOUTH PANE INITIALIZATION
		southPane.setLayout(new GridLayout(3, 1, 5, 5));
		southPane.add(filterPanel);

	}

}
