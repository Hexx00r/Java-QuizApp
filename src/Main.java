import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Quiz quiz = new Quiz();

		quiz.businessLogic();
	}

}

class Quiz {

	private HashMap<String, Integer> countAnswer;

	public Quiz() {

		countAnswer = new HashMap<>();
		countAnswer.put("a", 0); // Initialize counts for each choice
		countAnswer.put("b", 0);
		countAnswer.put("c", 0);

	}

	public void businessLogic() {

	 
	 
		Scanner Scanner = new Scanner(System.in);
		
		ArrayList<Questions> questions = new ArrayList<>();
		
		  questions.add(new Questions
				("Question: You went to a party last night and when you arrived to school the next day, everybody is talking about something you didn’t do. What will you do?",
				"a) Avoid everything and go with your friends", "b) Go and talk with the person that started the rumors",
				"C) Go and talk with the teacher"));

		  questions.add(new Questions("Question: What quality do you excel the most?", "a) Empathy", "b) Curiosity",
				"c) Perseverance"));

		  questions.add(new Questions(
				"Question: You are walking down the street when you see an old lady trying to cross, what will you do?",
				"a) Go and help her", "b) Go for a policeman and ask him to help", "c) Keep walking ahead"));

		  questions.add(new Questions("Question: You had a very difficult day at school, you will maintain a ____ attitude",
				"a) Depends on the situation", "b) Positive", "c)Negative"));

		  questions.add(new Questions(
				"Question: You are at a party and a friend of yours comes over and offers you a drink, what do you do?",
				"a) say no thanks", "b) Drink it until it is finished", "c) Ignore him and get angry at him"));

		  questions.add(new Questions("Question: You just started in a new school, you will...",
				"a) Go and talk with the person next to you", "b) Wait until someone comes over you",
				"c) Not talk to anyone"));
//		
		  questions.add(new Questions("Question: In a typical Friday, you would like to..",
				"a) Go out with your close friends to eat", "b) Go to a social club and meet more people",
				"c) Invite one of your friends to your house"));

		  questions.add(new Questions("Question: Your relationship with your parents is..", "a) I like both equally",
				"b) I like both equally", "c) I like my Mom the most"));
		
 
		 
	   Collections.shuffle(questions);
	   
	   ArrayList<Questions> selectedQuestions = new ArrayList<>(questions.subList(0, 8));

	   for (int i = 0; i < selectedQuestions.size(); i++) {
		
		System.out.println(selectedQuestions.get(i).getQuestion());
		System.out.println(selectedQuestions.get(i).getOptionA());
		System.out.println(selectedQuestions.get(i).getOptionB());
		System.out.println(selectedQuestions.get(i).getOptionC());

		
		
		
		System.out.println(" ");
		String ans;
		boolean validInput = false;

		while (!validInput) {
			System.out.println("Please Enter y our choice (a, b, c) ");
			ans = Scanner.next().toLowerCase();
			
			//
			if (ans.equals("a") || ans.equals("b") || ans.equals("c")) {
				validInput = true;
				countAnswer.put(ans, countAnswer.get(ans) + 1);
			}
			else {
				System.out.println("Invalid choice. Please enter 'a', 'b', 'c'");
			}
		 }
	   }
		
		int countA = countAnswer.get("a");
		int countB = countAnswer.get("b");
		int countC = countAnswer.get("c");

		if (countA > countB && countA > countC) {
			System.out.println(
					"Empathy You are emphatic. You see yourself in someone else's situation before doing decisions. You tend to listen to others voice.");
		} else if (countB > countA && countB > countC) {
			System.out.println(
					"Self-Awareness. You are conscious of your own character, feelings, motives and desires. The process can be painful but it leads to greater self-awareness");
		} else if (countC > countA && countC > countB) {
			System.out.println("Self-Management You manage yourself well, You take reposibility for your own behavior");

		} else if (countA == countB || countB == countC) {
			System.out.println("Self-Management You manage yourself well, You take reposibility for your own behavior");
		} else {
			System.out.println("Please choice the given choices");
		}
		Scanner.close();

	}

}
