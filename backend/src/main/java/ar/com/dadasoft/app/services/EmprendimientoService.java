package src.main.java.ar.com.dadasoft.app.services;

import ar.com.dadasoft.app.entities.Estado;
import ar.com.dadasoft.app.repositories.EstadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprendimientoService {

    @Autowired
    private EmprendimientoRepo emprendimientoRepo;

     public List<Emprendimiento> listarEmprendimientos() {
        return emprendimientoRepo.findAll();
    }

    public Emprendimiento getEmprendimiento(Long id) {
        return EmprendimientoRepo.findOne(id);
    }
}