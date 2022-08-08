import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String guestGreeting = String.format("Hello, %s. Lovely to see you.", name);
        return guestGreeting;
    }

    public String guestGreeting(String firstName, String lastName) {
        String guestGreeting = String.format("Hello, %s %s. Lovely to see you.", firstName, lastName);
        return guestGreeting;
    }


    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }
        
    }
}  
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
