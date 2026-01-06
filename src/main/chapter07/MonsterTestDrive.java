/*  Exercise: Be The Compiler
 *
 *   Which of the A-B pairs of methods listed on the right, if
 *   inserted into the classes on the left, would compile and
 *   produce the output shown? (The A method inserted into
 *   class Monster, the B method inserted into class Vampire.)
 *
*/

class Monster {

    /* 1. This code compiles
    boolean frighten(int d) {
        System.out.println("arrrgh");
        return true;
    }
    */

    /* 2. This particular code compiles
    boolean frighten(int x) {
        System.out.println("arrrgh");
        return true;
    }
    */

    // 3. This code compiles
   /* boolean frighten(int x) {
        System.out.println("arrrgh");
        return true;
    }
    */
   

}


class Vampire extends Monster {

    /* 1. This code compiles
    boolean frighten(int x) {
        System.out.println("a bite?");
        return false;
    }
    */

    /* 2. But this one does not compile, because we only changed returned type from boolean to int, we have to change argument also to fix this code.
    int frighten(double x) {
        System.out.println("a bite?");
        return 1;
    }
    */
    
    // 3. This code compiles but is not printed, because this method is not called in main
    /*
    boolean scare(int x) {
        System.out.println("a bite?");
        return true;
    }
    */

}

class Dragon extends Monster {

    boolean frighten(int degree) {
        System.out.println("breathe fire");
        return true;
    }
}


public class MonsterTestDrive {

    public static void main(String[] args) {
         
         Monster[] monsters  = new Monster[3];
         monsters[0] = new Vampire();
         monsters[1] = new Dragon(); 
         monsters[2] = new Monster();

         for (int i = 0; i < monsters.length; i++) {
             monsters[i].frighten(i);
         }
    }
}
