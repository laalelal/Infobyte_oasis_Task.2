import java.util.Random;
import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		int number, guess, nguesses = 1;
		RANDOM.setSeed(System.currentTimeMillis());
		number = (RANDOM.nextInt() & Integer.MAX_VALUE) % 100 + 1; //generate a random number between 1 to 100
		//System.out.println("The number is " + number + " ");
		do {
			System.out.println("Guess the number betwen 1 to 100");
			guess = STDIN_SCANNER.nextInt();
			if(guess > number) {
				System.out.println("Guess a lower number than "+guess);
			} else if(guess < number) {
				System.out.println("Guess a Higher no. than "+guess);
			} else {
				System.out.print("you guessed in " + nguesses + " attempts");
			}
			nguesses++;
		} while(guess != number);
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);

	public final static Random RANDOM = new Random(1);
}