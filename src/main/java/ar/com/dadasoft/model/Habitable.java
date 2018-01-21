package ar.com.dadasoft.model;


public class Habitable extends Inmueble {

	private int cantAmbientes;


	//Contructores
	public Habitable() {

		super(cantAmbientes);
	}

	public Habitable(Long id, String tipoPropiedad, int tipoOperacion, double importe, int superficie, String direccion, int altura, int localidad, String mapa, String descripcion, int estado, int cantAmbientes) {
		super(id, tipoPropiedad, tipoOperacion, importe, superficie, direccion, altura, localidad, mapa, descripcion, estado, cantAmbientes);
		this.cantAmbientes = cantAmbientes;
	}


	//Getters & Setters
	public int getCantAmbientes() {
		return cantAmbientes;
	}

	public void setCantAmbientes(int cantAmbientes) {
		this.cantAmbientes = cantAmbientes;
	}

}
