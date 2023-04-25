package com.sujata.demo;

public class AnswerThread extends Thread {
	private Chat chat;

	public AnswerThread(Chat chat,String name) {
		super(name);
		this.chat = chat;
	}
	
	@Override
	public void run() {
		String answers[]= {"Hi","I am Fine!","Thank You!"};
		for(String answer:answers) {
			chat.showAnswer(answer);
		}
	}
	

}
