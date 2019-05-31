package a_25_05;

public class Array {

    public static void main(String[] args) {
        int[] array = {10, 20, 34242, 94, 1};
        int a = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > a) {
                a = array[i + 1];
            }
        }
        System.out.println(a);


        for (int number : array) {
            if (number > a) {
                a = number;
            }
        }
        System.out.println(a + " is the biggest number");
    }
}