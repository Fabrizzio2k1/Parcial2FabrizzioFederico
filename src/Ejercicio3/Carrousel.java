package Ejercicio3;

public class Carrousel extends Atraccion {
	private boolean cintoSeguridad;

	public Carrousel(Cliente cliente) {
		super(2, "No asignada", 100, false, cliente);
		this.cintoSeguridad = true;
	}

	public boolean isCintoSeguridad() {
		return cintoSeguridad;
	}

	public void setCintoSeguridad(boolean cintoSeguridad) {
		this.cintoSeguridad = cintoSeguridad;
	}
	
	@Override
	public void verificarRequisitos(Cliente cliente) {
		cliente.setNombre(validarCaracter("Ingrese su nombre"));
		cliente.setEdad(validarNumeros("Ingrese su edad"));
		cliente.setAltura(validarNumeros("Ingrese su altura"));
		if (getCliente().getEdad()>=18 && getCliente().getAltura()>=160) {
			setRequisito(true);
		} else {
			setRequisito(false);
		}	
	}
}
