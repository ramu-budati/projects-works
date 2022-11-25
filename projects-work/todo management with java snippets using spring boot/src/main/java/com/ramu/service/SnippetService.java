package com.ramu.service;

import java.util.List;

import com.ramu.extra.SnippetFetch;
import com.ramu.model.Snippet;

public interface SnippetService {
	
	public void saveSnippet(Snippet snippet);
	public List<SnippetFetch> getAllSnippets();
	public List<String> getJavaCode(String input);
}
