import java.util.*;

public class Game{
public static void guessingNumberGame(){

        Scanner sc = new Scanner(System.in);

        int number = 1+(int)(100 * Math.random());

        int count = 5;

        for(int i=0; i<count; i++){
            
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println(
                    " Congratulations! You guessed the correct number.");
                sc.close();

                return;

                }
            else if (guess < number) {
                System.out.println(
                    " The number is greater than " + guess);
            }
            else {
                System.out.println(
                    " The number is less than " + guess);
            }
        }
        System.out.println(
            "You've exhausted all attempts. The correct number was: "
            + number);
        sc.close();
        }

    public static void main(String[] args){
        guessingNumberGame();
    }
}