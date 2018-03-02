package ar.com.dadasoft.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "INMUEBLE")
public class Inmueble implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_inmueble")
    private Long idInmueble;

    @NotNull
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_propiedad")
    private TipoPropiedad tipoPropiedad;

    @NotNull
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_operacion")
    private TipoOperacion tipoOperacion;

    @NotNull
    @Column(name="importe")
    private Double importe;

    @Column(name="superficie")
    private Integer superficie;

    @NotEmpty
    @Column(name="direccion")
    private String direccion;

    @NotNull
    @Column(name="altura")
    private Integer altura;

    @NotNull
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_localidad")
    private Localidad localidad;

    @Column(name="mapa")
    private String mapa;

    @Column(name="descripcion")
    private String descripcion;

    @NotNull
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_estado")
    private Estado estado;

    @Column(name="cant_ambientes")
    private String cantAmbientes;

    @Column(name="piso")
    private String piso;

    @Column(name="dpto")
    private String dpto;

    @Column(name="apto_credito")
    private Integer aptoCredito;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_edificio")
    private Edificio edificio;


    public Inmueble() {
    }

    public Inmueble(TipoPropiedad tipoPropiedad, TipoOperacion tipoOperacion, Double importe, Integer superficie, String direccion, Integer altura, Localidad localidad, String mapa, String descripcion, Estado estado, String cantAmbientes, String piso, String dpto, Integer aptoCredito, Edificio edificio) {
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
        this.cantAmbientes = cantAmbientes;
        this.piso = piso;
        this.dpto = dpto;
        this.aptoCredito = aptoCredito;
        this.edificio = edificio;
    }

    public Inmueble(Long idInmueble, TipoPropiedad tipoPropiedad, TipoOperacion tipoOperacion, Double importe, Integer superficie, String direccion, Integer altura, Localidad localidad, String mapa, String descripcion, Estado estado, String cantAmbientes, String piso, String dpto, Integer aptoCredito, Edificio edificio) {
        this.idInmueble = idInmueble;
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
        this.cantAmbientes = cantAmbientes;
        this.piso = piso;
        this.dpto = dpto;
        this.aptoCredito = aptoCredito;
        this.edificio = edificio;
    }


    public Long getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(Long idInmueble) {
        this.idInmueble = idInmueble;
    }

    public TipoPropiedad getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(TipoPropiedad tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(TipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCantAmbientes() {
        return cantAmbientes;
    }

    public void setCantAmbientes(String cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public Integer getAptoCredito() {
        return aptoCredito;
    }

    public void setAptoCredito(Integer aptoCredito) {
        this.aptoCredito = aptoCredito;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }
}
