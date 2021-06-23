import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split("\\?")[1]
                .split("&");
        boolean pass = false;
        String pas = "";
        for (String s : parts) {
            if (s.startsWith("pass")) {
                pass = true;
                pas = s.substring(5);
            }
            String[] p = s.split("=");
            if (p.length == 2) {
                System.out.println(s.replaceAll("=", " : "));
            } else {
                System.out.println(p[0] + " : not found");
            }
        }
        if (pass) {
            System.out.println("password : " + pas);
        }
    }
}