
public class Serie {
	// Atributos
	private String titulo;
	private int numTemps;
	private boolean entregado;
	private String genero;
	private String creador;
	// Constructores
	public Serie() {
		this.titulo = "Dark";
		this.numTemps = 3;
		this.entregado = false;
		this.genero = "Suspense";
		this.creador = "Jantje Friese";
	}
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numTemps = 3;
		this.entregado = false;
		this.genero = "Suspense";
	}
	public Serie(String titulo, int numTemps, String genero, String creador) {
		this.titulo = titulo;
		this.numTemps = numTemps;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}

	// Métodos
	@Override
	public String toString() {
		return "Serie [Título=" + titulo + ", Número de temporadas=" + numTemps + ", Entregado=" + entregado + ", Género=" + genero
				+ ", Creador=" + creador + "]";
	}
	// Getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumTemps() {
		return numTemps;
	}
	public void setNumTemps(int numTemps) {
		this.numTemps = numTemps;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}

}
