package com.ramu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Snippet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull(message = "should not be null")
	@Size(min = 10)
	private String question;
	@NotNull(message = "should not be null")
	@Size(min = 10)
	private String javaCode;
	@NotNull(message = "should not be null")
	@Size(min = 10)
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
	public String getJavaCode() {
		return javaCode;
	}
	public void setJavaCode(String javaCode) {
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
