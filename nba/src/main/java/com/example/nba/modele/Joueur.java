package com.example.nba.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "joueur")
@Getter
@Setter
@NoArgsConstructor
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

}
