package com.neo4j.todo.Service;

import com.neo4j.todo.entity.TodoDAO;

public interface ITodoService {

	void creatTodo(TodoDAO todo);

	void deleteTodo(Long id);

	void updateTodo(Long id, TodoDAO updatedTodo);

	TodoDAO getTodo(Long id);

}
