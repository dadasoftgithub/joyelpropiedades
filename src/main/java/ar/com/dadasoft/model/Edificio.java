package ar.com.dadasoft.model;

import java.io.Serializable;

public class Edificio implements Serializable {

	private Long id;
	private String titulo;
	private String foto;
	private int sum;
	private int picina;
	private int gimnacio;
	private int laundry;
	private int spa;
	private String descripcion;		//ESTA DESCRIPCION DEBER IR SEPARADA POR ; //
	private String direccion;
	private String mapa;


	//Contructor
	public Edificio() {
	}

	public Edificio(Long id, String titulo, String foto, int sum, int picina, int gimnacio, int laundry, int spa, String descripcion, String direccion, String mapa) {
		this.id = id;
		this.titulo = titulo;
		this.foto = foto;
		this.sum = sum;
		this.picina = picina;
		this.gimnacio = gimnacio;
		this.laundry = laundry;
		this.spa = spa;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.mapa = mapa;
	}


	//Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getPicina() {
		return picina;
	}

	public void setPicina(int picina) {
		this.picina = picina;
	}

	public int getGimnacio() {
		return gimnacio;
	}

	public void setGimnacio(int gimnacio) {
		this.gimnacio = gimnacio;
	}

	public int getLaundry() {
		return laundry;
	}

	public void setLaundry(int laundry) {
		this.laundry = laundry;
	}

	public int getSpa() {
		return spa;
	}

	public void setSpa(int spa) {
		this.spa = spa;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMapa() {
		return mapa;
	}

	public void setMapa(String mapa) {
		this.mapa = mapa;
	}

}
