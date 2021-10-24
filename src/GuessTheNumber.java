import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to GuessTheNumber game. Guess between 1-100 (both included)");
		
		while(true) {//GAME LOOP
			int guess = 0;
			int tries = 0;
			int target = (int)(Math.random()*100)+1;
			System.out.println("START GUESSING!");
			try {
				guess = scanner.nextInt();
			}catch(InputMismatchException e) {
				throw new InputMismatchException("Please only enter integers!");
			}
			tries++;
			while(guess != target) {
				System.out.println("Missed! The target number is "+(guess>target?"less":"more")+" than "+guess);
				try {
					guess = scanner.nextInt();
				}catch(InputMismatchException e) {
					throw new InputMismatchException("Please only enter integers!");
				}
				tries++;
			}
				System.out.println("Congrats! You found the number with "+tries+" tries.The number was "+target+"\nPress enter to continue playing!");
				try
		        {
		            System.in.read();
		        }  
		        catch(Exception e) {}
		}
	}
}
