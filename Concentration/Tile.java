//BENEDICT BOLTON
//HW#44
//PD08
//2013-12-17

/*========================================
class Tile
Intended for use with class Concentration.
========================================*/

public class Tile {

    private String _face;
    private boolean _isFaceUp;

    //constructor
    public Tile( String value ) {
	_face = value;
	_isFaceUp = false;
    }

    public boolean isFaceUp() { return _isFaceUp; }
    public String getFace() { return _face; }

    public void flip() { _isFaceUp = !_isFaceUp; }

    public String toString() {
	if ( isFaceUp() )
	    return _face;
	else
	    return "-X-";
    }

    //*** YOU WILL NEED TO IMPLEMENT EQUALS ***
    //	  ...(use the hints below)

    //overridden equals method
    public boolean equals( Object rightSide ) {

	boolean result = false;
	
	if (this == rightSide) {
	    result = true;
	}
	else if (rightSide instanceof Tile) {
	    if ( _isFaceUp) {
		if (this._face.equals( ((Tile)rightSide)._face)) {
		    result = true;
		}
	    }
	}
	return result;
    }
 
    public static void main(String [] args){
	Tile t1 = new Tile("cow");
	Tile t2 = new Tile("cow");
	System.out.println("t1\tt2");
	System.out.println( t1 + "\t" + t2);
	System.out.println( "t1 == t2: " + t1.equals(t2) );
	System.out.println();
	t1.flip();
	System.out.println("t1\tt2");
	System.out.println( t1 + "\t" + t2);
	System.out.println( "t1 == t2: " + t1.equals(t2) );
	System.out.println();
	t2.flip();
	System.out.println("t1\tt2");
	System.out.println( t1 + "\t" + t2);
	System.out.println( "t1 == t2: " + t1.equals(t2) );
	System.out.println();
    }

}//end class Tile

