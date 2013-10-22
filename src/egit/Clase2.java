package egit;

public class Clase2 {
	private int valor;
	private String descripcion;

	public Clase2(int valor, String descripcion) {
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

	@Override
	public String toString() {
		return "Clase2 [valor=" + valor + ", descripcion=" + descripcion + "]";
	}

}
