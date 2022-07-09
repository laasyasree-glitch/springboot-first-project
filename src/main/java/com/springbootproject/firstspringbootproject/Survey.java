package com.springbootproject.firstspringbootproject;

import java.util.List;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
=======
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
>>>>>>> 5f5578452f48ff02c533efa265035ab84027c0af

@Entity
public class Survey {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
<<<<<<< HEAD
	private int id;
	private String title;
	private String description;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="survey_id")
	private List<Question> questions;

	public Survey() {
		
	}
	public Survey(int id, String title, String description,
			List<Question> questions2) {
=======
	private String id;
	private String title;
	private String description;
	private String questions;

	public Survey(String id, String title, String description,
			String questions) {
>>>>>>> 5f5578452f48ff02c533efa265035ab84027c0af
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.questions = questions2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", title=" + title + ", description="
				+ description + ", questions=" + questions + "]";
	}

}