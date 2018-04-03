package ar.com.dadasoft.app.services;

import ar.com.dadasoft.app.entities.Estado;
import ar.com.dadasoft.app.entities.Test;
import ar.com.dadasoft.app.entities.TestDireccion;
import ar.com.dadasoft.app.pojos.TestPojo;
import ar.com.dadasoft.app.repositories.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepo testRepo;
    @Autowired
    private EstadoService estadoService;

    public void guardar(Test test) {
        testRepo.save(test);
    }

    public List<Test> listarTests() {
        return testRepo.findAll();
    }

    public Test getTest(Long id) {
        return  testRepo.findOne(id);
    }

    public boolean updateTest(Long id, TestPojo testPojo){

        Test t = getTest(id);
        TestDireccion d = t.getDireccion();
        Estado e = estadoService.getEstado(testPojo.getEstado());

        d.setCalle(testPojo.getCalle());
        d.setAltura(testPojo.getAltura());

        t.setPassword(testPojo.getPassword());
        t.setDireccion(d);
        t.setEmail(testPojo.getEmail());
        t.setDescripcion(testPojo.getDescripcion());
        t.setEstado(e);

        testRepo.save(t);

        return true;
    }
}
