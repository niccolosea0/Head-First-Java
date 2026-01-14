import java.util.*;

public class TestTree {
    public static void main(String[] args) {
         new TestTree().go();
    }

    public void go() {

        Book b1 = new Book("How cats work");
        Book b2 = new Book("Remix your body");
        Book b3 = new Book("Finding Emo");

        // Set<Book> tree = new TreeSet<>((one, two) -> one.title.compareTo(two.title));

        CompareTitle compareTitle = new CompareTitle();

        Set<Book> tree = new TreeSet<>(compareTitle);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);

    }


    class Book implements Comparable<Book> { 
        private String title;

        public Book(String t) {
            title = t;
        }

        public int compareTo(Book other) {
            return title.compareTo(other.title);
        }

        // Overriding toString() method to print titles
        public String toString() {
            return title;
        }
    }

    class CompareTitle implements Comparator<Book> {
        public int compare(Book one, Book two) {
            return one.title.compareTo(two.title);
        }
    }
}
// 1. What is the result when you compile the code?
// answer: Code successfuly compiles, no compiling issue

// 2. If it compiles, what is the result when you run the TesTree class?
// answer: We get runtime ClassCastException error, which says that, in TreeSet Book class objects are not sortable, 
// because TreeSet does not know how to sort them, there is not comparable or comparator implemeneted
// so we get an error because of this.


// 3. If there is a problem (either compile-time or runtime) with this code, how would you fix it?
// answer: 
// 1. I would add lambda expression when creating new TreeSet<>(); like: new TreeSet<>((one,two) -> one.title.compareTo(two.title))
// 2. I would implement Comparable<Book> in class book
// 3. I would create CompareTitle class, that implemenets Comparator<Book>
