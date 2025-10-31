package Day_1;

public class functionoverloading {
    void sum(int no)
    {
        int c=no*no;
        System.out.println("Square root is:"+c);
    }
    void sum(double no, double a) {
        double h = no + a;
        System.out.println("Addition is="+h);

    }
    boolean prime(int no)
    {
        for(int i=2;i<no;i++)
        {
            if(no%i==0)
            {
                System.out.println("not prime");
                break;

            }
            else
            {
                System.out.println("prime");
                break;
            }
        }
        return false;
    }
    void primerange(int no)
    {
        for(int i=0;i<no;i++)
        {
            if(prime(i))
            {
                System.out.println(i+  "");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        functionoverloading a=new functionoverloading();
        a.sum(10);
        a.sum(10.4,5.2);
        a.primerange(20);

    }


}
