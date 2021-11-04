package co.edu.unbosque.model;

//Representa los datos de persistencia que van a ser utilizados por el mundo y/o controlador
//es opcional: ser puede o no tener datos.

public class Empleado {

	private String nombreCompleto;
	private long cedula;
	private int anioNacim;
	private int mesNacim;
	private int diaNacim;
	private int anioIngreso;
	private int mesIngreso;
	private int diaIngreso;
	private int tipoContrato;
	private double salarioMensual;
	private double comisiones;
	private int tiempoServicio;
	private int mesCalculo;
	private int edad;

	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getMesCalculo() {
		return mesCalculo;
	}



	public void setMesCalculo(int mesCalculo) {
		this.mesCalculo = mesCalculo;
	}



	public int getTiempoServicio() {
		return tiempoServicio;
	}

	public void setTiempoServicio(int tiempoServicio) {
		this.tiempoServicio = tiempoServicio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public int getAnioNacim() {
		return anioNacim;
	}

	public void setAnioNacim(int anioNacim) {
		this.anioNacim = anioNacim;
	}

	public int getMesNacim() {
		return mesNacim;
	}

	public void setMesNacim(int mesNacim) {
		this.mesNacim = mesNacim;
	}

	public int getDiaNacim() {
		return diaNacim;
	}

	public void setDiaNacim(int diaNacim) {
		this.diaNacim = diaNacim;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public int getMesIngreso() {
		return mesIngreso;
	}

	public void setMesIngreso(int mesIngreso) {
		this.mesIngreso = mesIngreso;
	}

	public int getDiaIngreso() {
		return diaIngreso;
	}

	public void setDiaIngreso(int diaIngreso) {
		this.diaIngreso = diaIngreso;
	}

	public int getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(int tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	

}
