import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {
    // this method is the important one. sums all the elements of a given list of integers
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i : ar) {
            sum += i;
        }
        return sum;
    }
}

public class SimpleArraySum {
    public static void main(String[] args) {
        //I Used Scanner instead of BufferedReader and System.out.print() instead of BufferedWriter like in HackerRanker
        //This code should run without encountering the NullPointerException.
        Scanner scanner = new Scanner(System.in);

        //arCount is the size of the list ar
        System.out.println("How many numbers do you want to add?");
        int arCount = scanner.nextInt();

        //then we add integer elements into this list ar using a for loop
        System.out.println("Add your "+arCount+" numbers :");
        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < arCount; i++) {
            ar.add(scanner.nextInt());
        }

        //see the method simpleArraySum
        int result = Result.simpleArraySum(ar);
        System.out.println("You're Simple Array Sum is : "+result);

        scanner.close();
    }
}