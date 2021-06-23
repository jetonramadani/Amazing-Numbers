import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        System.out.println(str.toString().equals(str.reverse().toString())
                ? "yes" : "no");
    }
}