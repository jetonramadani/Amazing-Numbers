import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (char ch : str.toCharArray()) {
            System.out.print(ch + "" + ch);
        }
    }
}