public class Darts {
    int score(double xOfDart, double yOfDart) {
        Target target = new Target(1, 5, 10);
        boolean innerCircle = target.isInnerCircle(xOfDart, yOfDart);
        boolean middleCircle = target.isMiddleCircle(xOfDart, yOfDart);
        boolean outerCircle = target.isOuterCircle(xOfDart, yOfDart);

        if(innerCircle) {
            return 10;
        } else if (middleCircle) {
            return 5;
        } else if (outerCircle) {
            return 1;
        }
        return 0;
    }
}
class Target {
    private double innerCircleRadius;
    private double middleCircleRadius;
    private double outerCircleRadius;

    public Target(double innerCircleRadius, double middleCircleRadius, double outerCircleRadius) {
        this.innerCircleRadius = innerCircleRadius;
        this.middleCircleRadius = middleCircleRadius;
        this.outerCircleRadius = outerCircleRadius;
    }

    boolean isSymmetric(double x, double y) {
        return x == y;
    }

    double hypotenuse(double a, double b) {
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        return Math.sqrt(c);
    }

    boolean isInnerCircle(double x, double y) {
        if (isSymmetric(x, y)) {
            return Math.abs(x) <= innerCircleRadius && Math.abs(y * Math.sqrt(2)) <= innerCircleRadius;
        }
        return Math.abs(x) <= innerCircleRadius && Math.abs(hypotenuse(x, y)) <= innerCircleRadius;
    }

    boolean isMiddleCircle(double x, double y) {
        if (isSymmetric(x, y)) {
            return !isInnerCircle(x, y) && Math.abs(x) <= middleCircleRadius && Math.abs(y * Math.sqrt(2)) <= middleCircleRadius;
        }
        return !isInnerCircle(x, y) && Math.abs(x) <= middleCircleRadius && Math.abs(hypotenuse(x, y)) <= middleCircleRadius;
    }

    boolean isOuterCircle(double x, double y) {
        if (isSymmetric(x, y)) {
            return !isMiddleCircle(x, y) && Math.abs(x) <= outerCircleRadius && Math.abs(y * Math.sqrt(2)) <= outerCircleRadius;
        }
        return !isMiddleCircle(x, y) && Math.abs(x) <= outerCircleRadius && Math.abs(hypotenuse(x, y)) <= outerCircleRadius;
    }

    boolean isOutOfScope(double x, double y) {
        return !isOuterCircle(x, y);
    }
}
