import java.util.Arrays;

public class Hamming {

    private int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("strands must be of equal length");
        if (leftStrand.contentEquals(rightStrand)) {
            hammingDistance = 0;
        } else {
            char[] leftStrandArray = leftStrand.toCharArray();
            char[] rightStrandArray = rightStrand.toCharArray();
            int length = leftStrand.length();
            for (int i = 0; i < length; i++) {
                if (leftStrandArray[i] != rightStrandArray[i]) {
                    hammingDistance++;
                }
            }
        }
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
