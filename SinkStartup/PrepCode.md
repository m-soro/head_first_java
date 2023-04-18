VARIABLE DECLARATIONS  
    * DECLARE and instantiate the GameHelper instance variable, named helper
    * DECLARE and instantiate an ArrayList to hold the list of Startups(initially three). Call it startups.
    * DECLARE an int variable to hold the number of user guesses(so that we can give the user a score at the end of   the game). Name it numOfGuesses and set it to 0.

METHOD DECLARATIONS
    * DECLARE a setUpGame() method to create and initialize the Startup obects with names and locations. Display brief instructions to the user.
    
    * DECLARE a startPlaying() method that asks the player for guesses and calls the checkUserGuess() method until all Startup objects are removed from the play.
    
    * DECLARE a checkUserGuess() method that loops through all the remaining Startup objects and calls each Startup object's checkYourself() method.
    
    * DECLARE a finishGame() method that prints a message about the user's performance, based on how many guesses it took to sink all of Startup objects.

METHOD IMPLEMENTATIONS
    
    METHOD: void setUpGame()
        // make three Startup objects and name them.
        CREATE three Startup objects.
        SET a name for each Startup.
        ADD the Startups to startups (the ArrayLists).
        REPEAT with each of the Startup objects in the startup List:
            CALL the placeStartup() method on the helper object, to get a randomly selected location for this Startup(three cells, vertically or horizontally alined, 7x7 grid)
            SET the location for each Startup based on the result of the placeStartup() call.
        END REPEAT
    END METHOD

    METHOD: void startPlaying()
        REPEAT while any Startups exists.
            GET user input by calling the helper getUserInput() method.
            EVALUATE the user's guess by checkUserGuess() method.
        END REPEAT
    END METHOD

    METHOD: checkUserGuess(String userGuess)
        // find out if there's a hit (and kill) on any Startup
        INCREMENT the number of user guesses in the numOfGuesses variable.
        SET the local result variable (a String) to "miss", assuming that the user's guess will be a miss.
        REPEAT with each Startup objects in the startup list.
            EVALUATE the user's guess by calling the Startup object's checkYourself() method.
            SET the variable result to "hit" or "kill" if appropriate.
            IF the result if "kill", REMOVE the Startup from the startups List.
        END REPEAT
        DISPLAY the result value to the user.
    END METHOD

    METHOD: void finishGame()
        DISPLAY a generic "game over" message the:
            IF the numer of user guesses is small,
                DISPLAY a congratulations message.
            ELSE
                DISPLAY an insulting one
            END IF
        END METHOD                                   


