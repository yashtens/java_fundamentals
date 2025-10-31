package Day_1;

import java.sql.SQLOutput;

public class Butterfly {
    public static void main(String[] args) {
        int no=4;
         for(int  i=1;i<=no;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             for(int j=1;j<=2*(no-i);j++)
             {
                 System.out.print(" ");
             }
             for (int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();

         }
         for(int i=no;i>=1;i--)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             for(int j=1;j<=2*(no-i);j++)
             {
                 System.out.print(" ");
             }
             for (int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }

    }
}
