package JUnit5.Introducing;

public class AccountDetailsTest {

    AccountDetails accountDetails = new AccountDetails("Anita", 0123412.0, 113412, 5000.0, "Savings");

    void validateName(){
        if(accountDetails.getName().matches("^[a-zA-Z]*$")){
            System.out.println("Test passed: Name is valid");
        }
        else{
            System.out.println("Test failed: Name is invalid");
        }
    }

    public static void main(String [] args){
        AccountDetailsTest accountDetailsTest = new AccountDetailsTest();
        accountDetailsTest.validateName();

    }
}
