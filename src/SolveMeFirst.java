import java.util.Scanner;

public class SolveMeFirst {

    public static int solveMeFirst(int a, int b) {
        return a+b;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("First number : ");
        a = in.nextInt();
        int b;
        System.out.println("Second number :");
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println("Their sum is : " +sum);
    }
}