package C04.OOP_Project;

public class RunnerVehicle {

    public static void main(String[] args){
        Vehicle vh1 = new Vehicle("0X",1999,"0x12X", 10000, 1999, 200, 2000);
        System.out.println(vh1.getKilometers());
        vh1.updatePositionV2(300,2000,10000);
        System.out.println(vh1.getKilometers());
        vh1.updatePosition(123,1000);
        System.out.println(vh1.getKilometers());

    }
}
