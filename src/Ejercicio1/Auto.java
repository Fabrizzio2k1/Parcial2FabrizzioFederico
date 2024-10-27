package Ejercicio1;

import javax.swing.JOptionPane;

public class Auto extends Vehiculo {
	private boolean volante;

	public Auto(Duenio duenio) {
		super(4, "No asignado", "No asignado", true, duenio);
		this.volante = true;
	}

	public boolean isVolante() {
		return volante;
	}

	public void setVolante(boolean volante) {
		this.volante = volante;
	}
	
	public void asignarDuenio(Duenio duenio) {
		String opcionesauto [] = {"Bueno", "Malo"};
		String opcionvolante [] = {"Si", "No"};
		int elegido;
		duenio.setNombre(validarCaracter("Ingrese el Nombre del Dueño"));
		setMarca(validarCaracter("Ingrese la Marca del Vehiculo"));
		setModelo(validarCaracter("Ingrese el Modelo del Vehiculo"));
		

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
	}
}
