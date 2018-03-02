package ar.com.dadasoft.app.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "ESTADO")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_estado")
    private Long idEstado;

    @NotEmpty
    @Column(name="dc_estado")
    private String dcEstado;

    @NotEmpty
    @Column(name="color")
    private String color;


    public Estado() {
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


    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getDcEstado() {
        return dcEstado;
    }

    public void setDcEstado(String dcEstado) {
        this.dcEstado = dcEstado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
