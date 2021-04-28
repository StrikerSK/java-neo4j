package com.neo4j.todo.controller;

import com.neo4j.todo.Service.ITodoService;
import com.neo4j.todo.Service.TodoServiceImpl;
import com.neo4j.todo.entity.TodoDAO;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoControllerImpl implements ITodoController {

	private final ITodoService todoService;

	public TodoControllerImpl(TodoServiceImpl todoService) {
		this.todoService = todoService;
	}

	@Override
	public void createTodo(@RequestBody TodoDAO todo) {
		todoService.creatTodo(todo);
	}

	@Override
	public TodoDAO getTodo(Long id) {
		return todoService.getTodo(id);
	}

	@Override
	public void deleteTodo(Long id) {
		todoService.deleteTodo(id);
	}

	@Override
	public void updateTodo(Long id, @RequestBody TodoDAO updatedTodo) {
		todoService.updateTodo(id, updatedTodo);
	}
}
