/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;
import com.example.model.Usuario;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;



public interface PersonaRepository extends Repository<Usuario,String>{
    List<Usuario>findAll();
    Usuario findById(String id);
    //Persona findByNombre(String nombre);
    Usuario save(Usuario u);
    void delete(Usuario u);
    //Para validaciones asincronas (Cosas a investigar)
   Usuario findByUsuarioAndContrasenia(String nombre, String contrasenia);
    
   @Query("select nombre from Usuario u")//JPQL
   List<String> listadoUsuarios();
}
