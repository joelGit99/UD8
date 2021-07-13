import java.util.Arrays;
import java.util.Random;

public class Password {
	// Atributos
	private int longitud;
	private String[] contrase�a;
	// Constructores
	public Password() {
		this.longitud = 8;
		this.contrase�a = new String[this.longitud];
		for (int i = 0; i < contrase�a.length; i++) {
			Random random = new Random();
			contrase�a[i] = Integer.toString(random.nextInt(10));
		}
	}
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = new String[longitud];
		for (int i = 0; i < contrase�a.length; i++) {
			Random random = new Random();
			contrase�a[i] = Integer.toString(random.nextInt(10));
		}
	}
	
	// M�todos
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + Arrays.toString(contrase�a) + "]";
	}
	// Getters y setters
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String[] getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String[] contrase�a) {
		this.contrase�a = contrase�a;
	}
	
}
