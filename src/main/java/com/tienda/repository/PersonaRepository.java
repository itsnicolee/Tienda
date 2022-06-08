
package com.tienda.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tienda.entity.personas;
/**
 *
 * @author Usuario
 */
@Repository
public interface PersonaRepository extends CrudRepository<personas,Long>{
    
}
