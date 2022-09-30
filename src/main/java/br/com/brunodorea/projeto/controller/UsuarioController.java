package br.com.brunodorea.projeto.controller;

import br.com.brunodorea.projeto.model.Usuario;
import br.com.brunodorea.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping("/usuarios")
    public List<Usuario> getUsers() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/usuarios/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return usuarioRepository.finByUsername(username);
    }

    @DeleteMapping("/usuarios/{id}")
    public void deleteUsuario(@PathVariable("id") Integer id) {
        usuarioRepository.remove(id);
    }

    @PostMapping("/usuarios")
    public void postUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
