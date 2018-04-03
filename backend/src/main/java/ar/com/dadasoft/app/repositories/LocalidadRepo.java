package ar.com.dadasoft.app.repositories;

import ar.com.dadasoft.app.entities.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalidadRepo extends JpaRepository<Localidad, Long>{

    Localidad findByIdLocalidadAndEsActiva(Long idLocalidad, int i);
}
