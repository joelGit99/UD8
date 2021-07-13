
public class Electrodomestico {
	// Atributos
	private final double precioBase;
	private final String color;
	private final char consEnergetico;
	private final double peso;
	// Constructores
	public Electrodomestico() {
		this.precioBase = 100;
		this.color = ClasesApp.COLOR;
		this.consEnergetico = 'F';
		this.peso = 5;
	}
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = ClasesApp.COLOR;
		this.consEnergetico = 'F';
	}
	public Electrodomestico(double precioBase, String color, char consEnergetico, double peso) {
		this.precioBase = precioBase;
		if(color.equalsIgnoreCase(ClasesApp.COLOR) || 
				color.equalsIgnoreCase(ClasesApp.COLOR2) ||
				color.equalsIgnoreCase(ClasesApp.COLOR3) ||
				color.equalsIgnoreCase(ClasesApp.COLOR4) ||
				color.equalsIgnoreCase(ClasesApp.COLOR5)) {
			this.color = color;
		} else {
			this.color = ClasesApp.COLOR;
		}
		if(consEnergetico >= 'A' && consEnergetico <= 'F') {
			this.consEnergetico = consEnergetico;
		} else {
			this.consEnergetico = 'F';
		}
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Electrodomestico [Precio Base=" + precioBase + "€" + ", color=" + color + ", consumo energético=" + consEnergetico
				+ ", peso=" + peso + "kg" + "]";
	}

	// Métodos
	

	// Getters y setters
	public double getPrecioBase() {
		return precioBase;
	}
	public String getColor() {
		return color;
	}
	public char getConsEnergetico() {
		return consEnergetico;
	}
	public double getPeso() {
		return peso;
	}
	
}
