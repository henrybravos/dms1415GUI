package ubu.lsi.dms.agenda.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JButton addButton;
	private JButton clearButton;
	private JButton changeButton;
	
	public ButtonsPanel(){
		
		this.addButton = new JButton("Add");
		this.clearButton = new JButton("Clear");
		this.changeButton = new JButton("Change");
		
		setLayout(new GridLayout(1,3,5,5));
		
		add(changeButton);
		add(clearButton);
		add(addButton);
		
	}
	

}
