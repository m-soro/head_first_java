import java.util.ArrayList;

public class StartupBust {
    // Declare and intialize the variables we'll need.
    private GameHelper helper = new GameHelper();
    private  ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuess = 0;

    private void setUpGame() {
        // Make three Startup objects, give them names, and stick them in the ArrayList
        // first make some Startups and give them locations
        Startup one = new Startup();
        one.setName("NancyBiz");
        Startup two = new Startup();
        two.setName("BoyBiz");
        Startup three = new Startup();
        three.setName("EggBiz");
        startups.add(one);
        startups.add(two);
        startups.add(three);
    
        System.out.println("Your goal is to sink three startups"); // Print brief instructions to the user
        System.out.println("NancyBiz, BoyBiz, EggBiz");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (Startup startup : startups) { // Repeat with each startup in the list
            ArrayList<String> newLocation = helper.placeStartup(3); // Ask the helper for a Startup location (an ArrayList of Strings).
            startup.setLocationCells(newLocation); // Call the setter method on this Startup to give it the location you just got from the helper.
        } // close for loop
    }  // close setUpGame method

    private void startPlaying() { // As long as the Startup list is not empty (The ! means NOT, it's the same as (startups.isEmpty() == false))
        while ( !startups.isEmpty() ) {
            String userGuess = helper.getUserInput("Enter a guess"); // Get user input
            checkUserGuess(userGuess); // Call our own checkUserGuess method.
        } // close while
        finishGame(); // Call our own finish game method.
    } // close startPlaying method

    private void checkUserGuess(String userGuess) {
        numOfGuess++; // Increment the number of user guesses the user made
        String result = "miss"; // Assume its a miss, unless told otherwise

        for (Startup startupToTest : startups) { // Repeat with all the startups in the list
            result = startupToTest.checkYourself(userGuess); // Ask the Startup to check the user guess, looking for a hit(or kill). 

            if (result.equals("hit")) { // Get out of the loop early, there is no point in testing others
                break;
            } 
            if (result.equals("kill")) { // This one's dead so take it out of the startups list then get out of the loop
                startups.remove(startupToTest);
                break;
            }
        } // close for
        System.out.println(result); // print the result for the user
    } // close method

    private void finishGame() { // Print a message for the user how they did in the game.
        System.out.println("All the startups are dead! Your stock is now worthless!");
        if (numOfGuess <= 18) {
            System.out.println("It only took you " + numOfGuess + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough " + numOfGuess + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    } // close method

    public static void main(String[] args) {
        StartupBust game = new StartupBust(); // Create the game object
        game.setUpGame(); // Tell the game obect to set up a game
        game.startPlaying(); // Thell the game object to start the main game play loop(keep asking for user input and checking the guess)
    } // close method
}
