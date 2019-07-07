package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int n = myObj.nextInt();
        int length = String.valueOf(n).length(); //Se pare că poți calcula numărul de cifre prin metoda asta, mai ușor

        //Pentru metoda 2 de rezolvare, am pus "n" în variabilele a și c.
        int a= n;
        int c= n;

        //Metoda 1 de rezolvare:
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            int b = n % 10;
            myList.add(b);
            n /= 10;
        }
        for (int j = 0; j < length / 2; j++) {
            if (myList.get(j) != myList.get(length - (1 + j))) {
                System.out.println("Not a palindrome");
                break;
            }
            if (j == (length / 2) - 1) {
                System.out.println("Palindrome");
            }
        }

        //Metoda 2 de rezolvare, luând inversul numărului. Cosmin are dreptate, e mai simplu așa.
        int x=0, y=0;
        for (int j=0; j<length; j++) {
            y=a%10;
            x=10*x+y;
            a/=10;
        }
        if (x == c) {
            System.out.println("Also palindrome");
        }
        else {System.out.println("Also not a palindrome");}
    }
}