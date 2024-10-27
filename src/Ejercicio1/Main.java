package Ejercicio1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duenio d1 = new Duenio();
		Auto a1 = new Auto(d1);
		Moto m1 = new Moto(d1);
		Taller t1 = null;
		String vehiculo [] = {"Auto","Moto","Salir"};
		int elegido;
		do {
			elegido = JOptionPane.showOptionDialog(null, "Bienvenido al Taller\nSelecione Tipo de Vehiculo", "Taller Tano", 0, 0, null, vehiculo, vehiculo[0]);
			switch (elegido) {
			case 0:
				a1.asignarDuenio(d1);
				t1 = new Taller(a1);
				t1.verMenu();
				break;
			case 1:
				m1.asignarDuenio(d1);
				t1 = new Taller(m1);
				t1.verMenu();
				break;
			default:
				break;
			}
		} while (elegido!=2);
		
	}

}
