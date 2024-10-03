import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

    public boolean isPangram(String input) {
        if (input.isEmpty() || input.isBlank()) {
            return false;
        }
        Map<Alphabet, Boolean> map = new HashMap<>();
        for (Alphabet letter : Alphabet.values()) {
            map.put(letter, false);
        }
        for (Alphabet letter : Alphabet.values()) {
            if (Alphabet.contains(input, letter)) {
                map.replace(letter, false, true);
            }
        }
        return !map.containsValue(false);
    }

}

enum Alphabet {
    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, W, X, Y, Z;

    static boolean contains(String string, Alphabet letter) {
        return string.toUpperCase()
                .contains(letter.name());
    }
}
