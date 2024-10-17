import java.util.Locale;
import java.util.Map;

class SqueakyClean {
    static String clean(String identifier) {
        if (identifier.isEmpty()) {
            return identifier;
        }

        StringBuilder str = new StringBuilder(identifier);

        Map<Character, Character> map = Map.ofEntries(
                Map.entry('4', 'a'),
                Map.entry('3', 'e'),
                Map.entry('0', 'o'),
                Map.entry('1', 'l'),
                Map.entry('7', 't')
        );

        removeWhiteSpaces(str);


        return str.toString();
    }

    static private void removeWhiteSpaces(StringBuilder str) {
        while (str.toString().contains(" ")) {
            str.replace(str.indexOf(" "), str.indexOf(" ") + 1, "_");
        }
    }

    static private void kebabCaseToCamelCase(StringBuilder str) {
        while (str.toString().contains("-")) {
            str.replace(str.indexOf("-"), str.indexOf("-") + 1, String.valueOf(str.charAt(str.indexOf("-") + 1)).toUpperCase(Locale.ROOT));
        }
    }
}
