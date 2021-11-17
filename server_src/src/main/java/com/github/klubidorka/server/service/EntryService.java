package com.github.klubidorka.server.service;

import com.github.klubidorka.server.model.DbEntry;
import com.github.klubidorka.server.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EntryService {
    @Autowired
    private EntryRepository repository;

    public List<DbEntry> listAllEntries() {
        return repository.findAll();
    }
}