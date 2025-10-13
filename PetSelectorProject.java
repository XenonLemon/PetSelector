// Peter Daniel, 10/13/25
import java.util.*;

public class PetSelectorProject{
    public static void main(String [] args){
        //ask the user for input (name, season, and color)
        //make sure the input is valid (Idiot Proof!)
        //make a decision
        //tell the user what they get
        //for scanner, use .nextLine
        
        //The messages will prompt the user what to type in the terminal, and will use .nextLine in order to locate what was put into the terminal.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type in your first name and press enter.");
        String userName = userInput.nextLine();
        System.out.println("Please type in your favorite color (Either red, green, or blue.) and press enter.");
        String userColor = userInput.nextLine();
        System.out.println("Please type in your favorite season (Either winter, spring, summer, or fall.) and press enter.");
        String userSeason = userInput.nextLine();
        System.out.println("Name = " + userName);
        System.out.println("Color = " + userColor);
        System.out.println("Season = " + userSeason);




    }

}
