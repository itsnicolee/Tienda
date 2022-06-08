
package com.tienda.service;

import com.tienda.entity.personas;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IPersonaService {
    public List<personas> getAllpersonas();
    public personas getPersonaById (long id);
    public void savepersonas(personas personas);
    public void delete (long id);
}
