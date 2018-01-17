package ar.com.dadasoft.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;


public class Inmueble implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotEmpty
	private String tipoPropiedad;

    @NotEmpty
    private int tipoOperacion;		// 0=venta 1=alquiler

	@NotEmpty
	@NumberFormat(style = Style.NUMBER)
	@Min(1)
	private double importe;

	@NumberFormat(style = Style.NUMBER)
	@Min(1)
	private int superficie;

	@NotEmpty
	private String direccion;

	@NotEmpty
	private int altura;

	@NotEmpty
	private int localidad;

	private String mapa;			//link google map

	private String descripcion;

	@NotEmpty
	private int estado;				//0=activo 1=inactivo 2=eliminado



    //Contructores
	public Inmueble() {
	}

	public Inmueble(Long id, String tipoPropiedad, int tipoOperacion, double importe, int superficie, String direccion, int altura, int localidad, String mapa, String descripcion, int estado) {
		this.id = id;
		this.tipoPropiedad = tipoPropiedad;
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



	//Getter & Setters
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoPropiedad() {
		return cantidad;
	}

	public void setTipoPropiedad(String tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}

	public int getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(int tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLocalidad() {
		return localidad;
	}

	public void setLocalidad(int localidad) {
		this.localidad = localidad;
	}

	public String getMapa() {
		return mapa;
	}

	public void setMapa(String mapa) {
		this.mapa = mapa;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
