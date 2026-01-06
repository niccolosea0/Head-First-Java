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
        System.out.println("A's m1, ");
    }

    void m2() {
        System.out.println("A's m2 ");
    }

    void m3() {
        System.out.println("A's m3 ");
    }
}

class B extends A {

    void m1() {
        System.out.println("B's m1 ");
    }
}

class C extends B {
    void m3() {
        System.out.println("C's m3 " + (ivar + 6));
    }

}

public class Mixed2 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        b.m1(); // B's m1
        c.m2(); // A's m2
        a.m3(); // A's m3
         
    }
}


