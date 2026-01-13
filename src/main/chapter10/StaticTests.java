/* Exercise: Be The Compiler

The Java file on this page represents a complete program. Your job is to play
compiler and determine whether this file will compile. If it won’t compile,
how would you fix it? When it runs, what would be its output?

*/

class StaticSuper {
    static {
        System.out.println("super static block");
    }

    StaticSuper()  {
        System.out.println("Super constructor");
    }
}

public class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("statick block " + rand);
    }

    StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}


/* output
    super static block
    statick block (random number)
    in main
    super constructor
    constructor
*/
