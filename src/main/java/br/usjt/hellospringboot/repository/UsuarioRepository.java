package br.usjt.hellospringboot.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.usjt.hellospringboot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Usuario findOneByLoginAndSenha(String login, String senha);

	@Service
	public class LoginService {
		@Autowired
		UsuarioRepository usuarioRepo;

		public boolean logar(Usuario usuario) {
			return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
		}
	}
}