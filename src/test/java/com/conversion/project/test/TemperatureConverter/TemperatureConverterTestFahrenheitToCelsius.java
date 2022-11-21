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
public class TemperatureConverterTestFahrenheitToCelsius {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    public TemperatureConverterTestFahrenheitToCelsius() {
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
    public void TemperatureConverter_Test_Fahrenheit_To_Celsius_Return_Null() {
        //Arrange
        String value = null;

        //Act
        String result = temperatureConverter.fahrenheitToCelsius(value);

        //Assert
        assertNull(result);

    }

    @Test
    public void TemperatureConverter_Test_Fahrenheit_To_Celsius_Return_Thirty_Two() {
        //Arrange
        String value = "90";

        //Act
        String result = temperatureConverter.fahrenheitToCelsius(value);

        //Assert
        assertNotNull(result);

        assertEquals("32.222", result);

    }

    @Test
    public void TemperatureConverter_Test_Fahrenheit_To_Celsius_Return_Multiple_Values() {
        //Arrange
        String value1 = "42";
        String value2 = "37";
        String value3 = "300";

        //Act
        String result1 = temperatureConverter.fahrenheitToCelsius(value1);
        String result2 = temperatureConverter.fahrenheitToCelsius(value2);
        String result3 = temperatureConverter.fahrenheitToCelsius(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("5.556", result1);
        assertEquals("2.778", result2);
        assertEquals("148.889", result3);

    }

    @Test
    public void TemperatureConverter_Test_Fahrenheit_To_Celsius_Return_Decimal_Numbers() {
        //Arrange
        String value1 = "15.23";
        String value2 = "19.36";
        String value3 = "159.32";

        //Act
        String result1 = temperatureConverter.fahrenheitToCelsius(value1);
        String result2 = temperatureConverter.fahrenheitToCelsius(value2);
        String result3 = temperatureConverter.fahrenheitToCelsius(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("-9.317", result1);
        assertEquals("-7.022", result2);
        assertEquals("70.733", result3);

    }

    @Test
    public void TemperatureConverter_Test_Fahrenheit_To_Celsius_Return_Absolute_Zero() {
        //Arrange
        String value = "-459.67";

        //Act
        String result = temperatureConverter.fahrenheitToCelsius(value);

        //Assert
        assertNotNull(result);

        assertEquals("-273.15", result);

    }

    @Test
    public void TemperatureConverter_Test_Fahrenheit_To_Celsius_Return_Exception() {
        //Arrange
        String value = "-480.67";
        ArithmeticException exception = null;

        //Act
        try {
            String result = temperatureConverter.fahrenheitToCelsius(value);
        } catch (ArithmeticException e) {
            exception = e;
        }

        //Assert
        assertNotNull(exception);

        assertEquals("result cannot be greater than absolute zero!", exception.getMessage());

    }

}
