package multiplayerquizapplication;
/**
 *
 * @author Sabit
 */
import java.util.Scanner;

public class Question {
    Scanner input = new Scanner(System.in);
    public int number = 0;
    private String question, opA, opB, opC, opD;
    private char ans;

    public Question(String question, String opA, String opB, String opC, String opD, char ans) {

        this.question = question;
        this.opA = opA;
        this.opB = opB;
        this.opC = opC;
        this.opD = opD;
        this.ans = ans;
    }

    public void askQuestion() {
        System.out.println(question);
        System.out.println("A. " + opA);
        System.out.println("B. " + opB);
        System.out.println("C. " + opC);
        System.out.println("D. " + opD);
        System.out.println("Enter your choice : ");
        char choice = input.next().charAt(0);
        if (choice == this.ans) {
            number = 1;
        }

    }

    public Scanner getInput() {
        return input;
    }

    public String getQuestion() {
        return question;
    }

    public String getOpA() {
        return opA;
    }

    public String getOpB() {
        return opB;
    }

    public String getOpC() {
        return opC;
    }

    public String getOpD() {
        return opD;
    }

    public char getAns() {
        return ans;
    }

    

}
