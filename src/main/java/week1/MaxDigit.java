package week1;

import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int n = myObj.nextInt();

        int x=0;
        int a=n;

        //Calculez numărul de cifre al numărului, pe care îl păstrez în variabila x, ce-mi va folosi la for-ul de jos.
        while (a>1) {
            a=a/10;
            x=x+1;
        }

        //M-am jucat puțin, să văd dacă pot calcula numărul de cifre și cu "for". Se poate.
        /*
        int y=0;
        for (int c=n; c>1; c= c/10) {
            y+=1;
        }
        System.out.println("The number of digits is " + y);
        */

        int max= 0;//Tuturor variabilelor trebuie să li se atribuie o valoare.
        // Mi-a luat ceva să-mi dau seama că e ok să le pun 0 :)).
        // :P Am zis la curs ca variabilele locale nu au valoare initiala
        for (int i=1; i<x; i++){
            int b=n%10;
            if (b>max) {max=b;}
            n=n/10;
        }

        System.out.println(max + " is the maximum digit");
    }
}