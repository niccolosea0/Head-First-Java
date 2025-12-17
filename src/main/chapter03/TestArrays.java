/*
 * Exercise: Code Magnets 
 * 
 * A working Java program is all scrambled up on the fridge. Can you reconstruct the code snippets to make a working Java program
 * that produces the output listed below? Some of the curly braces fell on the floor and they were too small to pick up, so feel free to add as many of those as you need!
 *
 * Expected output:
 * 	island = Fiji
 * 	island = Cozume1
 * 	island = Bermuda
 * 	island = Azores
 *
*/

class TestArrays {
	public static void main(String[] args) {
		
		// Create String array and store objects
		String[] islands = new String[4];
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";

		// Create int array and store integers
		int[] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;

		
		// Variable y for incrementing while loop
		int y = 0;
		// Variable ref for indexing islands array
		int ref;

		while (y < 4) {
			ref = index[y]; // Initialize variable ref with corresponding index value
			System.out.print("island = ");
			System.out.println(islands[ref]); // Print island
			y = y + 1;
		}
	}
}

