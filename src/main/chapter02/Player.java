package chapter2;
import java.util.Random;

public class Player {
	int number;

	public void guess() {
		int random = new Random();
		number = random.nextInt(10);
	}
}
