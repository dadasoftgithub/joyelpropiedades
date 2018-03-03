package ar.com.dadasoft.app.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "Foto")
public class Foto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_foto")
    private Long idFoto;

    @Column(name="id_inmueble")
    @NumberFormat(style = Style.NUMBER)
    private Integer idInmueble;
    
    @Column(name="id_emprendimiento")
    @NumberFormat(style = Style.NUMBER)
    private Integer idEmprendimiento;
    
    @Column(name="id_tipo_dispositivo")
    @NumberFormat(style = Style.NUMBER)
    private Integer idTipoDispositivo;
    
    @Column(name="foto")
    private String foto;
    
    public Foto() {
    }

    public Estado(String dcEstado, String color) {
        this.dcEstado = dcEstado;
        this.color = color;
    }

    public Estado(Long idEstado, String dcEstado, String color) {
        this.idEstado = idEstado;
        this.dcEstado = dcEstado;
        this.color = color;
    }


    public Long getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Long idFoto) {
        this.idFoto = idFoto;
    }
    
    public Long getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble (Long idInmueble) {
        this.idInmueble = idInmueble;
    }
    
    public Long getIdEmprendimiento() {
        return idEmprendimiento;
    }

    public void setIdEmprendimiento (Long idEmprendimiento) {
        this.idEmprendimiento = idEmprendimiento;
    }
    
    public Long getIdTipoDispositivo() {
        return idTipoDispositivo;
    }

    public void setIdTipoDispositivo (Long idTipoDispositivo) {
        this.idTipoDispositivo = idTipoDispositivo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
