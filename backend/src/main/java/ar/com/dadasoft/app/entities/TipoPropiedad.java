package ar.com.dadasoft.app.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TIPO_PROPIEDAD")
public class TipoPropiedad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_propiedad")
    private Long idPropiedad;

    @NotEmpty
    @Column(name="dc_propiedad")
    private String dcPropiedad;


    public TipoPropiedad() {
    }

    public TipoPropiedad(String dcPropiedad) {
        this.dcPropiedad = dcPropiedad;
    }

    public TipoPropiedad(Long idPropiedad, String dcPropiedad) {
        this.idPropiedad = idPropiedad;
        this.dcPropiedad = dcPropiedad;
    }


    public Long getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Long idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getDcPropiedad() {
        return dcPropiedad;
    }

    public void setDcPropiedad(String dcPropiedad) {
        this.dcPropiedad = dcPropiedad;
    }


}
