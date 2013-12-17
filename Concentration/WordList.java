/*========================================
Another sample AP question. 1 of 4 free-response questions, 
for which you will have about 1hr45min.
Note that for today's work, you will have to implement a constructor 
and a main method yourself for testing...

The following class WordList is designed to store and manipulate a 
list of words. The incomplete class declaration is shown below. 
You will be asked to implement two methods.
========================================*/
import java.util.ArrayList;

public class WordList {

    private ArrayList<String> myList; // contains Strings made up of letters

    public WordList(String[] words) {
	ArrayList<String> myList = new ArrayList<String>();
	for (String h: words) {
	    myList.add(h);
	}
    }
    
    public boolean add(String thing) {
	myList.add(thing);
	return true;
    }
    
    public void add (int index, String thing) {
	myList.add(index, thing);
    }
    
    public void remove (int index) {
	myList.remove(index);
    }
    
    public void remove (String thing) {
	int index = myList.indexOf(thing);
	myList.remove(index);
    }
    
    public int size() {
	return myList.size();
    }

    public String get (int index) {
	return myList.get(index);
    }

    public String toString () {
	return myList.toString();
    }
	   

    //postcond: returns the number of words in this WordList that are 
    //          exactly len letters long
    public int numWordsOfLength(int len) { 
	int ans = 0;
	for (String word: myList) {
	    if ( word.length() == len ) {
		ans++;
	    }
	}
	return ans;
    }

    //postcond: all words that are exactly len letters long have been removed 
    //          from this WordList, with order of remaining words unchanged
    public void removeWordsOfLength(int len) { 
	for (int k = 0; k < myList.size(); k++) {
	    if ( (myList.get(k)).length() == len) {
		myList.remove(k);
		k--;
	    }
	}
    }

    //... constructor and other methods not shown
}


/*========================================
QUESTION 1A: Write the WordList method numWordsOfLength. 
Method numWordsOfLength returns the number of words in the WordList that 
are exactly len letters long. For example, assume that the instance 
variable myList of the WordList animals contains the following.
    ["cat", "mouse", "frog", "dog", "dog"] 

The table below shows several sample calls to numWordsOfLength.

Call                                    Result returned by call
animals.numWordsOfLength(4)             1
animals.numWordsOfLength(3)             3
animals.numWordsOfLength(2)             0

Complete method numWordsOfLength below.
========================================*/


//postcond: returns the number of words in this WordList that 
//          are exactly len letters long 
//public int numWordsOfLength(int len) {




/*========================================
QUESTION 1B: Write the WordList method removeWordsOfLength. 
Method removeWordsOfLength removes all words from the WordList that are exactly 
len letters long, leaving the order of the remaining words unchanged. 
For example, assume that the instance variable myList of the WordList 
animals contains the following.
    ["cat", "mouse", "frog", "dog", "dog"] 

The table below shows a sequence of calls to the removeWordsOfLength method.

Call                                   myList after the call 
animals.removeWordsOfLength(4);        ["cat", "mouse", "dog", "dog"] 
animals.removeWordsOfLength(3);        ["mouse"] 
animals.removeWordsOfLength(2);        ["mouse"]

Complete method removeWordsOfLength below.
========================================*/


//postcond: all words that are exactly len letters long 
//          have been removed from this WordList, with the 
//          order of the remaining words unchanged 
//public void removeWordsOfLength(int len) { 


