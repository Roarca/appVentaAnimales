/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.Animales;
import java.util.List;


public interface AnimalesService {
    List<Animales>listadoAnimales();
    Animales animalUnico(int id);
    Animales altaAnimal(Animales u);
    Animales editarAnimal(Animales u);
    Animales eliminarAnimal(int id);

    Animales animalUnicoTipo(String tipo);
     List<String>listadoAnimalesTipo();
    List<Animales>listadoAnimalesBucandoPorTipo(String tipo);

}
