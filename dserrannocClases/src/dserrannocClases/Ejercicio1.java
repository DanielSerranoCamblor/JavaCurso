package dserrannocClases;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Escriba la operación que desea realizar entre: \n- Suma \n- Resta \n- Division \n- Multiplicacion");
		int multiplicar; 
		int dividir;
		String key = sc.next();
		System.out.println(key);
		int resta  = 0; 
		int suma = 0;
		if(key.equals("Suma")) 
		{
			suma = a + b;
			System.out.println(suma);
		}
		else if(key.equals("Resta")) 
		{
			resta = a - b;
			System.out.println(resta);
		}
		else if(key.equals("Division")) 
		{
			while((a == 0) || (b == 0)) 
			{
				System.out.println("Ningún valor numérico puede ser 0");
				a = sc.nextInt();
				b = sc.nextInt();
			}
			dividir = a / b;
			System.out.println(dividir);
		}
		else if(key.equals("Multiplicacion")) 
		{
			multiplicar = a * b;
			System.out.println(multiplicar);
		}
		else
			System.out.println(" Aprende a escribir ! Tienes que teclear bien el nombre de la operación. Tal cual sale en la pantalla");
	
	}

}
