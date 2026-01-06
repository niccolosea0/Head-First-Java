/*  Exercise: Pool Puzzle
 *
 *   Your job is to take code snippets from the pool and place them into
 *   the blank lines in the code. You may use the same snippet more
 *   than once, and you might not need to use all the snippets. Your
 *   goal is to make a set of classes that will compile and run together
 *   as a program. Don’t be fooled—this one’s harder than it looks.
 *
 *   Expected output: drift drift hoist sail
*/

class Boat {

    private int length;

    public void setLength(int len) {
        length = len;
    }

    public int getLength() {
        return length;
    }

    public void move() {
        System.out.print("drift ");
    }
}

class Rowboat extends Boat {

    public void rowTheBoat() {
        System.out.print("stroke natasha");
    }
}

class Sailboat extends Boat {
    public void move() {
        System.out.print("hoist sail");
    }
}

public class TestBoats {
    public static void main(String[] args) {
         Boat b1 = new Boat();
         Sailboat b2 = new Sailboat();
         Rowboat b3 = new Rowboat();

         b2.setLength(32);
         b1.move();
         b3.move();
         b2.move();
    }
}
