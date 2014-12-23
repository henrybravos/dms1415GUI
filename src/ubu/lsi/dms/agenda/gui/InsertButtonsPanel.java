package ubu.lsi.dms.agenda.gui;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class InsertButtonsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton addButton;
	private JButton clearButton;
	private JButton changeButton;

	public InsertButtonsPanel() {

		addButton = new JButton("Add");
		clearButton = new JButton("Clear");
		changeButton = new JButton("Change");

		setLayout(new GridLayout(1, 3, 5, 5));
		
		add(changeButton);
		add(clearButton);
		add(addButton);

	}
	
	public void setInsertarContactoListener(ActionListener l) {
		addButton.addActionListener(l);
	}
	

}
