package com.conversion.project.test.CousinPrimeValidation;

import com.conversion.project.resources.CousinPrimeValidation;
import com.google.common.base.Functions;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class CousinPrimeValidationTest {

    CousinPrimeValidation CousinPrimeValidation = new CousinPrimeValidation();

    public CousinPrimeValidationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void CousinPrimeValidation_Test_Validate_Number_With_Null_Return_False() {
        //Arrange
        String value = null;

        //Act
        boolean result = CousinPrimeValidation.validateNumber(value);

        //Assert
        assertFalse(result);

    }

    @Test
    public void CousinPrimeValidation_Test_Validate_Number_With_Valid_Number_Return_True() {
        //Arrange
        String value = "2";

        //Act
        boolean result = CousinPrimeValidation.validateNumber(value);

        //Assert
        assertNotNull(result);
        assertTrue(result);

    }
    
    @Test
    public void CousinPrimeValidation_Test_Validate_Number_With_Double_Format_Return_Error() {
       //Arrange
        String value = "2.0";
        NumberFormatException exception = null;

        //Act
        try {
            boolean result = CousinPrimeValidation.validateNumber(value);
        } catch (NumberFormatException e) {
            exception = e;
        }

        //Assert
        assertNotNull(exception);
        assertEquals("it is necessary to pass a valid integer number!", exception.getMessage());

    }
    
    @Test
    public void CousinPrimeValidation_Test_Validate_Number_With_Not_Cousin_Number_Return_False() {
        //Arrange
        String value = "1";

        //Act
        boolean result = CousinPrimeValidation.validateNumber(value);

        //Assert
        assertNotNull(result);
        assertFalse(result);

    }
    
    @Test
    public void CousinPrimeValidation_Test_Validate_Number_With_Not_Mutiple_Values_Return_All_True() {
        //Arrange

        // prime numbers two through thousand
        Integer[] value = {
            2, 3, 5, 7,11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
            101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,
            211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293,
            307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397,
            401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499,
            503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599,
            601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691,
            701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797,
            809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887,
            907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997
        };
        List<String> list = Lists.transform( Arrays.asList(value), Functions.toStringFunction());

        //Act
        list.stream().map(item -> CousinPrimeValidation.validateNumber(item)).map((Boolean result) -> {
            //Assert
            assertNotNull(result);
            return result;
        }).forEachOrdered(result -> {
            if(result){
                assertTrue(result);
            }else{
                throw new  AssertionError("it is necessary to pass a valid prime number!");
            }
        });
    }

}
