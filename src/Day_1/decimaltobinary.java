package Day_1;

import java.util.Scanner;

public class decimaltobinary {
    static void dectobin(int n)
    {
        int pow=0;
        int binary=0;
        while(n!=0)
        {
            int rem=n%2;
            binary=binary+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println("Binary number are:"+binary);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int no=sc.nextInt();
        dectobin(no);
    }
}
