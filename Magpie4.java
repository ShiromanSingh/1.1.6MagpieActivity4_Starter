/**
 * A program to carry on conversations with a human user.
 * This version: Final
 *<ul><li>
 * 		Uses advanced search for keywords 
 *</li><li>
 * 		Will transform statements as well as react to keywords
 *</li></ul>
 * @authors Shiroman Singh, Abigale Kim
 * @version December 2016
 * Domain: Sports chatbot which is expert on Golden State Warriors NBA team.
 */
public class Magpie4
{
    /**
     * Get a default greeting 	
     * @return a greeting
     */	
    public String getGreeting()
    {
        return "Hello, would you like to have a conversation?";
    }

    public String getEnding()
    {
        return "Good Bye, have a nice day!";
    } //Unique method

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
        if (statement.length() == 0) //Null imput/random/probing response start
        {
            response = "Say something, please.";
        }

        else if (findKeyword(statement, "hello") >= 0)
        {
            response = "Hello, how's your day?";
        }
        else if (findKeyword(statement, "How's your day?") >= 0)
        {
            response = "My day has been fine so far.";
        }
        else if (findKeyword(statement, "What is your name?") >= 0)
        {
            response = "My name is SportsAssist";
            //End Null input/random/probing response
        } //Begin context based responses
        else if (findKeyword(statement, "Where Warriors play") >= 0
        || findKeyword(statement, "Where") >= 0
        || findKeyword(statement, "Warriors play") >=0)
        {
            response = "The Golden State Warriors play at Oracle Arena in Oakland, California.";
        }
        else if (findKeyword(statement, "your age") >= 0
        || findKeyword(statement, "are you") >= 0
        || findKeyword(statement, "your name") >= 0
        || findKeyword(statement, "are you a fan?") >= 0)
        {
            response = "I do not know; I am just an innocent, unbiased chatbot.";
        }
        else if (findKeyword(statement, "How Warriors do last season") >=0
        || findKeyword(statement, "How") >= 0
        || findKeyword(statement, "Warriors do last season") >0)
        {
            response = "The Golden State Warriors finished 73-9, garnering the first overall seed in the NBA";
        }
        else if (findKeyword(statement, "Who is Warriors coach") >= 0
        || findKeyword(statement, "Who is") >= 0
        || findKeyword(statement, "head coach") >= 0)
        {
            response = "Steve Kerr is the head coach of the Golden State Warriors.";
        }
        else if (findKeyword(statement, "New players") >= 0
        || findKeyword(statement, "new players") >= 0
        || findKeyword(statement, "new additions") >= 0
        || findKeyword(statement, "new add ons") >= 0)
        {
            response = "The new players on the Golden State Warriors are Kevin Durant, Zaza Pachulia, David West, and Javale McGee.";
        }
        else if (findKeyword(statement, "rookies") >= 0
        || findKeyword(statement, "rookies") >= 0
        || findKeyword(statement, "youngest players") >= 0)
        {
            response = "The rookies on the Golden State Warriors are Patrick McCaw and Damian Jones.";
        }
        else if (findKeyword(statement, "rivals") >= 0
        || findKeyword(statement, "rivals") >= 0
        || findKeyword(statement, "rival teams") >= 0
        || findKeyword(statement, "rivalry") >= 0
        || findKeyword(statement, "rivalries") >= 0)
        {
            response = "The rivals of the Golden State Warriors include the Los Angeles Clippers, Portland Trailblazers, and Cleveland Cavaliers.";
        }
        else if (findKeyword(statement, "awards won") >= 0
        || findKeyword(statement, "awards") >= 0
        || findKeyword(statement, "awards by Warriors players") >= 0
        || findKeyword(statement, "awards won by Warriors last season") >= 0
        || findKeyword(statement, "awards last season") >= 0)
        {
            response = "The Golden State Warriors' coach Steve Kerr won the Coach of the Year and point guard Stephen Curry won MVP last season.";
        }
        else if (findKeyword(statement, "MVP") >= 0
        || findKeyword(statement, "award") >= 0
        || findKeyword(statement, "highest individual awards") >= 0
        || findKeyword(statement, "who is MVP") >= 0
        || findKeyword(statement, "MVP") >= 0
        || findKeyword(statement, "Most Valuable Player") >= 0)
        {
            response = "Stephen Curry has won MVP the last two seasons for the Golden State Warriors (2014-15, 2015-16). Kevin Durant won MVP in 2013-14.";
        }
        else if (findKeyword(statement, "MVP Stephen Curry") >= 0
        || findKeyword(statement, "MVP award") >= 0
        || findKeyword(statement, "Stephen Curry MVPs") >= 0
        || findKeyword(statement, "who is MVP on currently?") >= 0)

        {
            response = "Stephen Curry has two MVP awards, won in 2014-15 and 2015-16";
        }
        else if (findKeyword(statement, "Stephen Curry stats") >= 0)
        {
            response = "Stephen Curry’s statistics last season were 30.1 PPG, 6.7 APG, 5.4 RPG, 2.1 SPG.";
        }
        else if (findKeyword(statement, "Kevin Durant stats") >= 0)
        {
            response = "Kevin Durant’s statistics last season were 28.2 PPG, 5.0 APG, 8.2 RPG, 1.0 SPG.";
        }
        else if (findKeyword(statement, "Klay Thompson stats") >= 0)
        {
            response = "Klay Thompson’s statistics last season were 22.1 PPG, 2.1 APG, 3.8 RPG, 0.8 SPG.";
        }
        else if (findKeyword(statement, "Draymond Green stats") >= 0)
        {
            response = "Draymond Green’s statistics last season were 14.0 PPG, 7.4 APG, 9.5 RPG, 1.5 SPG.";
        }
        else if (findKeyword(statement, "Warriors last championship") >= 0
        || findKeyword(statement, "Warriors last champtionsip") >= 0
        || findKeyword(statement, "Warriors last title") >= 0
        || findKeyword(statement, "When did the Warriors last win the NBA championship?") >= 0
        || findKeyword(statement, "When did the Warriors last win the title?") >= 0
        || findKeyword(statement, "When did the warriors last win a championship?") >= 0)

        {
            response = "The Golden State Warriors last won the NBA Championship in 2015, defeating the Cleveland Cavaliers.";
        }
        else if (findKeyword(statement, "Stephen Curry height") >= 0)
        {
            response = "Stephen Curry is 6'3''.";
        }
        else if (findKeyword(statement, "Klay Thompson height") >= 0)
        {
            response = "Klay Thompson is 6'7''.";
        }
        else if (findKeyword(statement, "Kevin Durant height") >= 0)
        {
            response = "Kevin Durant is 6'10''.";
        }
        else if (findKeyword(statement, "Draymond Green height") >= 0)
        {
            response = "Draymond Green is 6'7''.";
        }
        

        // Responses which require transformations
        else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }
        else if (findKeyword(statement, "Warriors this season") >= 0
        || findKeyword(statement, "Warriors this season") >= 0
        || findKeyword(statement, "Warriors record this season") >= 0)

        {
            response = "For the most up to date information on the 2016-17 NBA season, please visit nba.com. ";
        }
        else if (findKeyword(statement, "When was Stephen Curry drafted?") >= 0)
        {
            response = "Stephen Curry was drafted in 2009 by the Golden State Warriors.";
        }
        else if (findKeyword(statement, "When was Klay Thompson drafted?") >= 0)
        {
            response = "Klay Thompson was drafted in 2011 by the Golden State Warriors.";
        }
        else if (findKeyword(statement, "When was Kevin Durant drafted?") >= 0)
        {
            response = "Kevin Durant was drafted in 2007 by the Seattle SuperSonics.";
        }
        else if (findKeyword(statement, "When was Draymond Green drafted?") >= 0)
        {
            response = "Draymond Green was drafted in 2012 by the Golden State Warriors.";
        }
        else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }
        else if (findKeyword(statement, "Warriors conference") >= 0
        || findKeyword(statement, "What conference do the Warriors play in") >= 0
        || findKeyword(statement, "Warriors conference") >= 0)

        {
            response = "The Golden State Warriors play in the NBA’s Western conference.";
        }
        else if (findKeyword(statement, "Warriors division") >= 0
        || findKeyword(statement, "What division do the Warriors play in") >= 0
        || findKeyword(statement, "Warriors division") >= 0)

        {
            response = "The Golden State Warriors play in the NBA’s Pacific Division.";
        }
        //End context based responses 
        else
        {
     
            int psn = findKeyword(statement, "you", 0);

            if (psn >= 0
            && findKeyword(statement, "me", psn) >= 0)
            {
                response = transformYouMeStatement(statement);
            }
            else
            {
                response = getRandomResponse();
            }
        }
        return response;
    }

    /**
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    private String transformIWantToStatement(String statement)
    {
        // Start transposition responses
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }
        int psn = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "Would you like to " + restOfStatement + "?";
               
    }

    /**
     * Take a statement with "you <something> me" and transform it into 
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    private String transformYouMeStatement(String statement)
    {
     
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }

        int psnOfYou = findKeyword (statement, "you", 0);
        int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);

        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
        //End transposition responses
    }

    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  
     * @param statement the string to search
     * @param goal the string to search for
     * @param startPos the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

        //  Refinement--make sure the goal isn't part of a word 
        while (psn >= 0) 
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " "; 
            if (psn > 0)
            {
                before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }

            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
            && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return psn;
            }

            //  The last position didn't work, so let's find the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 10;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        //Begin random responses
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Why?";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "Tell me more";
        }
        else if (whichResponse == 4)
        {
            response = "That sounds interesting!";
        }
        else if (whichResponse == 5)
        {
            response = "That's pretty good.";
        }
        else if (whichResponse == 6)
        {
            response = "Ask me another question";
        }
        else if (whichResponse == 7)
        {
            response = "Cool idea!";
        }
        else if (whichResponse == 8)
        {
            response = "Interesting point";
        }
        else if (whichResponse == 9)
        {
            response = "I do not understand; please clarify";
        }
        else if (whichResponse == 10)
        {
            response = "That's awesome";
        }
        //Finish random responses

        return response;

    }

}
