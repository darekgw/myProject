package pl.coderslab.myProject;

import org.springframework.stereotype.Component;


public class Question {

	private int no;
	private int difficulty;
	private String quest;
	private String answer1;
	private String answer2;
	private String answer3;
	private String rightAnswer;
	private boolean used = false;
	

	public Question(int no, int difficulty, String quest,  String answer1,  String answer2,
			String answer3, String rightAnswer, boolean used) {
		super();
		this.no = no;
		this.difficulty = difficulty;
		this.quest = quest;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.rightAnswer = rightAnswer;
		this.used = used;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getDifficulty() {
		return difficulty;
	}
	
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	
	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}
}
