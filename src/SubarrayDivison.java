import java.util.ArrayList;
import java.util.List;

public class SubarrayDivison {

    public static int birthday(List<Integer> s, int d, int m) {
        //so d is total and m are the units if 4 is sum and 3 is the units ---> then i1+i2+i3=4;
        // d is sum, m is units ---> i1+i2+...im=d
        // s - numbers on each of the squares of the chocolate; d - Ron's birth day ; m Ron's birth month
        //Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
        //
        //Lily decides to share a contiguous segment of the bar selected such that:
        //    The length of the segment matches Ron's birth month, and,
        //    The sum of the integers on the squares is equal to his birthday.
        //Determine how many ways she can divide the chocolate.
        //s[i,j] = d
        int counter=0;


        for(int i=0; i<=s.size()-m; i++){
            int sum =0;
            for(int j=0; j<m; j++){
                sum = sum + s.get(i+j);

            }
            if(sum==d){counter++;}
        }

        return counter;

    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);

        System.out.println(birthday(s,4,2));

    }

}
