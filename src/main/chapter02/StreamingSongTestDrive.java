/*
 * Exercise: BE the Compiler 
 *
 * Each of the Java files on this page represents a complete source file. Your job is to play compiler and determine whether each of
 * these files will compile. If they won’t compile, how would you fix them, and if they do compile, what would be their output?
 *
 * */

/*
 * This file wont compile because in main method, we have not created SreamingSong object, and therefore we can not access it's instance variables or methods
	public static void main(String[] args) {
		
		song.artist = "The Beatles";
		song.title = "Come together";
		song.play();
		song.printDetails();
	}
 *
 *
 * to solve the problem we have to create an StreamingSong object called song
 * see solution in the code
 *
 * P.S We have to note that we have one redunant instance variable: duration, but it does not affect compiling
 */

class StreamingSong {

	String title;
	String artist;
	int duration;

	void play() {
		System.out.println("Playing song");
	}

	void printDetails() {
		System.out.println("This is song " + title + " by " + artist);
	}
}

class StreamingSongTestDrive {
	public static void main(String[] args) {
		
		StreamingSong song = new StreamingSong(); // Create StreamingSong object

		song.artist = "The Beatles";
		song.title = "Come together";
		song.play();
		song.printDetails();
	}
}
