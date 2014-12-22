package ubu.lsi.dms.agenda.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class FilterPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField filterText;

	private JButton filterButton;

	private JButton clearButton;

	private JComboBox<String> filterBox;

	private JPanel optionsPanel;

	private JPanel buttonsPanel;

	public FilterPanel(String[] options) {

		filterText = new JTextField(18);
		filterButton = new JButton("Filter");
		clearButton = new JButton("Clear");
		filterBox = new JComboBox<String>(options);

		optionsPanel = new JPanel();
		buttonsPanel = new JPanel();

		setLayout(new GridLayout(1, 2));
		setBorder(new TitledBorder(null, "Filter", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));

		initComponents();

		add(optionsPanel);
		add(buttonsPanel);

	}

	private void initComponents() {

		optionsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		optionsPanel.add(filterBox);
		optionsPanel.add(filterText);

		buttonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonsPanel.add(clearButton);
		buttonsPanel.add(filterButton);

	}

}
