package Day_1;

import java.util.Scanner;

public class maxofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number 1ST:");
        int no1= sc.nextInt();
        System.out.println("Enter the Number 2ST:");
        int no2= sc.nextInt();
        System.out.println("Enter the Number 3ST:");
        int no3= sc.nextInt();

        if(no1>no2 && no1>no3)
        {
            System.out.println("A is the Largest Number");
        } else if (no2>no1 && no2>no3)
        {
            System.out.println("B is largest:");
        }
        else
        {
            System.out.println("C is Largest:");
        }
    }
}
