package ubu.lsi.dms.agenda.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import ubu.lsi.dms.agenda.modelo.Contacto;
import ubu.lsi.dms.agenda.modelo.Llamada;
import ubu.lsi.dms.agenda.modelo.TipoContacto;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	private Container contents;

	private JPanel contactTab;
	private JPanel callTab;

	private JTabbedPane tabbedPane;

	private List<Contacto> contactList;
	private List<Llamada> callList;
	private List<TipoContacto> contactTypeList;
	
	private AdaptadorContacto adaptadorContacto;
	private AdaptadorLlamada adaptadorLlamada;
	private AdaptadorTipoContacto adaptadorTipoContacto;

	
	
	public MainWindow() {
		setTitle("Agenda");

		contents = getContentPane();
		tabbedPane = new JTabbedPane();

		inicializarListas();
		adaptadorContacto = new AdaptadorContacto(contactList);
		adaptadorLlamada = new AdaptadorLlamada(callList);
		adaptadorTipoContacto = new AdaptadorTipoContacto(contactTypeList);
		
		contactTab = new ContactPanel(adaptadorContacto,adaptadorLlamada,adaptadorTipoContacto);
		callTab = new CallPanel(adaptadorContacto,adaptadorLlamada,adaptadorTipoContacto);
		
		init();
		pack();
	}

	private void inicializarListas() {
		// Inicializamos los arraylist
				contactList = new ArrayList<Contacto>();
				callList = new ArrayList<Llamada>();
				contactTypeList = new ArrayList<TipoContacto>();
				
				for (int i = 1; i <= 7; i++) {
					switch (i) {
					case 1 - 9:
						System.out.println("Entro con " + i);
					}
					// Creamos un string para formaterar el número de 0
					String letra = null;
					if (i >= 1 && i <= 9) {
						letra = "00" + i;
					} else if (i >= 10 && i <= 99) {
						letra = "0" + i;
					} else if (i >= 100 && i <= 999) {
						letra = "" + i;
					}
					// Creamos un contacto, una llamada y un tipo de contacto
					TipoContacto contactType = new TipoContacto(i, "TipoDeContacto"
							+ letra);
					Contacto contact = new Contacto(i, "Nombre" + letra, "Apellidos"
							+ letra, "Estimado" + letra, "Direccion" + letra, "Ciudad"
							+ letra, "Prov" + letra, "CodProv" + letra, "Region"
							+ letra, "Pais" + letra, "NombreCompania" + letra, "Cargo"
							+ letra, "TelefonoTrabajo" + letra, "ExtensionTrabajo"
							+ letra, "TelefonoMovil" + letra, "NumFax" + letra,
							"NomCorreoElectronico" + letra, "Notas" + letra,
							contactType);
					Llamada call = new Llamada(i, contact,
							"2014-10-18 01:00:00.000000", "Asunto" + letra, "Notas"
									+ letra);
					if (i < 10) {
						contactList.add(contact);
						contactTypeList.add(contactType);
					}
					callList.add(call);
				}

		
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
