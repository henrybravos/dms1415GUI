package ubu.lsi.dms.agenda.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class CallPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel centerPane;

	private JPanel southPane;

	private FilterPanel filterPanel;
	
	private CallDataPanel callDataPanel;

	private String[] filterOptions;

	public CallPanel() {
		
		setLayout(new BorderLayout());
		filterOptions = new String[] {"Contact"};
		
		filterPanel = new FilterPanel(filterOptions);		
		callDataPanel = new CallDataPanel();
		
		centerPane = new JPanel();
		centerPane.setLayout(new GridLayout());
		centerPane.add(callDataPanel);
		
		southPane = new JPanel();
		southPane.setLayout(new GridLayout(3, 1, 5, 5));
		southPane.add(filterPanel);

		add(centerPane, BorderLayout.CENTER);

		add(southPane, BorderLayout.SOUTH);
		
	}

}
