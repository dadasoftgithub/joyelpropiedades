package ar.com.dadasoft.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import javax.persistence.*;

@Entity
@Table(name = "EDIFICIO")
public class Edificio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_edificio")
    private Long idEdificio;

    @NotEmpty
    @Column(name="titulo")
    private String titulo;

    @Column(name="sum")
    @NumberFormat(style = Style.NUMBER)
    private Integer sum;

    @Column(name="piscina")
    @NumberFormat(style = Style.NUMBER)
    private Integer piscina;

    @Column(name="gimnacio")
    @NumberFormat(style = Style.NUMBER)
    private Integer gimnacio;

    @Column(name="laundry")
    @NumberFormat(style = Style.NUMBER)
    private Integer laundry;

    @Column(name="spa")
    @NumberFormat(style = Style.NUMBER)
    private Integer spa;

    @Column(name="direccion")
    private String direccion;

    @Column(name="altura")
    @NumberFormat(style = Style.NUMBER)
    private Integer altura;

    @Column(name="mapa")
    private String mapa;

    @Column(name="descripcion")
    private String descripcion;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_estado")
    private Estado estado;


    public Edificio() {
    }

    public Edificio(String titulo, Integer sum, Integer piscina, Integer gimnacio, Integer laundry, Integer spa, String direccion, Integer altura, String mapa, String descripcion, Estado estado) {
        this.titulo = titulo;
        this.sum = sum;
        this.piscina = piscina;
        this.gimnacio = gimnacio;
        this.laundry = laundry;
        this.spa = spa;
        this.direccion = direccion;
        this.altura = altura;
        this.mapa = mapa;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Edificio(Long idEdificio, String titulo, Integer sum, Integer piscina, Integer gimnacio, Integer laundry, Integer spa, String direccion, Integer altura, String mapa, String descripcion, Estado estado) {
        this.idEdificio = idEdificio;
        this.titulo = titulo;
        this.sum = sum;
        this.piscina = piscina;
        this.gimnacio = gimnacio;
        this.laundry = laundry;
        this.spa = spa;
        this.direccion = direccion;
        this.altura = altura;
        this.mapa = mapa;
        this.descripcion = descripcion;
        this.estado = estado;
    }


    public Long getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(Long idEdificio) {
        this.idEdificio = idEdificio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getPiscina() {
        return piscina;
    }

    public void setPiscina(Integer piscina) {
        this.piscina = piscina;
    }

    public Integer getGimnacio() {
        return gimnacio;
    }

    public void setGimnacio(Integer gimnacio) {
        this.gimnacio = gimnacio;
    }

    public Integer getLaundry() {
        return laundry;
    }

    public void setLaundry(Integer laundry) {
        this.laundry = laundry;
    }

    public Integer getSpa() {
        return spa;
    }

    public void setSpa(Integer spa) {
        this.spa = spa;
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
}
