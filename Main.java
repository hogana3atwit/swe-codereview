/**
 * 
 * Implement Fizz Buzz Game with TDD
 * 
 * Players generally sit in a circle. The player designated to go first says the number "1",
 * and each player thenceforth counts one number in turn.
 * However, any number divisible by three is replaced by the word fizz and any number divisible by five by the word buzz.
 * Numbers divisible by 15 become fizz buzz.
 * A player who hesitates or makes a mistake is eliminated from the game.
 *
 * For example, a typical round of fizz buzz would start as follows:
 * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 
 * 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 
 * 31, 32, Fizz, 34, Buzz, Fizz, ...
 *
 * @author <student 1 name>, <student 2 name>
 */

public class Main { 
    
    /**
	 * Process a number
	 * @param num a number
	 * @return a string corresponds to that number
	 */
	public static String processNumber(int num) {
        // TODO: Write your code here
        if (num < 0) return "";
        if (num == 0) return "0";
        if (num % 15 == 0) return "FizzBuzz";
        if (num % 3 == 0) return "Fizz";
        if (num % 5 == 0) return "Buzz";
        return num+"";
    }
    
    /**
	 * Process numbers
	 * @param nums an array of numbers
	 * @return a string corresponds to that numbers array
	 */
	public static String processNumbers(int[] nums) {
        // TODO: Write your code here
        String proc_num, new_nums = "";
        for (int i = 0; i < nums.length; i++) {
          proc_num = processNumber(nums[i]);
          if ((i == nums.length-1) || (proc_num == "")) {
            new_nums = new_nums + proc_num;
          } else {
            new_nums = new_nums + proc_num + ", ";
          }
        }
        return new_nums;
    }
    
    /**
	 * Test processNumber
	 */
    private static void testProcessNumber() {
        System.out.println("Running processNumber test cases");
        // TODO: Write test cases for processNumber here using assertEquals
        // E.g., assertEquals(processNumber(1), "1");
      assertEquals(processNumber(-99), "");
      assertEquals(processNumber(0), "0");
      assertEquals(processNumber(1), "1");
      assertEquals(processNumber(3), "Fizz");
      assertEquals(processNumber(5), "Buzz");
      assertEquals(processNumber(15), "FizzBuzz");
      assertEquals(processNumber(30), "FizzBuzz");
      assertEquals(processNumber(33), "Fizz");
    }
    
    /**
	 * Test processNumbers
	 */
    private static void testProcessNumbers() {
        System.out.println("Running processNumbers test cases");
        // TODO: Write test cases for processNumbers here using assertEquals
        // E.g., assertEquals(processNumbers(new int[] {1}), "1");
      assertEquals(processNumbers(new int[] {1}), "1");
      assertEquals(processNumbers(new int[] {3, 5, 15}), "Fizz, Buzz, FizzBuzz");
      assertEquals(processNumbers(new int[] {1, 3, 5, 15}), "1, Fizz, Buzz, FizzBuzz");
      assertEquals(processNumbers(new int[] {3, 30, 33, 34}), "Fizz, FizzBuzz, Fizz, 34");
      assertEquals(processNumbers(new int[] {0, -23, 3, 5}), "0, Fizz, Buzz");
    }

    /**
	 * Implement assertEquals, print out Pass if actual string equals to expected; fail otherwise
	 * @param actual actual string
	 * @param expected expected string     
	 */
    private static void assertEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("Pass");
        }
        else {
            System.out.println(String.format("Fail: expected: %s, actual: %s", expected, actual));
        }
    }
    
    public static void main(String[] args) {
        testProcessNumber();
        testProcessNumbers();
    }
}