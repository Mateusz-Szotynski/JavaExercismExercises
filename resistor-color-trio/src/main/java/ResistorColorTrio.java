import java.util.Arrays;
import java.util.List;

class ResistorColorTrio {

    private static final int NUMBER_ELEMENTS = 2;
    private static final int IDX_NUMBER_OF_ZEROS = 2;

    String label(String[] colors) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(colors)
                .limit(3)
                .forEach(e -> builder.append(ResistorColors.valueOf(e.toUpperCase()).getValue()));
        char numberOfZeros = builder.charAt(2);
        int num = Integer.parseInt(String.valueOf(numberOfZeros));
        builder.deleteCharAt(2);
        System.out.println(builder.charAt(1));
        if (builder.charAt(1) == '0') {
            num++;
            builder.deleteCharAt(1);
        }
        if (builder.charAt(0) == '0') {
            builder.deleteCharAt(0);
        }
        System.out.println(numberOfZeros);
        if (num < 3) {
            builder.append("0".repeat(Math.max(0, num)));
            return builder.toString() + " ohms";
        } else if (num < 6) {
            num -= 3;
            builder.append("0".repeat(Math.max(0, num)));
            return builder.toString() + " kiloohms";
        } else if (num < 9) {
            num -= 6;
            builder.append("0".repeat(Math.max(0, num)));
            return builder.toString() + " megaohms";
        } else {
            num -= 9;
            builder.append("0".repeat(Math.max(0, num)));
            return builder.toString() + " gigaohms";
        }
    }


}

enum ResistorColors {
    BLACK(0), BROWN(1), RED(2), ORANGE(3), YELLOW(4),
    GREEN(5), BLUE(6), VIOLET(7), GREY(8), WHITE(9);

    private final int value;

    ResistorColors(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static String getZero() {
        return BLACK.toString().toLowerCase();
    }


    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
