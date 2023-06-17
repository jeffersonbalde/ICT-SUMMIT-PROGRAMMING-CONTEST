package SCC.PROBLEM2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER 5 NUMBER WITH SEPARATED SPACES: ");

        int[] arr = new int[5];

        System.out.println();
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int j = 0; j < arr.length; j++){
                 if(arr[j] > max){
                max = arr[j];
            }
        }

        System.out.println(max);
    }
}