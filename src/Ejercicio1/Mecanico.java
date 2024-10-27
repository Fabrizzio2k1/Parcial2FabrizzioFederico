package Ejercicio1;

public class Mecanico {
	private String nombre;
	private Taller taller;
	
	
	public Mecanico(Taller taller) {
		super();
		this.nombre = "No asignado";
		this.taller = taller;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String realizarVerificacion() {
		String mensaje = "";
		double precio = 0;
		if (taller.getVehiculo().isEstado()) {
			mensaje += "El Vehiculo esta en Perfecto Estado no Hace Falta Verificacion Tecnica.";
		} else {
			mensaje += "Se esta realizando la Verificacion porfavor espere... \n";
			if (taller.getVehiculo().isAceite()) {
				mensaje += "El Aceite esta bien... \n";
			} else {
				mensaje += "Se relleno Aceite\n";
				precio += 500.00;
				taller.setPrecio(taller.getPrecio() + precio);
				taller.getVehiculo().setAceite(true);
			}
			if (taller.getVehiculo().isMotor()) {
				mensaje += "El Motor esta bien... \n";
			} else {
				mensaje += "Se arreglo el Motor\n";
				precio += 1200.50;
				taller.setPrecio(taller.getPrecio() + precio);
				taller.getVehiculo().setMotor(true);
			}
			taller.getVehiculo().setEstado(true);
			mensaje += "La Verificación se completó con éxito.";
		}
		return mensaje;
	}
}
