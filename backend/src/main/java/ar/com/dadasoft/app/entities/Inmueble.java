package ar.com.dadasoft.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "inmueble")
public class Inmueble implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_inmueble")
    private Long idInmueble;

    @NotNull
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_tipo_propiedad")
    private TipoPropiedad tipoPropiedad;

    @NotNull
    @Column(name="es_venta")
    private Integer esVenta;

    @NotNull
    @Column(name="importe")
    private Integer importe;

    @Column(name="superficie")
    private Integer superficie;

    @NotEmpty
    @Column(name="calle")
    private String calle;

    @NotNull
    @Column(name="altura")
    private Integer altura;

    @NotNull
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_localidad")
    private Localidad localidad;

    @Column(name="descripcion")
    private String descripcion;

    @NotNull
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_estado")
    private Estado estado;

    @Column(name="cant_ambiente")
    private String cantAmbiente;

    @Column(name="piso")
    private String piso;

    @Column(name="depto")
    private String depto;

    @Column(name="apto_credito")
    private Integer aptoCredito;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(mappedBy = "inmueble")
    private List<Foto> fotos;


    public Inmueble() {
    }

    public Inmueble(TipoPropiedad tipoPropiedad, Integer esVenta, Integer importe, Integer superficie, String calle, Integer altura, Localidad localidad, String descripcion, Estado estado, String cantAmbiente, String piso, String depto, Integer aptoCredito, List<Foto> fotos) {
        this.tipoPropiedad = tipoPropiedad;
        this.esVenta = esVenta;
        this.importe = importe;
        this.superficie = superficie;
        this.calle = calle;
        this.altura = altura;
        this.localidad = localidad;
        this.descripcion = descripcion;
        this.estado = estado;
        this.cantAmbiente = cantAmbiente;
        this.piso = piso;
        this.depto = depto;
        this.aptoCredito = aptoCredito;
        this.fotos = fotos;
    }

    public Inmueble(Long idInmueble, TipoPropiedad tipoPropiedad, Integer esVenta, Integer importe, Integer superficie, String calle, Integer altura, Localidad localidad, String descripcion, Estado estado, String cantAmbiente, String piso, String depto, Integer aptoCredito, List<Foto> fotos) {
        this.idInmueble = idInmueble;
        this.tipoPropiedad = tipoPropiedad;
        this.esVenta = esVenta;
        this.importe = importe;
        this.superficie = superficie;
        this.calle = calle;
        this.altura = altura;
        this.localidad = localidad;
        this.descripcion = descripcion;
        this.estado = estado;
        this.cantAmbiente = cantAmbiente;
        this.piso = piso;
        this.depto = depto;
        this.aptoCredito = aptoCredito;
        this.fotos = fotos;
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

    public Integer getEsVenta() {
        return esVenta;
    }

    public void setEsVenta(Integer esVenta) {
        this.esVenta = esVenta;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
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

    public String getCantAmbiente() {
        return cantAmbiente;
    }

    public void setCantAmbiente(String cantAmbiente) {
        this.cantAmbiente = cantAmbiente;
    }

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

    public Integer getAptoCredito() {
        return aptoCredito;
    }

    public void setAptoCredito(Integer aptoCredito) {
        this.aptoCredito = aptoCredito;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }
}
