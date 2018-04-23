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


    /**
     * Metodo para listar los inmuebles
     * @return List<Inmueble>
     */
    @GetMapping(value = "/panel/getInmuebles")
    public List<Inmueble> getInmuebles(){
        return inmuebleService.listarInmuebles();
    }

    /**
     * Metodo para obtener un solo inmueble a partir del id del inmueble
     * @param idInmueble
     * @return Inmueble
     */
    @GetMapping(value = "/panel/getInmueble/{id}")
    public Inmueble getInmuebleById(@PathVariable(value = "id") Long idInmueble){
        return inmuebleService.getInmueble(idInmueble);
    }

    /**
     * Metodo para salvar un inmueble
     * <p>
     *     parametros de entrada:
     *     Integer esVenta
     *     Long idTipoPropiedad
     *     Integer superficie
     *     String cantAmbiente
     *     String piso
     *     String depto
     *     Long idEstado
     *     String calle
     *     Integer altura
     *     Long idLocalidad
     *     boolean aptoCredito
     *     Integer importe
     *     String descripcion
     * </p>
     * @param inmueblePojo
     * @return Inmueble
     */
    @PostMapping(value = "/panel/saveInmueble")
    public Inmueble saveInmueble(@RequestBody InmueblePojo inmueblePojo){
        return inmuebleService.guardarInmueble(inmueblePojo);
    }

    /**
     * Metodo para actualizar un inmueble
     * <p>
     *     parametros de entrada:
     *     Long id
     *     Integer esVenta
     *     Long idTipoPropiedad
     *     Integer superficie
     *     String cantAmbiente
     *     String piso
     *     String depto
     *     Long idEstado
     *     String calle
     *     Integer altura
     *     Long idLocalidad
     *     boolean aptoCredito
     *     Integer importe
     *     String descripcion
     * </p>
     * @param idInmueble
     * @param inmueblePojo
     * @return boolean
     */
    @PutMapping(value = "/panel/modificarInmueble/{id}")
    public boolean updateInmueble(@PathVariable(value = "id") Long idInmueble, @Valid @RequestBody InmueblePojo inmueblePojo){
        return inmuebleService.modificarInmueble(idInmueble, inmueblePojo);
    }




}
