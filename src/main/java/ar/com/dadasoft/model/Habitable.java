package ar.com.dadasoft.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;


public class Habitable extends Inmueble {

	private int cantAmbientes;


	//Contructores
	public Habitable() {

	}

	public Habitable(Long id, String tipoPropiedad, int tipoOperacion, double importe, int superficie, String direccion, int altura, int localidad, String mapa, String descripcion, int estado, int cantAmbientes) {
		super(id, tipoPropiedad, tipoOperacion, importe, superficie, direccion, altura, localidad, mapa, descripcion, estado);
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
