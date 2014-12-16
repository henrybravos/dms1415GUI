package ubu.lsi.dms.agenda.modelo;

import java.io.Serializable;

/**
 * Clase de entidad con la información de Contactos
 * 
 * @author Carlos López
 *
 */
@SuppressWarnings("serial")
public class Contacto implements Serializable {
	private int idContacto;
	private String nombre, apellidos, estimado, direccion, ciudad, prov,
			codPostal, region, pais, nombreCompania, cargo, telefonoTrabajo,
			extensionTrabajo, telefonoMovil, numFax, nomCorreoElectronico,
			notas;

	private TipoContacto tipoContacto;

	public Contacto(int idContacto, String nombre, String apellidos,
			String estimado, String direccion, String ciudad, String prov,
			String codPostal, String region, String pais,
			String nombreCompania, String cargo, String telefonoTrabajo,
			String extensionTrabajo, String telefonoMovil, String numFax,
			String nomCorreoElectronico, String notas, TipoContacto tipoContacto) {
		super();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estimado = estimado;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.prov = prov;
		this.codPostal = codPostal;
		this.region = region;
		this.pais = pais;
		this.nombreCompania = nombreCompania;
		this.cargo = cargo;
		this.telefonoTrabajo = telefonoTrabajo;
		this.extensionTrabajo = extensionTrabajo;
		this.telefonoMovil = telefonoMovil;
		this.numFax = numFax;
		this.nomCorreoElectronico = nomCorreoElectronico;
		this.notas = notas;
		this.tipoContacto = tipoContacto;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos
	 *            the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the estimado
	 */
	public String getEstimado() {
		return estimado;
	}

	/**
	 * @param estimado
	 *            the estimado to set
	 */
	public void setEstimado(String estimado) {
		this.estimado = estimado;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 *            the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad
	 *            the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the prov
	 */
	public String getProv() {
		return prov;
	}

	/**
	 * @param prov
	 *            the prov to set
	 */
	public void setProv(String prov) {
		this.prov = prov;
	}

	/**
	 * @return the codPostal
	 */
	public String getCodPostal() {
		return codPostal;
	}

	/**
	 * @param codPostal
	 *            the codPostal to set
	 */
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region
	 *            the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais
	 *            the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the nombreCompania
	 */
	public String getNombreCompania() {
		return nombreCompania;
	}

	/**
	 * @param nombreCompania
	 *            the nombreCompania to set
	 */
	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo
	 *            the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the telefonoTrabajo
	 */
	public String getTelefonoTrabajo() {
		return telefonoTrabajo;
	}

	/**
	 * @param telefonoTrabajo
	 *            the telefonoTrabajo to set
	 */
	public void setTelefonoTrabajo(String telefonoTrabajo) {
		this.telefonoTrabajo = telefonoTrabajo;
	}

	/**
	 * @return the extensionTrabajo
	 */
	public String getExtensionTrabajo() {
		return extensionTrabajo;
	}

	/**
	 * @param extensionTrabajo
	 *            the extensionTrabajo to set
	 */
	public void setExtensionTrabajo(String extensionTrabajo) {
		this.extensionTrabajo = extensionTrabajo;
	}

	/**
	 * @return the telefonoMovil
	 */
	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	/**
	 * @param telefonoMovil
	 *            the telefonoMovil to set
	 */
	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	/**
	 * @return the numFax
	 */
	public String getNumFax() {
		return numFax;
	}

	/**
	 * @param numFax
	 *            the numFax to set
	 */
	public void setNumFax(String numFax) {
		this.numFax = numFax;
	}

	/**
	 * @return the nomCorreoElectronico
	 */
	public String getNomCorreoElectronico() {
		return nomCorreoElectronico;
	}

	/**
	 * @param nomCorreoElectronico
	 *            the nomCorreoElectronico to set
	 */
	public void setNomCorreoElectronico(String nomCorreoElectronico) {
		this.nomCorreoElectronico = nomCorreoElectronico;
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
	 * @return the tipoContacto
	 */
	public TipoContacto getTipoContacto() {
		return tipoContacto;
	}

	/**
	 * @param tipoContacto
	 *            the tipoContacto to set
	 */
	public void setTipoContacto(TipoContacto tipoContacto) {
		this.tipoContacto = tipoContacto;
	}

	/**
	 * @return the idContacto
	 */
	public int getIdContacto() {
		return idContacto;
	}

	@Override
	public String toString() {
		return "" + idContacto;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (codPostal == null) {
			if (other.codPostal != null)
				return false;
		} else if (!codPostal.equals(other.codPostal))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (estimado == null) {
			if (other.estimado != null)
				return false;
		} else if (!estimado.equals(other.estimado))
			return false;
		if (extensionTrabajo == null) {
			if (other.extensionTrabajo != null)
				return false;
		} else if (!extensionTrabajo.equals(other.extensionTrabajo))
			return false;
		if (idContacto != other.idContacto)
			return false;
		if (nomCorreoElectronico == null) {
			if (other.nomCorreoElectronico != null)
				return false;
		} else if (!nomCorreoElectronico.equals(other.nomCorreoElectronico))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombreCompania == null) {
			if (other.nombreCompania != null)
				return false;
		} else if (!nombreCompania.equals(other.nombreCompania))
			return false;
		if (notas == null) {
			if (other.notas != null)
				return false;
		} else if (!notas.equals(other.notas))
			return false;
		if (numFax == null) {
			if (other.numFax != null)
				return false;
		} else if (!numFax.equals(other.numFax))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (prov == null) {
			if (other.prov != null)
				return false;
		} else if (!prov.equals(other.prov))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (telefonoMovil == null) {
			if (other.telefonoMovil != null)
				return false;
		} else if (!telefonoMovil.equals(other.telefonoMovil))
			return false;
		if (telefonoTrabajo == null) {
			if (other.telefonoTrabajo != null)
				return false;
		} else if (!telefonoTrabajo.equals(other.telefonoTrabajo))
			return false;
		if (tipoContacto == null) {
			if (other.tipoContacto != null)
				return false;
		} else if (!tipoContacto.equals(other.tipoContacto))
			return false;
		return true;
	}
}
