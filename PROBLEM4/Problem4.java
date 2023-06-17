package SCC.PROBLEM4;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter number limit: ");
        int limit = scanner.nextInt();

        System.out.println();
        System.out.print("Enter multiple: ");
        int multiple = scanner.nextInt();

        for(int i = 1; i <= limit; i++){
            System.out.println(i + " x " + multiple + " = " + i * multiple);
        }
    }
}