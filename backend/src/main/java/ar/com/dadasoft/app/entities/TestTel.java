package ar.com.dadasoft.app.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;

@Entity
@Table(name = "test_tel")
public class TestTel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_tel")
    private Long idTel;

    @NotEmpty
    @Column(name="telefono")
    private String telefono;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonBackReference
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private Test test;


    public TestTel() {
    }

    public TestTel(String telefono, Test test) {
        this.telefono = telefono;
        this.test = test;
    }

    public TestTel(Long idTel, String telefono, Test test) {
        this.idTel = idTel;
        this.telefono = telefono;
        this.test = test;
    }


    public Long getIdTel() {
        return idTel;
    }

    public void setIdTel(Long idTel) {
        this.idTel = idTel;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
