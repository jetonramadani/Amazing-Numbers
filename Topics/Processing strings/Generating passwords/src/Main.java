import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int uppercase = sc.nextInt();
        int lowercase = sc.nextInt();
        int numbers = sc.nextInt();
        int total = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < uppercase; i++) {
            sb.append((char) ('A' + i % 2));
        }
        for (int i = 0; i < lowercase; i++) {
            sb.append((char) ('a' + i % 2));
        }
        for (int i = 0; i < numbers; i++) {
            sb.append((char) ('1' + i % 2));
        }
        for (int i = uppercase + lowercase + numbers; i < total; i++) {
            sb.append((char) ('A' + i % 2));
        }
        System.out.println(sb);
    }
}