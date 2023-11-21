package com.example.nba.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "jeu")
@Getter
@Setter
@NoArgsConstructor
public class Jeu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String lieu;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dte;

    @ManyToOne
    @JoinColumn(name = "equipe1_id")
    private Equipe equipe1;

    @ManyToOne
    @JoinColumn(name = "equipe2_id")
    private Equipe equipe2;

}
