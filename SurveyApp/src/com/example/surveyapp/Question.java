package com.example.surveyapp;

public class Question {
	
	private int number;
	private String question;
	
	public Question(int number, String question){
		this.number = number;
		this.question = question;
	}
	public Question() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}


}
