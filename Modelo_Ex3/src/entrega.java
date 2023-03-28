import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
public class entrega {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entrega t1 = new entrega();
		t1.txt();
	}
	
	public void txt() 
	{
		String rutares = "C:\\Users\\dserranoc\\eclipse-workspace\\Modelo_Ex3\\src\\resultado.txt";
		File archivoResultado = new File(rutares);
		FileWriter fw;
		try {
			fw = new FileWriter(archivoResultado);
			BufferedWriter bw = new BufferedWriter(fw);
			String[] rutas = {"C:\\Users\\dserranoc\\eclipse-workspace\\Modelo_Ex3\\src\\TOP-10-Peliculas-Globales.txt"};
			for(String ruta : rutas) 
				try {
					BufferedReader obj = new BufferedReader(new FileReader(ruta));
					obj.readLine();
					// Lee cada línea del archivo utilizando un bucle for
					for (String line = obj.readLine(); line != null; line = obj.readLine()) {
						System.out.println(line);
						// Divide la línea en nombre y edad utilizando una coma como separador
						String[] parts = line.split(",");
						int posicion = Integer.parseInt(parts[0].trim());
						String Peli = parts[1].trim();
						int ventagross = Integer.parseInt(parts[2].trim());
						int domgross = Integer.parseInt(parts[3].trim());
						String porcentaje1 = parts[4].trim();
						String porcentaje2 = parts[6].trim();
						int foregross = Integer.parseInt(parts[5].trim());
						String ano = parts[7].trim();
						pelis datospelis = new pelis(Peli,posicion,ventagross,domgross,foregross,ano);
						
						bw.write(datospelis.getInformacion());
						
				        
				        String nombreArchivo = "resultado.txt";
				        
			            File archivo = new File(nombreArchivo);
			            FileWriter escritor = new FileWriter(archivo, true);

			            // Sobrescribir el archivo con el contenido actualizado
			            escritor.write(datospelis.getInformacion());
			            escritor.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			bw.close();
		}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
