import java.util.Comparator;
import java.util.List;

class HighScores {

    private final List<Integer> highScoreList;

    public HighScores(List<Integer> highScores) {
        highScoreList = List.copyOf(highScores);
    }

    List<Integer> scores() {
        return List.copyOf(highScoreList);
    }

    Integer latest() {
        return highScoreList.getLast();
    }

    Integer personalBest() {
        return highScoreList.stream()
                .sorted(Comparator.reverseOrder())
                .toList()
                .getFirst();
    }

    List<Integer> personalTopThree() {
        return List.copyOf(highScoreList.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList());
    }

}
