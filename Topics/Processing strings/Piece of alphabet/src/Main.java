import java.util.Scanner;

class Main {
    public static boolean checkAscending(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) + 1 != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkAscending(str));
    }
}