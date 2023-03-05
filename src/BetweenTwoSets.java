import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*There will be two arrayLists of integers. Determine all integers that satisfy the following two conditions:

    The elements of the first array are all factors of the integer being considered
    The integer being considered is a factor of all elements of the second array

These numbers are referred to as being between the two arrayLists. Determine how many such numbers exist.

 So you need to solve it using good old 5th grade Math that I certainly didn't google it online at 3Am
 LCM:
    LCM(a, b) = (a * b) / GCD(a, b)
   -where a and b are the two numbers for which we want to find the LCM, and GCD(a, b) is their greatest common divisor.


   GCD:use the Euclidean algorithm, which works as follows:
   1 Find the remainder of a divided by b (a % b).
   2 If the remainder is 0, then b is the GCD of a and b.
   3 If the remainder is not 0, then set a to b, and set b to the remainder of the division
      (b = a % b).
   4 Go back to step 1.

*/

public class BetweenTwoSets {
    public static int LCM(int firstNumber, int secondNumber){
        return (firstNumber * secondNumber) / GCD(firstNumber, secondNumber);
    }

    public static int GCD(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        } else {
            return GCD(secondNumber, firstNumber % secondNumber);
        }
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int counter =0;

        // Find the LCM of all integers in array a
        int lcm = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcm = LCM(lcm, a.get(i));
        }

        // Find the GCD of all integers in array b
        int gcd = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcd = GCD(gcd, b.get(i));
        }

        // Count the number of multiples of LCM that evenly divide the GCD.
        for (int i = lcm; i <= gcd; i += lcm) {
            if (gcd % i == 0) {
                counter++;
            }
        }

        return counter;

    }

    public static void main(String[] args) {
        //the sizes of the lists in the examples are 2. So I'll leave it like that.
        List<Integer> a = new ArrayList<>(Arrays.asList(2, 6));
        List<Integer> b = new ArrayList<>(Arrays.asList(24, 36));
        int firstExample = getTotalX(a, b);
        System.out.println(firstExample);
    }
}
