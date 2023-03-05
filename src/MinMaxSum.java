import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {

    public static void miniMaxSum1(List<Integer> arr) {
        /*Based upon the explanation we see that if we sort the list of integers in ascending order,
        than we see that Minimum Sum would always be given by arr[1]+arr[2]+arr[3]+arr[4]
        and the Maximum Sum would always be given by arr[2]+arr[3]+arr[4]+arr[5]
        This code will work if we don't overflow the integers. That means the range < 2,147,483,647)
        */

        Collections.sort(arr);
        int minimumSum = arr.get(0)+arr.get(1)+arr.get(2)+arr.get(3);
        int maximumSum = arr.get(1)+arr.get(2)+arr.get(3)+arr.get(4);
        System.out.println((long)minimumSum + " " + (long)maximumSum);

    }


    //this is used to solve the exercise from Hackerrank
    public static void miniMaxSum2(List<Integer> arr) {
        //If it's bigger the maximum range of int type (which is 2,147,483,647) (integer overflow) than we do it like this
        //Basically we search in the list the smallest number and then the biggest number and then we do the two sums
        // without them
        int minimum = arr.get(0);
        int maximum = arr.get(0);
        long sum = 0;

        for (int num : arr)
        {
            sum += num;
            if (num < minimum) { minimum = num;}
            if (num > maximum) { maximum = num;}
        }

        long minimumSum = sum - maximum;
        long maximumSum = sum - minimum;
        System.out.println(minimumSum + " " + maximumSum);
    }

    public static void main(String[] args) {
        List<Integer> ar= new ArrayList<>();
        int sizeOfAr=5;
        //From the explanation we know that ar.size=5, so no need to ask the user on how many elements does it want to add
        Scanner scan = new Scanner(System.in);
        System.out.println("Add your "+sizeOfAr+" numbers :");

        for (int i = 0; i < sizeOfAr; i++) {
            int element = scan.nextInt();
            ar.add(element);
        }

        scan.close();

        System.out.println("First method :");
        miniMaxSum1(ar);

        System.out.println("Second method :");
        miniMaxSum2(ar);

    }

}
