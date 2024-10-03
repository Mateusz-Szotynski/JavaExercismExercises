public class Lasagna {

    private static int MINUTES_IN_OVEN = 40;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return MINUTES_IN_OVEN;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int timeInMinutesInOven) {
        return MINUTES_IN_OVEN - timeInMinutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int numberOfLayers, int timeInMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + timeInMinutesInOven;
    }
}
