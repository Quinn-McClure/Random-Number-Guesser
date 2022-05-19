import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.util.Random;

public class RandNumGuesser 
{
    public static void main(String args[])
    {
        boolean TF = true;
        while (TF == true)
        {
            System.out.print("Enter a number (1-10): ");
            Scanner scan = new Scanner(System.in);

            try
            {
                int user = scan.nextInt();
                int computer = (int)(Math.random() * 10) + 1; 
    
                if (user == computer)
                {
                    System.out.println("Computer guesses " + computer + ".");
                    System.out.println("You lose!");
                }
                else
                {
                    System.out.println("Computer guesses " + computer + ".");
                    System.out.println("You win!");
                }

                System.out.print("Enter 'e' to exit or 'p' to play again: ");
                String decision = scan.next();

                if (decision.equals("e"))
                {
                    TF = false;
                }
                else if (decision.equals("p"))
                {
                    TF = true;
                }
                else 
                {
                    System.out.println("You have input '" + decision + "'");
                    System.out.println("The program will terminate");
                    TF = false;
                }
            }
            catch (Exception e)
            {
                System.out.println("Something went wrong");
                System.out.println("Try again \n");
            }
        }
    }
}