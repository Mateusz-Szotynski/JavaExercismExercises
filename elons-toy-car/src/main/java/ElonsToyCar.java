public class ElonsToyCar {

    private int batteryPrecentage;
    private int drivenMeters;

    public ElonsToyCar() {
        this.batteryPrecentage = 100;
        this.drivenMeters = 0;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + drivenMeters + " meters";
    }

    public String batteryDisplay() {
        if (batteryPrecentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPrecentage + "%";
    }

    public void drive() {
        if (batteryPrecentage > 0) {
            batteryPrecentage -= 1;
            drivenMeters += 20;
        }
    }
}
