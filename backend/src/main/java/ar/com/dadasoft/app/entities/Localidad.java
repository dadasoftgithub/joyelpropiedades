package ar.com.dadasoft.app.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "LOCALIDAD")
public class Localidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_localidad")
    private Long idLocalidad;

    @NotEmpty
    @Column(name="dc_localidad")
    private String dcLocalidad;

    @NotNull
    @Column(name="estado")
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_estado")
    private Estado estado;


    public Localidad() {
    }

    public Localidad(Long idLocalidad, String dcLocalidad, Estado estado) {
        this.idLocalidad = idLocalidad;
        this.dcLocalidad = dcLocalidad;
        this.estado = estado;
    }


    public Long getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Long idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getDcLocalidad() {
        return dcLocalidad;
    }

    public void setDcLocalidad(String dcLocalidad) {
        this.dcLocalidad = dcLocalidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


}

