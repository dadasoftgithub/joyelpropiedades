package ar.com.dadasoft.app.controllers;

import ar.com.dadasoft.app.entities.TipoPropiedad;
import ar.com.dadasoft.app.services.TipoPropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TipoPropiedadController {

	@Autowired
	private TipoPropiedadService tipoPropiedadService;


	/**
	 * Metodo para listar los tipos de propiedad
	 * @return List<TipoPropiedad>
	 */
	@GetMapping(value = "/panel/getTipoPropiedad")
	public List<TipoPropiedad> getThem(){
		return tipoPropiedadService.listarTipoPropiedad();
	}


}	
