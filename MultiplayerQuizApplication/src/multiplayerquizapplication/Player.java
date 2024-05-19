
package multiplayerquizapplication;
import java.io.*;
public class Player {
    private String name , password , numOfWin ;
    private int rightAns ;

    public Player(String name, String password, String numOfWin) {
        
        if(name.length()<5 && name.length()>10){
                                                   //something here
        }
        else{
        this.name = name;
        }
        
        if(password.length()<5 && password.length()>12){
                                                   //something here
        }
        else{
        this.password = password;
        }
        this.numOfWin = numOfWin;
    }

    public Player() {
        try (BufferedReader reader = new BufferedReader(new FileReader("player.txt"))) {
			String line;
			Player[] players = new Player[100];
			int index = 0;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
					String pName = parts[0];
					String pPass = parts[1];
					String pWin = parts[2];
				
					players[index] = new Player(pName,pPass,pWin);
                                        index++;
                                        
			}
                        //System.out.println(players[2].getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
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
    
    
    
    
    
}
