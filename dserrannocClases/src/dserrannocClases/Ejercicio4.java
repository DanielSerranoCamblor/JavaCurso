package dserrannocClases;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) 
	{
		int numero = (int)(Math.random() *100+1);
		System.out.println(numero);
		int intentos_usuario = 3;
		for(int i = 0; i < intentos_usuario -1; i = i++) 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Ingresa un valor numerico");
			
			int a = sc.nextInt();
			
			if(a == numero) 
			{
				System.out.println("Has acertado!");
				break;
			}
			else 
			{
				System.out.println("Has fallado!");

			}
		}
	}

}
