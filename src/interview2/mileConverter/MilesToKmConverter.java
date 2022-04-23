package interview2.mileConverter;

public class MilesToKmConverter {

    public final double milesToKm(double miles) {
        return getMilesToKmFactor() * miles;
    }

    public double getMilesToKmFactor() {
        return 1.609;
    }

}
