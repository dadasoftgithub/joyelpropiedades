package ar.com.dadasoft.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import javax.persistence.*;

@Entity
@Table(name = "foto")
public class Foto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_foto")
    private Long idFoto;

    //@Column(name="id_inmueble")
    @NumberFormat(style = Style.NUMBER)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_inmueble")
    private Inmueble inmueble;
    
    //@Column(name="id_emprendimiento")
    @NumberFormat(style = Style.NUMBER)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_emprendimiento")
    private Emprendimiento emprendimiento;
    
    @Column(name="id_tipo_dispositivo")
    @NumberFormat(style = Style.NUMBER)
    private Long idTipoDispositivo;
    
    @Column(name="foto")
    private String foto;


    public Foto() {
    }

    public Foto(Inmueble inmueble, Emprendimiento emprendimiento, Long idTipoDispositivo, String foto) {
        this.inmueble = inmueble;
        this.emprendimiento = emprendimiento;
        this.idTipoDispositivo = idTipoDispositivo;
        this.foto = foto;
    }

    public Foto(Long idFoto, Inmueble inmueble, Emprendimiento emprendimiento, Long idTipoDispositivo, String foto) {
        this.idFoto = idFoto;
        this.inmueble = inmueble;
        this.emprendimiento = emprendimiento;
        this.idTipoDispositivo = idTipoDispositivo;
        this.foto = foto;
    }


    public Long getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Long idFoto) {
        this.idFoto = idFoto;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Emprendimiento getEmprendimiento() {
        return emprendimiento;
    }

    public void setEmprendimiento(Emprendimiento emprendimiento) {
        this.emprendimiento = emprendimiento;
    }

    public Long getIdTipoDispositivo() {
        return idTipoDispositivo;
    }

    public void setIdTipoDispositivo(Long idTipoDispositivo) {
        this.idTipoDispositivo = idTipoDispositivo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
