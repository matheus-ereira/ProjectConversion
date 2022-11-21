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
public class TemperatureConverterTestFahrenheitToKelvin {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    public TemperatureConverterTestFahrenheitToKelvin() {
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
    public void TemperatureConverter_Test_Fahrenheit_To_Kelvin_Return_Null() {
        //Arrange
        String value = null;

        //Act
        String result = temperatureConverter.fahrenheitToKelvin(value);

        //Assert
        assertNull(result);

    }

    @Test
    public void TemperatureConverter_Test_Fahrenheit_To_Kelvin_Return_Three_Hundred_Sixty_Third() {
        //Arrange
        String value = "90";

        //Act
        String result = temperatureConverter.fahrenheitToKelvin(value);

        //Assert
        assertNotNull(result);

        assertEquals("305.372", result);

    }

    @Test
    public void TemperatureConverter_Test_Fahrenheit_To_Kelvin_Return_Multiple_Values() {
        //Arrange
        String value1 = "42";
        String value2 = "37";
        String value3 = "300";

        //Act
        String result1 = temperatureConverter.fahrenheitToKelvin(value1);
        String result2 = temperatureConverter.fahrenheitToKelvin(value2);
        String result3 = temperatureConverter.fahrenheitToKelvin(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("278.706", result1);
        assertEquals("275.928", result2);
        assertEquals("422.039", result3);

    }

    @Test
    public void TemperatureConverter_Test_Fahrenheit_To_Kelvin_Return_Decimal_Numbers() {
        //Arrange
        String value1 = "32.27";
        String value2 = "42.36";
        String value3 = "27.49";

        //Act
        String result1 = temperatureConverter.fahrenheitToKelvin(value1);
        String result2 = temperatureConverter.fahrenheitToKelvin(value2);
        String result3 = temperatureConverter.fahrenheitToKelvin(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("273.3", result1);
        assertEquals("278.906", result2);
        assertEquals("270.644", result3);

    }

    @Test
    public void TemperatureConverter_Test_Fahrenheit_To_Kelvin_Return_Absolute_Zero() {
        //Arrange
        String value = "-459.67";

        //Act
        String result = temperatureConverter.fahrenheitToKelvin(value);

        //Assert
        assertNotNull(result);

        assertEquals("0.0", result);

    }

    @Test
    public void TemperatureConverter_Test_Fahrenheit_To_Kelvin_Return_Exception() {
        //Arrange
        String value = "-480.67";
        ArithmeticException exception = null;

        //Act
        try {
            String result = temperatureConverter.fahrenheitToKelvin(value);
        } catch (ArithmeticException e) {
            exception = e;
        }

        //Assert
        assertNotNull(exception);

        assertEquals("result cannot be greater than absolute zero!", exception.getMessage());

    }

}
