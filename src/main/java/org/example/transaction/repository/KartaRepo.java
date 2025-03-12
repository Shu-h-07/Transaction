package org.example.transaction.repository;

import org.example.transaction.model.Karta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KartaRepo extends JpaRepository<Karta, Integer> {
}
