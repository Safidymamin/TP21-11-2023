package com.example.nba.service;

import com.example.nba.modele.Resultat_match;
import com.example.nba.repository.ResultatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ResultatServiceImpl implements ResultatService{
    private final ResultatRepository resrepo;
    @Override
    public Resultat_match create(Resultat_match v) {
        return resrepo.save(v);
    }

    @Override
    public List<Resultat_match> read() {
        return resrepo.findAll();
    }
}
