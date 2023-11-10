package com.example.ListarPersonas.controller;

import com.example.ListarPersonas.model.Usuario;
import com.example.ListarPersonas.service.ServiceUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    ServiceUser serviceUser;

    public UserController(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }
   //Lista por ID
    @GetMapping("/usuario/{id}")
    public Usuario obtenerUsuario(@PathVariable("id") int id)
    {
        return this.serviceUser.buscarUsuarioPorId(id);
    }
    //Lista todos los usuarios
    @GetMapping("/usuario")
    public List<Usuario> obtenerUsuario()
    {
        return this.serviceUser.listarUsuarios();
    }
}
