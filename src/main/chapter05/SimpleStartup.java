import java.util.Scanner;

class SimpleStartup {

	private int[] cellPosition;
	private int numberOfHits = 0;

	public void setCellPosition(int[] position) {
		cellPosition = position;
	}

	public String checkYourGuess(int guess) {
		String result = "miss";
		
		/* for (int cell : cellPosition) {
			if (guess == cell) {
				numberOfHits++;
				result = "hit";
				break;
			}
		}*/

		for (int i = 0; i < cellPosition.length; i++) {
			if (guess == cellPosition[i]) {
				numberOfHits++;
				result = "hit";
				cellPosition[i] = -1; // Position is guessed assign this position -1
				break;
			}	
		}

		if (numberOfHits == cellPosition.length) {
			result = "kill";
		}
			
		System.out.println(result);
		return result;
	}	
}

class Game {
	public static void main(String[] args) {

		int numOfGuess = 0;
		SimpleStartup simpleStartup = new SimpleStartup();

		Scanner scanner = new Scanner(System.in);
		
		int randomNum = (int) (Math.random() * 5);
		int[] positions = {randomNum, randomNum + 1, randomNum + 2};

		simpleStartup.setCellPosition(positions);
		boolean isAlive = true;

		while (isAlive) {
			System.out.print("Enter number: ");
			int userGuess = scanner.nextInt();
			numOfGuess++;

			String result = simpleStartup.checkYourGuess(userGuess);

			if (result.equals("kill")) {
				System.out.println("you took " + numOfGuess + " guesses");
				isAlive = false;
			}

		}

	}


}
