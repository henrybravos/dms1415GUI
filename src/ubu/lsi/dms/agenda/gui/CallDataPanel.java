package ubu.lsi.dms.agenda.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class CallDataPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JComboBox contactComboBox;
//	private JTextField contactField;
	private JTextField dayField;
	private JTextField monthField;
	private JTextField yearField;
	private JTextArea issueTextArea;
	private JTextArea notesTextArea;

	private JPanel callInfoPanel;

	private GridBagConstraints constraints;

	public CallDataPanel() {

		callInfoPanel = new JPanel();
		constraints = new GridBagConstraints();

		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		setPreferredSize(new Dimension(320, 200));
		setBorder(new TitledBorder(null, "Details",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));

		initComponents();

		add(callInfoPanel);

	}

	private void initComponents() {

		callInfoPanel.setLayout(new GridBagLayout());

		setConstraints(0, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		callInfoPanel.add(new JLabel("Contact:"), constraints);

		//
		contactComboBox = new JComboBox<String>();
		setConstraints(1, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		callInfoPanel.add(contactComboBox, constraints);
		
/*		contactField = new JTextField(4);
		setConstraints(1, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		callInfoPanel.add(contactField, constraints);
*/
		setConstraints(2, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		callInfoPanel.add(new JLabel("Date:"), constraints);

		dayField = new JTextField(2);
		dayField.setText("DD");
		setConstraints(3, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		callInfoPanel.add(dayField, constraints);

		setConstraints(4, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		callInfoPanel.add(new JLabel("-"), constraints);

		monthField = new JTextField(2);
		monthField.setText("MM");
		setConstraints(5, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		callInfoPanel.add(monthField, constraints);

		setConstraints(6, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		callInfoPanel.add(new JLabel("-"), constraints);

		yearField = new JTextField(4);
		yearField.setText("YYYY");
		setConstraints(7, 0, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		callInfoPanel.add(yearField, constraints);

		setConstraints(0, 1, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		callInfoPanel.add(new JLabel("Issue:"), constraints);

		issueTextArea = new JTextArea(4, 20);
		issueTextArea.setLineWrap(true);
		setConstraints(1, 1, 7, GridBagConstraints.WEST,
				GridBagConstraints.BOTH);
		callInfoPanel.add(new JScrollPane(issueTextArea), constraints);

		setConstraints(0, 2, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE);
		callInfoPanel.add(new JLabel("Notes:"), constraints);

		notesTextArea = new JTextArea(4, 20);
		notesTextArea.setLineWrap(true);
		setConstraints(1, 2, 7, GridBagConstraints.WEST,
				GridBagConstraints.BOTH);
		callInfoPanel.add(new JScrollPane(notesTextArea), constraints);

	}

	/**
	 * Sets different parameters of the GridBagConstraints instance used in
	 * GridBagLayout manager.
	 * 
	 * @param gridx
	 *            the column of the GridBagLayout
	 * @param gridy
	 *            the row of the GridBagLayout
	 * @param gridWidth
	 *            the number of columns that occupies an item in the grid
	 * @param anchor the position of an item
	 * @param fill the fill of the item in its display area
	 */
	private void setConstraints(int gridx, int gridy, int gridWidth,
			int anchor, int fill) {
		constraints.gridx = gridx;
		constraints.gridy = gridy;
		constraints.gridwidth = gridWidth;
		constraints.anchor = anchor;
		constraints.fill = fill;
		constraints.insets = new Insets(0, 0, 5, 5);
	} // setConstraints
	

	
	
	
	
	
}
