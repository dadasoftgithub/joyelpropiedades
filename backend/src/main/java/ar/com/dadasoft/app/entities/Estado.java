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


    public Estado() {
    }

    public Estado(Long idEstado, String dcEstado) {
        this.idEstado = idEstado;
        this.dcEstado = dcEstado;
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


}
