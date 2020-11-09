package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        assert number>0;
        int palindrom = 0;
        int temp = number;
        while (temp>0) {

         int a = temp % 10;
         palindrom = palindrom*10 + a;
         temp = temp/10;

        }
        boolean  correct = true;
        if   ( palindrom != number) {
          correct = false;
        }
      System.out.println("Palindrome: " + correct);

    }
}
