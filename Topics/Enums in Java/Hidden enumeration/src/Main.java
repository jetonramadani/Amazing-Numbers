import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    // write your program here
        System.out.println(Arrays.stream(Secret.values())
                .filter(s -> s.name().startsWith("STAR"))
                .count());
    }
}

/* sample enum for inspiration*/
   enum Secret {
    STAR, CRASH, START, // ...
}
