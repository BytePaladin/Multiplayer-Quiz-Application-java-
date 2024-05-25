
package multiplayerquizapplication;

/**
 *
 * @author Sabit
 */
public class SearchPlayerThread extends Thread {
    private Player[] players;
    private String name;
    private String password;
    private int startIndex;
    private int endIndex;
    private Player result;

    public SearchPlayerThread(Player[] players, String name, String password, int startIndex, int endIndex) {
        this.players = players;
        this.name = name;
        this.password = password;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            if (players[i] != null && players[i].getName().equals(name) && players[i].getPassword().equals(password)) {
                result = players[i];
                break;
            }
        }
    }

    public Player getResult() {
        return result;
    }
    
}