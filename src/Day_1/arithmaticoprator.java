package Day_1;

import java.util.Scanner;

public class arithmaticoprator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber 1st:");
        int num1=sc.nextInt();
        System.out.println("Enter the number2nd:");
        int num2=sc.nextInt();
        int a=num1+num2;
        int b=num1-num2;
        int c=num1*num2;
        float d=num1/num2;
        int e=num1%num2;
        System.out.println("Addition is:"+a);
        System.out.println("Subtraction is:"+b);
        System.out.println("Multiplication is:"+c);
        System.out.println("Division is:"+d);
        System.out.println("module is:"+e);
        System.out.println();
    }
}
