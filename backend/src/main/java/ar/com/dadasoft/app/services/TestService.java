package ar.com.dadasoft.app.services;

import ar.com.dadasoft.app.entities.Test;
import ar.com.dadasoft.app.repositories.TestRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private TestRepo testRepo;

    public void guardar(Test test) {
        testRepo.save(test);
    }

    public List<Test> listarTests() {
        return testRepo.findAll();
    }
}
