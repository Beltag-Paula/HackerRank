import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*The Apple and Orange problem from Hackerrank is a programming challenge that asks you
to determine how many apples and oranges fall on Sam's house given their positions on a coordinate axis, the distance they travel, and the positions of Sam's house.

The problem provides you with the following inputs:
    The starting point of Sam's house: int s
    The ending point of Sam's house: int t
    The location of the apple tree: int a
    The location of the orange tree: b
    The positions where the apples fell: List apples
    The positions where the oranges fell: List oranges

You are asked to output two integers:
    The number of apples that fall on Sam's house.
    The number of oranges that fall on Sam's house.

To solve this problem, you need to calculate if the position of each apple and orange and check falls within the range of Sam's house.
If it does, you increment the counter for that fruit.
* */
public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // The range where the fruits must fall is between s and t
        int counterApples=0; int counterOranges=0;

        for(int apple : apples){
            if((apple+a)>=s && (apple+a)<=t){
                counterApples++;
            }
        }

        for(int orange : oranges){
            if((orange+b)>=s && (orange+b)<=t){
                counterOranges++;
            }
        }

        System.out.println(counterApples);
        System.out.println(counterOranges);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where is Sam's house located? (s-t)! ");
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        System.out.println("Where is the Apple Tree located? ");
        int a = scanner.nextInt();

        System.out.println("Where is the Orange Tree located? ");
        int b = scanner.nextInt();

        System.out.println("Number of apples ");
        int numberOfApples = scanner.nextInt();


        System.out.println("Add your "+numberOfApples+" apples :");
        List<Integer> apples = new ArrayList<>();
        for (int i = 0; i < numberOfApples; i++) {
            apples.add(scanner.nextInt());
        }

        System.out.println("Number of oranges ");
        int numberOfOranges = scanner.nextInt();


        System.out.println("Add your "+numberOfOranges+" apples :");
        List<Integer> oranges = new ArrayList<>();
        for (int j = 0; j < numberOfOranges; j++) {
            oranges.add(scanner.nextInt());
        }

        scanner.close();

        countApplesAndOranges(s, t, a, b, apples, oranges);

    }

}
