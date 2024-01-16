package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10950_AB3 {
    public static void main(String args[]) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String tc = bf.readLine();
        int t = Integer.parseInt(tc);

        for(int T=1; T <= t; T++){
            String num = bf.readLine();
            StringTokenizer st = new StringTokenizer(num, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(A+B);
        }

    }
}
