import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("-");
        System.out.printf("%s/%s/%s", date[1], date[2], date[0]);
    }
}