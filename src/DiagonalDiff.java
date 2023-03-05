import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDiff {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // primary diagonal
        int d1=0;
        for(int i=0; i<arr.size(); i++){
            for(int j=arr.size()-1; j>=0; j--){
                if(i==j)
                    d1 =d1+ arr.get(i).get(j);
            }

        }

        //second diagonal
        int d2=0;
        for(int i=0; i<arr.size(); i++){

            d2 =d2+ arr.get(i).get(arr.size()-i-1);
        }

        int absDiagonalDifference =d1-d2;
        return Math.abs(absDiagonalDifference);

    }

    public static void main(String[] args) {

        List<List<Integer>> matrix = new ArrayList<>();

        System.out.println("What is the size of your squared matrix?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Populate matrix with input values
        System.out.println("Populate your "+n+"x"+n+" matrix :");
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                System.out.println("Element :"+i+" "+j);
                row.add(scan.nextInt());
            }
            matrix.add(row);
        }
        scan.close();

        int diagonalDifference = diagonalDifference(matrix);
        System.out.println("|d1-d1| = "+diagonalDifference);
    }

}
