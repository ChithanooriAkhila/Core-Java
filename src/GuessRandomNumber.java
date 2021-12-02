import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int myNumber,NUMBER_OF_GUESSESS=0,randomNumber;
        randomNumber=random.nextInt(100)+1;
        System.out.println(randomNumber);
        while(true){
            //randomNumber=random.nextInt(100)+1;
            myNumber=sc.nextInt();
            NUMBER_OF_GUESSESS++;
            if(myNumber==randomNumber){
                System.out.printf("congratulations!!!!!!!!!!\n " +
                        "you have taken %d guesses to predict the number !!!\n" +
                        "Thanks for playing",NUMBER_OF_GUESSESS);
                break;
            }
            else if(myNumber<1 && myNumber>100){
                System.out.println("chance wasted!!! \nGuess between 1 and 100");
            }
            else if(myNumber <randomNumber){
                System.out.println("your guess is too low");
            }
            else{
                System.out.println("your guess is too high");
            }

        }

    }
}
