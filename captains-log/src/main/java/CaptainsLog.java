import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private final Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        StringBuilder str = new StringBuilder("NCC-");
        str.append(1000 + random.nextInt(9000));
        return str.toString();
    }

    double randomStardate() {
        return 41000 + 1000 * random.nextDouble();
    }
}
