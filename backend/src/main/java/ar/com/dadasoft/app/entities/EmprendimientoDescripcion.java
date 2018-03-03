package ar.com.dadasoft.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import javax.persistence.*;

@Entity
@Table(name = "Emprendimiento_Descripcion")
public class EmprendimientoDescripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_emprendimiento_descripcion")
    private Long idEmprendimientoDescripcion;

    @NotEmpty
    @Column(name="descripcion")
    private String descripcion;
    
/*    @Column(name="dc_emprendimiento_descripcon")
    private String calle;*/


    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_emprendimiento")
    private Emprendimiento emprendimiento;


    public EmprendimientoDescripcion(Long idEmprendimientoDescripcion) {
        this.idEmprendimientoDescripcion = idEmprendimientoDescripcion;
    }

    public EmprendimientoDescripcion(String descripcion, Emprendimiento emprendimiento) {
        this.descripcion = descripcion;
        this.emprendimiento = emprendimiento;
    }

    public EmprendimientoDescripcion(Long idEmprendimientoDescripcion, String descripcion, Emprendimiento emprendimiento) {
        this.idEmprendimientoDescripcion = idEmprendimientoDescripcion;
        this.descripcion = descripcion;
        this.emprendimiento = emprendimiento;
    }


    public Long getIdEmprendimientoDescripcion() {
        return idEmprendimientoDescripcion;
    }

    public void setIdEmprendimientoDescripcion(Long idEmprendimientoDescripcion) {
        this.idEmprendimientoDescripcion = idEmprendimientoDescripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Emprendimiento getEmprendimiento() {
        return emprendimiento;
    }

    public void setEmprendimiento(Emprendimiento emprendimiento) {
        this.emprendimiento = emprendimiento;
    }
}
