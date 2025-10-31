package Day_1;

import java.util.Scanner;

public class binarytodecimal {
      public static void binatodec(int bi)
      {
          int pow=0;
          int decnum=0;

          while(bi!=0)
          {
              int lastdigit=bi%10;
              decnum=decnum +(lastdigit* (int)Math.pow(2,pow));
              pow++;
              bi=bi/10;
          }
          System.out.println("Decimal number are="+decnum);
      }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary Number:");
        int b1=sc.nextInt();
        binatodec(b1);
    }
}
