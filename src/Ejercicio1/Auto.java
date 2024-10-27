package Ejercicio1;

public class Auto extends Vehiculo {
	private boolean volante;

	public Auto(int ruedas, String marca, String modelo, boolean estado, Duenio duenio, boolean volante) {
		super(ruedas, marca, modelo, estado, duenio);
		this.volante = volante;
	}

	public boolean isVolante() {
		return volante;
	}

	public void setVolante(boolean volante) {
		this.volante = volante;
	}
	
}
