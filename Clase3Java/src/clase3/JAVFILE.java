package clase3;

import java.util.Scanner;

public class JAVFILE {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Elegi tu estado de animo del dia de hoy |n"
				+	"1. Con sueño \n"
				+   "2. Con hambre \n"
				+ "3. Feliz \n");
		int a =sc.nextInt();
		while (a!=1 || a!=2 || a!=3) 
		{
			if(a == 1) 
			{
				System.out.println("Anda a dormir");
			}
			if(a == 2) 
			{
				System.out.println("Preparate lña comida");
			}
			if(a == 3) 
			{
				System.out.println("Sigue así");
			}
		}
		sc.close ();
		
	}
	
}
