package Ejercicio3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		CasadelTerror terror = new CasadelTerror(c1);
		Carrousel carrousel = new Carrousel(c1);
		Parque parque = null;
		String opciones [] = {"Casita del Terror","Carrousel","Salir"};
		int elegido;
		do {
			elegido = JOptionPane.showOptionDialog(null, "Elija una Opción", "Bienvenidos al Parque",0,0, null, opciones, opciones[0]);
			switch (elegido) {
			case 0:
				terror.verificarRequisitos(c1);
				parque = new Parque(terror);
				parque.menu();
				break;
			case 1:
				carrousel.verificarRequisitos(c1);
				parque = new Parque(carrousel);
				parque.menu();
				break;
			default:
				break;
			}
		} while (elegido!=2);
	}

}
