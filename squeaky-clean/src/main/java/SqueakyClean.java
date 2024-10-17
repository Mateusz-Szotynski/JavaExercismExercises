import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

class SqueakyClean {
    static String clean(String identifier) {
        if (identifier.isEmpty()) {
            return identifier;
        }
        StringBuilder str = new StringBuilder(identifier);

        removeWhiteSpaces(str);
        kebabCaseToCamelCase(str);
        leetSpeakToNormalText(str);
        removeUselessCharacters(str);

        return str.toString();
    }

    static private void removeWhiteSpaces(StringBuilder str) {
        while (str.toString().contains(" ")) {
            str.replace(str.indexOf(" "), str.indexOf(" ") + 1, "_");
        }
    }

    static private void kebabCaseToCamelCase(StringBuilder str) {
        while (str.toString().contains("-")) {
            int idxOfSign = str.indexOf("-");
            str.deleteCharAt(idxOfSign);
            str.setCharAt(idxOfSign, Character.toUpperCase(str.charAt(idxOfSign)));
        }
    }

    static private void leetSpeakToNormalText(StringBuilder str) {
        Map<Character, Character> map = Map.ofEntries(
                Map.entry('4', 'a'),
                Map.entry('3', 'e'),
                Map.entry('0', 'o'),
                Map.entry('1', 'l'),
                Map.entry('7', 't')
        );

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                str.setCharAt(i, map.get(str.charAt(i)));
            }
        }
    }

    static private void removeUselessCharacters(StringBuilder str) {
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 65 || str.charAt(i) > 122) {
                str.deleteCharAt(i);
                i--;
            }
        }
    }
}
