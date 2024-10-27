package Ejercicio1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duenio d1 = new Duenio();
		Auto a1 = new Auto(false,d1,true);
		String opciones [] = {"Ingrese Vehiculo","Salir"};
		int elegido;
		do {
			elegido = JOptionPane.showOptionDialog(null, "Elija una opcion", "Taller Tano", 0, 0, null, opciones, opciones[0]);
			switch (elegido) {
			case 0:
				a1.asignarDuenio(d1);
				JOptionPane.showMessageDialog(null, a1.isEstado());
				JOptionPane.showMessageDialog(null, a1.isVolante());
				break;

			default:
				break;
			}
		} while (elegido!=1);
		
	}

}
