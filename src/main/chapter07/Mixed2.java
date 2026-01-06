/*   Exercise: Mixed Messages
 *
 *   A short Java program is listed below. One block of the program is missing! Your challenge is to match
 *   the candidate block of code (on the left), with the output that you’d see if the block were inserted.
 *   Not all the lines of output will be used, and some of the lines of output might be used more than once.
 *   Draw lines connecting the candidate blocks of code with their matching command-line output.
 *
 *
 *
*/


class A {
    int ivar = 7;

    void m1() {
        System.out.print("A's m1, ");
    }

    void m2() {
        System.out.print("A's m2, ");
    }

    void m3() {
        System.out.print("A's m3, ");
    }
}

class B extends A {

    void m1() {
        System.out.print("B's m1, ");
    }
}

class C extends B {
    void m3() {
        System.out.print("C's m3, " + (ivar + 6));
    }

}

public class Mixed2 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        b.m1(); // B's m1,
        c.m2(); // A's m2,
        a.m3(); // A's m3,

        System.out.println();

        c.m1(); // B's m1,
        c.m2(); // A's m2,
        c.m3(); // C's m3, 13

        System.out.println();

        a.m1(); // A's m1,
        b.m2(); // A's m2,
        c.m3(); // C's m3, 13

        System.out.println();

        a2.m1(); // B's m1,
        a2.m2(); // A's m2,
        a2.m3(); // C's m3, 13

        System.out.println();
 

    }
}


