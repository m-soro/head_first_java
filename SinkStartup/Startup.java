import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells; // Startup's instance variables
    private String name; // An ArrayList of cell locations and the Startup's name

    public void setLocationCells(ArrayList<String> loc) { // A setter method that updates the Startup's location. (Random location
        locationCells = loc; // provided by the GameHelper placeStartup() method).
    }

    public void setName(String n) { // A basic setter method
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput); // The ArrayList indexOf() method in action! If the user guess
        // is one of the entries in the ArrayList, indexOf() will return its ArrayList location. If not, indexOf will return -1.
        if (index >= 0) {
            locationCells.remove(index); // Using the ArrayList method remove() to delete an entry.

            if (locationCells.isEmpty()) { // Using the isEmpty method to see if all the locations have been guessed.
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " :( "); // Tell the user when a Startup has been sunk.
            } else {
                result = "hit";
            } // end if 
        } // end outer if
        return result; // Return "hit", "miss", or "kill"
    } //end method
} // end class
