

import java.util.ArrayList;
import java.util.List;

        
public class Player {

    //Maybe add name
    //maybe add some stat in the future.
    //winner status ?
    
    final int handSIZE = 10;
    int playerNumber;
    List<Domino> dominoAtHand = new ArrayList<>(); // must be a list , with the properties of Array List
    
    
    
    public void printHand(){ // for debug purposes
        for(int i = 0 ; i < handSIZE; i++ ){
            System.out.println("["+(i+1)+"] "+dominoAtHand.get(i).sideOne + "/" + dominoAtHand.get(i).sideTwo );
        }
    }
    
}
