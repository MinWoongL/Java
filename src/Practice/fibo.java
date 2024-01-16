package Practice;

import java.util.Scanner;

public class fibo {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibofunc(N));

    }

    static int fibofunc(int n){
        if (n==0)
            return 0;
        else if (n<2)
            return 1;
        else {
            return fibofunc(n-1) + fibofunc(n-2);
        }
    }
}
