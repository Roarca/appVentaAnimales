/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;
import com.example.dao.PersonaRepository;
import com.example.service.PersonaService;
import com.example.model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService
{
    //Inyecion de dependencias por Spring Boot ( CONFIGURACION DE ARCHIVOS POR PARTE DE SPRING BOOT) va por cada atributo que quieras
@Autowired
private PersonaRepository repositorio;
    @Override
    public List<Usuario> listadoUsuarios() {
        return repositorio.findAll();
    }

    @Override
    public Usuario usuarioUnico(String id) {
        return repositorio.findById(id);
    }

    @Override
    public Usuario altaUsuario(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario editarUsuario(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario eliminarUsuario(String id) {
        Usuario p = repositorio.findById(id);
            if (p!=null)
            {
                repositorio.delete(p);
            }
            return p;
    }

}

