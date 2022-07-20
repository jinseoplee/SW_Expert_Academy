package d1.p2068;

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

            int max = 0;
            for (int i = 0; i < 10; i++) {
                int n = Integer.parseInt(st.nextToken());
                if (n > max) {
                    max = n;
                }
            }
            sb.append("#" + tc + " " + max + "\n");
        }
        System.out.println(sb);
    }
}
