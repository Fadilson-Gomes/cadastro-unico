package fgs.ffgs.cadastrounico.pessoa;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, UUID>{

}
