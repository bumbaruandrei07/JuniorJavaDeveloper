package interview2.mileConverter;

public class NauticalMilesToKmConverter extends MilesToKmConverter {

    @Override
    public double getMilesToKmFactor() {
        return 1.852;
    }
}
