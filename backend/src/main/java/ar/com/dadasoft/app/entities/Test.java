package ar.com.dadasoft.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="test")
public class Test implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String password;

    //@JsonIgnore
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_direccion")
    private TestDireccion direccion;

    public Test() {
    }

    public Test(Long id, String email, String pass, TestDireccion direccion) {
        this.id = id;
        this.email = email;
        this.password = pass;
        this.direccion = direccion;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public TestDireccion getDireccion() {
        return direccion;
    }

    public void setDireccion(TestDireccion direccion) {
        this.direccion = direccion;
    }
}
