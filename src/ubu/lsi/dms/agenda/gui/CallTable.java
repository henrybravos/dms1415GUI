package ubu.lsi.dms.agenda.gui;

import javax.swing.JTable;

public class CallTable extends JTable {

	private static final long serialVersionUID = 1L;
	
	private AdaptadorLlamada callTableModel;

	public CallTable (AdaptadorLlamada tableModel) { 
		super(tableModel);
		this.callTableModel = tableModel;
	}
	
}
