class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distanceTravelled;
    private int numberOfVictories;


    private static final int UNITS_PER_DRIVE = 10;

    public void drive() {
        distanceTravelled += UNITS_PER_DRIVE;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return Integer.compare(numberOfVictories, o.numberOfVictories);
    }
}
