package ar.com.dadasoft.app.services;

import ar.com.dadasoft.app.entities.TestDireccion;
import ar.com.dadasoft.app.repositories.TestDireccionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDireccionService {

    @Autowired
    private TestDireccionRepo testDireccionRepo;

    public void guardar(TestDireccion testDireccion) {
        testDireccionRepo.save(testDireccion);
    }

    public List<TestDireccion> listarTestDireccion() {
        return testDireccionRepo.findAll();
    }

    public TestDireccion getTestDireccion(Long id) {
        return testDireccionRepo.findOne(id);
    }
}
