package ar.com.dadasoft.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_direccion")
    private TestDireccion direccion;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonManagedReference
    @OneToMany(mappedBy = "test")
    private List<TestTel> telefonos;

    public Test() {
    }

    public Test(String email, String password, TestDireccion direccion, List<TestTel> telefonos) {
        this.email = email;
        this.password = password;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public Test(Long id, String email, String pass, TestDireccion direccion, List<TestTel> telefonos) {
        this.id = id;
        this.email = email;
        this.password = pass;
        this.direccion = direccion;
        this.telefonos = telefonos;
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

    public List<TestTel> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<TestTel> telefonos) {
        this.telefonos = telefonos;
    }
}
