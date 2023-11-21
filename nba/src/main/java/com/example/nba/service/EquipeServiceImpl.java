package com.example.nba.service;

import com.example.nba.modele.Equipe;
import com.example.nba.repository.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeServiceImpl implements EquipeService{
    private final EquipeRepository equirepo;
    @Override
    public Equipe create(Equipe v) {
        return equirepo.save(v);
    }

    @Override
    public List<Equipe> read() {
        return equirepo.findAll();
    }

}
