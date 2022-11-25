package com.ramu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramu.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
