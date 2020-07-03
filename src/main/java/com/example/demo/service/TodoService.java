package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Todo;
import com.example.demo.repogitory.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  @Autowired
  private TodoRepository repository;

  public Todo addTodo(String task) {
    Todo todo = new Todo(task);
    return repository.save(todo);
  }

  public List<Todo> getTodos() {
    List<Todo> todos = new ArrayList<>();
    repository.findAll().forEach(todo -> todos.add(todo));

    return todos;
  }
}