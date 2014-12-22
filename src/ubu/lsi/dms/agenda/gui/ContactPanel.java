package ubu.lsi.dms.agenda.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class ContactPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel centerPane;
	
	private JPanel southPane;

	private FilterPanel filterPanel;

	private ContactDataPanel contactDataPanel;

	private String[] filterOptions;

	private InsertButtonsPanel insertButtonsPanel;

	private AddChangeButtonPanel addChangeButtonPanel;

	public ContactPanel() {

		setLayout(new BorderLayout());
		filterOptions = new String[] { "Surame" };

		filterPanel = new FilterPanel(filterOptions);
		contactDataPanel = new ContactDataPanel();
		insertButtonsPanel = new InsertButtonsPanel();
		addChangeButtonPanel = new AddChangeButtonPanel();

		centerPane = new JPanel();
		centerPane.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		centerPane.add(contactDataPanel);
//		centerPane.add(insertButtonsPanel);
//		centerPane.add(addChangeButtonPanel);

		southPane = new JPanel();
		southPane.setLayout(new GridLayout(3, 1, 5, 5));
		southPane.add(filterPanel);

		add(centerPane, BorderLayout.WEST);

		add(southPane, BorderLayout.SOUTH);

	}
}
