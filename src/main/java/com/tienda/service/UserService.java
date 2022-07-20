/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Persona;
import java.nio.file.attribute.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class UserService implements UserDetailsService{
    
    @Autowired
    public IPersonaService personaService;
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
    Persona persona = this.personaService.findByNombre(username);
    Userprincipal userPrincipal = new Userprincipal(persona);
    return userPrincipal;
    }
    
}
