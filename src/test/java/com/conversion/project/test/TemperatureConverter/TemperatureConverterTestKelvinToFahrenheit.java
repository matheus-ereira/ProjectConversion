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
public class TemperatureConverterTestKelvinToFahrenheit {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    public TemperatureConverterTestKelvinToFahrenheit() {
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
    public void TemperatureConverter_Test_Kelvin_To_Fahrenheit_Return_Null() {
        //Arrange
        String value = null;

        //Act
        String result = temperatureConverter.kelvinToFahrenheit(value);

        //Assert
        assertNull(result);

    }

    @Test
    public void TemperatureConverter_Test_Kelvin_To_Fahrenheit_Return_One_Hundred_Seventy() {
        //Arrange
        String value = "350";

        //Act
        String result = temperatureConverter.kelvinToFahrenheit(value);

        //Assert
        assertNotNull(result);

        assertEquals("170.33", result);

    }

    @Test
    public void TemperatureConverter_Test_Kelvin_To_Fahrenheit_Return_Multiple_Values() {
        //Arrange
        String value1 = "355";
        String value2 = "327";
        String value3 = "302";

        //Act
        String result1 = temperatureConverter.kelvinToFahrenheit(value1);
        String result2 = temperatureConverter.kelvinToFahrenheit(value2);
        String result3 = temperatureConverter.kelvinToFahrenheit(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("179.33", result1);
        assertEquals("128.93", result2);
        assertEquals("83.93", result3);

    }

    @Test
    public void TemperatureConverter_Test_Kelvin_To_Fahrenheit_Return_Decimal_Numbers() {
        //Arrange
        String value1 = "270.20";
        String value2 = "319.55";
        String value3 = "337.98";

        //Act
        String result1 = temperatureConverter.kelvinToFahrenheit(value1);
        String result2 = temperatureConverter.kelvinToFahrenheit(value2);
        String result3 = temperatureConverter.kelvinToFahrenheit(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("26.69", result1);
        assertEquals("115.52", result2);
        assertEquals("148.694", result3);

    }

    @Test
    public void TemperatureConverter_Test_Kelvin_To_Fahrenheit_Return_Absolute_Zero() {
        //Arrange
        String value = "0";

        //Act
        String result = temperatureConverter.kelvinToFahrenheit(value);

        //Assert
        assertNotNull(result);

        assertEquals("-459.67", result);

    }

    @Test
    public void TemperatureConverter_Test_Kelvin_To_Fahrenheit_Return_Exception() {
        //Arrange
        String value = "-10";
        ArithmeticException exception = null;

        //Act
        try {
            String result = temperatureConverter.kelvinToFahrenheit(value);
        } catch (ArithmeticException e) {
            exception = e;
        }

        //Assert
        assertNotNull(exception);

        assertEquals("result cannot be greater than absolute zero!", exception.getMessage());

    }

}
