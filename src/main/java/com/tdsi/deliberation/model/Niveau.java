package com.tdsi.deliberation.model;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "niveau")
@Getter
@Setter
@NoArgsConstructor
public class Niveau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nom;
    private String optionel;
    @ManyToOne
    private Filiere filiere;
    @OneToMany(mappedBy = "niveau")
    List<Promo> promoList;
}
