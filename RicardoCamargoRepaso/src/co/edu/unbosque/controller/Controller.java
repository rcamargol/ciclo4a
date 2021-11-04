package co.edu.unbosque.controller;

import co.edu.unbosque.model.Nomina;
import co.edu.unbosque.view.View;

public class Controller {

	//Atributos que vienen del Modelo (mundo) 
	private Nomina nomina;
	
	//Atributos que vienen de Vista
	private View gui;
	
	public Controller() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		nomina = new Nomina();
		gui = new View();

		//aqui van los métodos que se invocan de Modelo (Mundo) y de Vista y que ejecutarán el programa.
		funcionar();
	}
	
	public void funcionar() {
		int numero = gui.pedirEntero("Digite numero");
		//gui.escribirDato(numero);
	}
	
	
}
