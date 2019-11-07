

import java.util.Random;

public class Game {
    
    final int SIZE = 55;
    final int NUMBER_OF_PLAYERS = 4;
  
     Domino[] dominoPieces = new Domino[SIZE]; //array to create the list of domino piecesl
     Player[] players = new Player[NUMBER_OF_PLAYERS]; //array to create the players on the table
    
     //creates the pieces into array
    public void generatePieces(){ 
        int counter = 0;
        
        for(int row = 0; row  <= 9 ; row ++){
            for(int col = row; col <= 9 ; col ++ ){
                Domino dominoPiece = new Domino();                
               dominoPiece.sideOne = row;
                dominoPiece.sideTwo = col;
                dominoPiece.identifier = counter;
                dominoPieces[counter] = dominoPiece;
                counter ++;
            }
        }
    }
    
    //Prints domino Pieces
    public void printDominoPieces(){
        int counter = 0;  
        for(int row = 0; row  <= 9 ; row ++){
            for(int col = row; col <= 9 ; col ++ ){
                System.out.print(dominoPieces[counter].sideOne + "/" + dominoPieces[counter].sideTwo + " ");
                counter ++;
            }
            System.out.println("");
        }
    }
    
    // Shuffle Domino Pieces 
    public void shuffleDominoPieces() { 
        
        Random randomGenerator = new Random();
        int randomNumber ;
        Domino temp = new Domino();
        
        for(int j = 0; j<2 ; j++){
            for(int i =0; i < SIZE ; i ++) {
               randomNumber = randomGenerator.nextInt(55); 
                temp = dominoPieces[i];
                dominoPieces[i] = dominoPieces[randomNumber];
                dominoPieces[randomNumber] = temp;
            }
        }
         
    }
    
    public void piecesToPlayers(){
         
        int counter = 0;
        
        for(int j = 0; j < NUMBER_OF_PLAYERS; j++){ // for every player
            Player tempPlayer = new Player();
            for(int i =0 ; i < 10; i++){ // for every piece
                tempPlayer.dominoAtHand.add(dominoPieces[counter]);
                counter++;
            }
            players[j] = tempPlayer;
        }
    }
    //prints all the hands of the players to debug their options 
    public void printPlayerPieces(){
        for(int i = 0; i< NUMBER_OF_PLAYERS; i++){
            System.out.println("Player: "+ i);
           players[i].printHand();
        }
    }
    
    
    
}
