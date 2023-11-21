package com.example.nba.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "equipe")
@Getter
@Setter
@NoArgsConstructor
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @OneToMany(mappedBy = "equipe")
    private List<Joueur> joueurs;
    @OneToMany(mappedBy = "equipe1")
    private List<Jeu> matchesEquipe1;

    @OneToMany(mappedBy = "equipe2")
    private List<Jeu> matchesEquipe2;

    private String ville;

}
