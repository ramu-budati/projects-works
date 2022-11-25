package com.ramu.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;
import com.ramu.extra.SnippetFetch;
import com.ramu.model.Snippet;
import com.ramu.repository.SnippetRepository;

@Service
public class SnippetServiceImpl implements SnippetService {
	
	@Autowired
	SnippetRepository snippetRepository;

	@Override
	public void saveSnippet(Snippet snippet) {
		snippetRepository.save(snippet);
	}

	@Override
	public List<SnippetFetch> getAllSnippets() {
		List<Snippet> snippets = snippetRepository.findAll();
		List<SnippetFetch> snippetFetch =new ArrayList<>();
		for(Snippet snippet:snippets) {
			
			SnippetFetch snippetFe=new SnippetFetch();
			snippetFe.setId(snippet.getId());
			snippetFe.setQuestion(snippet.getQuestion());
			snippetFe.setExplanation(snippet.getExplanation());
			snippetFe.setJavaCode(getJavaCode(snippet.getJavaCode()));
			
			snippetFetch.add(snippetFe);
			
		}
		
		snippetFetch.forEach(System.out::println);
		return snippetFetch;
		
	}

	@Override
	public List<String> getJavaCode(String input) {
		String formatSource = "";
		Formatter formatter = new Formatter();
		try {

			formatSource = formatter.formatSource(input);
		} catch (FormatterException e) {
			e.printStackTrace();
		}
		Stream<String> str1 = formatSource.lines();
		// iterating each stream
		List<String> code = str1.collect(Collectors.toList());
		return code;
	}

}
