package Day_1;

public class function {
        static void demo()
        {
            System.out.println("Hello World");
        }
        static int multiply(int a, int b)
        {
            int c=a*b;
            return c;
        }
        static  int factorial(int number)
        {
            int fact=1;
            for(int i=1;i<=number;i++)
            {

                fact=fact*i;
            }
            return fact;
        }

    public static void main(String[] args) {
        System.out.println("a * b ="+multiply(10,20));
        System.out.println("Factorail is ="+factorial(5));
    }
}
