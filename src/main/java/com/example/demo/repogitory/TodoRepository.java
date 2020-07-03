package com.example.demo.repogitory;

import com.example.demo.model.Todo;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  Todo findById(long id);
}