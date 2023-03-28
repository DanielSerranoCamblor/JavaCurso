package modelo1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class principal implements calculos{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		// Creacion del .txt
		try {
			String ruta = "C:\\Users\\dserranoc\\eclipse-workspace\\Modelo_Ex1\\src\\modelo1\\info_tienda_salida.txt";	
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

	@Override
	public double precio_final(int a) {
		// TODO Auto-generated method stub
		double iva = 0.21;
		double resultado = 0;
		resultado = iva * a;
		return resultado;
	}

	@Override
	public double media_ventas(int a, int b, int c, int d, int e) {
		// TODO Auto-generated method stub
		double media_ventas = (a + b + c + d + e)/5;
		return media_ventas;
	}

	@Override
	public int ventas(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int dias() {
		// TODO Auto-generated method stub
		return 0;
	}
}
