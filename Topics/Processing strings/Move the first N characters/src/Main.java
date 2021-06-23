import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int n = sc.nextInt();
        if (n > text.length()) {
            System.out.println(text);
        } else {
            System.out.println(text.substring(n) +
                    text.substring(0, n));
        }
    }
}