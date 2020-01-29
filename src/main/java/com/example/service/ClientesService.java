/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.Clientes;
import java.util.List;

/**
 *
 * @author Pc
 */
public interface ClientesService {
     List<Clientes>listadoClientes();
    Clientes clienteUnico(String id);
    Clientes altaCliente(Clientes u);
    Clientes editarCliente(Clientes u);
    Clientes eliminarCliente(String id);

}
