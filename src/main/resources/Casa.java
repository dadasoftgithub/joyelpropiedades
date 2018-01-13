package Inmobiliaria;

public class Casa extends Habitable {

	private String tipoPropiedad;

	
	public Casa(int id, int tipoOperacion, String tipoMoneda, double importe, int superficie, String direccion,
			int altura, int localidad, String mapa, String descripcion, int estado, int cantAmbientes,
			String tipoPropiedad) {
		super(id, tipoOperacion, tipoMoneda, importe, superficie, direccion, altura, localidad, mapa, descripcion,
				estado, cantAmbientes);
		this.setTipoPropiedad(tipoPropiedad);
	}


	public String getTipoPropiedad() {
		return tipoPropiedad;
	}


	public void setTipoPropiedad(String tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}
	
	
	
}
