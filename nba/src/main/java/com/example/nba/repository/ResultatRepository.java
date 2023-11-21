package com.example.nba.repository;

import com.example.nba.modele.Resultat_match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultatRepository extends JpaRepository<Resultat_match,Integer> {
}
