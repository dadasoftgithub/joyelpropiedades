package ar.com.dadasoft.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;


public class Departamento extends Habitable {

	@NotEmpty
	private String piso;

	@NotEmpty
	private String depto;        // letra del epartamento//

	@NotEmpty
	private Edificio edificio;


	//Contructor
	public Departamento() {

	}

	public Departamento(Long id, String tipoPropiedad, int tipoOperacion, double importe, int superficie, String direccion, int altura, int localidad, String mapa, String descripcion, int estado, int cantAmbientes, String piso, String depto, Edificio edificio) {
		super(id, tipoPropiedad, tipoOperacion, importe, superficie, direccion, altura, localidad, mapa, descripcion, estado, cantAmbientes);
		this.piso = piso;
		this.depto = depto;
		this.edificio = edificio;
	}


	//Getters & Setters
	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}

}
