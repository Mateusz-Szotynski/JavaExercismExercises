class NeedForSpeed {

    private final int speed;
    private final int batteryDrain;
    private int drivenMeters;
    private int batteryPercentage;

    private static final int NITRO_SPEED = 50;
    private static final int NITRO_BATTERY_DRAIN = 4;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        drivenMeters = 0;
        batteryPercentage = 100;
    }

    public boolean batteryDrained() {
        return batteryPercentage - batteryDrain < 0;
    }

    public int distanceDriven() {
        return drivenMeters;
    }

    public void drive() {
        if (!batteryDrained()) {
            drivenMeters += speed;
            batteryPercentage -= batteryDrain;
        }
    }

    public int maxMetersToDrive() {
        int x = batteryPercentage / batteryDrain;
        return x * speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(NITRO_SPEED, NITRO_BATTERY_DRAIN);
    }
}

class RaceTrack {

    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.maxMetersToDrive() >= distance;
    }
}
