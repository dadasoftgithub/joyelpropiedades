package src.main.java.ar.com.dadasoft.app.services;

import ar.com.dadasoft.app.entities.TipoPropiedad;

@Service
public class TipoPropiedadService {

    @Autowired
    private TipoPropiedadRepo tipoPropiedadRepo;


    public List<TipoPropiedad> listarTipoPropiedad() {
        return TipoPropiedadRepo.findAll();
    }

}
	

