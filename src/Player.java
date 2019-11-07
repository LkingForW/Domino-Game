public class Player {

    //Maybe add name
    //maybe add some stat in the future.
    //winner status ?
    
    final int handSIZE = 10;
    Domino[] dominoAtHand = new Domino[handSIZE]; //Maybe this should be and Array list instead of an array for when we want to remove peices from the players hand
    int playerNumber;
    
    
    
    
    public void printHand(){
        for(int i = 0 ; i < handSIZE; i++ ){
            System.out.println(dominoAtHand[i].sideOne + "/" + dominoAtHand[i].sideTwo );
        }
    }
    
}
