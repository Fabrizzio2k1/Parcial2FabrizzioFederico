package Ejercicio1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duenio d1 = new Duenio();
		Auto a1 = new Auto(d1);
		Moto m1 = new Moto(d1);
		String opciones [] = {"Ingrese Vehiculo","Salir"};
		String vehiculo [] = {"Moto","Auto"};
		int elegido;
		do {
			elegido = JOptionPane.showOptionDialog(null, "Elija una opcion", "Taller Tano", 0, 0, null, opciones, opciones[0]);
			switch (elegido) {
			case 0:
				elegido = JOptionPane.showOptionDialog(null, "Elija una opcion", "Taller Tano", 0, 0, null, vehiculo, vehiculo[0]);
				switch (elegido) {
				case 0:
					a1.asignarDuenio(d1);
					break;
				case 1:
					m1.asignarDuenio(d1);
					break;
				}
			default:
				break;
			}
		} while (elegido!=1);
		
	}

}
