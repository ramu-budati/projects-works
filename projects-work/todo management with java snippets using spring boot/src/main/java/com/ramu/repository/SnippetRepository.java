package com.ramu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramu.model.Snippet;

@Repository
public interface SnippetRepository extends JpaRepository<Snippet, Long> {

}
