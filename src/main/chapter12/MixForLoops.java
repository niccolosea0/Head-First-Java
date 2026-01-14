/*      Exercise: Mixed Messages
 *   A short Java program is listed below. One block of the program is missing. We expect the output of the 
 *   program should be “1 2 3 4 5” but sometimes it’s difficult to get a for loop just right.
 *   
 *   Your challenge is to match the candidate block of code (on the left) with the output that you’d see 
 *   if the block were inserted. Not all the lines of output will be used, and some of the lines of output might be used more than once
*/

import java.util.*;

class MixForLoops {
    public static void main(String[] args) {
         List<Integer> nums = List.of(1, 2, 3, 4, 5);
         String output = "";

         /*
         // This for loop will output: 2 3 4 5
         for (int i = 1; i < nums.size(); i++) {
             output += nums.get(i) + " ";
         }
         */

         /*
         // This will output: 1 2 3 4 5
         for (Integer num : nums) {
             output += num + " ";
         }
         */

         /*
         // This loop will cause Compile error, because List does not have
         // any instance variable that is called "length", it is for arrays not lists
         // for lists you should use method size()
         for (int i = 0; i <= nums.length; i++) {
             output += nums.get(i) + " ";
         }
         */
         
         /*
         // This loop will cause IndexOutException, because last element in loop is
         // nums.size(), which equals to 5, and we do not have. list.get(5), it is out of bound
         for (int i = 0; i <= nums.size(); i++) {
             output += nums.get(i) + " ";
         }
         */


         System.out.println(output);
    }
}
