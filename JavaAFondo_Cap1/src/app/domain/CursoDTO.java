package app.domain;

/** Class Data Transfer Object */
public class CursoDTO {
	private int idCurso;
	private String descripcion;
	private double precio;

	// construct
	public CursoDTO() {
	}

	public CursoDTO(int idCurso, String descripcion, double precio) {
		setIdCurso(idCurso);
		setDescripcion(descripcion);
		setPrecio(precio);
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCusrso) {
		this.idCurso = idCusrso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}