package app.domain;

/** Class Data Transfer Object */
public class InscripcionDTO {
	private int iDInsc;
	private String nombre;
	private String telefono;
	private int idCurso;
	private int idFormaPago;

	// getters
	public int getiDInsc() {
		return iDInsc;
	}

	public void setiDInsc(int iDInsc) {
		this.iDInsc = iDInsc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getIdCurso() {
		return idCurso;
	}

	// setters
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(int idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

}
