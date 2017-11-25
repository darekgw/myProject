package pl.coderslab.myProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class QuestionDao {

	List<Question> questions = new ArrayList<>();
	
	public QuestionDao() {
		questions.add(new Question(1, 3, "O co chodzi?", "nie wiem", "wiem", "nie powiem", "wiem", false));
		questions.add(new Question(2, 2, "O co tutaj chodzi?", "ssak", "ryba", "plaz", "ssak", false));
		questions.add(new Question(3, 1, "O co tutaj chodzi?", "ssak", "ryba", "plaz", "ssak", false));
		questions.add(new Question(4, 3, "what's up for 3", "cool", "fugazi", "hard locker", "cool", false));
		questions.add(new Question(5, 3, "O co chodzi?", "nie wiem", "wiem", "nie powiem", "wiem", false));
		questions.add(new Question(6, 2, "O co tutaj chodzi?", "ssak", "ryba", "plaz", "ssak", false));
		questions.add(new Question(7, 1, "O co tutaj chodzi?", "ssak", "ryba", "plaz", "ssak", false));
		questions.add(new Question(8, 3, "what's up for 3", "cool", "fugazi", "hard locker", "cool", false));
		questions.add(new Question(9, 3, "O co chodzi?", "nie wiem", "wiem", "nie powiem", "wiem", false));
		questions.add(new Question(10, 2, "O co tutaj chodzi?", "ssak", "ryba", "plaz", "ssak", false));
		questions.add(new Question(11, 1, "O co tutaj chodzi?", "ssak", "ryba", "plaz", "ssak", false));
		questions.add(new Question(12, 3, "what's up for 3", "cool", "fugazi", "hard locker", "cool", false));
	}
	
	
	public List<Question> getQuestion() {
		return questions;
	}
	
	
	
}
