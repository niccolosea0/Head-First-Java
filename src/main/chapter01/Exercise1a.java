/* 
 * Task: Each of the Java files on this page represents a complete source file. Your job is to play compiler and
 * determine whether each of these files will compile. If they won’t compile, how would you fix them?
 * */

/*
 * This file compiles, but goes in infinite loop. To exit infinite loop press CTRL+C
*/

class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
	while (x < 10) {
	    if (x > 3) {
	        System.out.println("big x");
	    }
	}
    }	    
}
