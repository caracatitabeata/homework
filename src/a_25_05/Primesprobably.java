package a_25_05;

import java.util.Arrays;
import java.util.Scanner;

public class Primesprobably {


    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int n = myObj.nextInt();

        int valueofn = n;

        Boolean[] arr = new Boolean[n];
        Arrays.fill(arr, Boolean.TRUE);

        for (int i = 2; i < n; i++) {
            if (arr[i] == Boolean.TRUE) {
                for (int j = 2; j < n/i; j++) {
                    arr[j * i] = Boolean.FALSE;
                }
            }
        }

        System.out.print("Using the first method, the primes are ");
        for (int k=2;k<n;k++) {
            if (arr[k] == Boolean.TRUE) {
                System.out.print(" " + k);
            }
        }

        System.out.println(" ");

        //A doua metodă, folosind același principiu dar optimizat (cred?)
        double sqrt = java.lang.Math.sqrt(valueofn);
        for (int l = 2; l < sqrt; l++) {
            if (arr[l] == Boolean.TRUE) {
                for (int j = 0; j < n/l-l; j++) {
                    arr[l*l+j*l] = Boolean.FALSE;
                }
            }
        }
        System.out.print("And using the second method, the primes are ");
        for (int m=2;m<n;m++) {
            if (arr[m] == Boolean.TRUE) {
                System.out.print(" " + m);
            }
        }
    }
}
