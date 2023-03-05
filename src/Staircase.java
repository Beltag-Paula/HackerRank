import java.util.Scanner;

public class Staircase {

    //this is the method from Hackerrank
    public static void rightAlignedStaircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

    //this two are not necessary , but I'm just flexing my Google Search skills :)
    public static void leftAlignedStaircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void realStaircase(int n){
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                count += 2;
            }
            for (int j = 0; j < count; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("What is the height of your staircase?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        System.out.println("Right-aligned : ");
        rightAlignedStaircase(n);

        System.out.println("Left-aligned : ");
        leftAlignedStaircase(n);

        System.out.println("Real staircase : ");
        realStaircase(n);


    }
}
