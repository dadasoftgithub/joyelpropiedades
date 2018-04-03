package ar.com.dadasoft.app.repositories;

import ar.com.dadasoft.app.entities.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InmuebleRepo extends JpaRepository<Inmueble, Long>{

}
