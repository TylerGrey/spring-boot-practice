package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

  @Autowired
  TodoService todoService;

  @GetMapping("/todos")
  public List<Todo> getTodos() {
    return todoService.getTodos();
  }

  @PostMapping("/todo")
  public Todo addTodo(@RequestBody Map<String, String> param) {
    return todoService.addTodo(param.get("task"));
  }
}