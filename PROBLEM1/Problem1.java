package SCC.PROBLEM1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("ENTER POSITIVE INTEGER: ");
        int inputNum = scanner.nextInt();

        while (inputNum < 0) {
            System.out.println("INVALD INPUT");
            System.out.print("ENTER POSITIVE INTEGER: ");
            inputNum = scanner.nextInt();
        }

        int number = 1;
        for (int i = inputNum; i >= 1; i--) {
            number = number * i;

        }
        System.out.println(number);
    }
}
