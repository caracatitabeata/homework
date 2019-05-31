package a_25_05;

public class Sum100 {

    public static void main(String[] args) {
        int s =0;
        int x =0;
        for (int i=0; i<100; i++) {
            x+=1;
            s=s+x;
        }
    System.out.print("The sum of integers smaller than 100 is " + s);
    }
}
