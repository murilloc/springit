package br.nocclarobrasil.springit.repository;

import br.nocclarobrasil.springit.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoreRepository extends JpaRepository<Vote, Long> {
}
