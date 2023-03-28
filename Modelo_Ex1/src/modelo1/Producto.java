package modelo1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Producto{
	private String nombre;
	private String precio_unitario;
	private String cant_vend;
	private String Fecha_compra;
	 public static void main(String[] args) 
	    {
		 
		 List<String> Remera = new ArrayList<>();
		 List<String> Camisa = new ArrayList<>();
		 List<String> Vestido = new ArrayList<>();
		 List<String> Pantalon = new ArrayList<>();
		 List<String> Sweater = new ArrayList<>();
		 Set<String> Cabecera = new HashSet<>();
		 Producto producto1 = new Producto();
		 Producto producto2 = new Producto();
		 Producto producto3 = new Producto();
		 Producto producto4 = new Producto();
		 Producto producto5 = new Producto();

		 
		 
		 try {
			 File doc = new File("C:\\Users\\dserranoc\\eclipse-workspace\\Modelo_Ex1\\src\\modelo1\\info_tienda.txt");
			 BufferedReader obj = new BufferedReader (new FileReader(doc));
			 String Linea0 = obj.readLine();
			 String Linea1 = obj.readLine();
			 String Linea2 = obj.readLine();
			 String Linea3 = obj.readLine();
			 String Linea4 = obj.readLine();
			 String Linea5 = obj.readLine();
			 Cabecera.add(Linea0);
			 Remera.add(Linea1);
			 Camisa.add(Linea2);
			 Vestido.add(Linea3);
			 Pantalon.add(Linea4);
			 Sweater.add(Linea5);
			 producto1.nombre=Remera.get(0);
			 producto1.precio_unitario=Remera.get(1);
			 producto1.cant_vend=Remera.get(2);
			 producto1.Fecha_compra=Remera.get(3);
			 producto2.nombre=Camisa.get(0);
			 producto2.precio_unitario=Camisa.get(1);
			 producto2.cant_vend=Camisa.get(2);
			 producto2.Fecha_compra=Camisa.get(3);
			 producto3.nombre=Vestido.get(0);
			 producto3.precio_unitario=Vestido.get(1);
			 producto3.cant_vend=Vestido.get(2);
			 producto3.Fecha_compra=Vestido.get(3);
			 producto4.nombre=Pantalon.get(0);
			 producto4.precio_unitario=Pantalon.get(1);
			 producto4.cant_vend=Pantalon.get(2);
			 producto4.Fecha_compra=Pantalon.get(3);
			 producto5.nombre=Sweater.get(0);
			 producto5.precio_unitario=Sweater.get(1);
			 producto5.cant_vend=Sweater.get(2);
			 producto5.Fecha_compra=Sweater.get(3);
			 System.out.println(producto1.precio_unitario);

			 } catch (IOException e) {
				// TODO Auto-generated catch block
				 e.printStackTrace();
				}
		 
		
	    }

}
