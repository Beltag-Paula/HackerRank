import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        /*in this order
         *  we print the ratio of 1. positive numbers/ size of arr
         *                        2. negative numbers/ size of arr
         *                        3. number of 0s /size of arr
         */
        int numberOfPositives =0;
        int numberOfNegatives =0;
        int numberOfZeroes =0;


        for(int i :arr){
            if(i>0){
                numberOfPositives++;

            }
            if(i<0){
                numberOfNegatives++;
            }
            if(i==0){
                numberOfZeroes++;
            }
        }

       //Each value should be printed on a separate line with 6 digits after the decimal. (%.6f)
        System.out.println(String.format("%.6f",  (double) numberOfPositives / arr.size()));
        System.out.println(String.format("%.6f",  (double) numberOfNegatives / arr.size()));
        System.out.println(String.format("%.6f",  (double) numberOfZeroes / arr.size()));

    }

    public static void main(String[] args) {
        List<Integer> ar= new ArrayList<>();

        System.out.println("How many numbers do you want to add? in the list?");
        Scanner scan = new Scanner(System.in);
        int sizeOfAr = scan.nextInt();

        System.out.println("Add your "+sizeOfAr+" numbers :");
        for (int i = 0; i < sizeOfAr; i++) {
            int element = scan.nextInt();
            ar.add(element);
        }

        scan.close();

        plusMinus(ar);
    }
}
