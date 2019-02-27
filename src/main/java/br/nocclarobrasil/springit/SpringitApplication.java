package br.nocclarobrasil.springit;

import br.nocclarobrasil.springit.domain.Comment;
import br.nocclarobrasil.springit.domain.Link;
import br.nocclarobrasil.springit.repository.CommentRepository;
import br.nocclarobrasil.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }
    
    //@Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("Getting started with Soring Boot 2", "https://threrealdanvega.com/");
            linkRepository.save(link);
            
            Comment comment = new Comment("This Spring Boot 2 link is awesome", link);
            commentRepository.save(comment);
            
            link.getComments().add(comment);
            
            
        };
    }
    
}
