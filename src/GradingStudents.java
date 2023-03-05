import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
   This Java code defines a method called gradingStudents that takes as input a List of Integer values representing student grades.
   The method returns a List of rounded grades for these students.
   The method iterates over the input List using a for loop and an index variable i.
   For each grade in the List, the code checks if the grade is greater than or equal to 38.

   If the grade is less than 38, the code does nothing to it and moves on to the next grade.
   If the grade is greater than or equal to 38, the code checks if the grade modulo 5 (i.e. the remainder when the grade is divided by 5) is less than or equal to 2.
   If it is, the code does nothing to the grade.
   If the grade modulo 5 is greater than 2, the code rounds the grade up to the next multiple of 5 by adding the difference between the grade modulo 5 and 5.
 This is done using the set method on the List, which updates the value of the grade at the specified index i in the List.

   Finally, the method returns the updated List of rounded grades.
   */
public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for(int i = 0;i < grades.size();i++){
            if(grades.get(i)>=38) //
            {
                if(grades.get(i)%5<=2){}
                else grades.set(i, grades.get(i)+(5-grades.get(i)%5));
            }
        }
        return grades;


    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of grades: ");
        int numberOfGrades = scanner.nextInt();


        System.out.println("Add your "+numberOfGrades+" numbers :");
        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < numberOfGrades; i++) {
            grades.add(scanner.nextInt());
        }

        scanner.close();

        List<Integer> roundedGrades = gradingStudents(grades);
        System.out.println("Grades have been rounded. Results : "+roundedGrades);

    }

}
