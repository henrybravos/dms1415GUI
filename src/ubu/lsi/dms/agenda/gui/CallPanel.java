package ubu.lsi.dms.agenda.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class CallPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel centerPane;

	private JPanel southPane;

	private FilterPanel filterPanel;

	private CallDataPanel callDataPanel;

	private String[] filterOptions;

	private InsertButtonsPanel insertButtonsPanel;

	public CallPanel() {

		setLayout(new BorderLayout());
		filterOptions = new String[] { "Contact" };

		filterPanel = new FilterPanel(filterOptions);
		callDataPanel = new CallDataPanel();
		insertButtonsPanel = new InsertButtonsPanel();

		centerPane = new JPanel();
		centerPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		centerPane.add(callDataPanel);
//		centerPane.add(insertButtonsPanel);

		southPane = new JPanel();
		southPane.setLayout(new GridLayout(3, 1, 5, 5));
		southPane.add(filterPanel);

		add(centerPane, BorderLayout.CENTER);

		add(southPane, BorderLayout.SOUTH);

	}

}
