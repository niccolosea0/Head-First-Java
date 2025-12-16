/*
 * Exercise: Pool Puzzle
 *
 * Your job is to take code snippets from the pool and place them into the blank lines in the code. You may use the same snippet more than once, and you won’t need to use
 * all the snippets. Your goal is to make classes that will compile and run and produce the output listed be-low. Some of the exercises and puzzles
 * in this book might have more than one correct answer. If you find another cor- rect answer, give yourself bonus points!
 *
 * Expected output:
 * 			helloooo...
 * 			helloooo...
 * 			helloooo...
 * 			helloooo...
 * 			10
 *
 *
 * Bonus Question!
 * 	if the last line of output was 24 instead of 10, how yould you compelte the puzzle?
 *
 */

class Echo {
	int count = 0;
	void hello() {
		System.out.println("helloooo..." );
	}
}

 public class EchoTestDrive {
 	public static void main(String[] args) {
 
 		Echo e1 = new Echo();
 		Echo e2 = new Echo();
 		int x = 0;
 
 		while (x < 4) {
 			e1.hello();
 
 			e1.count = e1.count + 1; // 1. 0+1=1 | 2. 1+1=2 | 3. 2+1=3 | 4. 3+1=4; 
 
 			if (x == 4) {
 				e2.count = e2.count + 1; // This code never executes, because when x will be equal to 4, loop will end
 			}
			if (x < 4) {
 				e2.count = e2.count + e1.count; // 1. 0+1=1 | 2. 1+2=3 | 3. 3+3=6 | 4. 6+4=10
 			}
 			x = x + 1;
 		}
 		
 		System.out.println(e2.count); // Prints last number
 
 	}
 }

// Bonus Question Solution
/*
  public class EchoTestDrive {
	public static void main(String[] args) {

		Echo e1 = new Echo();
		Echo e2 = e1;
		int x = 0;

		while (x < 4) {
			e1.hello();

			e1.count = e1.count + 1; // 1. 0+1=1 | 2. 1+1=2 | 3. 4+1=5 | 4. 10+1 = 11

			if (x == 3) {
				e2.count = e2.count + 1; // 1.- | 2. - | 3. 11+1=12
			}
			if (x > 0) {
				e2.count = e2.count + e1.count; // 1.- | 2. 2+2=4 | 3. 5+5=10 | 4. 12+12=24
			}
			x = x + 1;
		}
		
		System.out.println(e2.count); // Prints last number

	}
}
*/
