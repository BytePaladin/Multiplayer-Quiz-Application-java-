package cse215.multiplayerquizapplication;

import java.io.*;

public class MultiplayerQuizApplication {

	public static Question[] FileReader(String file_name) {
		try (BufferedReader reader = new BufferedReader(new FileReader(file_name))) {
			String line;
			Question[] questions = new Question[10];
			int index = 0;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length >= 6) {
					String questionText = parts[0].trim();
					String optionA = parts[1].trim();
					String optionB = parts[2].trim();
					String optionC = parts[3].trim();
					String optionD = parts[4].trim();
					char correctAnswer = parts[5].trim().charAt(0);
					questions[index++] = new Question(questionText, optionA, optionB, optionC, optionD, correctAnswer);
				}
			}
			return questions;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		String file_name = "questions.txt";
		Question[] questions = FileReader(file_name);
		if (questions != null) {
			int totalMarks = 0; // Variable to store total marks
			for (int i = 0; i < questions.length; i++) {
				questions[i].askQuestion();
				totalMarks += questions[i].getNumber(); // Add the marks for the current question
				System.out.println(questions[i]);
			}

			System.out.println("Total Marks: " + totalMarks); // Print total marks at the end
		}
	}
}
