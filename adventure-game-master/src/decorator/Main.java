package decorator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is your name: ");
        String name = keyboard.nextLine();
        Character character = new BasicCharacter(name);
        
        int choice = 0;
        int actionCount = 0;
        
        while (choice != 6)
        {
            System.out.println("What would you like to do " + character.getName() + "?");
            System.out.println("1: Open the first chest.");
            System.out.println("2: Open the second chest.");
            System.out.println("3: Open the third chest.");
            System.out.println("4: Open the fourth chest.");
            System.out.println("5: Fight the boss");
            System.out.println("6: Exit the game");
            choice = keyboard.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("You got a sword.");
                    character = new Sword(new BasicCharacter(name));
                    System.out.println("Your might is: " + character.getMight());
                    break;
                case 2:
                    System.out.println("You got a spear.");
                    character = new Spear(new BasicCharacter(name));
                    System.out.println("Your might is: " + character.getMight());
                    break;
                case 3:
                    System.out.println("You got a shield.");
                    character = new Shield(new BasicCharacter(name));
                    System.out.println("Your might is: " + character.getMight());
                    break; 
                case 4:
                    System.out.println("You where hit with a hunger spell.");
                    character = new Starving(new BasicCharacter(name));
                    System.out.println("Your might is: " + character.getMight());                    
                    actionCount = 0;
                    break;
                case 5:
                    if (character.getMight() > 5) {
                        System.out.println("You defeated the boss.");
                    }
                    else {
                        System.out.println("The boss defeated you.");
                    }
                default:
                    break;
            }
        }
                
              
    }
}
