package com.example.nba.service;

import com.example.nba.modele.Equipe;
import com.example.nba.modele.Joueur;

import java.util.List;

public interface JoueurService {


    Joueur create(Joueur v);

    List<Joueur> read();
}
