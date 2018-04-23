package ar.com.dadasoft.app.controllers;

import ar.com.dadasoft.app.entities.Emprendimiento;
import ar.com.dadasoft.app.services.EmprendimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmprendimientoController {

    @Autowired
    private EmprendimientoService emprendimientoService;


    /**
     * Metodo para listar los emprendimientos
     * @return List<Emprendimiento>
     */
    @GetMapping(value = "/panel/getemprendimientos")
    public List<Emprendimiento> getThem(){
        return emprendimientoService.listarEmprendimientos();
    }

    /**
     * Metodo para obtener un emprendimiento a partir del id de un emprendimiento
     * @param id
     * @return Emprendimiento
     */
    @GetMapping(value = "/panel/getemprendimientobyid/{id}")
    public Emprendimiento getById(@PathVariable Long id){
        return emprendimientoService.getEmprendimiento(id);
    }
}