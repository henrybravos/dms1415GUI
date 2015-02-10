package ubu.lsi.dms.agenda.gui;

import javax.swing.JPanel;

public abstract class MediadorAbstractoPanel extends JPanel{
	protected static final long serialVersionUID = 1L;
	protected FilterPanel filterPanel;

	protected ContactTable contactTable;
	protected ContactTypeTable contactTypeTable;

	protected ContactDataPanel contactDataPanel;

	protected String[] filterOptions;

	protected InsertButtonsPanel insertButtonsPanel;

	protected AddChangeButtonPanel addChangeButtonPanel;

	protected AdaptadorTipoContacto adaptadorTipoContacto;
	protected AdaptadorContacto adaptadorContacto;
	protected AdaptadorLlamada adaptadorLlamada;
	protected int IDContactoActualizado;
	protected int  IDTipoContactoActualizado;
	
	protected JPanel westPane;
	protected JPanel eastPane;
	protected JPanel southPane;
	
	
	
	protected abstract void initComponents();

}
