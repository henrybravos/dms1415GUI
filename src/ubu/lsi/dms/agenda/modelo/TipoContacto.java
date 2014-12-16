package ubu.lsi.dms.agenda.modelo;

import java.io.Serializable;

/**
 * Clase de entidad con la información de TipodeContacto
 * 
 * @author Carlos López
 *
 */
@SuppressWarnings("serial")
public class TipoContacto implements Serializable {
	private int idTipoContacto;
	private String TipoContacto;

	public TipoContacto(int idTipoContacto, String tipoContacto) {
		super();
		this.idTipoContacto = idTipoContacto;
		TipoContacto = tipoContacto;
	}

	/**
	 * @return the tipoContacto
	 */
	public String getTipoContacto() {
		return TipoContacto;
	}

	/**
	 * @param tipoContacto
	 *            the tipoContacto to set
	 */
	public void setTipoContacto(String tipoContacto) {
		TipoContacto = tipoContacto;
	}

	/**
	 * @return the idTipoContacto
	 */
	public int getIdTipoContacto() {
		return idTipoContacto;
	}

	@Override
	public String toString() {
		return TipoContacto;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoContacto other = (TipoContacto) obj;
		if (TipoContacto == null) {
			if (other.TipoContacto != null)
				return false;
		} else if (!TipoContacto.equals(other.TipoContacto))
			return false;
		if (idTipoContacto != other.idTipoContacto)
			return false;
		return true;
	}

}
