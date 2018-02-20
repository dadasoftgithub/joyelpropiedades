package ar.com.dadasoft.app.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "TIPO_OPERACION")
public class TipoOperacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_operacion")
    private Long idOperacion;

    @NotEmpty
    @Column(name="dc_operacion")
    private String dcOperacion;


    public TipoOperacion() {
    }

    public TipoOperacion(Long idOperacion, String dcOperacion) {
        this.idOperacion = idOperacion;
        this.dcOperacion = dcOperacion;
    }


    public Long getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(Long idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getDcOperacion() {
        return dcOperacion;
    }

    public void setDcOperacion(String dcOperacion) {
        this.dcOperacion = dcOperacion;
    }


}
