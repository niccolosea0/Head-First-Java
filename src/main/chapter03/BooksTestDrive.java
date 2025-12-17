/* Exercise BE the Compiler
 *
 * Each of the Java files on this page represents a complete source file. Your job is to  play compiler and determine whether each of these files will compile and run
 * without exception. If they won’t, how would you fix them?
 *
 *
 * Lets analyze why this code does not compile
 *	Books[] myBooks = new Books[3]; this line of code creates array of Books which length is 3 and assigns its reference value to variable myBooks
 *
 *	But this array has null values, not references to object, so when we are trying to access myBooks[0].title, we are getting NullPointerException
 *	because value of myBooks[0] is null.
 *
 *	What we need to do is to create Books objects and assign its reference values myBooks array.
 *      //	myBooks[0] = new Books();
 *	//	myBooks[1] = new Books();
 *	//	myBooks[2] = new Books();
 *
 *	Like that, by adding this code, we will have no compilation issue. 
 */     



class Books {
	String title;
	String author;
}

class BooksTestDrive {
	public static void main(String[] args) {
		Books[] myBooks = new Books[3];
		int x = 0;

		// Creating objects and storing their reference values into the array.
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Cookbook";

		myBooks[0].author = "Bob";
		myBooks[1].author = "Sue";
		myBooks[2].author = "Ian";

		while (x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x + 1;
		}
	}
}
