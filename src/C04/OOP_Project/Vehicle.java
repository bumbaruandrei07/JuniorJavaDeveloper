package C04.OOP_Project;

import java.util.Locale;

public class Vehicle {

    //nu trebuie definit in constructor, este deja initializat, toate obiectele vor avea acest camp
    private static final String produceBy = "Nissan";
    //unic pt fiecare obiect -> nu este static
    private final int productionYear;
    //unic pt fiecare obiect -> nu este static
    private final String vin;
    private String plateNumber;
    private double kilometers;
    private int lastSoldOnYear;
    private double positionX;
    private double positionY;


    //Transforma campul plateNumber intr-o proprietate a obiectelor, care poate fi atat citita cat si actualizata.
    // Raspuns : getter + setter

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

//    Transforma campul kilometers intr-o proprietate read-only (i.e. poate fi citita, dar nu poate fi actualizata).
//    doar getter, fara setter

    public double getKilometers() {
        return this.kilometers;
    }

    //just read-only
    public int getLastSoldOnYear() {
        return this.lastSoldOnYear;
    }


//    Defineste cel putin 3 constructori diferiti ai clasei, la alegere.
//    Hints:
//    tine cont de criteriile anterioare in definirea corecta a constructorilor;
//    evita duplicarea codului in constructori utilizand mecanismul de reutilizare a codului

    //toti constructorii trebuie sa contine campurile final
    public Vehicle(String vin, int productionYear) {
        this.vin = vin;
        this.productionYear = productionYear;
    }

    public Vehicle(String vin, int productionYear, String plateNumber) {
        this(vin, productionYear); //apelam constructorul anterior
        this.plateNumber = plateNumber;
    }

    public Vehicle(String vin, int productionYear, String plateNumber, double kilometers) {
        this(vin, productionYear, plateNumber); //apelam constructorul anterior
        this.kilometers = kilometers;
    }

    public Vehicle(String vin, int productionYear, String plateNumber, double kilometers, int lastSoldOnYear, double positionX, double positionY) {
        this(vin, productionYear, plateNumber, kilometers);
        this.lastSoldOnYear = lastSoldOnYear;
        this.positionX = positionX;
        this.positionY = positionY;
    }


//    Implementeaza o metoda sellVehicle(String plateNumber, int lastSoldOnYear)
//    care actualizeaza corespunzator starea obiectului in urma unei (noi) achizitii.
//    Metoda va actualiza valorile campurilor plateNumber respectiv lastSoldOnYear.

    public void sellVehicle(String plateNumber, int lastSoldOnYear) {
        this.plateNumber = plateNumber;
        this.lastSoldOnYear = lastSoldOnYear;
    }

//    Implementeaza o metoda care permite mutarea masinii intr-o noua pozitie,
//    actualizand corespunzator coordonatele acesteia (i.e. positionX si positionY) precum si distanta parcursa (i.e. kilometers).
//    Pentru a calcula distanta parcursa se va folosi formula de distanta euclidiana intre doua puncte carteziene in plan

    public void updatePosition(double positionX, double positionY) {
        this.kilometers = Math.sqrt(((positionX - this.positionX) * (positionX - this.positionX)) +
                ((positionY - this.positionY) * (positionY - this.positionY)));
        this.positionX = positionX;
        this.positionY = positionY;
    }

    //V2

    public void updatePositionV2(double positionX, double positionY, double kilometers) {
        double xdif = this.positionX - positionX;
        double ydif = this.positionY - positionY;
        double newDistance = Math.sqrt(xdif * xdif + ydif * ydif);
        this.kilometers = newDistance;
        this.positionX = positionX;
        this.positionY = positionY;
    }

//    Implementeaza o metoda isVinValid(boolean isDrivingInNorthAmerica) care verifica daca seria sasiului unei masini este sau nu valida.
//    In cazul in care autovehiculul circula in zona Americii de Nord seria sasiului se va verifica conform algoritmului prezentat la adresa: Wikibooks - Vehicle Identification Numbers (VIN codes) - Check digit algorithm
//    Obs:Daca masina nu circula in America de Nord (i.e. parametrul isDrivingInNorthAmerica este false) nu trebuie sa faci nicio verificare. Prin urmare, in acest caz metoda va returna (intotdeauna) true.

    public boolean isVinValid(boolean isDrivingInNorthAmerica) {
//        Multiply this new number, the yield of the transliteration, with the assigned weight.
        int[] weights = {8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2};

        if (!isDrivingInNorthAmerica) {
            return true;
        }

        //construim numarul VIN translatat
        StringBuilder translatedVIN = new StringBuilder(this.vin.toUpperCase()); //il formam direct din vin
//        Remove all of the letters from the VIN by transliterating them with their numeric counterparts -> folosim metoda translateLetterToDigit
        for (int i = 0; i < translatedVIN.length(); i++) {
            char currentChar = translatedVIN.charAt(i); //reprezinta caracterul curent
            //daca caracterul curent este litera
            if (Character.isLetter(translatedVIN.charAt(i))) {
                translatedVIN.setCharAt(i, translateLetterToDigit(currentChar));
            }
        }
        int sum = 0;
        for (int i = 0; i < translatedVIN.length(); i++) {
            //   int currentDigit = Integer.parseInt(String.valueOf(translatedVIN.charAt(i)));
            // int currentDigit2 = translatedVIN.charAt(i) - '0'; //transformam dintr-un caracter care este cifra in valoarea lui intreaga efectiv
            int currentDigit = Character.getNumericValue(translatedVIN.charAt(i));
            sum += currentDigit * weights[i];
        }
        int remainder = sum % 11;
        char checkDigit; // '\0' -> caracterul null
        if (remainder == 10) {
            checkDigit = 'X';
        } else {
            checkDigit = (char) remainder;
        }
        return checkDigit == this.vin.charAt(8); //pozitia 9 de la 1 la 9, 8 de la 0 la 9
    }

    private char translateLetterToDigit(char c) {
        switch (c) {
            case 'a', 'j':
                return 1;
            case 'b', 'k', 's':
                return 2;
            case 'c', 'l', 't':
                return 3;
            case 'd', 'm', 'u':
                return 4;
            default:
                return 0;

        }
    }

    public void printVINDecomposed() {
        System.out.println("Identificatorul producatorului: " + this.vin.substring(0, 3));
        System.out.println("Atributele vehiculului: " + this.vin.substring(3, 8));
//        System.out.println("Cifra de verificare: " + this.vin.substring());

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "productionYear=" + productionYear +
                ", vin='" + vin + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", kilometers=" + kilometers +
                ", lastSoldOnYear=" + lastSoldOnYear +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
    public String display() {
        return String.format("Information about the vehicle:\n " +
                        "\t VIN: %s\n" +
                        "\t Producer Name: %s" +
                        "\t Production Year: %d",
                this.vin, produceBy, this.productionYear);

    }
}
