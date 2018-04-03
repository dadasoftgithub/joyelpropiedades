package ar.com.dadasoft.app.services;

import ar.com.dadasoft.app.entities.*;
import ar.com.dadasoft.app.pojos.InmueblePojo;
import ar.com.dadasoft.app.pojos.TestPojo;
import ar.com.dadasoft.app.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InmuebleService {

    @Autowired
    private InmuebleRepo inmuebleRepo;
    @Autowired
    private TipoPropiedadRepo tipoPropiedadRepo;
    @Autowired
    private LocalidadRepo localidadRepo;
    @Autowired
    private EstadoRepo estadoRepo;



    public List<Inmueble> listarInmuebles(){
        return inmuebleRepo.findAll();
    }

    public Inmueble getInmueble(Long id){
        return inmuebleRepo.findOne(id);
    }

    public Inmueble guardarInmueble(InmueblePojo inmueblePojo){

        //TODO - validar que no sean nulos los campos!!
        TipoPropiedad tipoPropiedad = tipoPropiedadRepo.findOne(inmueblePojo.getIdTipoPropiedad());
        Localidad localidad = localidadRepo.findByIdLocalidadAndEsActiva(inmueblePojo.getIdLocalidad(), 1);
        Estado estado = estadoRepo.findOne(inmueblePojo.getIdEstado());
        Inmueble inmueble = new Inmueble();

        inmueble.setTipoPropiedad(tipoPropiedad);
        inmueble.setEsVenta(inmueblePojo.getEsVenta());
        inmueble.setImporte(inmueblePojo.getImporte());
        inmueble.setSuperficie(inmueblePojo.getSuperficie());
        inmueble.setCalle(inmueblePojo.getCalle());
        inmueble.setAltura(inmueblePojo.getAltura());
        inmueble.setLocalidad(localidad);
        inmueble.setDescripcion(inmueblePojo.getDescripcion());
        inmueble.setEstado(estado);
        inmueble.setCantAmbiente(inmueblePojo.getCantAmbiente());
        inmueble.setPiso(inmueblePojo.getPiso());
        inmueble.setDepto(inmueblePojo.getDepto());
        inmueble.setAptoCredito(inmueblePojo.getAptoCredito());

        inmuebleRepo.save(inmueble);

        return inmueble;
    }

    public boolean modificarInmueble(Long idInmueble, InmueblePojo inmueblePojo){

        //TODO - validar que no sean nulos los campos!!
        Inmueble inmueble = inmuebleRepo.findOne(idInmueble);
        TipoPropiedad tipoPropiedad = tipoPropiedadRepo.findOne(inmueblePojo.getIdTipoPropiedad());
        Localidad localidad = localidadRepo.findByIdLocalidadAndEsActiva(inmueblePojo.getIdLocalidad(), 1);
        Estado estado = estadoRepo.findOne(inmueblePojo.getIdEstado());

        inmueble.setTipoPropiedad(tipoPropiedad);
        inmueble.setEsVenta(inmueblePojo.getEsVenta());
        inmueble.setImporte(inmueblePojo.getImporte());
        inmueble.setSuperficie(inmueblePojo.getSuperficie());
        inmueble.setCalle(inmueblePojo.getCalle());
        inmueble.setAltura(inmueblePojo.getAltura());
        inmueble.setLocalidad(localidad);
        inmueble.setDescripcion(inmueblePojo.getDescripcion());
        inmueble.setEstado(estado);
        inmueble.setCantAmbiente(inmueblePojo.getCantAmbiente());
        inmueble.setPiso(inmueblePojo.getPiso());
        inmueble.setDepto(inmueblePojo.getDepto());
        inmueble.setAptoCredito(inmueblePojo.getAptoCredito());

        inmuebleRepo.save(inmueble);

        return true;
    }


}
