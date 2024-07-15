import java.util.*;

public class TakeInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Integer : ");
        int number = sc.nextInt();
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String Sentence = str.nextLine();
        // when you use a string to take a sentence input from user then you need to
        // used a separate scanner for it if the input statement is after some other
        // input statement
        // for example, if you input a number then input a string like this
        // System.out.print("Input a Integer : ");
        // int number = sc.nextInt();
        // System.out.print("Enter a String : ");
        // String Sentence = sc.nextLine();
        // System.out.println("Your Entered Integer : " + number);
        // System.out.println("Your Entered String : " + Sentence);
        // this wont take string input
        System.out.print("Enter a Floating Value : ");
        float decim = sc.nextFloat();
        System.out.println("Your Entered Integer : " + number);
        System.out.println("Your Entered String : " + Sentence);
        System.out.println("Your Entered Floating Value : " + decim);
    }
}
