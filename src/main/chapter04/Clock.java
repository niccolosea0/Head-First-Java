/*Exercise: Be the Compiler
 *
 *  Each of the Java files on this page represents a complete source file. Your job is to play compiler and determine whether each of these files
 *  will compile. If they won’t compile, how would you fix them, and if they do compile, what would be their output?
 *
 *
 *  	Problem: This program has issue with compiling, because we have method in class Clock:
 *  		void getTime() {
 *  			return time;
 *  		}
 *	
 *	If we have method which is void type, it means it should not return a value, but in it's body we still return a variable;
 *	
 *	Solution: If we want this program to work we have to change method's type from void to String.
 *
 */



class Clock {
	String time;

	void setTime(String t) {
		time = t;
	}

	String getTime() {
		return time;
	}
}

class ClockTestDrive {
	public static void main(String[] args) {
		Clock c = new Clock();

		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}
}
