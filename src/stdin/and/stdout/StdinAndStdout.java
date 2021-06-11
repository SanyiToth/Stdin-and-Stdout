package stdin.and.stdout;

import java.util.Scanner;

public class StdinAndStdout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        int myInt = sc.nextInt();
        double myDouble = sc.nextDouble();

        sc.close();

        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }

}
