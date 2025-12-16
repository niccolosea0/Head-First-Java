/*
 * Exercise BE The Compiler
 *
 *
 * Each of the Java files on this page represents a complete source file. Your job is to play compiler and determine whether each of
 * these files will compile. If they won’t compile, how would you fix them, and if they do compile, what would be their output?
 *
 *
 * This file will not compile because in main method, we are calling undefined method play on Episode object,
 * to fix this problem we either have to remove the play method from the main, or add play method in Episode class
 *
 *  public static void main(String[] args) {

		Episode episode = new Episode();
		episode.seriesNumber = 4;
		episode.seriesNumber = 4;
		---------------------------episode.play(); --------------
		episode.skipIntro();
	}
 *
 * I decided to change play() method in main to skipToNext() method
 */


class Episode {
	
	int seriesNumber;
	int episodeNumber;

	void skipIntro() {
		System.out.println("Skiping intro...");
	}

	void skipToNext() {
		System.out.println("Loading next episode...");
	}
}

class EpisodeTestDrive {
	public static void main(String[] args) {

		Episode episode = new Episode();
		episode.seriesNumber = 4;
		episode.seriesNumber = 4;
		episode.skipToNext();
		episode.skipIntro();
	}
}
