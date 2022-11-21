package com.conversion.project.test.TemperatureConverter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.conversion.project.resources.TemperatureConverter;

/**
 *
 * @author mathe
 */
public class TemperatureConverterTestCelsiusToKelvin {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    public TemperatureConverterTestCelsiusToKelvin() {
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
    public void TemperatureConverter_Test_Celsius_To_Kelvin_Return_Null() {
        //Arrange
        String value = null;

        //Act
        String result = temperatureConverter.celsiusToKelvin(value);

        //Assert
        assertNull(result);

    }

    @Test
    public void TemperatureConverter_Test_Celsius_To_Kelvin_Return_Three_Hundred_Sixty_Third() {
        //Arrange
        String value = "90";

        //Act
        String result = temperatureConverter.celsiusToKelvin(value);

        //Assert
        assertNotNull(result);

        assertEquals("363.15", result);

    }

    @Test
    public void TemperatureConverter_Test_Celsius_To_Kelvin_Return_Multiple_Values() {
        //Arrange
        String value1 = "42";
        String value2 = "37";
        String value3 = "300";

        //Act
        String result1 = temperatureConverter.celsiusToKelvin(value1);
        String result2 = temperatureConverter.celsiusToKelvin(value2);
        String result3 = temperatureConverter.celsiusToKelvin(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("315.15", result1);
        assertEquals("310.15", result2);
        assertEquals("573.15", result3);

    }

    @Test
    public void TemperatureConverter_Test_Celsius_To_Kelvin_Return_Decimal_Numbers() {
        //Arrange
        String value1 = "32.27";
        String value2 = "42.36";
        String value3 = "27.49";

        //Act
        String result1 = temperatureConverter.celsiusToKelvin(value1);
        String result2 = temperatureConverter.celsiusToKelvin(value2);
        String result3 = temperatureConverter.celsiusToKelvin(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("305.42", result1);
        assertEquals("315.51", result2);
        assertEquals("300.64", result3);

    }

    @Test
    public void TemperatureConverter_Test_Celsius_To_Kelvin_Return_Absolute_Zero() {
        //Arrange
        String value = "-273.15";

        //Act
        String result = temperatureConverter.celsiusToKelvin(value);

        //Assert
        assertNotNull(result);

        assertEquals("0.0", result);

    }

    @Test
    public void TemperatureConverter_Test_Celsius_To_Kelvin_Return_Exception() {
        //Arrange
        String value = "-280.15";
        ArithmeticException exception = null;

        //Act
        try {
            String result = temperatureConverter.celsiusToKelvin(value);
        } catch (ArithmeticException e) {
            exception = e;
        }

        //Assert
        assertNotNull(exception);

        assertEquals("result cannot be greater than absolute zero!", exception.getMessage());

    }

}
