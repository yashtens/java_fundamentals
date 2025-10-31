package Day_1;

import java.util.Scanner;

public class prime
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int no= sc.nextInt();
        int c=2;
        for(int i=0;i<no;i++);
        {
            if(no%c!=0)
            {
                System.out.println("Number is prime");

            }
            else
            {
                System.out.println("Number is not prime");
            }
        }
    }
}