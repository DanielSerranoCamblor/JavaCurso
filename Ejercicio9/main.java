package Ejercicio9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> data = new HashSet<>();
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\dserranoc\\texto.txt"));
			
			while(sc.hasNextLine())
			{
				
				data.add(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("La lista de elementos es: " + data);
	}

}
