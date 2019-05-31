package a_25_05;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int n = myObj.nextInt();
        int x=0, f=1;
        for (int i=0; i<n; i++) {
            x+=1;
            f=f*x;
        }
        System.out.print("The factorial of " + n + " is " + f);
    }
}
