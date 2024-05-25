package multiplayerquizapplication;
/**
 *
 * @author Sabit
 */

import java.io.*;

public class MultiplayerQuizApplication {

    private static int playerIndex = 0;

    public static int getPlayerIndex() {
        return playerIndex;
    }

    public static void setPlayerIndex(int playerIndex) {
        MultiplayerQuizApplication.playerIndex = playerIndex;
    }

    public static Player[] playerRead(String playerFile) {
        Player[] players = new Player[100];
        try (BufferedReader reader = new BufferedReader(new FileReader(playerFile))) {
            String line;
            playerIndex = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String pName = parts[0];
                    String pPass = parts[1];
                    int pWin = Integer.parseInt(parts[2].trim());

                    players[playerIndex] = new Player(pName, pPass, pWin);
                    playerIndex++;
                }
            }
            return players;
        } catch (IOException e) {
            e.printStackTrace();
            return players;
        }
    }

     public static Player searchPlayer(Player[] players, String name, String password) {
        int midIndex = playerIndex / 2; //distributing the players

       
        SearchPlayerThread thread1 = new SearchPlayerThread(players, name, password, 0, midIndex);
        SearchPlayerThread thread2 = new SearchPlayerThread(players, name, password, midIndex, playerIndex);

        
        thread1.start();
        thread2.start();

        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        Player result = thread1.getResult();
        if (result == null) {
            result = thread2.getResult();
        }

        return result;
    }

    public static void playerWrite(Player[] players, String playerFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(playerFile))) {
            for (int i = 0; i < playerIndex; i++) {
                if (players[i] != null) {
                    writer.write(players[i].getName() + "," + players[i].getPassword() + "," + players[i].getNumOfWin());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addPlayer(Player[] players, Player p) {
        if (playerIndex < players.length) {
            players[playerIndex] = p;
            playerIndex++;
        }
    }

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

        WelcomePage welcome = new WelcomePage();
        welcome.show();
        
    }

}
