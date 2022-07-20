package d1.p2050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i) - 'A' + 1 + " ");
        }
        System.out.println(sb);
    }
}