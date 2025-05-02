import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int guess;
        int attempts=0;
        int min=1;
        int max=100;
        int random_num= random.nextInt(min,max);
        System.out.println("Number Guessing Game:");
        System.out.printf("Guess the number between %d-%d:\n",min,max);


        do{
            System.out.println("Enter the number:");
            guess = scanner.nextInt();
            attempts++;

            if (guess < random_num) {
                System.out.println("TOO LOW!! try again");
            } else if (guess > random_num) {
                System.out.println("TOO HIGH!! try again");
            }
            else {
                System.out.printf("CORRECT THE NUMBER OF %d \n",guess);
                System.out.printf("# of attempts is %d",attempts);
            }
        }while(guess!=random_num);

        scanner.close();
    }

}
