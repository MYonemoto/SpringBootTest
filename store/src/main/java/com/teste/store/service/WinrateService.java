package com.teste.store.service;

import com.teste.store.model.Winrate;
import com.teste.store.repository.Winrates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WinrateService {

    @Autowired
    Winrates winrates;

    public Winrate save(Winrate winrate) {
        Optional<Winrate> winrateOptional = winrates.findByHero(winrate.getHero());

        if (winrateOptional.isPresent()) {
            throw new HeroAlreadyExistException();
        }

        return winrates.save(winrate);
    }

    public Winrate update(Long id, Winrate winrate) {
        Optional<Winrate> winrateOptional = winrates.findById(id);

        if (!winrateOptional.isPresent()) {
            throw new HeroNotFoundException();
        }

        winrate.setId(id);

        return winrates.save(winrate);
    }

    public void delete(Long id) {
        Optional<Winrate> winrateOptional = winrates.findById(id);

        if (!winrateOptional.isPresent()) {
            throw new HeroNotFoundException();
        }

        winrates.deleteById(id);
    }
}
