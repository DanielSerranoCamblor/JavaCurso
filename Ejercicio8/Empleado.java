package Ejercicio8;

public class Empleado extends Persona{
    public String cargo;
    public String fechaingreso;
    public int salario;
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        Empleado gustavo = new Empleado();
        gustavo.nombre = "Gustavo";
        gustavo.apellido = "Vargas";
        gustavo.Dni = "72367312L";
        gustavo.lugarNacimiento = "Almeria";
        gustavo.FechaNacimiento="12/02/1990";
        gustavo.fechaingreso = "22/03/2014";
        gustavo.cargo = "Ingeniero";
        gustavo.salario = 22000;
        Empleado Ana = new Empleado();
        Ana.nombre = "Ana";
        Ana.apellido = "Vargas";
        Ana.Dni = "72367312L";
        Ana.lugarNacimiento = "Barcelona";
        Ana.FechaNacimiento="01/02/1990";
        Ana.fechaingreso = "22/03/2014";
        Ana.cargo = "Ingeniero";
        Ana.salario = 80000;
        Empleado elena = new Empleado();
        elena.nombre = "Elena";
        elena.apellido = "Caste";
        elena.Dni = "72367432L";
        elena.lugarNacimiento = "Ponferrada";
        elena.FechaNacimiento="12/02/1994";
        elena.fechaingreso = "22/03/2014";
        elena.cargo = "Formadora";
        elena.salario = 24200;
        
    }
}