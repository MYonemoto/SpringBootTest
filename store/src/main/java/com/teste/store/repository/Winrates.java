package com.teste.store.repository;

import com.teste.store.model.Winrate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Winrates extends JpaRepository<Winrate, Long> {

    Optional<Winrate> findByHero(String hero);
}
