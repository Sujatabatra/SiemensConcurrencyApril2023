package com.sujata.demo;

public class QuestionThread extends Thread {

	private Chat chat;

	public QuestionThread(Chat chat,String name) {
		super(name);
		this.chat = chat;
	}
	
	@Override
	public void run() {
		String questions[]= {"Hello","How are You?","Great!"};
		for(String question:questions) {
			chat.showQuestion(question);
		}
	}
}
