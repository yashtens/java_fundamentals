package Day_1;

public class pattern {
    public static void main(String[] args) {
       /* int i;
        for(i=0;i<4;i++)
        {
            System.out.println("****");
        }*/
       /* int c=1;
        while(c<=4)
        {
            System.out.println("****");
            c++;
        }*/
        /*for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }*/
       /* for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    */
        /*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*int counter=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }*/
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
