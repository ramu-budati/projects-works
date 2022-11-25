package com.ramu.extra;

import java.util.List;

public class SnippetFetch {
	private long id;
	private String question;
	private List<String> javaCode;
	private String explanation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getJavaCode() {
		return javaCode;
	}

	public void setJavaCode(List<String> javaCode) {
		this.javaCode = javaCode;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	@Override
	public String toString() {
		return "Snippet [id=" + id + ", question=" + question + ", javaCode=" + javaCode + ", explanation="
				+ explanation + "]";
	}

}
