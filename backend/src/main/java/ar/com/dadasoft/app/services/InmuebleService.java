package ar.com.dadasoft.app.services;

import ar.com.dadasoft.app.entities.*;
import ar.com.dadasoft.app.pojos.InmueblePojo;
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


    /**
     * Metodo para listar los inmuebles
     * @return List<Inmueble>
     */
    public List<Inmueble> listarInmuebles(){
        return inmuebleRepo.findAll();
    }

    /**
     * Metodo para obtener un inmueble a partir del id del inmueble
     * @param id
     * @return Inmueble
     */
    public Inmueble getInmueble(Long id){
        return inmuebleRepo.findOne(id);
    }

    /**
     * Metodo para salvar un inmueble
     * <p>
     *     parametros de entrada (parametros de inmueblePojo):
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
    public Inmueble guardarInmueble(InmueblePojo inmueblePojo){

        Integer aptoCredito = 0;
        Integer enable = 1;

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
        inmueble.setEnable(enable);

        if (inmueblePojo.isAptoCredito()) {
            aptoCredito = 1;
        }

        inmueble.setAptoCredito(aptoCredito);

        inmuebleRepo.save(inmueble);

        return inmueble;
    }

    /**
     * Metodo para actualizar un inmueble
     * <p>
     *     parametros de entrada (parametros de inmueblePojo):
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
    public boolean modificarInmueble(Long idInmueble, InmueblePojo inmueblePojo){

        Integer aptoCredito = 0;

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

        if (inmueblePojo.isAptoCredito()) {
            aptoCredito = 1;
        }

        inmueble.setAptoCredito(aptoCredito);

        inmuebleRepo.save(inmueble);

        return true;
    }

    /**
     * Metodo para eliminar/deshabilitar un inmueble
     * @param idInmueble
     * @return boolean
     */
    public boolean deleteInmueble(Long idInmueble){

        //TODO - validar que no sean nulos los campos!!
        Inmueble inmueble = inmuebleRepo.findOne(idInmueble);

        inmueble.setEnable(0);

        inmuebleRepo.save(inmueble);

        return true;
    }


}
