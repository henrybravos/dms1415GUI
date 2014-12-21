package ubu.lsi.dms.agenda.gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	private Container contents;

	private JPanel contactTab;
	private JPanel callTab;

	private JTabbedPane tabbedPane;

	public MainWindow() {
		setTitle("Agenda");

		contents = getContentPane();
		tabbedPane = new JTabbedPane();

		contactTab = new ContactPanel();
		callTab = new CallPanel();

		init();
		pack();
	}

	public void init() {

		contents.setLayout(new GridLayout(1, 0));

		tabbedPane.addTab("Contacts", contactTab);

		tabbedPane.addTab("Calls", callTab);


		contents.add(tabbedPane);
	}

	public static void main(String[] args) {
		MainWindow win = new MainWindow();
		win.setDefaultCloseOperation(EXIT_ON_CLOSE);
		win.setVisible(true);
	}
}
