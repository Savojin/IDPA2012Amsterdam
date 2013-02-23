package com.example.surveyapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;

public class MainActivity extends Activity {

	File q;
	File p;
	File d;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 q = new File(Environment.getExternalStorageDirectory()
		 .getAbsolutePath()
		 + File.separator
		 + "SurveyApp"
		 + File.separator + "surveyApp_Question.txt");
		 p = new File(Environment.getExternalStorageDirectory()
		 .getAbsolutePath()
		 + File.separator
		 + "SurveyApp"
		 + File.separator + "surveyApp_Person.txt");
		 d = new File(Environment.getExternalStorageDirectory()
		 .getAbsolutePath() + File.separator + "SurveyApp");

		setContentView(R.layout.activity_main);

		System.out.println("main");




		 createFile();
		System.out.println("after create");
		Question qu = new Question();
		qu.setNumber(1);
		qu.setQuestion("frage");
		writeQuestion(qu);
		 System.out.println(getQuestions());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void writePerson(Person person) {

		String s;
		s = person.getName() + ";" + person.getAge() + ";" + person.isCity()
				+ ";" + person.getQuestion() + ";" + person.getAnswer();

		BufferedWriter buffer;
		try {
			buffer = new BufferedWriter(new FileWriter(p));
			buffer.write(s);
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public ArrayList<Question> getQuestions() {

		try {
			String s;
			ArrayList<Question> questions = new ArrayList<Question>();
			BufferedReader buffer;

			buffer = new BufferedReader(new FileReader(q));

			s = buffer.readLine().toString();
			while (s != null) {
				questions
						.add(new Question(Integer.getInteger(s.substring(0,
								(s.indexOf(";") - 1))), s.substring(s
								.indexOf(";") + 1)));
				s = buffer.readLine().toString();
			}
			buffer.close();
			return questions;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public void writeQuestion(Question question) {
		System.out.println("in q");

		try {
			String s = question.getNumber() + ";" + question.getQuestion();
			BufferedWriter buffer;
			buffer = new BufferedWriter(new FileWriter(q));
			buffer.write(s);
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void createFile() {

		System.out.println("in create");
		if (!d.exists()) {
			System.out.println("in dir");
			d.mkdirs();
		}

		if (!q.exists()) {
			try {
				System.out.println("in filef");
				q.createNewFile();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (!p.exists()) {
			try {
				System.out.println("in filep");
				p.createNewFile();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
