package com.ramu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ramu.model.Snippet;
import com.ramu.service.SnippetService;

@Controller("/snippet")
public class SnippetController {

	@Autowired
	SnippetService snippetService;

	@GetMapping("/add-snippet")
	public String getAddSnippetPage(ModelMap modelMap) {
		modelMap.put("snippet", new Snippet());
		return "snippet";
	}

	@PostMapping("/add-snippet")
	public String addSnippet(@ModelAttribute @Valid Snippet snippet, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "snippet";
		snippetService.saveSnippet(snippet);
		return "redirect:list-snippets";
	}

	@GetMapping("/list-snippets")
	public String getListSnippets(ModelMap modelMap) {

		modelMap.put("snippets", snippetService.getAllSnippets());

		return "list-snippet";
	}

}
