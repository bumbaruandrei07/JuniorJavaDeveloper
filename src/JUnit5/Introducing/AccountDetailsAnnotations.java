package JUnit5.Introducing;

import org.junit.jupiter.api.*;

public class AccountDetailsAnnotations {

    //this obj will be referenced througout this test class
    static AccountDetails accountDetails;



    //daca nu faceam metoda statica atunci primeam exceptia JUnitException, pentru ca metodele BeforeAll si AfterAll trebuie declarate statice
    // acest lucru se explica prin faptul ca aceste 2 metode se vor executa doar o data pentru fiecare test, nu avem nevoie de mai multe instante
    // there is no point in having multiple instances of it
    //ne ajuta sa mentinem o stare de-a lungul executiei tuturor testelor
    @BeforeAll
    static void initAll() {
        accountDetails = new AccountDetails("Anita", 01123142.0, 123412, 5000.0, "Savings");
        System.out.println("Account balance: " + accountDetails.getBalance());
        System.out.println("@BeforeAll block has been executed");
    }


    //this init method will be invoked before each test case is executed
    //in this way, we need to do is to define this init method just once
    // and it will be run before each and every test case
    //we use this to initialize something at the beginning of each test
    //asta inseamna ca un nou obiect de tipul AccountDetails cu balance 5000 va fi creat la inceputul fiecarui test

    //VARIANTA MAI CLEAN -> initializam obiectul in BeforeAll, ca sa nu-l mai recreem iar la fiecare inceput de test
//    @BeforeEach
//    void init() {
//        accountDetails = new AccountDetails("Anita", 01123142.0, 123412, 5000.0, "Savings");
//        System.out.println("@BeforeEach block has been executed");
//        System.out.println("Account balance: " + accountDetails.getBalance());
//
//    }

    @Test
    void depositTest() {
        accountDetails.deposit(500);
        System.out.println("@Test block for deposit has been executed");
    }

    @Test
    void withdrawTest() {
        accountDetails.withdraw(1000);
        System.out.println("@Test block for withdraw has been executed");
    }

    //this method will be executed after each test
    @AfterEach
    void balance() {
        System.out.println("@AfterEach has been executed");
        System.out.println("Account balance: " + accountDetails.getBalance());
    }

    //se executa la finalul tuturor testeleor, o singura data
    //run exactly once
    @AfterAll
    static void teardownAll() {
        System.out.println("Final account balance: " + accountDetails.getBalance());
        System.out.println("@AfterAll block has been executed");
        System.out.println("Clean all");
        accountDetails = null; //the object is no longer required
        //it represents a common use case of the AfterAll block in a JUnit test class
        //this is usually used to destroy any objects which were created to make it easier for the garbage collector to clean them up
    }
}
