package main;

import student.Student;
import java.util.Scanner;

public class StudentTest {

  public static void main(String[] args) {
      Scanner inputNum = new Scanner(System.in);
      Student e1 = new Student();
      Student e2 = new Student();   
      Student e3 = new Student();
      
      System.out.print("Enter test case number: ");
      int Testcase = inputNum.nextInt();
  
    switch (Testcase) {
      
        case 1 ->
        {
            e1 = new Student("Jemar Jude", "Maranga", 17);
            System.out.println("Test Case 1: Student under 18");
            System.out.println(e1.toString());
        }
        case 2 ->
        {
            e2 = new Student("Jemar Jude", "Maranga", 17);
            e2.increaseAge();
            System.out.println("Test Case 2: Increase age of student1");
            System.out.println(e2.toString());
        }
        case 3 ->
        {
            e3 = new Student("Jemar Jude", "Maranga", 19);
            System.out.println("Test Case 3: Student over 18");
            System.out.println(e3.toString());
        }
    }
  }
}
