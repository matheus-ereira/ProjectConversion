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
public class TemperatureConverterTestCelsiusToFahrenheit {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    public TemperatureConverterTestCelsiusToFahrenheit() {
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
    public void TemperatureConverter_Test_Celsius_To_Fahrenheit_Return_Null() {
        //Arrange
        String value = null;

        //Act
        String result = temperatureConverter.celsiusToFahrenheit(value);

        //Assert
        assertNull(result);

    }

    @Test
    public void TemperatureConverter_Test_Celsius_To_Fahrenheit_Return_Two_Hundred_Forty_Eight() {
        //Arrange
        String value = "120";

        //Act
        String result = temperatureConverter.celsiusToFahrenheit(value);

        //Assert
        assertNotNull(result);

        assertEquals("248.0", result);

    }

    @Test
    public void TemperatureConverter_Test_Celsius_To_Fahrenheit_Return_Multiple_Values() {
        //Arrange
        String value1 = "42";
        String value2 = "37";
        String value3 = "300";

        //Act
        String result1 = temperatureConverter.celsiusToFahrenheit(value1);
        String result2 = temperatureConverter.celsiusToFahrenheit(value2);
        String result3 = temperatureConverter.celsiusToFahrenheit(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("107.6", result1);
        assertEquals("98.6", result2);
        assertEquals("572.0", result3);

    }

    @Test
    public void TemperatureConverter_Test_Celsius_To_Fahrenheit_Return_Decimal_Numbers() {
        //Arrange
        String value1 = "15.23";
        String value2 = "19.36";
        String value3 = "159.32";

        //Act
        String result1 = temperatureConverter.celsiusToFahrenheit(value1);
        String result2 = temperatureConverter.celsiusToFahrenheit(value2);
        String result3 = temperatureConverter.celsiusToFahrenheit(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("59.414", result1);
        assertEquals("66.848", result2);
        assertEquals("318.776", result3);

    }

    @Test
    public void TemperatureConverter_Test_Celsius_To_Fahrenheit_Return_Absolute_Zero() {
        //Arrange
        String value = "-273.15";

        //Act
        String result = temperatureConverter.celsiusToFahrenheit(value);

        //Assert
        assertNotNull(result);

        assertEquals("-459.67", result);

    }

    @Test
    public void TemperatureConverter_Test_Celsius_To_Fahrenheit_Return_Exception() {
        //Arrange
        String value = "-280.15";
        ArithmeticException exception = null;

        //Act
        try {
            String result = temperatureConverter.celsiusToFahrenheit(value);
        } catch (ArithmeticException e) {
            exception = e;
        }

        //Assert
        assertNotNull(exception);

        assertEquals("result cannot be greater than absolute zero!", exception.getMessage());

    }

}
