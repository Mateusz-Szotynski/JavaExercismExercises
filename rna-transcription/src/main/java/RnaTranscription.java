class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder str = new StringBuilder();
        char[] chars = dnaStrand.toCharArray();
        for (int i = 0; i < dnaStrand.length(); i++) {
            String letter = switch (chars[i]) {
                case 'G' -> "C";
                case 'C' -> "G";
                case 'T' -> "A";
                case 'A' -> "U";
                default -> "";
            };
            str.append(letter);
        }
        return str.toString();
    }

}
