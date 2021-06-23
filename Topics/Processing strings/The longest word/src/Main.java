import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split("\\s+");
        int max = 0;
        String maxS = "";
        for (String s : parts) {
            if (s.length() > max) {
                max = s.length();
                maxS = s;
            }
        }
        System.out.println(maxS);
    }
}