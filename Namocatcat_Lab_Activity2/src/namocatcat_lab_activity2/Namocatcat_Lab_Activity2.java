package namocatcat_lab_activity2;

import java.util.Scanner;

public class Namocatcat_Lab_Activity2 {


    static Scanner String = new Scanner(System.in);
    
    public static void main(String[] args) {
   
    System.out.print("Enter the message: ");
    String message = String.nextLine();
    
    int count = 0;
    
   String[] phrases = message.split("\\s+");
   for(String phrase : phrases){
    
  for(int c = 2; c <= phrase.length(); c++){
 
    if (Character.isUpperCase(phrase.charAt(0)) && Character.isUpperCase(phrase.charAt(1)) ) {
                count = 1;
                break;
            }
            }
   }
    
    if (count == 1){
       System.out.println("JEJE!");
    }
    else {
            System.out.println("uWu");
    }
    }
}
    


