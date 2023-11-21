package com.example.nba.controller;

import com.example.nba.modele.Jeu;
import com.example.nba.modele.Joueur;
import com.example.nba.service.JeuService;
import com.example.nba.service.JoueurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jeu")
@AllArgsConstructor
@CrossOrigin(origins = "*")

public class JeuController {
    private final JeuService jeuserv;
    @PostMapping
    public Jeu creer(@RequestBody Jeu v){
        return jeuserv.create(v);
    }
    @GetMapping
    public List<Jeu> lire(){
        return jeuserv.read();
    }
}
