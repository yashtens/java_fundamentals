package Day_1;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int a [] = new int [6];
        Scanner sc  = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int start=0;
        int end=a.length-1;
        while (start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
       int n = a.length;
       for(int i=0; i<n/2; i++){
           int temp = a[i];
           a[i] = a[n-1-i];
           a[n-1-i] = temp;
       }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
