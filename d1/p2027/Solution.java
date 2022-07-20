package d1.p2027;

public class Solution {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                sb.append("+");
            }

            sb.append("#");

            for (int j = 4 - i; j > 0; j--) {
                sb.append("+");
            }

            sb.append("\n");
        }
        System.out.println(sb);
    }
}
