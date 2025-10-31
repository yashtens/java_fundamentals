package Day_1;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int rev=0;
        while(num!=0)
        {
            int r=num%10;
            rev=(rev*10)+r;
            num=num/10;
        }
        System.out.println("Reverse Number are:"+rev);
        int a[]={1,2,3,4,5,5,6};
        for(int i : a)
        {
            System.out.println(i);
        }
    }
}
