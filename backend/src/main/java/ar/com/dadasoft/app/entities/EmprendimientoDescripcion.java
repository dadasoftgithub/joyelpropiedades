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
    
    @Column(name="dc_emprendimiento_descripcon")
    private String calle;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_emprendimiento")
    private Emprendimiento emprendimiento;


    public Emprendimiento() {
    }

    public Emprendimiento(String dcEmprendimientoDescripcion, Integer idEmprendimiento) {
    	this.dcEmprendimientoDescripcion = dcEmprendimientoDescripcion;
        this.idEmprendimiento = idEmprendimiento;
    }

    public Emprendimiento(Long idEmprendimientoDescripcion, String dcEmprendimientoDescripcion, Integer idEmprendimiento) {
        this.idEmprendimientoDescripcion = idEmprendimientoDescripcion;
        this.dcEmprendimientoDescripcion = dcEmprendimientoDescripcion;
        this.idEmprendimiento = idEmprendimiento;
    }

    public Long getIdEmprendimientoDescripcion() {
        return idEmprendimientoDescripcion;
    }

    public void setIdEmprendimientoDescripcion(Long idEmprendimientoDescripcion) {
        this.idEmprendimientoDescripcion = idEmprendimientoDescripcion;
    }
   
    public String getDcEmprendimientoDescripcion() {
        return dcEmprendimientoDescripcion;
    }

    public void setDcEmprendimientoDescripcion(String dcEmprendimientoDescripcion) {
        this.dcEmprendimientoDescripcion = dcEmprendimientoDescripcion;
    }

    public Estado getIdEmprendimiento() {
        return idEmprendimiento;
    }

    public void setIdEmprendimiento(Estado idEmprendimiento) {
        this.idEmprendimiento = idEmprendimiento;
    }
}
