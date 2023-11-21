package com.example.nba.service;

import com.example.nba.modele.Equipe;
import com.example.nba.modele.Jeu;

import java.util.List;

public interface JeuService {
    Jeu create(Jeu v);

    List<Jeu> read();
}
