package com.teste.store.resource;

import com.teste.store.model.Winrate;
import com.teste.store.repository.Winrates;
import com.teste.store.service.WinrateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/winrates")
public class WinrateResource {

    @Autowired
    Winrates winrates;

    @Autowired
    WinrateService winrateService;

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Winrate> getAll() {
        return winrates.findAll();
    }

    @PostMapping(value = "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Winrate save(@Valid @RequestBody Winrate winrate) {
        return winrateService.save(winrate);
    }

    @PutMapping(value = "/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Winrate update(@PathVariable Long id, @Valid @RequestBody Winrate winrate) {
        return winrateService.update(id, winrate);
    }

    @DeleteMapping(value = "/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        winrateService.delete(id);
    }
}
