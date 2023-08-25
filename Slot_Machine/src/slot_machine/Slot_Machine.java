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
     * This is a slot machine
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        int tokenCount = 5;
        boolean quitGame = false;

        welcome();

        while (tokenCount > 0 && quitGame == false) {
            tokenCount--;
            tokenCount = play_slots(tokenCount);
            System.out.println("The token count is : " + tokenCount);
            System.out.println("Spin again <CR> or Quit (Q): ");
            String input = userInput().toUpperCase();
            if(input.equals("Q")){
                quitGame = true;
            }


        }
        System.out.println("*** No Tokens Left ***\nThanks you for playing.");

    }


    public static void welcome(){
        System.out.print("\nWelcome to the FDSE Slots Game\n*************************************\n\t\tEach Spin of the" +
                " Slot Machine costs 1 token\n\t\tYou can quit the game at any time by entering <Q>\n\t\tThe game is " +
                "automatically over when all tokens have been spent\n\nWinning:\n\t\t\t&&& wins 3 tokens\n\t\t\t$$$ wins 4 tokens" +
                "\n\t\t\t£££ wins 5 tokens\n\t\t\t3 symbols all different in any order wins 1 token\nPress <CR> to continue...");
        userInput();

    }

    public static int play_slots(int tokenCount){
        int winnings = 0;
        String randomSymbol1 = randomSymbol();
        String randomSymbol2 = randomSymbol();
        String randomSymbol3 = randomSymbol();

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


        System.out.println("You have " + tokenCount + " token(s) left\n\n\t\t\t***********\n\t\t\t|" + randomSymbol1 + "|" +
                randomSymbol2 + "|" + randomSymbol3 + "|\n\t\t\t***********\n\n");
        if(winnings != 0) {
            System.out.println("*** Congratulations you won " + winnings + " token ***");
        }else{
            System.out.println("*** No Win this Spin ***");
        }

        return (tokenCount + winnings);
    }

    public static String randomSymbol(){
        String playerSymbol = "";
        int num = 0;
        Random random = new Random();
        while(true) {
            num = random.nextInt(4);
            if(num != 0) break;
        }

        if(num == 1){
            playerSymbol = "&";
        }else if (num == 2){
            playerSymbol = "$";
        }else if (num == 3){
            playerSymbol = "£";
        }else{
            playerSymbol = "Error";
        }

        return playerSymbol;
    }

    public static String userInput(){
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        return input;
    }
    
}
