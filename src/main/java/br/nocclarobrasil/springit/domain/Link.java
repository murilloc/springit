package br.nocclarobrasil.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Link extends Auditable{
    
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String url;
    
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();
    
}
