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
public class TemperatureConverterTestKelvinToCelsius {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    public TemperatureConverterTestKelvinToCelsius() {
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
    public void TemperatureConverter_Test_Kelvin_To_Celsius_Return_Null() {
        //Arrange
        String value = null;

        //Act
        String result = temperatureConverter.kelvinToCelsius(value);

        //Assert
        assertNull(result);

    }

    @Test
    public void TemperatureConverter_Test_Kelvin_To_Celsius_Return_Thirty_Sixth() {
        //Arrange
        String value = "310";

        //Act
        String result = temperatureConverter.kelvinToCelsius(value);

        //Assert
        assertNotNull(result);

        assertEquals("36.85", result);

    }

    @Test
    public void TemperatureConverter_Test_Kelvin_To_Celsius_Return_Multiple_Values() {
        //Arrange
        String value1 = "42";
        String value2 = "37";
        String value3 = "300";

        //Act
        String result1 = temperatureConverter.kelvinToCelsius(value1);
        String result2 = temperatureConverter.kelvinToCelsius(value2);
        String result3 = temperatureConverter.kelvinToCelsius(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("-231.15", result1);
        assertEquals("-236.15", result2);
        assertEquals("26.85", result3);

    }

    @Test
    public void TemperatureConverter_Test_Kelvin_To_Celsius_Return_Decimal_Numbers() {
        //Arrange
        String value1 = "32.27";
        String value2 = "42.36";
        String value3 = "27.49";

        //Act
        String result1 = temperatureConverter.kelvinToCelsius(value1);
        String result2 = temperatureConverter.kelvinToCelsius(value2);
        String result3 = temperatureConverter.kelvinToCelsius(value3);

        //Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertEquals("-240.88", result1);
        assertEquals("-230.79", result2);
        assertEquals("-245.66", result3);

    }

    @Test
    public void TemperatureConverter_Test_Kelvin_To_Celsius_Return_Absolute_Zero() {
        //Arrange
        String value = "0";

        //Act
        String result = temperatureConverter.kelvinToCelsius(value);

        //Assert
        assertNotNull(result);

        assertEquals("-273.15", result);

    }

    @Test
    public void TemperatureConverter_Test_Kelvin_To_Celsius_Return_Exception() {
        //Arrange
        String value = "-10";
        ArithmeticException exception = null;

        //Act
        try {
            String result = temperatureConverter.kelvinToCelsius(value);
        } catch (ArithmeticException e) {
            exception = e;
        }

        //Assert
        assertNotNull(exception);

        assertEquals("result cannot be greater than absolute zero!", exception.getMessage());

    }

}
