import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> miColeccion = new LinkedList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		miColeccion.add("List");
		
		// Alternativa
		miColeccion.remove("List");
//		miColeccion.remove(1);

		// Alternativa
		miColeccion.remove("List");
//		miColeccion.remove(4);
		
		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}
}
