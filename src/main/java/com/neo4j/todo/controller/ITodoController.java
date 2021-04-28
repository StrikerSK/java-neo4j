package com.neo4j.todo.controller;

import com.neo4j.todo.entity.TodoDAO;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/todo")
public interface ITodoController {

	@PostMapping
	void createTodo(TodoDAO todo);

	@GetMapping("/{id}")
	TodoDAO getTodo(@PathVariable Long id);

	@DeleteMapping("/{id}")
	void deleteTodo(@PathVariable Long id);

	@PutMapping("/{id}")
	void updateTodo(@PathVariable Long id, TodoDAO updateTodo);

}
