
public class Persona {
	// Atributos
	private String nombre;
	private int edad;
	private String DNI;
	private final char sexo;
	private double peso;
	private double altura;

	// Constructores
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = 'H';
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	// Métodos
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	// Getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}
	
}
