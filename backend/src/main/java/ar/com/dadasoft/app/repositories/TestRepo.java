package ar.com.dadasoft.app.repositories;

import ar.com.dadasoft.app.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test, Long>{

}
