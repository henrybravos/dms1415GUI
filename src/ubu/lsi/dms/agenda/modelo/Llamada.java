package ubu.lsi.dms.agenda.modelo;

import java.io.Serializable;

/**
 * Clase de entidad con la información de Llamada
 * 
 * @author Carlos López
 *
 */
@SuppressWarnings("serial")
public class Llamada implements Serializable {

	private int idLlamada;
	private Contacto contacto;
	private String fechaLlamada;
	private String asunto, notas;

	public Llamada(int idLlamada, Contacto contacto, String fechaLlamada,
			String asunto, String notas) {
		super();
		this.idLlamada = idLlamada;
		this.contacto = contacto;
		this.fechaLlamada = fechaLlamada;
		this.asunto = asunto;
		this.notas = notas;
	}

	/**
	 * @return the contacto
	 */
	public Contacto getContacto() {
		return contacto;
	}

	/**
	 * @param contacto
	 *            the contacto to set
	 */
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	/**
	 * @return the fechaLlamada
	 */
	public String getFechaLlamada() {
		return fechaLlamada;
	}

	/**
	 * @param fechaLlamada
	 *            the fechaLlamada to set
	 */
	public void setFechaLlamada(String fechaLlamada) {
		this.fechaLlamada = fechaLlamada;
	}

	/**
	 * @return the asunto
	 */
	public String getAsunto() {
		return asunto;
	}

	/**
	 * @param asunto
	 *            the asunto to set
	 */
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	/**
	 * @return the notas
	 */
	public String getNotas() {
		return notas;
	}

	/**
	 * @param notas
	 *            the notas to set
	 */
	public void setNotas(String notas) {
		this.notas = notas;
	}

	/**
	 * @return the idLlamada
	 */
	public int getIdLlamada() {
		return idLlamada;
	}

	@Override
	public String toString() {
		return contacto.getApellidos() + ", " + contacto.getNombre();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Llamada other = (Llamada) obj;
		if (asunto == null) {
			if (other.asunto != null)
				return false;
		} else if (!asunto.equals(other.asunto))
			return false;
		if (contacto == null) {
			if (other.contacto != null)
				return false;
		} else if (!contacto.equals(other.contacto))
			return false;
		if (fechaLlamada == null) {
			if (other.fechaLlamada != null)
				return false;
		} else if (!fechaLlamada.equals(other.fechaLlamada))
			return false;
		if (idLlamada != other.idLlamada)
			return false;
		if (notas == null) {
			if (other.notas != null)
				return false;
		} else if (!notas.equals(other.notas))
			return false;
		return true;
	}

}
