import java.util.Arrays;
import java.util.List;

public class Speaking {
    static void main() {
        String str = "hajbfjabf";
        for (int i =0; i<str.length();i++){
            List<Character> vowels = Arrays.asList('a','e','i','o','u');
            vowels.contains(str) ; // still scans 1 by 1 → O(n)
        }

    }
}