/*
 * Your job is to take code snippets from the pool and place them into the blank lines in the code. You may not use the same snippet more than once, and
 * you won’t need to use all the snip pets. Your goal is to make a class that will compile and run and produce the
 * output listed. Don’t be fooled—this one’s harder than it looks.
*/

/*
 * Expected Output:
 * a noise
 * annoys
 * an oyster
 */


class PoolPuzzleOne {
    public static void main(String[] args) {
    	
	int x = 0;

	while (x < 4) {
	 
	    System.out.print("a"); 
	    
	    if (x < 1) {
	        System.out.print(" ");
	    }

	    System.out.print("n");

	    if (x > 1) {
	        System.out.print(" oyster");
		x = x + 2;
	    }

	    if (x == 1) {
	       System.out.print("noys");
	    }

	    if (x < 1) {
	        System.out.print("oise");
	    }
	    
	    System.out.println();

	    x = x + 1; 
	}

    }
}
