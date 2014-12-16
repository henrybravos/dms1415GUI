package ubu.lsi.dms.agenda.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FilterPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField filterText;

	private JButton filterButton;

	private JButton clearButton;

	private JComboBox<String> filterBox;
 
	public FilterPanel(String [] options) {
		
		this.filterText = new JTextField(18);
		this.filterButton = new JButton("Filter");
		this.clearButton = new JButton("Clear");
		this.filterBox = new JComboBox<String>(options);
		
		JPanel optionsPanel = new JPanel();
		optionsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		optionsPanel.add(filterBox);
		optionsPanel.add(filterText);

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonsPanel.add(clearButton);
		buttonsPanel.add(filterButton);

		setLayout(new GridLayout(1, 2));
		add(optionsPanel);
		add(buttonsPanel);

	}

}
