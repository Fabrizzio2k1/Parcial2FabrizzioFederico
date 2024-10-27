package Ejercicio1;

import javax.swing.JOptionPane;

public class Auto extends Vehiculo {
	private boolean volante;

	public Auto(boolean estado, Duenio duenio, boolean volante) {
		super(4, "No asignado", "No asignado", estado, duenio);
		this.volante = volante;
	}

	public boolean isVolante() {
		return volante;
	}

	public void setVolante(boolean volante) {
		this.volante = volante;
	}
	
	public void asignarDuenio(Duenio duenio) {
		String estadoauto;
		String volante;
		String opcionesauto [] = {"Bueno", "Malo"};
		String opcionvolante [] = {"Si", "No"};
		int elegido;
		duenio.setNombre(validarCaracter("Ingrese el Nombre del Dueño"));
		setMarca(validarCaracter("Ingrese la Marca del Vehiculo"));
		setModelo(validarCaracter("Ingrese el Modelo del Vehiculo"));
		
		do {
			elegido = JOptionPane.showOptionDialog(null, "Coloque el Estado del Vehiculo", "Estado del Vehiculo", 0, 0, null, opcionesauto, opcionesauto[0]);
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
			
		} while (elegido != 3);
		
		do {
			elegido = JOptionPane.showOptionDialog(null, "¿Tiene Volante?", "Volante", 0, 0, null, opcionvolante, opcionvolante[0]);
			switch (elegido) {
			case 0:
				setVolante(true);
				break;
			case 1:
				setVolante(false);
				break;
			default:
				break;
			}
			
		} while (elegido != 3);
	}
}
