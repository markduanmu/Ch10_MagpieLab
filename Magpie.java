/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting() //first reply (first thing on screen, before user types)
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) //public String method, user enters a string
	{
		String response = "";
		if (statement.indexOf("no") >= 0) //if the user-entered string includes "no":
		{
			response = "Don't say no! Be positive."; //modified  response, return "Don't say no! Be positive."
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0) //if user-entered string includes mother or father
		{
			response = "Tell me more about your parents."; //modified response
		}
		else if (statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) //if user-entered string includes sister or brother
		{
			response = "Tell me about your siblings"; //modified response
		}
		else if (statement.trim().length()==0) //if length of user-entered string (after trimming spaces) is zero:
		{
			response = "Say something, please."; //prompts user to say something
		}
		else if (statement.indexOf("Mr. Lin") >= 0) //if user-entered string includes "Mr. Lin"
		{
			response = "He sounds like a good teacher."; //compliment Mr. Lin (because he's the best)
			
		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0) //if user-entered string includes cat or dog
		{
			response = "Tell me more about your pets."; //returns "Tell me more about your pets."
			
		}
		else 
		{
			response = getRandomResponse(); //if there's no keyword in user-entered string, calls on getRandomResponse method below for non-commital response.
		}
		return response; //returns the response
	
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse() //returns a random reply 
	{
		final int NUMBER_OF_RESPONSES = 6; //6 possible responses
		double r = Math.random(); //random number generator from 0 to 1
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES); //sets response number to random int from 0 to 6
		String response = ""; //initializes variable
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more."; //first non-commital response
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm."; //second non-commital response
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?"; //third non-commital response
		}
		else if (whichResponse == 3)
		{
			response = "You don't say."; //fourth non-commital response
		}
		else if (whichResponse == 4)
		{
			response = "So what?"; //fifth non-commital response, created this myself
		}
		else if (whichResponse == 5)
		{
			response = "I don't care."; //sixth non-commital response, created this myself
		}

		return response; //returns random response (1 of the 6)
	}
}
