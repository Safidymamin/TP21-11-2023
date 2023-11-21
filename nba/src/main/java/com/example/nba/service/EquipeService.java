package com.example.nba.service;

import com.example.nba.modele.Equipe;

import java.util.List;

public interface EquipeService {
    Equipe create(Equipe v);

    List<Equipe> read();
}
