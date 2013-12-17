/*========================================
class Concentration
Facilitates playing game of Concentration,
aka Memory.
========================================*/

import java.util.ArrayList;
import cs1.Keyboard;

public class Concentration {

    //instance variables
    //storage for 4x4 grid of Tiles. _board.size() == 16	
    private ArrayList<Tile> _board; 

    //count of Tiles with faces visible
    private int _numberFaceUp;  

    //list of Strings used for Tile vals
    private WordList _list;

    private static int _numRows = 4;


    public Concentration () {
	String[] tiles = {"King", "Queen", "Jack", "Joker", "Duke", "Count", "Earl", "Jarl"};
	_list = new WordList(tiles);
	_numberFaceUp = 0;
	_board = new ArrayList<Tile>();
	for (int t = 0; t < (tiles.length * 2); t++) {
	    int rand = (int) (Math.random() * 8);
	    if ( (_board.indexOf(tiles[rand]) == -1) ||
		 (_board.indexOf(tiles[rand])) == (_board.lastIndexOf(tiles[rand])) ) {
		_board.add( new Tile(tiles[rand]) );
	    }
	}
    }

    public void printBoard() {
	for (Tile k: _board) {
	    if ( (_board.indexOf(k) % _numRows) == 0 && (_board.indexOf(k) != 0) ) {
		System.out.print("\n");
	    }
	    System.out.print(k);
	}
    }

    public void play() {
	System.out.println( _list.toString() );
	while (_list.size() > 0) {
	    printBoard();
	    System.out.print("Select the Row of your First Card(0-3):");
	    int row1 = Keyboard.readInt();
	    System.out.print("Select the Colomn of your First Card(0-3):");
	    int col1 = Keyboard.readInt();
	    int card1 = col1 + (4*row1);
	    System.out.print("Select the Row of your Second Card(0-3):");
	    int row2 = Keyboard.readInt();
	    System.out.print("Select the Colomn of your Second Card(0-3):");
	    int col2 = Keyboard.readInt();
	    int card2 = col2 + (4*row2);
	    _board.get(card1).flip();
	    _board.get(card2).flip();
	    printBoard();
	    if ( _board.get(card1).equals(_board.get(card2)) ) {
		System.out.println("You have chosen matching cards, they will stay flipped if you do not choose them again");
		_list.remove( (_board.get(card1)).getFace() ); 
		_list.remove( (_board.get(card2)).getFace() ); 
	    }
	    else {
		System.out.println("You choose incorrectly, try again");
		_board.get(card1).flip();
		_board.get(card2).flip();
	    }
	}//end while
	System.out.println("You have Successfully matched all the cards, congratulations, You Win!");
    }


    //DO NOT MODIFY main()
    public static void main( String[] args ) {
	Concentration game = new Concentration();
	game.play();
    }//end main

}//end class Concentration

