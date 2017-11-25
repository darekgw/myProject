package pl.coderslab.myProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Answer {

	private Question question;
	private int pointScored;
	private boolean used = true;
	
	

	public Answer(Question question, int pointScored, boolean used) {
		this.question = question;
		this.pointScored = pointScored;
		this.used = used;
	}
	
	public Question getQuestion() {
		return question;
	}
	
	
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getPointScored() {
		return pointScored;
	}
	public void setPointScored(int pointScored) {
		this.pointScored = pointScored;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
	
	
	
	
	
}
