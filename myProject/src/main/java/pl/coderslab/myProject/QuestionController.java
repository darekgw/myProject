package pl.coderslab.myProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuestionController {

	private int noOfQuestions = 6;
	private int questionNo = 0;
	private int points = 0;
	private List<Question> answeredQuestions = new ArrayList<>();
 
	@Autowired
	private QuestionDao questionDao;

	@RequestMapping(value="/question", method=RequestMethod.GET)
	public String  askQuestion(Model model) {

		model.addAttribute("question", questionDao.questions.get(questionNo).getQuest());
		model.addAttribute("answer1", questionDao.questions.get(questionNo).getAnswer1());
		model.addAttribute("answer2", questionDao.questions.get(questionNo).getAnswer2());
		model.addAttribute("answer3", questionDao.questions.get(questionNo).getAnswer3());
		questionDao.questions.get(questionNo).setUsed(true);
		noOfQuestions--;
		answeredQuestions.add(questionDao.questions.get(questionNo));
		
		return "question";
	}
 
	@RequestMapping(value="/question", method = RequestMethod.POST)
	public String takeAnswer(@RequestParam String answer, Model model) {

		if(answer.equals(questionDao.questions.get(questionNo).getRightAnswer())) {
			if(questionDao.questions.get(questionNo).getDifficulty() == 3) {
				points += 3;
				//answeredQuestions.add(new Answer(questionDao.questions.get(questionNo), 3, true));
//				for (int i = 0; i < questionDao.questions.size(); i++) {
//					for(int j = 0; j < answeredQuestions.size(); j++) {
//					if(questionDao.questions.get(i).getDifficulty() == 3) {
//						questionNo = questionDao.questions.get(i).getNo();
//						break;
//					}
//				}
//				}
			} else if(questionDao.questions.get(questionNo).getDifficulty() == 2) {
				points += 2;
			//	answeredQuestions.add(new Answer(questionDao.questions.get(questionNo), 2, true));
//				for (int i = 0; i < questionDao.questions.size(); i++) {
//					if(questionDao.questions.get(i).getDifficulty() == 3 && questionDao.questions.get(i).isUsed() == false) {
//						questionNo = questionDao.questions.get(i).getNo();
//						break;
//					}
//				}
			} else {
				points++;
			//	answeredQuestions.add(new Answer(questionDao.questions.get(questionNo), 1, true));
//				for (int i = 0; i < questionDao.questions.size(); i++) {
//					if(questionDao.questions.get(i).getDifficulty() == 2 && questionDao.questions.get(i).isUsed() == false) {
//						questionNo = questionDao.questions.get(i).getNo();
//						break;
//					}
//				}
			}
		} else {
			points--;
		//	answeredQuestions.add(new Answer(questionDao.questions.get(questionNo), -1, true));
//			for (int i = 0; i < questionDao.questions.size(); i++) {
//				if(questionDao.questions.get(i).getDifficulty() == 1 && questionDao.questions.get(i).isUsed() == false) {
//					questionNo = questionDao.questions.get(i).getNo();
//					break;
//				}
//			}
		}

		 questionNo++;

		if(noOfQuestions > 0) {

			return "redirect:question";
		}

		model.addAttribute("points", points);
	  
   
		return "summary";
	}

	@ModelAttribute("questions")
	public Collection<Question> questions() {
		List<Question> questions = questionDao.getQuestion();
		return questions;
	}

	@ModelAttribute("answeredQuestions")
    public Collection<Question> answeredQuestions() {
	    List<Question> answeredQuestions = this.answeredQuestions;
		return answeredQuestions;
	}
}
