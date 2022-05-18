import java.util.Scanner;
import java.util.Random;

public class RandNumGuesser 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int userNum = scan.nextInt();
        int computer = (int)Math.random() * 10;
    }
}