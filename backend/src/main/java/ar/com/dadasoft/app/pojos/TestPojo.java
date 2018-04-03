package ar.com.dadasoft.app.pojos;

import ar.com.dadasoft.app.entities.TestTel;

import java.util.List;

public class TestPojo {

    private String email;
    private String password;
    private String calle;
    private Integer altura;
    private String descripcion;
    private Long estado;
    private List<TestTel> telefonos;


    public TestPojo() {
    }

    public TestPojo(String email, String password, String calle, Integer altura, String descripcion, Long estado, List<TestTel> telefonos) {
        this.email = email;
        this.password = password;
        this.calle = calle;
        this.altura = altura;
        this.descripcion = descripcion;
        this.estado = estado;
        this.telefonos = telefonos;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public List<TestTel> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<TestTel> telefonos) {
        this.telefonos = telefonos;
    }
}
