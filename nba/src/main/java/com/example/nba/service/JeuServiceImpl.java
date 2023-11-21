package com.example.nba.service;

import com.example.nba.modele.Jeu;
import com.example.nba.repository.JeuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JeuServiceImpl implements JeuService{
    private final JeuRepository jeurepo;
    @Override
    public Jeu create(Jeu v) {
        return jeurepo.save(v);
    }

    @Override
    public List<Jeu> read() {
        return jeurepo.findAll();
    }
}
