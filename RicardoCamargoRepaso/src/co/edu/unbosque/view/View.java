package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	public View() {
		// TODO Auto-generated constructor stub

	}

	/*
	 * metodo de prueba que pide un dato por JOptionPane y retorna el String
	 * correspondiente Reemplazar por lo que se necesiten
	 */

	public String pedirString(String mensaje) {
		return (JOptionPane.showInputDialog(null, mensaje, "Titulo del InputDialog", JOptionPane.INFORMATION_MESSAGE));
	}

	public int pedirEntero(String mensaje) {
		String dato = JOptionPane.showInputDialog(null,mensaje,"Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE);
		int numero;
		try {
			numero = Integer.parseInt(dato);
		}
		catch (Exception e) {
			return -1;
		}
		return (numero);
	}

	/*
	 * metodo de prueba que imprime un dato procesado por un método declarado en
	 * Reemplazar por lo que se necesiten
	 */

	public void escribirDato(String dato) {
		JOptionPane.showMessageDialog(null, dato, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
}
