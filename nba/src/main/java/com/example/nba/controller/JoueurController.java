package com.example.nba.controller;

import com.example.nba.modele.Equipe;
import com.example.nba.modele.Joueur;
import com.example.nba.service.EquipeService;
import com.example.nba.service.JoueurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/joueur")
@AllArgsConstructor
@CrossOrigin(origins = "*")

public class JoueurController {
    private final JoueurService joueurserv;
    @PostMapping
    public Joueur creer(@RequestBody Joueur v){
        return joueurserv.create(v);
    }
    @GetMapping
    public List<Joueur> lire(){
        return joueurserv.read();
    }

}
