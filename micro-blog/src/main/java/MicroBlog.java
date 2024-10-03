import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MicroBlog {
    public String truncate(String input) {
        int length = input.length();
        if (length <= 5) return input;

        StringBuilder str = new StringBuilder();
        input.codePoints()
                .limit(5)
                .forEach(str::appendCodePoint);

        return str.toString();
    }
}
