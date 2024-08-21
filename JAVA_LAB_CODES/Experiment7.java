import java.util.*;

public class Experiment7 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int b = 2;
        int c;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        try {
            System.out.println("Program Stated");
            for (int i = 0; i < 5; i++) {
                c = a[i] % b;
                System.out.println(c);
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Program Ended");
    }
}
