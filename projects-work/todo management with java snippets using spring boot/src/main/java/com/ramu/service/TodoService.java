package com.ramu.service;

import java.util.List;

import com.ramu.model.Todo;

public interface TodoService {
	
	public boolean saveTodo(Todo todo);
	public List<Todo> getTodosList();
	public Todo getTodoById(long id);
	public boolean update(long id , Todo todo);
	public boolean delete(long id);
	
}
