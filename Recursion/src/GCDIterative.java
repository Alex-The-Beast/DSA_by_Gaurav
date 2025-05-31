import java.util.Scanner;

public class GCDIterative {
    static int gcd (int x,int y){
        if(x<=0 || y<=0 ) throw new IllegalArgumentException("The value of x and y should be greater than zero");
        while(y != 0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x for finding the gcd .");
        int x=sc.nextInt();
        System.out.println("Enter the value of y for fonding the gcd.");
        int y=sc.nextInt();
        System.out.println(gcd(x,y));

    }
}
