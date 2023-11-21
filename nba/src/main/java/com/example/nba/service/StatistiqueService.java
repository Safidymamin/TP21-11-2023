package com.example.nba.service;

import com.example.nba.modele.Statistique;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StatistiqueService {
    List<Statistique> getStatistiquesByEquipe(int equipeId);
}
