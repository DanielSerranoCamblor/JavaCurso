package aop00;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import aop.dao.DAO;

public class main {
	public void saludar()
	{
		System.out.println("Te estoy saludando, Hola!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext contexto =
				new AnnotationConfigApplicationContext(Configuracion.class);
		DAO saludo1 = contexto.getBean(DAO.class);
		saludo1.setNombre("Daniel");
		saludo1.setApellido("Serrano");
		String info = saludo1.frase();
		System.out.println(info);
		main main = new main();
		main.saludar();
	}

}
