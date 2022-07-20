package d1.p1938;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String input = br.readLine();
        int a = input.charAt(0) - '0';
        int b = input.charAt(2) - '0';
        sb.append((a + b) + "\n" + (a - b) + "\n" + (a * b) + "\n" + (a / b));
        System.out.println(sb);
    }
}
