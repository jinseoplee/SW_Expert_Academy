package d1.p1933;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sb.append(i + " ");
            }
        }
        System.out.println(sb);
    }
}