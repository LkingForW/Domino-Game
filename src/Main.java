



public class Main {

   
    public static void main(String[] args) {// TODO code application logic here
        Game newGame = new Game();
        
        newGame.generatePieces(); //Places the domnio pieces into array.
        newGame.printDominoPieces(); //print the domino pieces to debug
        newGame.shuffleDominoPieces(); //shuffle the domino pieces to debug
        newGame.printDominoPieces(); //print the domino pieces to debug
        newGame.piecesToPlayers();//distributes the domino pieces to the player
        newGame.printPlayerPieces(); //prints the pieces the players hand in hand
    
    
    }
    
}
