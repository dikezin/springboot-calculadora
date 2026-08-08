package com.dike.calculadoraapi.service;
import com.dike.calculadoraapi.model.Usuario;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario guardarUsuario(Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }
    public List<Usuario> listarUsuarios(){
        return usuarios;
    }

}
