package Day_1;

import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int p,r,t;
        System.out.println("Enter the Principle:");
        p=sc.nextInt();
        System.out.println("Entetr the rate :");
        r=sc.nextInt();
        System.out.println("Enter the time:");
        t= sc.nextInt();
        double si;
        si=(p*r*t)/100;
        System.out.println("Simple intrest ="+si);
    }
}
