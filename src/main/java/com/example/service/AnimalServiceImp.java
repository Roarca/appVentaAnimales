/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.dao.AnimalesRepository;
import com.example.model.Animales;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImp implements AnimalesService{
@Autowired
private AnimalesRepository repositorio;
    @Override
    public Animales animalUnico(int id) {
         return repositorio.findById(id);
    }

    @Override
    public Animales altaAnimal(Animales a) {
        return repositorio.save(a);
    }

    @Override
    public Animales editarAnimal(Animales a) {
        return repositorio.save(a);
    }

    @Override
    public Animales eliminarAnimal(int id) {
       Animales a = repositorio.findById(id);
            if ( a!=null)
            {
                repositorio.delete(a);
            }
            return a;
    }

    @Override
    public List<Animales> listadoAnimales() {
       return repositorio.findAll();
    }


    @Override
    public List<String> listadoAnimalesTipo() {
        return repositorio.listadoAnimalesTipo();
    }

    @Override
    public Animales animalUnicoTipo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Animales> listadoAnimalesBucandoPorTipo(String tipo) {
        return repositorio.findByTipo(tipo);
    }




}
