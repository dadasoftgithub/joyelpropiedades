package ar.com.dadasoft.app.controllers;

import ar.com.dadasoft.app.entities.Estado;
import ar.com.dadasoft.app.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;


    @GetMapping(value = "/panel/getestados")
    public List<Estado> getThem(){
        return estadoService.listarEstados();
    }


    @GetMapping(value = "/panel/getestadobyid/{id}")
    public Estado getById(@PathVariable Long id){
        return estadoService.getEstado(id);
    }

    @PostMapping(value = "/panel/saveestado")
    public String saveEstado(@RequestBody Estado estado){

        estadoService.guardar(estado);

        return "It was saved";
    }

}
