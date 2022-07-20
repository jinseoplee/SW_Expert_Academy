package d1.p2056;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            String input = br.readLine();
            int y = Integer.parseInt(input.substring(0, 4));
            int m = Integer.parseInt(input.substring(4, 6));
            int d = Integer.parseInt(input.substring(6, 8));

            sb.append("#" + tc + " ");
            if ((m >= 1 && m <= 12) && (d >= 1 && d <= arr[m - 1])) {
                sb.append(String.format("%04d/", y) + 
                          String.format("%02d/", m) + 
                          String.format("%02d\n", d));
            } else {
                sb.append("-1\n");
            }
        }
        System.out.println(sb);
    }
}
