package com.example.springrepositeries2;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ProgLangController {
    @Autowired
    private ProgrammingLanguagaRepository programmingLanguagaRepository;

    @GetMapping("/repo-prog-languages")
    @Operation (description = "restituisce tutti gli oggetti")
    public Collection<ProgrammingLanguage> get() {
        return programmingLanguagaRepository.findAll();
    }
    @PostMapping("/repo-prog-languages")
    public ProgrammingLanguage create(@RequestBody ProgrammingLanguage programmingLanguage) {
        return programmingLanguagaRepository.save(programmingLanguage);
    }
    @PutMapping("/repo-prog-languages/{id}")
    public ProgrammingLanguage update(@PathVariable int id, @RequestBody ProgrammingLanguage programmingLanguage) {
        return programmingLanguagaRepository.save(programmingLanguage);
    }

}
