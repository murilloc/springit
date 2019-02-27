package br.nocclarobrasil.springit.repository;


import br.nocclarobrasil.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link, Long> {

    
}
