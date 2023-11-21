package com.example.nba.repository;


import com.example.nba.modele.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatistiqueRepository extends JpaRepository<Statistique, Long> {
    List<Statistique> findByEquipeId(int equipeId);
}
