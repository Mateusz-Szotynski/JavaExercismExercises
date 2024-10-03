import java.util.ArrayList;
import java.util.List;

class NaturalNumber {

    private Classification classification;

    NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
       List<Integer> aliquotsOfNumber = findAliquots(number);
       int sum = aliquotsOfNumber.stream().mapToInt(Integer::intValue).sum();
       if (sum == number) {
           classification = Classification.PERFECT;
       } else if (sum > number) {
           classification = Classification.ABUNDANT;
       } else {
           classification = Classification.DEFICIENT;
       }
    }

    private List<Integer> findAliquots(int number) {
        List<Integer> aliquots = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                aliquots.add(i);
            }
        }
        return aliquots;
    }

    Classification getClassification() {
        return classification;
    }
}
