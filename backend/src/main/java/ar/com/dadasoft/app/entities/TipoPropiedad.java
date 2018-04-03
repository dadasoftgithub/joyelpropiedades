package ar.com.dadasoft.app.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "Tipo_Propiedad")
public class TipoPropiedad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_tipo_propiedad")
    private Long idTipoPropiedad;

    @NotEmpty
    @Column(name="dc_tipo_propiedad")
    private String dcTipoPropiedad;


    public TipoPropiedad() {
    }

    public TipoPropiedad(String dcTipoPropiedad) {
        this.dcTipoPropiedad = dcTipoPropiedad;
    }

    public TipoPropiedad(Long idTipoPropiedad, String dcTipoPropiedad) {
        this.idTipoPropiedad = idTipoPropiedad;
        this.dcTipoPropiedad = dcTipoPropiedad;
    }


    public Long getIdTipoPropiedad() {
        return idTipoPropiedad;
    }

    public void setIdTipoPropiedad(Long idTipoPropiedad) {
        this.idTipoPropiedad = idTipoPropiedad;
    }

    public String getDcTipoPropiedad() {
        return dcTipoPropiedad;
    }

    public void setDcTipoPropiedad(String dcTipoPropiedad) {
        this.dcTipoPropiedad = dcTipoPropiedad;
    }


}
