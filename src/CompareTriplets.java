import java.util.*;
/*The method compareTriplets compares two lists of integers (Alice and Bob) and returns a new list @compareAtoB with two integers.
The first index represents the number of times the first list (Alice's List) if it had an element greater than the corresponding element in the second list(Bob).
The second index represents the number of times the second list had an element greater than the corresponding element in the first list.
The input is taken from the command line and the result is written back to the command line.
*/
class Result1 {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> compareAtoB = new ArrayList<>();
        int aliceScore=0; int bobScore = 0;

        for(int i=0; i<3; i++){

            if(a.get(i)>b.get(i)){

                aliceScore ++;
            }
            if(a.get(i)<b.get(i)){
                bobScore ++;
            }

        }

        compareAtoB.add(0,aliceScore);
        compareAtoB.add(1,bobScore);
        return compareAtoB;
    }

}

public class CompareTriplets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First list = Alice List : add Alice's 3 numbers");
        String[] aTemp = scan.nextLine().split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        System.out.println("Second List = Bob List : add Bob's 3 numbers");
        String[] bTemp = scan.nextLine().split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = Result1.compareTriplets(a, b);
        System.out.println("Compare Triplets : ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }


}
