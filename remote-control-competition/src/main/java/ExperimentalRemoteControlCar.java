public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int distanceTravelled;

    private static final int UNITS_PER_DRIVE = 20;

    public void drive() {
        distanceTravelled += UNITS_PER_DRIVE;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
