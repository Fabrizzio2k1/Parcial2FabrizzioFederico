package Ejercicio1;

import javax.swing.JOptionPane;

public class Moto extends Vehiculo {
	private boolean cadena;

	public Moto(Duenio duenio) {
		super(2, "No asignado", "No asignado", true, duenio);
		this.cadena = true;
	}

	public boolean isCadena() {
		return cadena;
	}

	public void setCadena(boolean cadena) {
		this.cadena = cadena;
	}
	
	public void asignarDuenio(Duenio duenio) {
		String opcionesauto [] = {"Bueno", "Malo"};
		String opcionvolante [] = {"Si", "No"};
		int elegido;
		duenio.setNombre(validarCaracter("Ingrese el Nombre del Dueño"));
		setMarca(validarCaracter("Ingrese la Marca del Vehiculo"));
		setModelo(validarCaracter("Ingrese el Modelo del Vehiculo"));
		

			elegido = JOptionPane.showOptionDialog(null, "Coloque el Estado de la Moto", "Estado de la Moto", 0, 0, null, opcionesauto, opcionesauto[0]);
			switch (elegido) {
			case 0:
				setEstado(true);
				break;
			case 1:
				setEstado(false);
				break;
			default:
				break;
			}
		
			elegido = JOptionPane.showOptionDialog(null, "¿Tiene Cadena?", "Cadena", 0, 0, null, opcionvolante, opcionvolante[0]);
			switch (elegido) {
			case 0:
				setCadena(true);
				break;
			case 1:
				setCadena(false);
				break;
			default:
				break;
			}
	}
	
}
