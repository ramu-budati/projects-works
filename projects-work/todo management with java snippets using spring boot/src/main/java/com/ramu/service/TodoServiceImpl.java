package com.ramu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramu.model.Todo;
import com.ramu.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoRepository todoRepository;

	@Override
	public boolean saveTodo(Todo todo) {
		Todo save = todoRepository.save(todo);
		return false;
	}

	@Override
	public List<Todo> getTodosList() {
		return todoRepository.findAll();
	}

	@Override
	public Todo getTodoById(long id) {
		return todoRepository.findById(id).get();
	}

	@Override
	public boolean update(long id, Todo todo) {
		todoRepository.deleteById(id);
		todoRepository.save(todo);
		return true;
	}

	@Override
	public boolean delete(long id) {
		todoRepository.deleteById(id);
		return true;
	}

}
