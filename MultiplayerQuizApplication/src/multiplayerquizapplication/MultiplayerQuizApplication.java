package multiplayerquizapplication;

import java.io.*;

public class MultiplayerQuizApplication {

	public static Question[] FileReader(String file_name) {
		try (BufferedReader reader = new BufferedReader(new FileReader(file_name))) {
			String line;
			Question[] questions = new Question[10];
			int index = 0;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
					String questionText = parts[0];
					String optionA = parts[1];
					String optionB = parts[2];
					String optionC = parts[3];
					String optionD = parts[4];
					char correctAnswer = parts[5].trim().charAt(0);
					questions[index++] = new Question(questionText, optionA, optionB, optionC, optionD, correctAnswer);
			}
			return questions;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
            
                Player p = new Player();
		String file_name = "questions.txt";
                //WelcomePage welcome = new WelcomePage();
                //welcome.show();
		Question[] questions = FileReader(file_name);
		if (questions != null) {
			int totalMarks = 0; // Variable to store total marks
			for (int i = 0; i < questions.length; i++) {
				questions[i].askQuestion();
				totalMarks += questions[i].getNumber(); // Add the marks for the current question
				System.out.println(questions[i]);
			}

			System.out.println("Total Marks: " + totalMarks); 
		}
		else {
			System.out.println("No questions found.");
		}
	}
}
