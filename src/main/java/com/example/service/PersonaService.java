
package com.example.service;

import com.example.model.Usuario;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;


public interface PersonaService {
    List<Usuario>listadoUsuarios();
    Usuario usuarioUnico(String id);
    Usuario altaUsuario(Usuario u);
    Usuario editarUsuario(Usuario u);
    Usuario eliminarUsuario(String id);

}
