import java.util.Arrays;
import java.util.List;

class ResistorColor {
    int colorCode(String color) {
        return ResistorColorValue.valueOf(color.toUpperCase()).getValue();
    }

    String[] colors() {
        ResistorColorValue[] colors = ResistorColorValue.values();
        List<String> collect = Arrays.stream(colors)
                .map(ResistorColorValue::toString)
                .toList();

        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i] = collect.get(i);
        }
        return array;
    }
}

enum ResistorColorValue {

    BLACK(0), BROWN(1), RED(2), ORANGE(3), YELLOW(4), GREEN(5), BLUE(6), VIOLET(7), GREY(8), WHITE(9);

    private final int value;


    ResistorColorValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
