package com.neo4j.todo.repository;

import com.neo4j.todo.entity.TodoDAO;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends Neo4jRepository<TodoDAO, Long> {
}
