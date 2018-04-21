package src.main.java.ar.com.dadasoft.app.controllers;

import ar.com.dadasoft.app.entities.TipoPropiedad;

@RestController
public class TipoPropiedadController {

	@Autowired
	private TipoPropiedadService tipoPropiedadService;

	@GetMapping(value = "/panel/getTipoPropiedad")
	public List<TipoPropiedad> getThem(){
		return tipoPropiedadService.listarTipoPropiedad();
	}


}	
