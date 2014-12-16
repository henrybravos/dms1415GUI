package ubu.lsi.dms.agenda.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class CallPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private String[] filterOptions;

	private FilterPanel filterPanel;
	
	private JPanel callDataPanel;

	public CallPanel() {
		
		setLayout(new BorderLayout());
		filterOptions = new String[] {"Contact"};
		
		callDataPanel = new JPanel();
		
		callDataPanel.setBorder(new TitledBorder(null,
				"Call Information", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		filterPanel = new FilterPanel(filterOptions);
		
		
		
	}

}
