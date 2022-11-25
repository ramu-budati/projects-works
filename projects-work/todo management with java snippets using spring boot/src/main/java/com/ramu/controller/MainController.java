package com.ramu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ramu.model.Register;
import com.ramu.model.Todo;
import com.ramu.service.TodoService;

@Controller
public class MainController {

	@Autowired
	TodoService todoService;

	@GetMapping("/")
	public String getWelcomePage() {
		return "welcome";
	}

	@GetMapping("/list-todos")
	public String getListTodos(ModelMap modelMap) {
		modelMap.put("todos", todoService.getTodosList());
		return "list-todo";
	}

	@PostMapping("/list-todos")
	public String validateTodo(@ModelAttribute @Valid Register register, BindingResult bindingResult) {

		if (bindingResult.hasErrors())
			return "list-todo";

		return "redirect:welcome";
	}

	@GetMapping("/add-todo")
	public String getTodo(ModelMap modelMap) {
		modelMap.put("todo", new Todo());
		return "todo";
	}

	@PostMapping("/add-todo")
	public String addTodo(@ModelAttribute @Valid Todo todo, BindingResult bindingResult) {

		if (bindingResult.hasErrors())
			return "todo";
		todo.setUserName("budati_ramu");
		todoService.saveTodo(todo);
		return "redirect:list-todos";
	}

	// update todo
	
	@GetMapping("/update-todo")
	public String getUpdateTodoPage(@RequestParam long id, ModelMap modelMap) {

		Todo currentTodo = todoService.getTodoById(id);
		modelMap.put("todo", currentTodo);
		return "update-todo";
	}
	@PostMapping("/update-todo")
	public String updateTodo(@RequestParam long id, @ModelAttribute @Valid Todo todo, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "todo";
		todoService.update(id, todo);
		return "redirect:list-todos";
	}
	@GetMapping("/delete-todo")
	public String deleteTodo(@RequestParam long id) {
		todoService.delete(id);
		return "redirect:list-todos";
	}
}