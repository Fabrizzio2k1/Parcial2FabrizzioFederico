package Ejercicio3;

public class CasadelTerror extends Atraccion {
	private double distancia;

	public CasadelTerror(Cliente cliente) {
		super(3, "No asignada", 50, false, cliente);
		this.distancia = 100;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	@Override
	public void verificarRequisitos(Cliente cliente) {
		cliente.setNombre(validarCaracter("Ingrese su nombre"));
		cliente.setEdad(validarNumeros("Ingrese su edad"));
		if (getCliente().getEdad()>=16) {
			setRequisito(true);
		} else {
			setRequisito(false);
		}	
}
}
