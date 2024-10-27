package Ejercicio3;

public class Carrousel extends Atraccion {
	private boolean cintoSeguridad;

	public Carrousel(int duracion, String calificacion, int capacidad, boolean requisito, Cliente cliente,
			boolean cintoSeguridad) {
		super(duracion, calificacion, capacidad, requisito, cliente);
		this.cintoSeguridad = cintoSeguridad;
	}

	public boolean isCintoSeguridad() {
		return cintoSeguridad;
	}

	public void setCintoSeguridad(boolean cintoSeguridad) {
		this.cintoSeguridad = cintoSeguridad;
	}
	
	public void verificarRequisitos() {
		
	}
}
