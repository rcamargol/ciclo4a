package co.edu.unbosque.model;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Nomina {
	
	private Empleado empleado;	
	private int anioHoy = 2021;
	private int mesHoy = 8;
	private int diaHoy = 27;
	
	
	public Nomina() {
		// TODO Auto-generated constructor stub
		empleado = new Empleado();
	}
	
	public void calcularTiempoServicio() {
		int meses = (anioHoy - empleado.getAnioIngreso()) * 12;
		empleado.setTiempoServicio(meses);
	}
	
	public void calcularEdadActual() {
		int anios = (anioHoy - empleado.getAnioNacim());
		empleado.setEdad(anios);
	}

	public void calcularIngresosBrutos() {
		
	}
	
	public void calcularAportesSalud() {
		
	}
	
	public void calcularAportesPension() {
		
	}
	
	public void calcularIngresoNeto() {
		
	}
	

	//-------------------- getters y setteres -------------------------------
	
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public int getAnioHoy() {
		return anioHoy;
	}

	public void setAnioHoy(int anioHoy) {
		this.anioHoy = anioHoy;
	}

	public int getMesHoy() {
		return mesHoy;
	}

	public void setMesHoy(int mesHoy) {
		this.mesHoy = mesHoy;
	}

	public int getDiaHoy() {
		return diaHoy;
	}

	public void setDiaHoy(int diaHoy) {
		this.diaHoy = diaHoy;
	}

	
	
	
}
