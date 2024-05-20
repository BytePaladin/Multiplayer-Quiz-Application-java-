
package multiplayerquizapplication;
import java.io.*;
public class Player {
    private String name , password , numOfWin ;
    private int rightAns ;

    public Player(String name, String password, String numOfWin) {
        
        this.name = name;
        this.password = password;
        this.numOfWin = numOfWin;
    }


    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getNumOfWin() {
        return numOfWin;
    }

    public int getRightAns() {
        return rightAns;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumOfWin(String numOfWin) {
        this.numOfWin = numOfWin;
    }

    public void setRightAns(int rightAns) {
        this.rightAns = rightAns;
    }
    
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", password=" + password + ", numOfWin=" + numOfWin + '}';
    }
    
    
    
}
