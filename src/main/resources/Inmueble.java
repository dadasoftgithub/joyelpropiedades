package Inmobiliaria;

public abstract class Inmueble {

	private int id;
	private int tipoOperacion;		// 0=venta 1=alquiler
//	private String tipoMoneda; lo muestra el sitio dependiendo el tipo de operacion
	private double importe;
	private int superficie; 
	private String direccion;
	private int altura;
	private int localidad;			//verificar de donde sacamos la localidad
	private String mapa;			//link google map
	private String descripcion;
	private int estado;				//0=activo 1=inactivo 2=eliminado
	
	
	public Inmueble(int id, int tipoOperacion, String tipoMoneda, double importe, int superficie, String direccion,
			int altura, int localidad, String mapa, String descripcion, int estado) {
		this.id = id;
		this.tipoOperacion = tipoOperacion;
		this.importe = importe;
		this.superficie = superficie;
		this.direccion = direccion;
		this.altura = altura;
		this.localidad = localidad;
		this.mapa = mapa;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	
	
	
}
