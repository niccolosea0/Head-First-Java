/*
 *   Exercise: Pool Puzzle
 *  
 *    Your job is to take code snippets from the pool and  place them into the blank lines in the code and output. 
 *    You may use the same snippet more than once, and you won’t need to use all the snippets. Your
 *    goal is to make a set of classes that will compile and run and produce the output listed.
 *  
 *  
 *   Expected Output:
        %java ----
        5 class Acts
        7 class clowns
        ------ Of76
 *  
*/

interface Nose {
    public int iMethod();
}

abstract class Picasso implements Nose {
    public int iMethod() {
        return 7;
    }
}

class Clowns extends Picasso{}

class Acts implements Nose {
    public int iMethod() {
        return 5;
    }
}

public class Of76 extends Clowns {
    public static void main(String[] args) {
         
         Nose[] i = new Nose[3];

         i[0] = new Clowns();
         i[1] = new Acts();
         i[2] = new Of76();

         for (int x = 0; x < 3; x++) {
             System.out.println(i[x].iMethod() + " " + i[x].getClass());

        }
    }
}
