//Write a program that simulates a simple game. Implement a method that throws a 'GameLostException' when the player loses the game.Use try-catch blocks to manage the game's flow and catch the 'GameLostException' when necessary.
package practice_java;


	class GameLostException extends Exception {
	    public GameLostException(String message) {
	        super(message);
	    }
	}

	public class pratice2811 {
	    public static void playGame() throws GameLostException {
	        int playerScore = 0;
	        int maxScore = 10;  
	        
	        while (playerScore < maxScore) {
	            try {
	                
	                playerScore--;
	                
	                if (playerScore < -5) {
	                    throw new GameLostException("You lost the game!");
	                }
	                
	                System.out.println("Current Score: " + playerScore);
	                
	                
	                playerScore++;
	            } catch (GameLostException e) {
	                System.out.println("Caught Exception: " + e.getMessage());
	              
	                break;  
	            }
	        }
	        
	        if (playerScore >= maxScore) {
	            System.out.println("Congratulations! You won the game!");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            playGame();
	        } catch (GameLostException e) {
	            System.out.println("Main caught Exception: " + e.getMessage());
	        }
	    }
	}


