package chapter2;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {
		// Create objcets of new Players
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		System.out.println("\nI'm thinking about random number between 0 and 9");
		int randomNumber = (int) (Math.random() * 10);
		System.out.println("Number to guess is: " + randomNumber);

		int p1Guess = 0;
		int p2Guess = 0;
		int p3Guess = 0;

		boolean p1Right = false;
		boolean p2Right = false;
		boolean p3Right = false;

		while (true) {
			// Call guess method for player's objects
			p1.guess();
			p2.guess();
			p3.guess();

			// Initialize players guess variables by the number that is returend by guess() method
			p1Guess = p1.number;
			p2Guess = p2.number;
			p3Guess = p3.number;

			System.out.println("\nPlayer1 guessed number: " + p1Guess);
			System.out.println("Player2 guessed number: " + p2Guess);
			System.out.println("Player3 guessed number: " + p3Guess);

			if (p1Guess == randomNumber)
				p1Right = true;
			if (p2Guess == randomNumber)
				p2Right = true;
			if (p3Guess == randomNumber)
				p3Right = true;

			if (p1Right || p2Right || p3Right) {
				System.out.println("\nPlayer1 guessed? " + p1Right);
				System.out.println("Player2 guessed? " + p2Right);
				System.out.println("Player3 guessed? " + p3Right);
				System.out.println("\nWe have a winner!!!");
				break;
			}
			else {
				System.out.println("\nNone of the players guessed the number");
				System.out.println("Try again!\n");
			}
		}

		System.out.println("Game Over!");


	}
}
