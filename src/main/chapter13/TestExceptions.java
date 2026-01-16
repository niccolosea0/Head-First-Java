/* 
Look at the code to the left. What do you think the output of this program would be? What do you think
it would be if the third line of the program were changed to String test = "yes";? Assume ScaryException extends Exception.


Output when test = "no"
    1. start try
    2. start risky
    3. end risky
    4. end try
    5. finally
    6. end of main


Output when = "yes"
    1. start try
    2. start risky
    3. scary exception
    4. finally
    5. end of main
*/


public class TestExceptions {
    public static void main(String[] args) {
         String test = "yes";

         try {
             System.out.println("start try");
             doRisky(test);
             System.out.println("end try");
         } catch (ScaryException se) {
             System.out.println("scary exception");
         } finally {
             System.out.println("finally");
         }

         System.out.println("end of main");
    }

    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
    }
}

class ScaryException extends Exception {

}
