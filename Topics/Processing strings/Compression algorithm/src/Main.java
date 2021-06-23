import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        char last = chars[0];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != last) {
                System.out.print(last + "" + count);
                last = chars[i];
                count = 0;
            }
            if (chars.length - 1 == i) {
                System.out.println(chars[i] + "" + ++count);
            }
            ++count;
        }

    }
}