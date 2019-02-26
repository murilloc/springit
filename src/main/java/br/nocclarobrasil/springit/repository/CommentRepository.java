package br.nocclarobrasil.springit.repository;

import br.nocclarobrasil.springit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
