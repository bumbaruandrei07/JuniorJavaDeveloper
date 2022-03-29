package JUnit_ParameterizedTests.DefiningAnArgumentConverter.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter; //allows us to define a transformation for our argument, can be used repeadedly across multiple test cases


//We will use this RoleConverter in order to take in the role of an employee in the organization as the parameter
// and then return the uppercase of that role


public class RoleConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object source, Class<?> target) throws ArgumentConversionException {

        Assertions.assertEquals(String.class, target); //type of the target, we make sure that the returned type of target is String
        return String.valueOf(source).toUpperCase(); //return the source as long as the return type matches the target type
        //we simply transform the source into a string by calling String.valueOf

    }
}
