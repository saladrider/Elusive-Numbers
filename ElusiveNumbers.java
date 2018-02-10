/**
 * Author: Tyler Knight
 * Date Created: 02/07/2018
 * Program Purpose: Guessing game using
 * random numbers.
 **/


//Importing random and scanner classes
import java.util.Random;
import java.util.Scanner;
//
public class ElusiveNumbers {

    public static void main(String[] args) {

        //Declare variables
        Random num = new Random();
        int userInput;
        int answer;
        int count;
        int attempts;
        int restart;
        int terminate;
        int range;
        Scanner keyboard = new Scanner(System.in);

        //Whitespace
        System.out.println();
        System.out.println();

        try {

            //Greeting Message
            System.out.println("Welcome To Elusive Numbers!");

            //Whitespace
            System.out.println();

            //Prompt user to enter number range
            System.out.println("Enter the range of numbers you would like to guess from. EX: 5, 10, 100, 1000");
            //Whitespace
            System.out.println();

            //Allows User To Enter Range
            range = keyboard.nextInt();

            //Whitespace
            System.out.println();

            //Prompt user to enter in however many chances they would like to have
            System.out.println("Enter the amount of attempts you would like for this challenge");
            //Whitespace
            System.out.println();

            //Allows user to set amount of attempts
            attempts = keyboard.nextInt() - 1;

            //Whitespace
            System.out.println();

            //Prompt user to guess the number
            System.out.println("Enter a number between 1 and " + range);

            //Whitespace
            System.out.println();
            System.out.println();

            //Assign value to variables
            answer = num.nextInt(range) + 1;
            count = 0;



            /*
            * While the user input is not equal to the random generated number,
            * it will tell the user if their number was too high or too low,
            * it will also add 1 to the count variable every time user is wrong,
            * if the count variable becomes equal to 3 "Game Over" will display,
            * the user will then have the chance to try again or exit the game
            */


            do {
                userInput = keyboard.nextInt();
                restart = 1;
                terminate = 0;

                if (count >= attempts && userInput != answer) {
                    //
                    if (userInput < answer) {
                        //Whitespace
                        System.out.println();
                        System.out.println("Too Low!");

                    } else if (userInput > answer) {
                        //Whitespace
                        System.out.println();
                        System.out.println("Too High!");
                    }
                    //Whitespace
                    System.out.println();
                    System.out.println("Game Over!");

                    //Whitespace
                    System.out.println();

                    System.out.println("To try again, type 1, to quit type 0");
                    //Whitespace
                    System.out.println();

                    userInput = keyboard.nextInt();
                    //Whitespace
                    System.out.println();

                    if (userInput == restart) {
                        count = 0;
                        answer = num.nextInt(range) + 1;

                        System.out.println("Enter the range of numbers you would like to guess from. EX: 5, 10, 100, 1000");
                        //Whitespace
                        System.out.println();

                        range = keyboard.nextInt();

                        //Whitespace
                        System.out.println();

                        System.out.println("Enter the amount of attempts you would like for this challenge");
                        //Whitespace
                        System.out.println();

                        attempts = keyboard.nextInt() - 1;

                        //Whitespace
                        System.out.println();
                        System.out.println("Enter a number between 1 and " + range + "\t");

                        //Whitespace
                        System.out.println();
                    }
                    //
                    else if (userInput == terminate) {
                        return;
                    }
                }
                
                // If the counter is at it's limit but the answer is correct it will not go to game over
                else if (count == 2 && userInput == answer) {
                    System.out.println("Great Job!");
                    System.out.println("To try again type 1, to quit type 0");
                    //
                    userInput = keyboard.nextInt();
                    if (userInput == restart) {
                        count = 0; // Resets count
                        answer = num.nextInt(range) + 1; // Resets random number

                        System.out.println("Enter the range of numbers you would like to guess from. EX: 5, 10, 100, 1000");
                        //Whitespace
                        System.out.println();

                        range = keyboard.nextInt();
                        //Whitespace
                        System.out.println();

                        System.out.println("Enter the amount of attempts you would like for this challenge");
                        //Whitespace
                        System.out.println();

                        attempts = keyboard.nextInt() - 1;

                        System.out.println("Enter a number between 1 and " + range + "\t");
                        //Whitespace
                        System.out.println();

                    } 
                    else if (userInput == terminate) {
                        return;
                    }
                }
                
                else if (userInput > answer) {

                    //Whitespace
                    System.out.println();

                    System.out.println("Too high!");

                    //Whitespace
                    System.out.println();

                    count = count + 1;

                }
                
                else if (userInput < answer) {

                    //Whitespace
                    System.out.println();

                    System.out.println("Too Low!");

                    //Whitespace
                    System.out.println();

                    count = count + 1;
                }
                
                else if (userInput == answer) {

                    System.out.println("Great Job!");
                    System.out.println("To try again type 1, to quit type 0");
                    
                    userInput = keyboard.nextInt();

                    if (userInput == restart) {

                        count = 0; //Resets count
                        answer = num.nextInt(range) + 1; //Resets random number

                        System.out.println("Enter the range of numbers you would like to guess from. EX: 5, 10, 100, 1000");

                        //Whitespace
                        System.out.println();
                        range = keyboard.nextInt();

                        //Whitespace
                        System.out.println();

                        System.out.println("Enter the amount of attempts you would like for this challenge");

                        //Whitespace
                        System.out.println();

                        attempts = keyboard.nextInt() - 1;
                        //Whitespace
                        System.out.println();

                        System.out.println("Enter a number between 1 and " + range + "\t");

                        //Whitespace
                        System.out.println();

                    } 
                    else if (userInput == terminate) {
                        return;
                    }
                }
            }
            while (userInput != answer || count < attempts);
        }
        catch (Exception all){
            System.out.println("Please enter a valid integer and try again.");
        }
    }
}
