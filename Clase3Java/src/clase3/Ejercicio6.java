package clase3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Las lsitas admiten valores plicados*/
		// TODO Auto-generated method stub
		// Una coleccion es un objeto que agrupa eleementos de cualquier tipo
		// Se encuentran en java.util
		// Lista admite valores duplicados ordenados 
		// Coleccion "Lista"
		List<String> productos = new ArrayList<>();
		productos.add("Zanahoria");
		productos.add("Agua");
		productos.add("Patates");
		productos.add("Refresco");
		productos.add("Vino");
		productos.add("Pasta");
		productos.add("Arroz");
		productos.add("Fresas");
		productos.add("Legumbres");
		productos.add("Agua");
		
		System.out.println("----------- LISTAS -----------------");

		System.out.println("Lista de productos" + productos);
		/*
		// Acceder al primer elemento de la lista
		String primerElemento = productos.get(0);
		System.out.println("El primer producto comprado fue" + " " + primerElemento);
		
		//Modificamos el producto 2o de la lista
		productos.set(1, "Papel higiénico");
		System.out.println("Lista de productos modificados" + productos) ;
		
		// Elimino el elemento refresco
		productos.remove(3);
		System.out.println("Lista de productos modificados" + productos) ;

		//Verificamos si la lista tiene un elemento
		boolean contienePatates = productos.contains("Patates");
		System.out.println("La lista cintiene patates?" + contienePatates) ;
		
		// Obtenemso el tamaño de la lista
		int tamañoLista = productos.size();
		System.out.println("Tamaño lista:" + tamañoLista) ;
		
		//Redcorremos la lista con un forr
		for(String Listaproductos: productos) 
		{
			System.out.println(Listaproductos) ;

		}*/
		
		/*// Coleccion SET 
		 * Valorse UNICOS, donde no admite la repeticion
		 * Ordena según sus criterios*/
		System.out.println("----------- SET -----------------");

		Set<String> productos1 = new HashSet<>();
		productos1.add("Zanahoria");
		productos1.add("Agua");
		productos1.add("Patates");
		productos1.add("Refresco");
		productos1.add("Vino");
		productos1.add("Pasta");
		productos1.add("Arroz");
		productos1.add("Fresas");
		productos1.add("Legumbres");
		productos1.add("Agua");
		System.out.println("La lista de elementos es: " + productos);
		/*// Lee y organiza de forma alfabética en ocasiones al no saber cómo ordenar
		// Con el set no admitimos duplicados la pila de la lista va acumulándose
		
		//Verificar si tiene un elemento
		boolean contieneRefresco = productos1.contains("Refresco");
		System.out.println("Contiene refresco?" + " " + contieneRefresco);
		
		//Eliminar
		productos1.remove("Agua");
		System.out.println("La lista de productos es" + productos);
		
		//Tamaño
		int tamañoset = productos1.size();
		System.out.println("tamaño" + tamañoset);
		
		// Recorrer
		for(String Setproductos: productos1) 
		{
			System.out.println(Setproductos);
		}*/
		
		
		// Coleccion Map: Representa una asociacion de pares clave-valor, donde cada clave está 
		// asociada a un valor.
		System.out.println("----------- MAP -----------------");

		// Creamos un mapa con relación nombre edad
		Map<String, Integer> mapaNombreEdades = new HashMap<>();
		mapaNombreEdades.put("Gustavo", 30);
		mapaNombreEdades.put("Marta", 23);
		mapaNombreEdades.put("Álvaro", 25);
		mapaNombreEdades.put("León", 22);
		mapaNombreEdades.put("Lu", 26);
		mapaNombreEdades.put("Daniel", 28);
		mapaNombreEdades.put("Pepito", 26);
		mapaNombreEdades.put("Matusalén", 500);
		mapaNombreEdades.put("Javier", 21);
		mapaNombreEdades.put("Luisa", 15);
		System.out.println("Imprimimos nombres y edades" + mapaNombreEdades); // Organiza sin criterio de orden
		/*// Accedemos a la edad de alguien
		int edadMarta = mapaNombreEdades.get("Marta");
		System.out.println(" La esdad de marta " + edadMarta); 
		
		// Modificamos la edad
		mapaNombreEdades.put("Marta",53);
		System.out.println(mapaNombreEdades); 
		// Eliminamos un elemento 
		mapaNombreEdades.remove("Gustavo");
		System.out.println("Lista actualizada:" + mapaNombreEdades); 
		
		// Obtenemos el larfgo de la lista
		int largo = mapaNombreEdades.size();
		System.out.println("El largo es " + largo); 
		
		// Recorremos
		for(Map.Entry<String, Integer> entrada: mapaNombreEdades.entrySet())
		{
			String nombre = entrada.getKey();
			int edad= entrada.getValue();
			System.out.println(nombre + " " + edad);
		}*/

	}

}
