package ar.com.dadasoft.app.controllers;

import ar.com.dadasoft.app.entities.Inmueble;
import ar.com.dadasoft.app.pojos.InmueblePojo;
import ar.com.dadasoft.app.services.InmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PanelController {

    @Autowired
    private InmuebleService inmuebleService;



    @GetMapping(value = "/panel/getInmuebles")
    public List<Inmueble> getInmuebles(){
        return inmuebleService.listarInmuebles();
    }

    @GetMapping(value = "/panel/getInmueble/{id}")
    public Inmueble getInmuebleById(@PathVariable(value = "id") Long idInmueble){
        return inmuebleService.getInmueble(idInmueble);
    }

    @PostMapping(value = "/panel/saveInmueble")
    public Inmueble saveInmueble(@RequestBody InmueblePojo inmueblePojo){
        return inmuebleService.guardarInmueble(inmueblePojo);
    }

    @PutMapping(value = "/panel/modificarInmueble/{id}")
    public boolean updateInmueble(@PathVariable(value = "id") Long idInmueble, @Valid @RequestBody InmueblePojo inmueblePojo){
        return inmuebleService.modificarInmueble(idInmueble, inmueblePojo);
    }




}
