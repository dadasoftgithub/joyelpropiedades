package Inmobiliaria;

public class Departamento extends Habitable {

	private String piso;
	private String depto;        // letra del epartamento//
	private Edificio edificio;
	
	
	public Departamento(int id, int tipoOperacion, String tipoMoneda, double importe, int superficie, String direccion,
			int altura, int localidad, String mapa, String descripcion, int estado, int cantAmbientes, String piso,
			String depto, Edificio edificio) {
		super(id, tipoOperacion, tipoMoneda, importe, superficie, direccion, altura, localidad, mapa, descripcion,
				estado, cantAmbientes);
		this.piso = piso;
		this.depto = depto;
		this.edificio = edificio;
	}
	
	
	
}
