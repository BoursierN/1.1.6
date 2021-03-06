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
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public void findKeyword(String statement, String lookingFor)
    {
        int initSize = statement.length();
        statement = statement.toLowerCase();
        lookingFor = lookingFor.toLowerCase();
        for(int i = 0; i<statement.length()-lookingFor.length()+1; i++){
            if(statement.substring(i, i + lookingFor.length()).equals(lookingFor)){
                System.out.print(i);
                System.out.print(" & ");
            }
            else {
                //System.out.print(" & ");
            }
        }
    }
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0
				|| statement.indexOf("bird") >= 0
				|| statement.indexOf("fish") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Kaehms") >= 0)
		{
			response = "Great teacher, 10/10.";
		}
		else if (statement.indexOf("science") >= 0
				|| statement.indexOf("math") >= 0
				|| statement.indexOf("english") >= 0
				|| statement.indexOf("history") >= 0)
		{
			response = "Tell me about your favorite class.";
		}
		else if (statement.indexOf("america") >= 0
				|| statement.indexOf("russia") >= 0
				|| statement.indexOf("mexico") >= 0
				|| statement.indexOf("canada") >= 0)
		{
			response = "Tell me more about where you're from.";
		}
		else if (statement.trim().length() == 0)
		{
			response = "Say something!";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "I'm not listening to anything you say really, so stop unless you want to just keep wasting your life.";
		}
		else if (whichResponse == 5)
		{
			response = "Oh really?.";
		}

		return response;
	}
}
