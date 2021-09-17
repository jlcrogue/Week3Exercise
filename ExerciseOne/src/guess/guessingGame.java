package guess;

import java.lang.Math;
import java.util.Scanner;

public class guessingGame {
	
	public static void main(String[] args) {
		int correct = randInt();
		int guess = -1;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter a number between 0 and 100: ");
			if(scan.hasNextInt()) {
				guess = scan.nextInt();
			}
			giveHint(correct, guess);
		} while(correct != guess);
	}
	
	public static int randInt() {
		int min = 0;
		int max = 100;
		int ret = (int)(Math.random()*(max-min+1)+min);
		return ret;
	}
	
	public static void giveHint(int correct, int guess) {
		if(correct > guess) {
			System.out.println("Your guess is too low!");
		} else if(correct < guess) {
			System.out.println("Your guess is too high!");
		} else {
			System.out.println("That is correct!");
		}
	}

}
