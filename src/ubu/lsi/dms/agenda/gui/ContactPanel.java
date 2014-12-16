package ubu.lsi.dms.agenda.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class ContactPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel northPane;
	private JPanel centerPane;
	private JPanel southPane;

	private JPanel filterPanel;

	private ContactDataPanel contactDataPanel;

	private String[] filterOptions;

	public ContactPanel() {

		setLayout(new BorderLayout());
		filterOptions = new String[] { "Surame" };

		filterPanel = new FilterPanel(filterOptions);
		contactDataPanel = new ContactDataPanel();

		northPane = new JPanel();
		northPane.setLayout(new GridLayout(1, 2, 5, 5));

		centerPane = new JPanel();
		centerPane.setLayout(new GridLayout());
		centerPane.add(contactDataPanel);

		southPane = new JPanel();
		southPane.setLayout(new GridLayout(3, 1, 5, 5));
		southPane.add(filterPanel);

		add(centerPane, BorderLayout.WEST);

		add(southPane, BorderLayout.SOUTH);

	}
}
