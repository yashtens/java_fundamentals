package Day_1;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil= sc.nextFloat();
        float pen= sc.nextFloat();
        float eraser= sc.nextFloat();
        float cost=pencil+pen+eraser;
        System.out.println("Bill="+cost);

    }
}
