package Day_1;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* System.out.println("Enter the 1st Number:");
        int a=sc.nextInt();
        System.out.println("Enter the 2st Number:");
        int b=sc.nextInt();
        System.out.println("Enter the 3st Number:");
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("Average="+avg);*/
        System.out.println("Enter the Side:");
        int side=sc.nextInt();
        float area=side*side;
        System.out.println("Area of Square:"+area);

    }
}
