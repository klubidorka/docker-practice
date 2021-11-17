package com.github.klubidorka.server.controller;

import java.util.List;

import com.github.klubidorka.server.model.DbEntry;
import com.github.klubidorka.server.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class EntryController {
    @Autowired
    EntryService entryService;

    @GetMapping("/")
    public List<DbEntry> list() {
        return entryService.listAllEntries();
    }

    @GetMapping("/health")
    public void healthCheck() {
    }
}
