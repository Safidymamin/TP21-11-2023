package com.example.nba.service;

import com.example.nba.modele.Resultat_match;

import java.util.List;

public interface ResultatService {
    Resultat_match create(Resultat_match v);

    List<Resultat_match> read();
}
