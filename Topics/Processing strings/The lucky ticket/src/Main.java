import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        byte[] chars = sc.next().getBytes(StandardCharsets.UTF_8);
        int res = chars[0] - chars[5];
        res += chars[1] - chars[4];
        res += chars[2] - chars[3];
        System.out.println(res == 0 ? "Lucky" : "Regular");
    }
}