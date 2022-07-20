package d1.p2072;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());

            int sum = 0;
            for (int i = 0; i < 10; i++) {
                int n = Integer.parseInt(st.nextToken());
                if (n % 2 == 1) {
                    sum += n;
                }
            }
            sb.append("#" + tc + " " + sum + "\n");
        }
        System.out.println(sb);
    }
}
