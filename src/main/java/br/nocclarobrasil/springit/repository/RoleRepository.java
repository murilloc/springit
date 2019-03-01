package br.nocclarobrasil.springit.repository;

import br.nocclarobrasil.springit.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
