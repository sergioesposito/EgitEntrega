package egit;

import java.util.Date;

public class Clase1 {
	private int valor;
	private String descripcion;
	private Date fecha;

	public Clase1(int valor, String descripcion, Date fecha) {
		super();
		this.valor = valor;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Clase1 [valor=" + valor + ", descripcion=" + descripcion
				+ ", fecha=" + fecha + "]";
	}

}
