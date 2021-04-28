package com.neo4j.todo.Service;

import com.neo4j.todo.repository.TodoRepository;
import com.neo4j.todo.entity.TodoDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements ITodoService {

	private final CrudRepository<TodoDAO, Long> todoRepository;

	public TodoServiceImpl(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	Logger LOG = LoggerFactory.getLogger(TodoServiceImpl.class);

	@Override
	public void creatTodo(TodoDAO todo) {
		Long id = todoRepository.save(todo).getId();
		LOG.info("Created under ID: {}", id);
	}

	@Override
	public void deleteTodo(final Long id) {
		todoRepository.deleteById(id);
	}

	@Override
	public void updateTodo(Long id, TodoDAO updatedTodo) {
		updatedTodo.setId(id);
		todoRepository.save(updatedTodo);
	}

	@Override
	public TodoDAO getTodo(Long id) {
		return todoRepository.findById(id).orElse(null);
	}
}
