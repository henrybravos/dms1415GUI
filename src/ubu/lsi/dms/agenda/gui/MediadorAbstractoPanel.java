package ubu.lsi.dms.agenda.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public abstract class MediadorAbstractoPanel extends JPanel{
	protected static final long serialVersionUID = 1L;
	protected FilterPanel filterPanel;

	protected ContactTable contactTable;
	
	protected JTable callsTable;
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
