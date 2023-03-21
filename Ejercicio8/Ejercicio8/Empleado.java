package Ejercicio8;

import java.time.LocalDate;

public class Empleado extends Persona{
    public String cargo;
    LocalDate fechaingreso;
    public int salario;
    LocalDate EdadLaboral;
    public static void main(String[] args) 
    {
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

    }
}