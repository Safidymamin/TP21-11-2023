package com.example.nba.modele;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Statistique {
    @Id
    @Column(name = "joueur_id")
    private int joueurId;

    @Column(name = "joueur_nom")
    private int joueur_nom;
    @Column(name = "equipeId")

    private int equipeId;
    @Column(name = "nb_match")
    private int nbMatch;

    @Column(name = "point_marque")
    private int pointMarque;

    @Column(name = "rebond_moy")
    private double rebondMoy;

    @Column(name = "passe_moy")
    private double passeMoy;

    @Column(name = "passe_decisive_moy")
    private double passeDecisiveMoy;

    @Column(name = "pct_3_points")
    private double pct3Points;

    @Column(name = "pct_lance_franc")
    private double pctLanceFranc;

    @Column(name = "minute_par_match")
    private double minuteParMatch;

    @Column(name = "temps_total_joue")
    private double tempsTotalJoue;

    // Getters and setters
    // ...
}
