/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.model.Clientes;
import com.example.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Pc
 */
public interface ClientesRepository extends Repository<Clientes,String>{
     List<Clientes>findAll();
    Clientes findById(String id);
    //Persona findByNombre(String nombre);
    Clientes save(Clientes c);
    void delete(Clientes c);
    //Para validaciones asincronas (Cosas a investigar)
   @Query("select nombre from Clientes c")//JPQL
   List<String> listadoClientes();
}
