package aop00;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class Aspecto {

	@Before("saludar())")
	public void presaludo(){
		System.out.println("Vas a saludar");
	}
	/*@After("saludar())")
	public void possaludo(){
		System.out.println("Saludaste");
	}*/
}
