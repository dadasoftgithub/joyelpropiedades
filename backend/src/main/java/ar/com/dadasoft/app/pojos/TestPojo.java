package ar.com.dadasoft.app.pojos;

import ar.com.dadasoft.app.entities.TestTel;

import java.util.List;

public class TestPojo {

    private String email;
    private String password;
    private String calle;
    private Integer altura;
    private List<TestTel> telefonos;


    public TestPojo() {
    }

    public TestPojo(String email, String password, String calle, Integer altura, List<TestTel> telefonos) {
        this.email = email;
        this.password = password;
        this.calle = calle;
        this.altura = altura;
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

    public List<TestTel> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<TestTel> telefonos) {
        this.telefonos = telefonos;
    }
}
