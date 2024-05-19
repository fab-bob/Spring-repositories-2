package com.example.springrepositeries2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProgrammingLanguagaRepository extends JpaRepository<ProgrammingLanguage, Integer> {
}
