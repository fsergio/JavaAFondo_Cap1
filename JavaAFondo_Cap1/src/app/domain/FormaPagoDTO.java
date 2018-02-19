package app.domain;

/** Class Data Transfer Object */
public class FormaPagoDTO {
	private int idFormaPago;
	private String descripcion;
	private double recargo;

	public FormaPagoDTO(int idFormaPago, String decripcion, double recargo) {
		setIdFormaPago(idFormaPago);
		setDescripcion(decripcion);
		setRecargo(recargo);
	}

	public int getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(int idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getRecargo() {
		return recargo;
	}

	public void setRecargo(double recargo) {
		this.recargo = recargo;
	}

}
