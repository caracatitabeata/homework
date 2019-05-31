package a_25_05;

import java.util.Scanner;

public class Primes {

    public static void main(String[] args) {
        System.out.print("Insert your number, and I will display all the primes smaller than it:");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int n = myObj.nextInt();
        int b=n; //Păstrez în "a" valoarea lui "n" pentru a mă ajuta la afișare, la ultimul mesaj.
        for (n=n-1; n>1; n--) {
            for (int a=n-1; a > 1; a--){
                if (n % a == 0) {
                    break;
                }
                if (a == 2) {
                    //System.out.println(n + " is a prime number"); Ar fi apărut unul sub altul inițial,
                    // dar am mai rafinat.
                    System.out.print(n + " ");
                }
            }
        }System.out.print("are all the prime numbers smaller than " + b + ".");
    }
}

//Mă bucur că am știut să-l fac pe ăsta :)).
