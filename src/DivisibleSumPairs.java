import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

   /* Given an array of integers k and a positive integer (i,j) , pairs where i<j and ar[i]+ar[j] is div by k
   determine the number of pairs where and + is divisible by

    Example
    ar[1,2,3,4,5,6]; k =5; Three pairs meet the criteria : [1,4], [2,3] and [4,6] - method returns counter=3;
   * */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int counter=0;
        for(int arNumber=0; arNumber<ar.size(); arNumber++){
            for(int arNumber2=ar.size()-1; arNumber2>=0; arNumber2--){
                if((arNumber<arNumber2) && (ar.get(arNumber)+ar.get(arNumber2))%k==0){
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);

        //I am not sure what the n does. In the explanation, n is the length of array n. That means they didn't update
        //the problem, since the method uses List<Integer> ar as parameter and not int[] ar
        System.out.println(divisibleSumPairs(0,5,a));
    }


}
