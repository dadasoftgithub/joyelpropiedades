package ar.com.dadasoft.app.services;

import ar.com.dadasoft.app.entities.Estado;
import ar.com.dadasoft.app.repositories.EstadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepo estadoRepo;

    public void guardar(Estado estado) {
        estadoRepo.save(estado);
    }

    public List<Estado> listarEstados() {
        return estadoRepo.findAll();
    }

    public Estado getEstado(Long id) {
        return estadoRepo.findOne(id);
    }
}
