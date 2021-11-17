package com.github.klubidorka.server.repository;

import com.github.klubidorka.server.model.DbEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<DbEntry, Integer> {
}