/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tienda.entity.Pais;

/**
 *
 * @author Usuario
 */
@Repository
public interface PaisRepository extends CrudRepository<Pais,Long>{
    
}
