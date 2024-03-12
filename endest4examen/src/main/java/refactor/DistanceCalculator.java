package refactor;

/*
 * Utiliza nombres más descriptvos para las variables.
 */

public class DistanceCalculator {

    double ubicacionEjeX;
    double ubicacionEjeY;

    public double calculateDistance(double ubicacionEjeX, double ubicacionEjeY) {
        return ubicacionEjeX * ubicacionEjeY;
    }
}