import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int[][] arr = new int[100][100];
            for (int i=0; i<100; i++){
                for (int j=0; i<100; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int maxV = Integer.MIN_VALUE;
//            int minV = Integer.MAX_VALUE;

            for (int i=0; i<100; i++){
                int s=0;
                for (int j=0; j<100; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
        }

    }
}
