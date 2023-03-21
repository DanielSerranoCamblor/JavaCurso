package clase3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tomamos valores para la lista
		
		List<String> productos = new ArrayList<>();
		System.out.println("Ingrese 3 items para la lista: ");

		Scanner sc = new Scanner(System.in);
		String elemento1 = sc.next();
		String elemento2 = sc.next();
		String elemento3 = sc.next();
	
		productos.add(elemento1);
		productos.add(elemento2);
		productos.add(elemento3);

		System.out.println("----------- LISTAS -----------------");

		System.out.println("Lista de productos" + productos);
		
		System.out.println("----------- SET -----------------");

		System.out.println("Ingrese 3 items para el DNI: ");
		Scanner sc1 = new Scanner(System.in);
		String elemento4 = sc1.next();
		String elemento5 = sc1.next();
		String elemento6 = sc1.next();
		Set<String> productos1 = new HashSet<>();
		
		productos1.add(elemento4);
		productos1.add(elemento5);
		productos1.add(elemento6);
		System.out.println("La lista de elementos es: " + productos1);
		
		System.out.println("----------- MAP -----------------");
		
		System.out.println("Ingrese Nombre_Usuario e ID_suario: ");

		Scanner sc2 = new Scanner(System.in);
		String elemento7 = sc2.next();
		int elemento8 = sc2.nextInt();
		String elemento9 = sc2.next();
		int elemento10 = sc2.nextInt();
		String elemento11 = sc2.next();
		int elemento12 = sc2.nextInt();
		// Creamos un mapa con relación nombre edad
		Map<String, Integer> mapaNombreEdades = new HashMap<>();

		mapaNombreEdades.put(elemento7, elemento8);
		mapaNombreEdades.put(elemento9, elemento10);
		mapaNombreEdades.put(elemento11, elemento12);
		System.out.println("Imprimimos nombres y edades" + mapaNombreEdades); // Organiza sin criterio de orden
		sc.close();
		sc1.close();
		sc2.close();
	}

}
