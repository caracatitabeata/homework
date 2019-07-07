package week1;

import java.util.Scanner;

public class Primesagain {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int n = myObj.nextInt();


        System.out.print("The primes are ");

        int norest=0;
        for (int i=n-1; i>1;i--) {
            for (int j=1; j<i+1; j++) {
                if (i%j==0){
                norest+=1;
            }
        }
            if (norest==2) {
                System.out.print(i + " ");}
            norest=0;
        }
    }

}