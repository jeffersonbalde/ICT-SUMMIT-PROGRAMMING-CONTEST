package SCC.PROBLEM3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        

        System.out.println();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while(num < 0){
            System.out.println("Invalid Input");
            System.out.print("Enter a number: ");
            num  = sc.nextInt();
        }w21z


        int flag = 0;
        
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        
        if(flag == 0) System.out.println("The Number is a Prime Number");
        else System.out.println("The Number is not a Prime Number");
    }
}