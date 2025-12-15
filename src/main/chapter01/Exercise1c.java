/* 
 * Task: Each of the Java files on this page represents a complete source file. Your job is to play compiler and
 * determine whether each of these files will compile. If they won’t compile, how would you fix them?
 * */

/*
 * This file does not compile, because main method which is needed to run the program is not specified.
 *
*/


class Exercise1c {
    public static void main(String[] args) { // main method now is specified
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }	
}
