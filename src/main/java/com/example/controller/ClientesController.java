package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Clientes;
import com.example.service.ClientesService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping
public class ClientesController {
@Autowired
	ClientesService service;
@GetMapping("/clientes")
public List<Clientes>listar()
{
	return service.listadoClientes();
}
@PostMapping("/clientes")
public Clientes agregar(@RequestBody Clientes u){
   return service.altaCliente(u); 
}
@GetMapping({"/clientes/{id}"})
public Clientes listarId(@PathVariable("id") String id)
{
    return service.clienteUnico(id);
}
@PutMapping(path={"/clientes/{id}"})
public Clientes editar(@RequestBody Clientes u, @PathVariable("id") String id)
{
    u.setDni(id);
    return service.editarCliente(u);
}  
@DeleteMapping(path={"/clientes/{id}"})
public Clientes delete(@PathVariable ("id") String id)
{
    return service.eliminarCliente(id);
}    
}
