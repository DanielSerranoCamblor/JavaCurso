package Ejercicio5;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio5 implements Estado_Animo{
	
	public void enojado()
	{
		System.out.println("Haz yoga");
	};
	public void triste()
	{
		System.out.println("ve a terapia o tala unas birras");
	};
	public void feliz() 
	{
		System.out.println("Sigue así");
	};
	public void preocupado() 
	{
		System.out.println(" Echa un pitin ");
	};
	public void aburrido() 
	{
		int numero = (int)(Math.random() *3);
		if(numero == 1) 
		{
			System.out.println("Van dos y cae el del medio");
		}
		if(numero == 2) 
		{
			System.out.println("Chsite 2");
		}
		else
		{
			System.out.println("Chiste 3");
		}	
	};
	public void somnoliento() 
	{
		System.out.println(" A por un café campeón");
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio5 ini = new Ejercicio5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Cómo te sientes hoy? \n"
				+	"1. Enojado \n"
				+   "2. Triste \n"
				+	"3. Feliz \n"
				+	"4. Preocupado \n"
				+ 	"5. Aburrido \n"
				+	"6. Somnoliento \n");
		
		int a =sc.nextInt();

		LocalDate fecha = LocalDate.now();
		System.out.println("A fecha: " + fecha);
	
		while (a!=1 || a!=2 || a!=3 || a!=4 || a!=5 || a!=6) 
		{
			if(a == 1) 
			{
				ini.enojado();
				break;
			}
			if(a == 2) 
			{
				ini.triste();
				break;
			}
			if(a == 3) 
			{
				ini.feliz();
				break;
			}
			if(a == 4) 
			{
				ini.preocupado();
				break;
			}
			if(a == 5) 
			{
				ini.aburrido();
				break;

			}
			if(a == 6) 
			{
				ini.somnoliento();
				break;
			}
		}
		sc.close ();
	}

}
