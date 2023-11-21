package com.example.nba.controller;

import com.example.nba.modele.Equipe;
import com.example.nba.modele.Statistique;
import com.example.nba.service.EquipeService;
import com.example.nba.service.StatistiqueService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipe")
@AllArgsConstructor
@CrossOrigin(origins = "*")

public class EquipeController {
    private final EquipeService equiserv;

    private final StatistiqueService statistiqueService;
    @PostMapping
    public Equipe creer(@RequestBody Equipe v){
        return equiserv.create(v);
    }
    @GetMapping
    public List<Equipe> lire(){
        return equiserv.read();
    }

    @GetMapping("/{equipeId}")
    public ResponseEntity<List<Statistique>> getStatistiquesByEquipe(@PathVariable int equipeId) {
        List<Statistique> statistiques = statistiqueService.getStatistiquesByEquipe(equipeId);
        return ResponseEntity.ok().body(statistiques);
    }
}
