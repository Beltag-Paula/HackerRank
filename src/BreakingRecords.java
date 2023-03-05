import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Maria plays college basketball and wants to go pro. Each season she maintains a record of her play.
She tabulates the number of times she breaks her season record for most points and least points in a game.
Points scored in the first game establish her record for the season, and she begins counting from there.

ex :   scores = [12,24,10,24]

                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1

     Returns : An arrayList of size 2 with the numbers of times she broke her records.
     -index 0 is for breaking most points records
     -index 1 is for breaking least points records.
* */

public class BreakingRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<>();
        int minimum=scores.get(0); int maximum=scores.get(0); int counterMin=0; int counterMax=0;

        for(int i=0; i<scores.size(); i++){
            //to find the minimum
            if(scores.get(i)<minimum){
                minimum=scores.get(i);
                counterMin++;
            }

            //to find the maximum
            if(scores.get(i)>maximum){
                maximum=scores.get(i);
                counterMax++;
            }
        }

        result.add(0,counterMax);
        result.add(1,counterMin);

        return result;

    }


    public static void main(String[] args){
        List<Integer> mariaScores = new ArrayList<>();

       /* Scanner scanner = new Scanner(System.in);

        System.out.println("How many scores do you want to tabulate ? ");
        int numberOfScores = scanner.nextInt();


        System.out.println("Add your "+numberOfScores+" scores :");
        for (int i = 0; i < numberOfScores; i++) {
            mariaScores.add(scanner.nextInt());
        }

        scanner.close();
        */

        mariaScores.add(10);
        mariaScores.add(5);
        mariaScores.add(20);
        mariaScores.add(20);
        mariaScores.add(4);
        mariaScores.add(5);
        mariaScores.add(2);
        mariaScores.add(25);
        mariaScores.add(1);

        mariaScores = breakingRecords(mariaScores);

        System.out.println(mariaScores);


    }
}
