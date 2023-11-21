package com.example.nba.controller;


import com.example.nba.modele.Joueur;
import com.example.nba.modele.Resultat_match;
import com.example.nba.service.JoueurService;
import com.example.nba.service.ResultatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resultat")
@AllArgsConstructor
@CrossOrigin(origins = "*")

public class ResultatController {
    private final ResultatService resultatserv;
    @PostMapping
    public Resultat_match creer(@RequestBody Resultat_match v){
        return resultatserv.create(v);
    }
    @GetMapping
    public List<Resultat_match> lire(){
        return resultatserv.read();
    }
}
