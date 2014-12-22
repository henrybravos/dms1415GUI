package ubu.lsi.dms.agenda.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AddChangeButtonPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton addButton;
	private JButton changeButton;
	
	public AddChangeButtonPanel() {
		
		addButton = new JButton("Add");
		changeButton = new JButton("Change");

		setLayout(new GridLayout(1, 2, 5, 5));
		
		add(addButton);
		add(changeButton);
			
	}

}
