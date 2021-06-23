import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String search = sc.nextLine();
        int i = 0;
        int len2 = search.length();
        int count = 0;
        while (i <= str.length() - len2) {
            if (str.substring(i, i + len2).equals(search)) {
                i += len2;
                ++count;
            } else {
                ++i;
            }
        }
        System.out.println(count);
    }
}