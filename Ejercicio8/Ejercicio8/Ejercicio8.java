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

public class Ejercicio8 extends Empleado implements Antiguedad
{
	@Override
	public void AntiguedadLaoral() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Edad() {
		// TODO Auto-generated method stub
		LocalDate fechaNacimiento = LocalDate.of(0, 0, 0);
		LocalDate fecha = LocalDate.now();
		int Edad = fecha.getYear() - fechaNacimiento.getYear();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado gustavo = new Empleado();
        gustavo.nombre = "Gustavo";
        gustavo.apellido = "Vargas";
        gustavo.Dni = "72367312L";
        gustavo.lugarNacimiento = "Almeria";
        gustavo.FechaNacimiento=LocalDate.of(1996, 4, 12);
        gustavo.fechaingreso = LocalDate.of(2015, 4, 12);
        gustavo.cargo = "Ingeniero";
        gustavo.salario = 22000;
        Empleado Ana = new Empleado();
        Ana.nombre = "Ana";
        Ana.apellido = "Vargas";
        Ana.Dni = "72367312L";
        Ana.lugarNacimiento = "Barcelona";
        Ana.FechaNacimiento=LocalDate.of(1998, 4, 12);
        Ana.fechaingreso = LocalDate.of(2016, 4, 12);
        Ana.cargo = "Perito";
        Ana.salario = 80000;
        Empleado elena = new Empleado();
        elena.nombre = "Elena";
        elena.apellido = "Caste";
        elena.Dni = "72367432L";
        elena.lugarNacimiento = "Ponferrada";
        elena.FechaNacimiento=LocalDate.of(1994, 4, 12);
        elena.fechaingreso = LocalDate.of(2014, 4, 12);
        elena.cargo = "Formadora";
        elena.salario = 24200;

		Set<String> empleados = new HashSet<>();
		empleados.addAll(gustavo);
		empleados.addAll(Ana);
		empleados.addAll(elena);
		LocalDate fecha = LocalDate.now();
		int antiguedadLaboral = AntiguedadLaoral();
		try {
		String ruta = "C:salida_ministerio.txt";	
		String contenido = empleados;
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
