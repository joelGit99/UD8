
public class ClasesApp {
	public final static String COLOR = "Blanco";
	public final static String COLOR2 = "Negro";
	public final static String COLOR3 = "Rojo";
	public final static String COLOR4 = "Azul";
	public final static String COLOR5 = "Gris";

	public static void main(String[] args) {
		Persona persona = new Persona();
		System.out.println(persona);
		
		Persona persona2 = new Persona("Joel", 21, 'H');
		System.out.println(persona2);
		
		Persona persona3 = new Persona("Marta", 12, "39931225M", 'M', 52, 1.30);
		System.out.println(persona3);
		persona3.setAltura(1.45);
		System.out.println(persona3.getAltura());
		
		Password password = new Password(5);
		System.out.println(password);
		
		Electrodomestico elec = new Electrodomestico();
		System.out.println(elec);
		Electrodomestico elec2 = new Electrodomestico(150.3, 200.25);
		System.out.println(elec2);
		Electrodomestico elec3 = new Electrodomestico(300.12, "blanco", 'B', 500.14);
		System.out.println(elec3);
		elec3 = new Electrodomestico(300.12, "rosa", 'G', 500.14);
		System.out.println(elec3);
		
		Serie serie = new Serie();
		System.out.println(serie);
		Serie serie2 = new Serie("One Piece", "Eiichiro Oda");
		System.out.println(serie2);
		Serie serie3 = new Serie("Vikingos", 6, "Michael Hirst", "Histórica");
		System.out.println(serie3);
		
	}

}
