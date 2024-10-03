class Acronym {

    private final String acronym;

    Acronym(String phrase) {
        StringBuilder str = new StringBuilder(phrase.replace(" ", "-").replace("_", "-").toUpperCase());
        System.out.println(str);
        int i = 1;
        for (;;) {
            int indexOfSpecialSign = str.indexOf("-");
            if (indexOfSpecialSign == -1) {
                str.delete(i, str.length());
                break;
            }
            str.delete(i, indexOfSpecialSign + 1);
            if (i > indexOfSpecialSign) {
                i = indexOfSpecialSign - 1;
            }
            i++;
        }

        acronym = str.toString();
    }

    String get() {
        return acronym;
    }

}
