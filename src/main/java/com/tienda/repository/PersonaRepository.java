
package com.tienda.repository;
import com.tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
*
* @author usuario
*/
@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>{
    Persona findByNombre (String nombre);
    
    public void deleteById(long id);

    public Object findById(long id);
    
    
}