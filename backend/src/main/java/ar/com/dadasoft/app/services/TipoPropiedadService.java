package ar.com.dadasoft.app.services;

import ar.com.dadasoft.app.entities.TipoPropiedad;
import ar.com.dadasoft.app.repositories.TipoPropiedadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TipoPropiedadService {

    @Autowired
    private TipoPropiedadRepo tipoPropiedadRepo;


    public List<TipoPropiedad> listarTipoPropiedad() {
        return tipoPropiedadRepo.findAll();
    }

}
	

