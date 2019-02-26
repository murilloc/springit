package br.nocclarobrasil.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Link {
    
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
    
    @OneToOne(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();
    
}
