import java.util.Scanner;

public class Lab4 {
    public static void main(String args[]) {
        Scanner name = new Scanner(System.in);
        String personName;
        System.out.println("Hello, what is your name?");
        personName = name.next();

        System.out.println("Nice to meet you " + personName + ", my names Philip!");
    }
}
