package Ejercicio3;

public class CasadelTerror extends Atraccion {
	private double distancia;

	public CasadelTerror(int duracion, String calificacion, int capacidad, boolean requisito, Cliente cliente,
			double distancia) {
		super(duracion, calificacion, capacidad, requisito, cliente);
		this.distancia = distancia;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public void verificarRequisitos() {
		
	}
	
}
