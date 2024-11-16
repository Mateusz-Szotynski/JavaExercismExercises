public class EliudsEggs {
    public int eggCount(int number) {
        String bits = Integer.toBinaryString(number);
        int length = bits.length();
        int numberOfEggs = 0;
        for (int i = 0; i < length; i++) {
            if (bits.charAt(i) == '1') numberOfEggs++;
        }
        return numberOfEggs;
    }

}
