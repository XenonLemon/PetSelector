import java.util.*;

// Peter Daniel, 10/13/25, This program will ask the user their name, favorite season, and favorite color, and will determine from those inputs the user's selected pet.
public class PetSelectorProject{
    public static void main(String [] args){
        //ask the user for input (name, season, and color)
        //make sure the input is valid (Idiot Proof!)
        //make a decision
        //tell the user what they get
        //for scanner, use .nextLine()
        
        //The messages will prompt the user what to type in the terminal, and will use .nextLine().toLowerCase().trim() in order to locate what was put into the terminal, make the input lowercase, and trim the message.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type in your first name and press enter.");
        String userName = userInput.nextLine().toLowerCase().trim();
        System.out.println("Please type in your favorite color (Either red, green, or blue.) and press enter.");
        String userColor = userInput.nextLine().toLowerCase().trim();
        System.out.println("Please type in your favorite season (Either winter, spring, summer, or fall.) and press enter.");
        String userSeason = userInput.nextLine().toLowerCase().trim();
        

        //Gets the first letter of the user's name that was typed in.
        String nameFirstLetter = userName.substring(0, 1);
        
        //Lists to have a reference for what a vowel and what a consonant is.
        String vowelList = "aeoiu";
        String consonantsList = "bcdfghjklmnpqrstvwxyz";

        //If statements if the name has a vowel as the first letter.
        if (vowelList.contains(nameFirstLetter)){
            if (userColor.equals("red")){
               System.out.println("Your perfect pet is: Porcupine!"); 
            }
            else if (userColor.equals("blue")){
                if(userSeason.equals("summer")){
                    System.out.println("Your perfect pet is: Pony!");  
                }
                else{
                    System.out.println("Your perfect pet is: Rock!");
                }
            
            }
            else if (userColor.equals("green")){
                if(userSeason.equals("spring")){
                     System.out.println("Your perfect pet is: Dog!"); 
                }
                else{
                    System.out.println("Your perfect pet is: Rock!");
                }
            }
            else{
            System.out.println("Your perfect pet is: Rock!");
        }
        }
        
        //If statements if the name has a consonant as the first letter.
        else if (consonantsList.contains(nameFirstLetter)){
            if (userColor.equals("red")){
               System.out.println("Your perfect pet is: Panda!"); 
            }
            else if (userColor.equals("blue")){
                if(userSeason.equals("fall")){
                     System.out.println("Your perfect pet is: Alligator!"); 
                }
                else if(userSeason.equals("spring")){
                     System.out.println("Your perfect pet is: Ostrich!"); 
                }
                else if(userSeason.equals("winter")){
                     System.out.println("Your perfect pet is: Axolotl!"); 
                }
                else if(userSeason.equals("summer")){
                     System.out.println("Your perfect pet is: Pony!"); 
                }
                else{
                     System.out.println("Your perfect pet is: Rock!");
                 }
            }
            else if(userColor.equals("green")){
                if(userSeason.equals("winter")){
                     System.out.println("Your perfect pet is: Giraffe!"); 
                }
                else if(userSeason.equals("spring")){
                     System.out.println("Your perfect pet is: Dog!"); 
                }
                else if(userSeason.equals("summer")){
                     System.out.println("Your perfect pet is: Dog!"); 
                }
                else{
                     System.out.println("Your perfect pet is: Rock!");
                }
                
            }
            else{
            System.out.println("Your perfect pet is: Rock!");
        }
        }

        //If no condition is met from the previous if statements.
        else{
            System.out.println("Your perfect pet is: Rock!");
        }
        

    }

}
