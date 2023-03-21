package Ejercicio8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio8 implements Antiguedad{


	@Override
	public void AntiguedadLaoral() {
		// TODO Auto-generated method stub
		LocalDate fechaNacimiento = LocalDate.of(0, 0, 0);
		LocalDate fecha = LocalDate.now();
		int antiguedad = fecha.getYear() - fechaNacimiento.getYear();
	}

	@Override
	public void Edad() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> empleados = new HashSet<>();
	
		int antiguedadLaboral = AntiguedadLaoral();
		try {
		String ruta = "C:salida_ministerio.txt";	
		String contenido = "Hola que tal? Me gusta la paella!!!!!!!";
		File archivo = new File(ruta);
		// Si el archivo no existe es creado.
		if (!archivo.exists())
			{
				archivo.createNewFile();
			}
		FileWriter fw = new FileWriter(archivo);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(contenido);
		bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}


}
