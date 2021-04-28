package com.neo4j.todo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Todo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDAO {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;
	private Boolean done;

}
