package ar.com.dadasoft.app.services;

import ar.com.dadasoft.app.entities.Emprendimiento;
import ar.com.dadasoft.app.repositories.EmprendimientoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmprendimientoService {

    @Autowired
    private EmprendimientoRepo emprendimientoRepo;


    /**
     * Metodo para listar los emprendimientos
     * @return List<Emprendimiento>
     */
    public List<Emprendimiento> listarEmprendimientos() {
        return emprendimientoRepo.findAll();
    }

    /**
     * Metodo para obtener un emprendimiento a partir del id del emprendimiento
     * @param id
     * @return Emprendimiento
     */
    public Emprendimiento getEmprendimiento(Long id) {
        return emprendimientoRepo.findOne(id);
    }
}