import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class BDayCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int counter=0;
        Collections.sort(candles, Collections.reverseOrder());

        for(int i : candles){
            if(i==candles.get(0)) {counter++;}
        }

        return counter;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //arCount is the size of the list ar
        System.out.println("How many candles do you want to add?");
        int numbesOfCandles = scanner.nextInt();

        //then we add integer elements into this list ar using a for loop
        System.out.println("Add your "+numbesOfCandles+" numbers :");
        List<Integer> candles = new ArrayList<>();
        for (int i = 0; i < numbesOfCandles; i++) {
            candles.add(scanner.nextInt());
        }

        /*It is important to close the Scanner in Java to free up resources and prevent memory leaks.
        When the Scanner is not closed, it continues to consume system resources and can lead to performance issues,
        especially in large applications that use many Scanner objects.
        Additionally, not closing the Scanner can result in unexpected behavior and errors in the application.
        Therefore, it is a good practice to always close the Scanner after it has finished being used.*/
        scanner.close();

        //return the number of candles that are the highest/tallest
        int numberOfHighestCandles=birthdayCakeCandles(candles);
        System.out.println("You have "+numberOfHighestCandles+" tall candles");


    }

}
