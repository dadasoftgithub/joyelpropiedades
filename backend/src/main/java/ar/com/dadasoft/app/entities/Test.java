package ar.com.dadasoft.app.entities;

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

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_direccion", foreignKey = @ForeignKey(name = "FK_TEST_TESTDIRECCION"))
    private TestDireccion direccion;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="id_estado", foreignKey = @ForeignKey(name = "FK_TEST_ESTADO"))
    private Estado estado;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonManagedReference
    @OneToMany(mappedBy = "test")
    private List<TestTel> telefonos;

    @Column(name="descripcion")
    private String descripcion;


    public Test() {
    }

    public Test(String email, String password, TestDireccion direccion, Estado estado, List<TestTel> telefonos, String descripcion) {
        this.email = email;
        this.password = password;
        this.direccion = direccion;
        this.estado = estado;
        this.telefonos = telefonos;
        this.descripcion = descripcion;
    }

    public Test(Long id, String email, String pass, TestDireccion direccion, Estado estado, List<TestTel> telefonos, String descripcion) {
        this.id = id;
        this.email = email;
        this.password = pass;
        this.direccion = direccion;
        this.estado = estado;
        this.telefonos = telefonos;
        this.descripcion = descripcion;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<TestTel> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<TestTel> telefonos) {
        this.telefonos = telefonos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
