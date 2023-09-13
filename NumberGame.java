import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int min = 1, max = 1000, guess, attempt = 5 , randomNumber = random.nextInt(max-min+1)+min;
        System.out.print("Enter Your Guess, You have "+attempt+" attempts left :");
        guess = sc.nextInt();
        while(guess != randomNumber && attempt > 1){
            if(guess > randomNumber){
                System.out.println("Your Guess is Higher...");
            } else {
                System.out.println("Your Guess is Lower...");

            }
            attempt--;
            System.out.print("Enter Your Guess, You have "+attempt+" attempts left :");
            guess = sc.nextInt();
        }
        if(guess == randomNumber){
            System.out.println("Your answer was correct the number was -> " +randomNumber);
        } else {
            System.out.println("Your answer was wrong the number was -> " +randomNumber);

        }

    }
}