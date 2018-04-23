package ar.com.dadasoft.app.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "localidad")
public class Localidad {
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_localidad")
    private Long idLocalidad;

    @NotEmpty
    @Column(name="dc_localidad")
    private String dcLocalidad;

    @NotNull
    @Column(name="es_activa")
    private Integer esActiva;


    public Localidad() {
    }

    public Localidad(String dcLocalidad, Integer esActiva) {
        this.dcLocalidad = dcLocalidad;
        this.esActiva = esActiva;
    }

    public Localidad(Long idLocalidad, String dcLocalidad, Integer esActiva) {
        this.idLocalidad = idLocalidad;
        this.dcLocalidad = dcLocalidad;
        this.esActiva = esActiva;
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

    public Integer getEsActiva() {
        return esActiva;
    }

    public void setEsActiva(Integer esActiva) {
        this.esActiva = esActiva;
    }
}

