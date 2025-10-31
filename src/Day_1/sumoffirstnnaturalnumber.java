package Day_1;

import java.util.Scanner;

public class sumoffirstnnaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum1 = 0;
        for (int i = 0; i <= num; i++) {
                sum1 = sum1 + i;

        }
        System.out.println("Sum of natural number are:" + sum1);
    }
}
