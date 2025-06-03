// euclid's algo ---->>> gcd(x,y)=gcd(y,x%y)

import java.util.Scanner;

public class GCDRecursive {
    static int gcd(int x,int y){
        if (x < 0 || y < 0) throw new IllegalArgumentException("GCD requires non-negative integers");
        if (y==0) return x;
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println( gcd(x,y));
    }
}
