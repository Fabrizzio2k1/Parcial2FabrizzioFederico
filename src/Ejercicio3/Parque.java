package Ejercicio3;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Parque {
	private String nombre;
	private String ubicacion;
	private Atraccion atraccion;
	private Operador operador;
	
	public Parque(Atraccion atraccion) {
		super();
		this.nombre = "Parque de la Costa";
		this.ubicacion = "Av. Santafe 2032";
		this.atraccion = atraccion;
		this.operador = new Operador(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Atraccion getAtraccion() {
		return atraccion;
	}

	public void setAtraccion(Atraccion atraccion) {
		this.atraccion = atraccion;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	
	public String verTicket() {
		return getNombre() + "\nMuchas gracias por su visita " + atraccion.getCliente().getNombre() + "\nOperador a cargo: " + operador.getNombre() + "\nSu Calificacion de la Atracción: " + getAtraccion().getCalificacion() + "\nUbicación: " + getUbicacion() + "\nFecha: " + LocalDate.now() + "\nDuracción de la Atracción " + atraccion.getDuracion() + " Hora/s";
	}
	
	public void asignarOperador() {
		operador.setNombre(validarCaracter("Ingrese el nombre del Operador"));
	}
	
	public void menu() {
		String opciones [] = {"Asignar Operador","Verificar Acceso","Calificacion","Ver Ticket","Salir"};
		int elegido;
		do {
			elegido = JOptionPane.showOptionDialog(null, "Elija una Opcion", "Menu del Parque", 0, 0, null, opciones, opciones[0]);
			switch (elegido) {
			case 0:
				asignarOperador();
				break;
			case 1:
				if (operador.getNombre().equals("No asignado")) {
					JOptionPane.showMessageDialog(null, "Asigne un Operador...");
				} else {
					operador.verificarAcceso();
				}
				break;
			case 2:
				if (operador.getLegajo()==0 || atraccion.getCliente().getEdad() < 16) {
					JOptionPane.showMessageDialog(null, "Todavia no jugaste o no Cumplis los requisitos");
				} else {
					String calificacion []= {"Malo","Bueno","Excelente"};
					int cali = JOptionPane.showOptionDialog(null, "Seleccione su calificación", "Calificacion de la atraccion", 0, 0, null, calificacion, calificacion[0]) ;
					switch (cali) {
					case 0:
						atraccion.setCalificacion("Mala");
						break;
					case 1:
						atraccion.setCalificacion("Bueno");
						break;
					case 2:
						atraccion.setCalificacion("Excelente");
						break;
					default:
						break;
					}
				}
				break;
			case 3:
				if (atraccion.getCalificacion().equals("No asignada")) {
					JOptionPane.showMessageDialog(null, "No califico el juego...");
				} else {
					JOptionPane.showMessageDialog(null, verTicket());
				}
				break;
			default:
				break;
			}
		} while (elegido!=4);
	}
	
	public int validarNumeros(String mensaje) {
		boolean flag ;
		String num ="" ;
		do {
			flag =true;
			num = JOptionPane.showInputDialog(mensaje);
			while (num.isEmpty()) {
				num = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < num.length(); i++) {
				if (!Character.isDigit(num.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
		
		return Integer.parseInt(num);
	}
	
	public String validarCaracter(String mensaje) {
		String texto = "";
		Boolean flag;
		do {
			flag = true;
			texto = JOptionPane.showInputDialog(mensaje);
			while (texto.isEmpty()) {
				texto = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < texto.length(); i++) {
				if(!Character.isAlphabetic(texto.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
		
		return texto;
	}
	
}
