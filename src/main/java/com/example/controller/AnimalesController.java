/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.model.Animales;
import com.example.service.AnimalesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping
public class AnimalesController  {
@Autowired
	AnimalesService service;
@GetMapping("/animales")
public List<Animales>listar()
{
	return service.listadoAnimales();
}
@GetMapping("/animales/tipos")
public List<String>listaTipos()
{
	return service.listadoAnimalesTipo();
}
@PostMapping("/animales")
public Animales agregar(@RequestBody Animales a){
   return service.altaAnimal(a); 
}
@GetMapping({"/animales/{id}"})
public Animales listarId(@PathVariable("id") int id)
{
    return service.animalUnico(id);
}
@GetMapping({"/animales/tipo/{tipo}"})
public List<Animales> listarAnimalesBuscadosPorTipo(@PathVariable("tipo") String tipo)
{
    return service.listadoAnimalesBucandoPorTipo(tipo);
}
@PutMapping(path={"/animales/{id}"})
public Animales editar(@RequestBody Animales a, @PathVariable("id") int id)
{
    a.setId(id);
    return service.editarAnimal(a);
}

@GetMapping(path={"/animalesss"})
public Animales listarTipo(@PathVariable("id") String tipo)
{
     return service.animalUnicoTipo(tipo);
}  

@DeleteMapping(path={"/animales/{id}"})
public Animales delete(@PathVariable ("id") int id)
{
    return service.eliminarAnimal(id);
}    
}
