package com.example.surveyapp;

public class Person {
	
	private String name;
	private String age;
	private int question;
	private String answer;
	private boolean city;
	
	public Person(){
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the question
	 */
	public int getQuestion() {
		return question;
	}

	/**
	 * @param questions the question to set
	 */
	public void setQuestion(int question) {
		this.question = question;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * @return the city
	 */
	public boolean isCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(boolean city) {
		this.city = city;
	}

}
