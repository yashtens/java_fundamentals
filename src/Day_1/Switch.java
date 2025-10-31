package Day_1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number 1st:");
        int num1= scanner.nextInt();
        System.out.println("Enter the Number 2st:");
        int num2= scanner.nextInt();

        System.out.println("Enter your Choise:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.module:");
        int ch= scanner.nextInt();

        switch (ch)
        {
            case 1:
                int c=num1+num2;
                System.out.println("Addition=:"+c);
                break;

            case 2:
                int a=num1-num2;
                System.out.println("Subtraction=:"+a);
                break;

            case 3:
                int b=num1*num2;
                System.out.println("Multiplication=:"+b);
                break;

            case 4:
            int e=num1/num2;
            System.out.println("Division=:"+e);
            break;
            case 5:
            int h=num1%num2;
            System.out.println("module=:"+h);
            break;

            default:
                System.out.println("Invalid Choise:");
        }

    }
}
