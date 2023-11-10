package com.example.ListarPersonas.service;

import com.example.ListarPersonas.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceUser {
private List<Usuario> usuarios=new ArrayList<>() ;;


    public ServiceUser() {
        // Crear usuarios de prueba en el constructor
        Usuario usuario1 = new Usuario(1,"Pepito","Perez");
        Usuario usuario2 = new Usuario(2,"Lola","Mendez");
        usuarios.add(usuario1);
        usuarios.add(usuario2);
    }
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsuario_id()==id) {
                return usuario;

            }
        }

        throw new RuntimeException("No se ha encontrado el usuario con el ID: " + id);

    }


}
