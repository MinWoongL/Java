package Practice;

import java.util.Scanner;

public class dowhileswitch {
    public static void main(String [] args) throws Exception
    {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while(i<5);

        i = 0;
        while(i<5)
        {
            System.out.println(i);
            i++;
        }
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        switch (N){
            case 1:
                System.out.println("A");
//                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
        }
    }
}
