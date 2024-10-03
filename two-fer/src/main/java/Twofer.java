public class Twofer {
    public String twofer(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            return "One for you, one for me.";
        }
        return "One for " + name + ", one for me.";
    }
}
