/*
 * @author nider6687
 * This program finds the perfect integers between 1 and 100
 */

package perfect.integers;

/**
 *
 * @author nider6687
 */
public class PerfectIntegers {
    
    public static void main(String[] args) {
        //checking if each integer between 2-100 is perfect
        for (int i = 2; i < 100; i++) {
            if (isPerfectInteger(i)) {
                System.out.println(i + " is a perfect integer");
            }
        }
    }
 
    /**
     * 
     * @param x the numeric value of i (numbers between 2 and 100)
     * @return true or false on the integer
     * 
     * This method returns a true or false statement seeing if the parameter x is
     * equal to the sum. If it does that means the integer(i) is a perfect integer.
     */
    public static boolean isPerfectInteger(int x) {
        int sum = 1;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                sum += i;
            }  
        }  
        //returns a true or false statement
        return x == sum;
    }
}
