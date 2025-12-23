/* Exercise: BE the Compiler

   Each of the Java files on this page represents a complete source file. Your job is to play compiler and
   determine whether each of these files will compile. If they won’t compile, how would you
   fix them, and if they do compile, what w


   This program compiler and works well.
*/

class XCopy {
	public static void main(String[] args) {
		int orig = 42;
		XCopy x = new XCopy();
		int y = x.go(orig);
		System.out.println(orig + " " + y);
	}

	int go(int arg) {
		arg = arg * 2;
		return arg;
	}
}
