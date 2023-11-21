package com.example.nba.service;

import com.example.nba.modele.Statistique;
import com.example.nba.repository.StatistiqueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class StatistiqueServiceImpl implements StatistiqueService{
        private StatistiqueRepository statistiqueRepository;

        @Override
        public List<Statistique> getStatistiquesByEquipe(int equipeId) {
            return statistiqueRepository.findByEquipeId(equipeId);
        }


}
