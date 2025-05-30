// fibonacci series :-->> 0 1 1 2 3 5 8 13 .........


import java.util.Scanner;
public class Fibonacci {
    static int fibo (int n ){
        if(n==0 || n==1) return  n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n to find the nth fibonacci value");
        int n=sc.nextInt();
        int result=fibo(n);
        System.out.println(result);
    }
}
