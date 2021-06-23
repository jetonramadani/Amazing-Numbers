import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();

        double res = text.chars().filter(ch -> ch == 'g' || ch == 'c')
                .count();
        System.out.println(100 * res / text.length());
    }
}