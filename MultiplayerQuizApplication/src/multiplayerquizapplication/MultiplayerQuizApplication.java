package multiplayerquizapplication;

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
                    String pWin = parts[2];

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
}
