import java.util.*;

// Peter Daniel, 10/13/25
public class PetSelectorProject{
    public static void main(String [] args){
        //ask the user for input (name, season, and color)
        //make sure the input is valid (Idiot Proof!)
        //make a decision
        //tell the user what they get
        //for scanner, use .nextLine
        
        //The messages will prompt the user what to type in the terminal, and will use .nextLine().toLowerCase() in order to locate what was put into the terminal, .
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type in your first name and press enter.");
        String userName = userInput.nextLine().toLowerCase();
        System.out.println("Please type in your favorite color (Either red, green, or blue.) and press enter.");
        String userColor = userInput.nextLine().toLowerCase();
        System.out.println("Please type in your favorite season (Either winter, spring, summer, or fall.) and press enter.");
        String userSeason = userInput.nextLine().toLowerCase();
        System.out.println("Name = " + userName);
        System.out.println("Color = " + userColor);
        System.out.println("Season = " + userSeason);

        //Gets the first letter of the user's name.
        String nameFirstLetter = userName.substring(0, 1);
        
        String vowelList = "aeoiu";
        String consonantsList = "bcdfghjklmnpqrstvwxyz";

        if (vowelList.contains(nameFirstLetter)){
            System.out.println("first letter is a vowel. ");
        }

        else if (consonantsList.contains(nameFirstLetter)){
            System.out.println("first letter is a consonant. ");
        }
        else{
            System.out.println("Your perfect pet is: Rock");
        }
        




    }

}
