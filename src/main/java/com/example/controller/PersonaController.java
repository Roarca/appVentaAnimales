package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Usuario;
import com.example.service.PersonaService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping
public class PersonaController {
	@Autowired
	PersonaService service;
@GetMapping("/usuarios")
public List<Usuario>listar()
{
	return service.listadoUsuarios();
}
@PostMapping("/usuarios")
public Usuario agregar(@RequestBody Usuario u){
   return service.altaUsuario(u); 
}
@GetMapping({"/usuarios/{id}"})
public Usuario listarId(@PathVariable("id") String id)
{
    return service.usuarioUnico(id);
}
@PutMapping(path={"/usuarios/{id}"})
public Usuario editar(@RequestBody Usuario u, @PathVariable("id") String id)
{
    u.setUsuario(id);
    return service.editarUsuario(u);
}  
@DeleteMapping(path={"/usuarios/{id}"})
public Usuario delete(@PathVariable ("id") String id)
{
    return service.eliminarUsuario(id);
}
}
