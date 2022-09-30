package br.com.brunodorea.projeto.repository;

import br.com.brunodorea.projeto.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir o usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("bruno","password"));
        usuarios.add(new Usuario("bianca","masterpass"));
        return usuarios;
    }

    public Usuario finById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("bruno","password");
    }

    public Usuario finByUsername(String username) {
        System.out.println(String.format("FIND/id - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario("bruno","password");
    }
}
