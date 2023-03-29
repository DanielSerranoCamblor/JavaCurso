import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vuelos  extends caracteristicasvuelo implements operaciones{
	public int pasajeros;
	public int valor;

	public Vuelos(final String nombre, final int pasajeros, final String tipo, 
			final int valor, final String fecha) 
	{
		this.nombre = nombre;
		this.pasajeros = pasajeros;
		this.tipo = tipo;
		this.valor = valor;
		this.fecha = fecha;
	}

	@Override
	public int ValorFinalPorVuelo() {
		// TODO Auto-generated method stub
		int Valorfinalporvuelo = this.valor * this.pasajeros;
		return Valorfinalporvuelo;
	}

	@Override
	public int DiasDeDiferencia() {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaAnt = LocalDate.parse(this.fecha, formatter);
		LocalDate fecha = LocalDate.now();
		int fechaUltComp = fecha.getDayOfMonth() - fechaAnt.getDayOfMonth();
		return fechaUltComp;
	}

	@Override
	public String Segmentacion() {
		// TODO Auto-generated method stub
		String economico = "ECONOMICO";
		String premier = "PREMIER";
		if(((this.tipo.compareTo(economico) == 0) && (ValorFinalPorVuelo() >= 100)) ||
				((this.tipo.compareTo(premier) == 0) && (ValorFinalPorVuelo() >= 1500))) 
		{
			return "Es Rentable";
		}
		else
			return "No es Rentable";
	}
	public String getInfo() 
	{
		String info = new String();
		info = info.concat("Nombre: " + this.nombre + "     ");
		info = info.concat("ValorFinalPorVuelo: " + this.ValorFinalPorVuelo() + "     ");
		info = info.concat("Dias de diferencia: " + this.DiasDeDiferencia() + "     ");
		info = info.concat("Segmentación: " + this.Segmentacion() + "     ");
		info = info.concat("\n");
		return info;
	}
}
