/* Exercise BE the Compiler
 *
 * Each of the Java files on this page represents a complete source file. Your job is to play compiler and determine whether each of these
 * files will compile and run without exception. Ifthey won’t, how would you fix them?
 *
 *
 * This is very interesting code, there are various of stuff that we can point.
 * First thing first this file compiles but do not run without exception, because when we go in loop third time we try to access h[3],
 * but this index is out of bound of array, 
 *
 * to fix this good solution will be to, move z = z + 1 increment at the end of the while loop and instead of looping while (z < 4) loop while (z < 3)
 *
*/

class Hobbits {
	String name;

	public static void main(String[] args) {
		Hobbits[] h = new Hobbits[3];
		int z = 0;

		while (z < 3) {
			h[z] = new Hobbits();
			h[z].name = "Bilbo";

			if (z == 1) {
				h[z].name = "Frodo";
			}

			if (z == 2) {
				h[z].name = "Sam";
			}

			System.out.print(h[z].name + " is a ");
			System.out.println("good Hobbit name");
			z = z + 1;
		}
	}
}

