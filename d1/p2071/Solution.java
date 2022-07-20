package d1.p2071;

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
                sum += Integer.parseInt(st.nextToken());
            }

            sb.append("#" + tc + " " + Math.round((sum / 10.0)) + "\n");
        }
        System.out.println(sb);
    }
}
