/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot_machine;

import java.util.Random;
import java.util.Scanner;

/**
 * SDK Version 18.0.1
 * @author Roy Ferguson
 */
public class Slot_Machine {

    /**
     * This is a slot machine game.
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        // The number of tokens a user is allowed per game.
        int tokenCount = 5;
        // If the user manually quits slot machine game.
        boolean quitGame = false;

        // Runs Method/Function called welcome
        welcome();

        // While loop so the game keeps going until user runs out of tokens or quits the game.
        while (tokenCount > 0 && quitGame == false) {
            // Loses one token per spin
            tokenCount--;
            // Calls another method/function called play_slots which updates the tokenCount
            tokenCount = play_slots(tokenCount);
            // Output the number of tokens the user has.
            System.out.println("The token count is : " + tokenCount);
            System.out.println("Spin again <CR> or Quit (Q): ");
            // Gets the users input on whether they want to spin again or not.
            String input = userInput().toUpperCase();
            // If Q is entered to quit the quitGame status is set to true meaning game is over
            if(input.equals("Q")){
                quitGame = true;
            }


        } // End While Loop
        System.out.println("*** No Tokens Left ***\nThanks you for playing.");

    }


    public static void welcome(){
        // Outputs information for the user playing the slot machine.
        System.out.print("\nWelcome to the FDSE Slots Game\n*************************************\n\t\tEach Spin of the" +
                " Slot Machine costs 1 token\n\t\tYou can quit the game at any time by entering <Q>\n\t\tThe game is " +
                "automatically over when all tokens have been spent\n\nWinning:\n\t\t\t&&& wins 3 tokens\n\t\t\t$$$ wins 4 tokens" +
                "\n\t\t\t£££ wins 5 tokens\n\t\t\t3 symbols all different in any order wins 1 token\nPress <CR> to continue...");
        // Calls a method/function userInput - Used to get users input.
        // Put the Scanner 'Input' inside a function so you don't have to repeat Scanner over and over again in different
        // Methods/Functions.
        userInput();

    }

    public static int play_slots(int tokenCount){
        // Initialising the winnings variable.
        int winnings = 0;

        // Storing the three random symbols by calling the randomSymbol method/function
        String randomSymbol1 = randomSymbol();
        String randomSymbol2 = randomSymbol();
        String randomSymbol3 = randomSymbol();

        // Depending on the symbols, it will set the winnings.
        if(randomSymbol1.equals("&") && randomSymbol2.equals("&") && randomSymbol3.equals("&")){
            winnings = 3;
        }else if (randomSymbol1.equals("$") && randomSymbol2.equals("$") && randomSymbol3.equals("$")){
            winnings = 4;
        }else if(randomSymbol1.equals("£") && randomSymbol2.equals("£") && randomSymbol3.equals("£")){
            winnings = 5;
        }else if(randomSymbol1.equals("£") && randomSymbol2.equals("&") && randomSymbol3.equals("$")){
            winnings = 1;
        }else if(randomSymbol1.equals("£") && randomSymbol2.equals("$") && randomSymbol3.equals("&")){
            winnings = 1;
        }else if(randomSymbol1.equals("&") && randomSymbol2.equals("£") && randomSymbol3.equals("$")){
            winnings = 1;
        }else if(randomSymbol1.equals("&") && randomSymbol2.equals("$") && randomSymbol3.equals("£")){
            winnings = 1;
        }else if(randomSymbol1.equals("$") && randomSymbol2.equals("£") && randomSymbol3.equals("&")){
            winnings = 1;
        }else if(randomSymbol1.equals("$") && randomSymbol2.equals("&") && randomSymbol3.equals("£")){
            winnings = 1;
        }else {
            winnings = 0;
        }

        // Output to let you know how many tokens are left as well as what the three random symbols where.
        System.out.println("You have " + tokenCount + " token(s) left\n\n\t\t\t***********\n\t\t\t|" + randomSymbol1 + "|" +
                randomSymbol2 + "|" + randomSymbol3 + "|\n\t\t\t***********\n\n");
        // If you get anything other than zero winnings you will get a congratulations message.
        if(winnings != 0) {
            System.out.println("*** Congratulations you won " + winnings + " token ***");
        }else{
            // If you get zero winnings.
            System.out.println("*** No Win this Spin ***");
        }
        // Returning the new tokenCount
        return (tokenCount + winnings);
    }

    public static String randomSymbol(){
        // Initialising playerSymbol and num
        String playerSymbol = "";
        int num = 0;

        // Creating a random number
        Random random = new Random();

        while(true) {
            // Random number will either be 0,1,2,3
            num = random.nextInt(4);
            // If it is zero the while loop repeats it's self again until the random number is not zero.
            // Then it breaks while loop.
            if(num != 0) break;
        }

        // Each number is represented by a symbol.
        if(num == 1){
            playerSymbol = "&";
        }else if (num == 2){
            playerSymbol = "$";
        }else if (num == 3){
            playerSymbol = "£";
        }else{
            playerSymbol = "Error";
        }

        // Returning the Symbol
        return playerSymbol;
    }

    public static String userInput(){
        // To get users input.
        // Created this method/function so you are not constantly having to repeat the same two lines of code.
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        return input;
    }
    
}
