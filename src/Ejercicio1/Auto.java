package Ejercicio1;

import javax.swing.JOptionPane;

public class Auto extends Vehiculo {
	private boolean volante;
	
	public Auto(Duenio duenio) {
		super(4, "No asignado", "No asignado", false, true, true, duenio);
		this.volante = true;
	}

	public boolean isVolante() {
		return volante;
	}


	public void setVolante(boolean volante) {
		this.volante = volante;
	}
	
	@Override
	public void asignarDuenio(Duenio duenio) {
		String opcionesauto [] = {"Bueno", "Malo"};
		String opcionaceite [] = {"Mucho", "Poco"};
		int elegido;
		duenio.setNombre(validarCaracter("Ingrese el Nombre del Dueño"));
		setMarca(validarCaracter("Ingrese la Marca del Vehiculo"));
		setModelo(validarCaracter("Ingrese el Modelo del Vehiculo"));
				
			elegido = JOptionPane.showOptionDialog(null, "Coloque el Estado del Motor", "Estado del Motor", 0, 0, null, opcionesauto, opcionesauto[0]);
			switch (elegido) {
			case 0:
				setMotor(true);
				break;
			case 1:
				setMotor(false);
				break;
			default:
				break;
			}
			
			elegido = JOptionPane.showOptionDialog(null, "Coloque el Estado del Aceite", "Estado del Aceite", 0, 0, null, opcionaceite, opcionaceite[0]);
			switch (elegido) {
			case 0:
				setAceite(true);
				break;
			case 1:
				setAceite(false);
				break;
			default:
				break;
			}
	}
}
