package ar.com.dadasoft.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import javax.persistence.*;

@Entity
@Table(name = "Emprendimiento")
public class Emprendimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_emprendimiento")
    private Long idEmprendimiento;

    @NotEmpty
    @Column(name="titulo")
    private String titulo;

    @Column(name="sum")
    @NumberFormat(style = Style.NUMBER)
    private Integer sum;

    @Column(name="piscina")
    @NumberFormat(style = Style.NUMBER)
    private Integer piscina;

    @Column(name="gimnasio")
    @NumberFormat(style = Style.NUMBER)
    private Integer gimnasio;

    @Column(name="laundry")
    @NumberFormat(style = Style.NUMBER)
    private Integer laundry;

    @Column(name="calle")
    private String calle;

    @Column(name="altura")
    @NumberFormat(style = Style.NUMBER)
    private Integer altura;
    
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_estado")
    private Estado estado;


    public Emprendimiento() {
    }

    public Emprendimiento(String titulo, Integer sum, Integer piscina, Integer gimnasio, Integer laundry, String calle, Integer altura, Estado estado) {
        this.titulo = titulo;
        this.sum = sum;
        this.piscina = piscina;
        this.gimnasio = gimnasio;
        this.laundry = laundry;
        this.calle = calle;
        this.altura = altura;
        this.estado = estado;
    }

    public Emprendimiento(Long idEdificio, String titulo, Integer sum, Integer piscina, Integer gimnasio, Integer laundry, String calle, Integer altura, Estado estado) {
        this.idEdificio = idEdificio;
        this.titulo = titulo;
        this.sum = sum;
        this.piscina = piscina;
        this.gimnasio = gimnasio;
        this.laundry = laundry;
        this.spa = spa;
        this.calle = calle;
        this.altura = altura;
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

    public Integer getGimnasio() {
        return gimnacio;
    }

    public void setGimnasio(Integer gimnasio) {
        this.gimnacio = gimnacio;
    }

    public Integer getLaundry() {
        return laundry;
    }

    public void setLaundry(Integer laundry) {
        this.laundry = laundry;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
