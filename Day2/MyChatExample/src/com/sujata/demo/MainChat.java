package com.sujata.demo;

public class MainChat {

	public static void main(String[] args) {
		Chat chat=new Chat();
		
		QuestionThread rekha=new QuestionThread(chat, "Rekha");
		AnswerThread harshita=new AnswerThread(chat, "Harshita");
		
		rekha.start();
		harshita.start();

	}

}
