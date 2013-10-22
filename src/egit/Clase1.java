package egit;

import java.util.Date;

public class Clase1 {
	private int valor;
	private String descripcion;
	private Date fecha;

	public Clase1(int valor, String descripcion) {
		super();
		this.valor = valor;
		this.descripcion = descripcion;
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

	@Override
	public String toString() {
		return "Clase1 [valor=" + valor + ", descripcion=" + descripcion + "]";
	}

}
