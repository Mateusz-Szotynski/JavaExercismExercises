class ResistorColorDuo {

    private static final int ELEMENTS = 2;

    int value(String[] colors) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < ELEMENTS; i++) {
            str.append(ResistorColors.valueOf(colors[i].toUpperCase()).getValue());
        }
        return Integer.parseInt(str.toString());
    }
}

enum ResistorColors {
    BLACK(0), BROWN(1), RED(2), ORANGE(3), YELLOW(4), GREEN(5),
    BLUE(6), VIOLET(7), GREY(8), WHITE(9);

    private final int value;

    ResistorColors(int value) {
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
