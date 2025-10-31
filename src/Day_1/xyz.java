package Day_1;

import java.util.Scanner;

public class xyz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println(fact);
        int sum=0;
        while(n>0)
        {
            int rem=fact%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
