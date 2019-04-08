
package br.usjt.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.hellospringboot.model.Tempo;

public interface CadastroRepository extends JpaRepository<Tempo, Long>{

}
