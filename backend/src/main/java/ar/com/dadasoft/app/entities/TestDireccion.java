package ar.com.dadasoft.app.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="test_direccion")
public class TestDireccion implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_direccion")
    private Long idDireccion;

    private String calle;
    private Integer altura;


    public TestDireccion() {
    }

    public TestDireccion(String calle, Integer altura) {
        this.calle = calle;
        this.altura = altura;
    }

    public TestDireccion(Long idDireccion, String calle, Integer altura) {
        this.idDireccion = idDireccion;
        this.calle = calle;
        this.altura = altura;
    }


    public Long getId() {
        return idDireccion;
    }

    public void setId(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
}
