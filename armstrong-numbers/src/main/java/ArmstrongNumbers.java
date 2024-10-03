import java.util.ArrayList;
import java.util.List;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int digitsNum = numberOfDigits(numberToCheck);

        List<Integer> arrayOfDigits = separateDigitsFromNumber(numberToCheck, digitsNum);
        List<Integer> arrayOfPowDigits = new ArrayList<>();

        for(Integer x : arrayOfDigits) {
            arrayOfPowDigits.add((int) Math.pow(x, digitsNum));
        }

        int sum = 0;
        for (Integer x : arrayOfPowDigits) {
            sum += x;
        }

        return sum == numberToCheck;
    }

    List<Integer> separateDigitsFromNumber(int numberToSeparate, int numberOfDigits) {
        List<Integer> arrayOfDigits = new ArrayList<>();
        int i = 10, k = 1;
        for(int x = 0; x < numberOfDigits; x++) {
            arrayOfDigits.add((numberToSeparate % i) / k);
            i *= 10;
            k *= 10;
        }
        return arrayOfDigits;
    }

    int numberOfDigits(int numberToCheck) {
        int i = 1, digits = 0;
        while(numberToCheck / i != 0) {
            i *= 10;
            digits++;
        }
        return digits;
    }

}
