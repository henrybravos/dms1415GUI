package ubu.lsi.dms.agenda.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ContactPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel westPane;

	private JPanel eastPane;

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

		westPane = new JPanel();
		eastPane = new JPanel();
		southPane = new JPanel();
		
		initComponents();
		
		add(westPane, BorderLayout.WEST);
		add(eastPane, BorderLayout.EAST);
		add(southPane, BorderLayout.SOUTH);

	}

	private void initComponents() {

		// WEST PANE INITIALIZATION
		westPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		westPane.setPreferredSize(new Dimension(650, 340));
		westPane.setBorder(new TitledBorder(null, "Contact",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));

		westPane.add(contactDataPanel);
		westPane.add(insertButtonsPanel);

		// EAST PANE INITIALIZATION
		eastPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		westPane.setPreferredSize(new Dimension(650, 340));
		eastPane.setBorder(new TitledBorder(null, "Contact type",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		eastPane.add(addChangeButtonPanel);

		// SOUTH PANE INITIALIZATION
		southPane.setLayout(new GridLayout(3, 1, 5, 5));
		southPane.add(filterPanel);
	}
}
