package com.example.nba.modele;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "resultat_match")
@Getter
@Setter
@NoArgsConstructor
public class Resultat_match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "match_id")
    private Jeu jeu;

    @ManyToOne
    @JoinColumn(name = "joueur_id")
    private Joueur joueur;

    @Column(name = "nb_passe")
    private Integer nbPasse;

    @Column(name = "nb_passe_decisive")
    private Integer nbPasseDecisive;

    @Column(name = "nb_rebond")
    private Integer nbRebond;

    @Column(name = "nb_tir_3_pts_marque")
    private Integer nbTir3PtsMarque;

    @Column(name = "nb_tir_3_pts_tente")
    private Integer nbTir3PtsTente;

    @Column(name = "nb_tir_sans_lance_franc")
    private Integer nbTirSansLanceFranc;

    @Column(name = "nb_lance_franc_marque")
    private Integer nbLanceFrancMarque;

    @Column(name = "nb_lance_franc_tentes")
    private Integer nbLanceFrancTentes;

    @Column(name = "temps_total_joue")
    private Double tempsTotalJoue;


}
