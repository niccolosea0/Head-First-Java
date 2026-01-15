/*      Exercise: Pool Puzzle
 *   Your job is to take code snippets from the pool and place them into the blank
 *   lines in the code. You may not use the same snippet more than once, and
 *   you won’t need to use all the snippets. Your goal is to make a class that
 *   will compile and run and produce the output listed.
 */
import java.util.*;
import java.util.stream.*;
import java.util.Collectors;

public class StreamPuzzle {
    public static void main(String[] args) {
         
         SongSearch songSearch = new SongSearch();

         songSearch.printTopFiveSongs();
         
         songSearch.search("The Beatles");

         songSearch.search("The Beach Boys");
    }
}

class SongSearch {
    private final List<Song> songs = new JukeboxData.Songs().getSongs();

    void printTopFiveSongs() {
        List<String> topFive = songs.stream()
                                    .sorted(Comparator.comparingInt(Song::getTimesPlayed))
                                    .map(song -> song.getTitle)
                                    .limit(5)
                                    .collect(Collectors.toList)

        System.out.println(topFive);
    }

    void search(String artist) {
        Optional<String> result = songs.stream()
                                       .filter(song -> song.getArtist().equals(artist))
                                       .findFirst();
        if (result.isPresent()) {
            System.out.println(result.get().getTitle());
        } else {
            System.out.println("No songs found by: " + artist);
        }
    }
}
