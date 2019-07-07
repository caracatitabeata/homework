package week1;

public class Sum100 {

    public static void main(String[] args) {
        int s =0;
        int x =0;
        for (int i=0; i<100; i++) {
            x+=1; //de ce mai ai nevoie de x daca il ai pe i ???
            s=s+x;
            //s+=i; e suficient
        }
    System.out.print("The sum of integers smaller than 100 is " + s);
    }
}
