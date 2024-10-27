package Ejercicio1;

public class Moto extends Vehiculo {
	private boolean cadena;

	public Moto(int ruedas, String marca, String modelo, boolean estado, Duenio duenio, boolean cadena) {
		super(ruedas, marca, modelo, estado, duenio);
		this.cadena = cadena;
	}

	public boolean isCadena() {
		return cadena;
	}

	public void setCadena(boolean cadena) {
		this.cadena = cadena;
	}
	
}
