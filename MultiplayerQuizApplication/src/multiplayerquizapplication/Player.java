
package multiplayerquizapplication;
/**
 *
 * @author Sabit
 */

public class Player {
    private String name , password ;
    private int numOfWin ;
    private int rightAns = 0 ;

    public Player(String name, String password, int numOfWin) {
        
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

    public int getNumOfWin() {
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

    public void setNumOfWin(int numOfWin) {
        this.numOfWin = numOfWin;
    }

    public void setRightAns(int rightAns) {
        this.rightAns = rightAns;
    }
    
    public void increaseRightAns(){
        rightAns++;
    }
    public void increaseWin(){
       numOfWin++;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", password=" + password + '}';
    }
    
    
    
}
