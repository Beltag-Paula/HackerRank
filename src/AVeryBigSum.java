import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {
        long sum=0;
        for(long i : ar){ sum +=i; i++;}

        return sum;

    }

    public static void main(String[] args) {
        List<Long> ar= new ArrayList<>();

        System.out.println("How many numbers do you want to add?");
        Scanner scan = new Scanner(System.in);
        int sizeOfAr = scan.nextInt();

        System.out.println("Add your "+sizeOfAr+" numbers :");
        for (int i = 0; i < sizeOfAr; i++) {
            long element = scan.nextLong();
            ar.add(element);
        }

        scan.close();

        long sum = aVeryBigSum(ar);
        System.out.println("You're Very Big Number Sum is : "+sum);

    }

}
