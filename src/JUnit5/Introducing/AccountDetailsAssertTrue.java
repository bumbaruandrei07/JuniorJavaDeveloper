package JUnit5.Introducing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountDetailsAssertTrue {
    //metoda assertTrue specifica clasei Assertions valideaza testul daca numele contine doar litere
    @Test
    public void validateName() {
        AccountDetails accountDetails = new AccountDetails("Anita", 0123412.0, 113412, 5000.0, "Savings");
        AccountDetails accountDetails2 = new AccountDetails("Anita4", 0123412.0, 113412, 5000.0, "Savings");

        //test accepted
        Assertions.assertTrue(accountDetails.getName().matches("^[a-zA-Z]*$"), " Verfiyng condition...");

        //test failed
        //   Assertions.assertTrue(accountDetails2.getName().matches("^[a-zA-Z]*$"), " Verfiyng condition...");

        //test accepted
        Assertions.assertTrue(!accountDetails.getAccountType().isEmpty());
    }

}
