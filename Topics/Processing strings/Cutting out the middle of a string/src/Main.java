import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int firsEnd = len % 2 == 0 ? len / 2 - 1 : len / 2;
        int secondStart = len % 2 == 0 ? firsEnd + 2 : firsEnd + 1;

        System.out.println(str.substring(0, firsEnd) + str.substring(secondStart));
    }
}