package Inmobiliaria;

public class Habitable extends Inmueble {
	
	private int cantAmbientes;

	public Habitable(int id, int tipoOperacion, String tipoMoneda, double importe, int superficie, String direccion,
			int altura, int localidad, String mapa, String descripcion, int estado, int cantAmbientes) {
		super(id, tipoOperacion, tipoMoneda, importe, superficie, direccion, altura, localidad, mapa, descripcion,
				estado);
		this.setCantAmbientes(cantAmbientes);
	}

	public int getCantAmbientes() {
		return cantAmbientes;
	}

	public void setCantAmbientes(int cantAmbientes) {
		this.cantAmbientes = cantAmbientes;
	}
	
	
	

}
