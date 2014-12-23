package ubu.lsi.dms.agenda.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.JTextComponent;

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
		setPreferredSize(new Dimension(840,60));
		
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
	
	

	/**
	 * @return the filterButton
	 */
	public JButton getFilterButton() {
		return filterButton;
	}

	/**
	 * @return the clearButton
	 */
	public JButton getClearButton() {
		return clearButton;
	}

	
	/**
	 * @return the filterText
	 */
	public JTextField getFilterText() {
		return filterText;
	}

	/**
	 * @return the filterBox
	 */
	public JComboBox<String> getFilterBox() {
		return filterBox;
	}
	
	public void setFiltrarContactoListener(ActionListener l) {
		filterButton.addActionListener(l);
	}

	public void setLimpiarFiltroContactoListener(ActionListener l) {
		clearButton.addActionListener(l);
	}


	
}
