/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.personas;
import com.tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<personas> getAllpersonas() {
        return (List<personas>) personaRepository.findAll();
    }

    @Override
    public personas getPersonaById(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void savepersonas(personas personas) {
        personaRepository.save(personas);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
    }
    
}
