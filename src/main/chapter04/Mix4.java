/*
 *	Puzzle: Mixed Messages
 *
 *   A short Java program is listed to your right. Two blocks of the program are missing. Your challenge is to match the candidate
 *   blocks of code (below) with the output that you’d see if the blocks were inserted.
 * 
 *   Not all the lines of output will be used, and some of the lines of output might be used more than once. Draw lines connecting
 *   the candidate blocks of code with their matching command-line output.
 *
 *
 *   Candidates: 	            Possible output: 
 *   i < 9, index < 5    ------>         14 1 
 *   i < 20, index < 5   ------>         25 1
 *   i < 7, index < 7    ------> 	 14 1
 *   i < 19, index < 1   ------>         20 1	 
 *
 */

public class Mix4 {
	int counter = 0;

	public static void main(String[] args) {
		int count = 0;
		Mix4[] mixes = new Mix4[20];
		int i = 0;
		while (i < 19) {
			mixes[i] = new Mix4();
			mixes[i].counter = mixes[i].counter + 1;
			count = count + 1;
			count = count + mixes[i].maybeNew(i);
			i = i + 1;
		}
		System.out.println(count + " " + mixes[1].counter);
	}

	public int maybeNew(int index) {
		if (index < 1) {
			Mix4 mix = new Mix4();
			mix.counter = mix.counter + 1;
			return 1;
		}

		return 0;
	}
}

