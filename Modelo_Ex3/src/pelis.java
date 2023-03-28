import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class pelis implements operaciones{
	public String nombre;
	public int clasificacion;
	public int wlg;
	public int dlg;
	public int flg;
	public String fecha;
	
	public pelis(final String nombre, final int clasificacion, final int wlg, final int dlg,
			final int flg, final String fecha) {
		this.nombre = nombre;
		this.clasificacion = clasificacion;
		this.wlg = wlg;
		this.dlg = dlg;
		this.flg = flg;
		this.fecha = fecha;
	}

	@Override
	public int dinero_recaudado() {
		// TODO Auto-generated method stub
		int din_rec = this.wlg + this.dlg + this.flg;
		return din_rec;
	}

	@Override
	public void agrupar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void top() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orden_alf() {
		// TODO Auto-generated method stub
		
	}
	public String getInformacion() 
	{
		String info = new String();
		info = info.concat("Descripcion: " + this.nombre + "     ");
		info = info.concat("Dinero_Recaudado: " + this.dinero_recaudado() + "     ");
		info = info.concat("\n");
		return info;
	}
}
