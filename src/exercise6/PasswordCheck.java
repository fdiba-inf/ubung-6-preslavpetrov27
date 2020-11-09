package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
       String password = input.next.Line();
       boolean correct = true;
       if(password.length()<8){
         correct = false;

       }
       for (int i = 0; i  <password.length();i++){
       if (!Character.isLetterOrDigit(password.charAt(i))){
         correct = false;
         break;
       }
        int count = 0;
    }
       for (int i = 0; i  <password.length();i++){
         if (Character.isDigit(password.charAt(i))){
           count++;
         }
       }
       if ( count <2){
         correct = false;

       }
       if (correct == true){
         System.out.println("Password valid!");
         break;
       }else {
          System.out.println("Password invalid!");
         
       }
    }
    }
}
