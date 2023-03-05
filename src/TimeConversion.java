import java.util.Scanner;

public class TimeConversion {
    //The method converts 12H time to Military time(which is 24H)
    public static String timeConversion(String s) {
        //To fix this error :  java.lang.StringIndexOutOfBoundsException
        // we have to be sure that the String s has a length of at least 9 before calling the charAt() method with an index of 8.
        if (s.length() < 9) {
            throw new IllegalArgumentException("Invalid time format");
        }

        String hours = s.substring(0, 2); //extracts the two characters from String s
        int number = Integer.parseInt(hours);

        if(s.charAt(8) == 'P' && number != 12) {number += 12;}
        else if(s.charAt(8) == 'A' && number == 12) {number = 0;}

        hours = String.format("%02d", number); //%02d is used to format an integer value as a                                                          //zero-padded string with a width of two characters

        return hours + s.substring(2, 8);

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What time is it? (12H format): Format : Hour:Minute:AM/PM");
        String time=scanner.next();

        scanner.close();

        System.out.println("Military time: ");
        String converseTime=timeConversion(time);
        System.out.println(converseTime);

    }
}
