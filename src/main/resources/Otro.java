package Inmobiliaria;

public class Otro extends Inmueble {
	
	private String tipoPropiedad;

	public Otro(int id, int tipoOperacion, String tipoMoneda, double importe, int superficie, String direccion,
			int altura, int localidad, String mapa, String descripcion, int estado, String tipoPropiedad) {
		super(id, tipoOperacion, tipoMoneda, importe, superficie, direccion, altura, localidad, mapa, descripcion,
				estado);
		this.setTipoPropiedad(tipoPropiedad);
	}

	public String getTipoPropiedad() {
		return tipoPropiedad;
	}

	public void setTipoPropiedad(String tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}
	
	

}
