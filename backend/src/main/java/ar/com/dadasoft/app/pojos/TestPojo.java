package ar.com.dadasoft.app.pojos;

public class TestPojo {

    private String email;
    private String password;
    private String calle;
    private Integer altura;


    public TestPojo() {
    }

    public TestPojo(String email, String password, String calle, Integer altura) {
        this.email = email;
        this.password = password;
        this.calle = calle;
        this.altura = altura;
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
}
