package src.main.java.ar.com.dadasoft.app.controllers;

import ar.com.dadasoft.app.entities.Estado;
import ar.com.dadasoft.app.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmprendimientoController {

    @Autowired
    private EmprendimientoService emprendimientoService;


    @GetMapping(value = "/panel/getemprendimientos")
    public List<Emprendimiento> getThem(){
        return estadoService.listarEstados();
    }


    @GetMapping(value = "/panel/getemprendimientobyid/{id}")
    public Emprendimiento getById(@PathVariable Long id){
        return emprendimientoService.getEmprendimiento(id);
    }
}