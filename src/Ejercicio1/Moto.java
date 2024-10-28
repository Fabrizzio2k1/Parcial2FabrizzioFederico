package Ejercicio1;

import javax.swing.JOptionPane;

public class Moto extends Vehiculo {
	private boolean cadena;
	
	public boolean isCadena() {
		return cadena;
	}

	public Moto(Duenio duenio) {
	super(2, "No asignado", "No asignado", false, true, true, duenio);
	this.cadena = true;
}

	public void setCadena(boolean cadena) {
		this.cadena = cadena;
	}
	
	@Override
	public void asignarDuenio(Duenio duenio) {
		String opcionesmoto [] = {"Bueno", "Malo"};
		String opcionaceite [] = {"Mucho", "Poco"};
		int elegido;
		duenio.setNombre(validarCaracter("Ingrese el Nombre del Dueño"));
		setMarca(validarCaracter("Ingrese la Marca del Vehiculo"));
		setModelo(validarCaracter("Ingrese el Modelo del Vehiculo"));

			elegido = JOptionPane.showOptionDialog(null, "Coloque el Estado del Motor", "Estado del Motor", 0, 0, null, opcionesmoto, opcionesmoto[0]);
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
