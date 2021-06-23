import java.util.*;

public class Main {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u' || ch == 'y';
    }
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toLowerCase();
        int count = 0;
        int vowels = 0;
        int opposite = 0;
        for (char ch : word.toCharArray()) {
            if (!isVowel(ch)) {
                ++count;
                if (count == 3) {
                    count = 1;
                    ++vowels;
                }
                opposite = 0;
            } else {
                ++opposite;
                if (opposite == 3) {
                    opposite = 1;
                    ++vowels;
                }
                count = 0;
            }

        }

        System.out.println(vowels);
    }
}