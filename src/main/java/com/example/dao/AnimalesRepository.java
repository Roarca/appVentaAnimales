/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.model.Animales;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Pc
 */
public interface AnimalesRepository extends Repository<Animales,String>{
    List<Animales>findAll();
    Animales findById(int id);
    Animales findByTipo(String tipo);
    //Persona findByNombre(String nombre);
    Animales save(Animales u);
    void delete(Animales u);
    //Para validaciones asincronas (Cosas a investigar)
   @Query("select id from Animales a")//JPQL
   List<String> listadoAnimales();
    
}
