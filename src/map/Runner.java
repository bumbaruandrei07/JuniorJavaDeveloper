package map;

import InnerClasses.quiz.ex01.Car;

import java.io.IOException;

public class Runner {

    private static CarRentalSystem carRentalSystem = new CarRentalSystem();

    public static void main(String[] args) throws IOException {

        carRentalSystem = CarRentalSystem.readCarsRentedFromBinaryFile();
        carRentalSystem.run();
        CarRentalSystem.writeCarsRentedToBinaryFile(carRentalSystem);

    }
}
