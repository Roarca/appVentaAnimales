/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.dao.ClientesRepository;
import com.example.service.ClientesService;
import com.example.model.Clientes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pc
 */
@Service
public class ClientesServiceImp implements ClientesService{
@Autowired
private ClientesRepository repositorio;
    @Override
    public List<Clientes> listadoClientes() {
       return repositorio.findAll();
    }

    @Override
    public Clientes clienteUnico(String id) {
        return repositorio.findById(id);
    }

    @Override
    public Clientes altaCliente(Clientes c) {
        return repositorio.save(c);
    }

    @Override
    public Clientes editarCliente(Clientes c) {
         return repositorio.save(c);
    }

    @Override
    public Clientes eliminarCliente(String id) {
          Clientes c = repositorio.findById(id);
            if ( c!=null)
            {
                repositorio.delete(c);
            }
            return c;
    }

}
