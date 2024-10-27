package Ejercicio3;

public class Operador {
	private int legajo;
	private Parque parque;
	
	public Operador(int legajo, Parque parque) {
		super();
		this.legajo = legajo;
		this.parque = parque;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public Parque getParque() {
		return parque;
	}

	public void setParque(Parque parque) {
		this.parque = parque;
	}
	
	public void verificarAcceso() {
		
	}
	
}
