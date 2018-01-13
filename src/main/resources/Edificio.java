package Inmobiliaria;

public class Edificio {

	private int id;
	private String foto;			//CONSULTAR EL TEMA DE LAS FOTOS//
	private String titulo;
	private boolean sum;
	private boolean picina;
	private boolean gimnacio;
	private boolean laundry;
	private boolean spa;
	private String descripcion;		//ESTA DESCRIPCION DEBER IR SEPARADA POR ; //
	private String direccion;
	private String mapa;
	
	public Edificio(int id, String foto, String titulo, boolean sum, boolean picina, boolean gimnacio, boolean laundry,
			boolean spa, String descripcion, String direccion, String mapa) {
		this.id = id;
		this.foto = foto;
		this.titulo = titulo;
		this.sum = sum;
		this.picina = picina;
		this.gimnacio = gimnacio;
		this.laundry = laundry;
		this.spa = spa;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.mapa = mapa;
	}            
	
	
}
