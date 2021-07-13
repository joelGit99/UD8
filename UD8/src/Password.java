import java.util.Arrays;
import java.util.Random;

public class Password {
	// Atributos
	private int longitud;
	private String[] contraseña;
	// Constructores
	public Password() {
		this.longitud = 8;
		this.contraseña = new String[this.longitud];
		for (int i = 0; i < contraseña.length; i++) {
			Random random = new Random();
			contraseña[i] = Integer.toString(random.nextInt(10));
		}
	}
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = new String[longitud];
		for (int i = 0; i < contraseña.length; i++) {
			Random random = new Random();
			contraseña[i] = Integer.toString(random.nextInt(10));
		}
	}
	
	// Métodos
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + Arrays.toString(contraseña) + "]";
	}
	// Getters y setters
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String[] getContraseña() {
		return contraseña;
	}
	public void setContraseña(String[] contraseña) {
		this.contraseña = contraseña;
	}
	
}
