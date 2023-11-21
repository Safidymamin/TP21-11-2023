package com.example.nba.service;

import com.example.nba.modele.Joueur;
import com.example.nba.repository.JoueurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JoueurServiceImpl implements JoueurService{
    private final JoueurRepository jourepo;
    @Override
    public Joueur create(Joueur v) {
        return jourepo.save(v);
    }

    @Override
    public List<Joueur> read() {
        return jourepo.findAll();
    }
}
