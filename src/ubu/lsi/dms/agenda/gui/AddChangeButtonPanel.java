package ubu.lsi.dms.agenda.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddChangeButtonPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton addButton;
	private JButton changeButton;
	private JTextField contactTypeField;
	
	public AddChangeButtonPanel() {
		
		addButton = new JButton("Add");
		changeButton = new JButton("Change");
		contactTypeField = new JTextField(8);

		setLayout(new GridLayout(2, 2, 5, 5));
		
		add(new JLabel("Contact Type:"));
		add(contactTypeField);
		add(addButton);
		add(changeButton);
			
	}

}
