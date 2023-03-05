/* This is a method that takes in four integer parameters: x1, v1, x2, and v2.
These parameters represent the starting positions and velocities of two kangaroos on a number line.

The method first sets the answer to "NO", which will be returned if the kangaroos do not meet.
Then, the method checks if the second kangaroo is initially ahead of the first kangaroo (x2 > x1) and if the second kangaroo has a slower velocity (v2 < v1). If this condition is true, then the method enters a loop that updates the positions of the kangaroos until either the first kangaroo overtakes the second kangaroo, or they both land on the same position at the same time.

If the kangaroos land on the same position at the same time, the method updates the answer to "YES". Finally, the method returns the answer.
 */
public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String answer="NO";


        if(v2<v1){
            while(x1<x2){
                x1 = x1+v1;
                x2 = x2+v2;
            }
            if(x1==x2){
                answer="YES";
            }
        }


        return answer;

    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0,2,5,3));
        System.out.println(kangaroo(0,3,4,2));
    }
}
