package com.conversion.project.test.TemperatureConverter;

import com.conversion.project.resources.ApplicationUtils;
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
public class TemperatureConverterTestAllMethods {

    TemperatureConverter temperatureConverter = new TemperatureConverter();
    ApplicationUtils applicationUtils = new ApplicationUtils();

    public TemperatureConverterTestAllMethods() {
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
    public void TemperatureConverter_Test_All_Methods_Return_Null() {
        //Arrange
        String value = null;

        //Act
        String resultKelvin1 = temperatureConverter.kelvinToFahrenheit(value);
        String resultKelvin2 = temperatureConverter.kelvinToCelsius(value);

        String resultFahrenheit1 = temperatureConverter.fahrenheitToCelsius(value);
        String resultFahrenheit2 = temperatureConverter.fahrenheitToKelvin(value);

        String resultCelsius1 = temperatureConverter.celsiusToFahrenheit(value);
        String resultCelsius2 = temperatureConverter.celsiusToKelvin(value);

        //Assert
        assertNull(resultKelvin1);
        assertNull(resultKelvin2);

        assertNull(resultFahrenheit1);
        assertNull(resultFahrenheit2);

        assertNull(resultCelsius1);
        assertNull(resultCelsius2);

    }

    @Test
    public void TemperatureConverter_Test_All_Methods_Return_In_Celsius() {
        //Arrange
        String fahrenheit = "230";
        String kelvin = "337";

        //Act
        String resultCelsius1 = temperatureConverter.fahrenheitToCelsius(fahrenheit);
        String resultCelsius2 = temperatureConverter.kelvinToCelsius(kelvin);

        //Assert
        assertNotNull(resultCelsius1);
        assertNotNull(resultCelsius2);

        assertEquals("110.0", resultCelsius1);
        assertEquals("63.85", resultCelsius2);

    }

    @Test
    public void TemperatureConverter_Test_All_Methods_Return_In_Fahrenheit() {
        //Arrange
        String celsius = "36";
        String kelvin = "320";

        //Act
        String resultFahrenheit1 = temperatureConverter.celsiusToFahrenheit(celsius);
        String resultFahrenheit2 = temperatureConverter.kelvinToFahrenheit(kelvin);

        //Assert
        assertNotNull(resultFahrenheit1);
        assertNotNull(resultFahrenheit2);

        assertEquals("96.8", resultFahrenheit1);
        assertEquals("116.33", resultFahrenheit2);

    }

    @Test
    public void TemperatureConverter_Test_All_Methods_Return_In_Kelvin() {
        //Arrange
        String celsius = "36";
        String fahrenheit = "120";

        //Act
        String resultKelvin1 = temperatureConverter.celsiusToKelvin(celsius);
        String resultKelvin2 = temperatureConverter.fahrenheitToKelvin(fahrenheit);

        //Assert
        assertNotNull(resultKelvin1);
        assertNotNull(resultKelvin2);

        assertEquals("309.15", resultKelvin1);
        assertEquals("322.039", resultKelvin2);

    }

    @Test
    public void TemperatureConverter_Test_All_Methods_Return_Absolute_Zero() {
        //Arrange
        String celsius = "-273.15";
        String fahrenheit = "-459.67";
        String kelvin = "0";

        //Act
        String resultKelvin1 = temperatureConverter.kelvinToFahrenheit(kelvin);
        String resultKelvin2 = temperatureConverter.kelvinToCelsius(kelvin);

        String resultFahrenheit1 = temperatureConverter.fahrenheitToCelsius(fahrenheit);
        String resultFahrenheit2 = temperatureConverter.fahrenheitToKelvin(fahrenheit);

        String resultCelsius1 = temperatureConverter.celsiusToFahrenheit(celsius);
        String resultCelsius2 = temperatureConverter.celsiusToKelvin(celsius);

        //Assert
        assertNotNull(resultKelvin1);
        assertNotNull(resultKelvin2);

        assertNotNull(resultFahrenheit1);
        assertNotNull(resultFahrenheit2);

        assertNotNull(resultCelsius1);
        assertNotNull(resultCelsius2);

        assertEquals("-459.67", resultKelvin1);
        assertEquals("-273.15", resultKelvin2);

        assertEquals("-273.15", resultFahrenheit1);
        assertEquals("0.0", resultFahrenheit2);

        assertEquals("-459.67", resultCelsius1);
        assertEquals("0.0", resultCelsius2);

    }
    
    @Test
    public void TemperatureConverter_Test_All_Methods_Return_Absolute_Zero_With_Invalid_Character() {
        //Arrange
        String celsius = "-273,15";
        String fahrenheit = "-459,67";
        String kelvin = "0";

        //Act
        String resultKelvin1 = temperatureConverter.kelvinToFahrenheit(kelvin);
        String resultKelvin2 = temperatureConverter.kelvinToCelsius(kelvin);

        String resultFahrenheit1 = temperatureConverter.fahrenheitToCelsius(fahrenheit);
        String resultFahrenheit2 = temperatureConverter.fahrenheitToKelvin(fahrenheit);

        String resultCelsius1 = temperatureConverter.celsiusToFahrenheit(celsius);
        String resultCelsius2 = temperatureConverter.celsiusToKelvin(celsius);

        //Assert
        assertNotNull(resultKelvin1);
        assertNotNull(resultKelvin2);

        assertNotNull(resultFahrenheit1);
        assertNotNull(resultFahrenheit2);

        assertNotNull(resultCelsius1);
        assertNotNull(resultCelsius2);

        assertEquals("-459.67", resultKelvin1);
        assertEquals("-273.15", resultKelvin2);

        assertEquals("-273.15", resultFahrenheit1);
        assertEquals("0.0", resultFahrenheit2);

        assertEquals("-459.67", resultCelsius1);
        assertEquals("0.0", resultCelsius2);

    }

    @Test
    public void TemperatureConverter_Test_All_Methods_Return_ArithmeticException() {
        //Arrange
        String celsius = "-290.15";
        String fahrenheit = "-480.67";
        String kelvin = "-10";

        ArithmeticException exception1 = null;
        ArithmeticException exception2 = null;
        ArithmeticException exception3 = null;
        ArithmeticException exception4 = null;
        ArithmeticException exception5 = null;
        ArithmeticException exception6 = null;

        //Act
        //
        try {
            String resultKelvin1 = temperatureConverter.kelvinToFahrenheit(kelvin);
        } catch (ArithmeticException e) {
            exception1 = e;
        }
        
        try {
            String resultKelvin2 = temperatureConverter.kelvinToCelsius(kelvin);
        } catch (ArithmeticException e) {
            exception2 = e;
        }
        
        try {
            String resultFahrenheit1 = temperatureConverter.fahrenheitToCelsius(fahrenheit);
        } catch (ArithmeticException e) {
            exception3 = e;
        }
        
        try {
            String resultFahrenheit2 = temperatureConverter.fahrenheitToKelvin(fahrenheit);
        } catch (ArithmeticException e) {
            exception4 = e;
        }
        
        try {
            String resultCelsius1 = temperatureConverter.celsiusToFahrenheit(celsius);
        } catch (ArithmeticException e) {
            exception5 = e;
        }
        
        try {
            String resultCelsius2 = temperatureConverter.celsiusToKelvin(celsius);
        } catch (ArithmeticException e) {
            exception6 = e;
        }

        //Assert
        assertNotNull(exception1);
        assertNotNull(exception2);
        assertNotNull(exception3);
        assertNotNull(exception4);
        assertNotNull(exception5);
        assertNotNull(exception6);

        assertEquals("result cannot be greater than absolute zero!", exception1.getMessage());
        assertEquals("result cannot be greater than absolute zero!", exception2.getMessage());
        assertEquals("result cannot be greater than absolute zero!", exception3.getMessage());
        assertEquals("result cannot be greater than absolute zero!", exception4.getMessage());
        assertEquals("result cannot be greater than absolute zero!", exception5.getMessage());
        assertEquals("result cannot be greater than absolute zero!", exception6.getMessage());

    }
    
    @Test
    public void TemperatureConverter_Test_All_Methods_Return_NumberFormatException() {
        //Arrange
        String celsius = "AAAAAAAAAAA";
        String fahrenheit = "BBBBBBBBB";
        String kelvin = "CCCCCCCCCCC";

        NumberFormatException exception1 = null;
        NumberFormatException exception2 = null;
        NumberFormatException exception3 = null;
        NumberFormatException exception4 = null;
        NumberFormatException exception5 = null;
        NumberFormatException exception6 = null;

        //Act
        //
        try {
            String resultKelvin1 = temperatureConverter.kelvinToFahrenheit(kelvin);
        } catch (NumberFormatException e) {
            exception1 = e;
        }
        
        try {
            String resultKelvin2 = temperatureConverter.kelvinToCelsius(kelvin);
        } catch (NumberFormatException e) {
            exception2 = e;
        }
        
        try {
            String resultFahrenheit1 = temperatureConverter.fahrenheitToCelsius(fahrenheit);
        } catch (NumberFormatException e) {
            exception3 = e;
        }
        
        try {
            String resultFahrenheit2 = temperatureConverter.fahrenheitToKelvin(fahrenheit);
        } catch (NumberFormatException e) {
            exception4 = e;
        }
        
        try {
            String resultCelsius1 = temperatureConverter.celsiusToFahrenheit(celsius);
        } catch (NumberFormatException e) {
            exception5 = e;
        }
        
        try {
            String resultCelsius2 = temperatureConverter.celsiusToKelvin(celsius);
        } catch (NumberFormatException e) {
            exception6 = e;
        }

        //Assert
        assertNotNull(exception1);
        assertNotNull(exception2);
        assertNotNull(exception3);
        assertNotNull(exception4);
        assertNotNull(exception5);
        assertNotNull(exception6);

        assertEquals("it is necessary to pass a valid number!", exception1.getMessage());
        assertEquals("it is necessary to pass a valid number!", exception2.getMessage());
        assertEquals("it is necessary to pass a valid number!", exception3.getMessage());
        assertEquals("it is necessary to pass a valid number!", exception4.getMessage());
        assertEquals("it is necessary to pass a valid number!", exception5.getMessage());
        assertEquals("it is necessary to pass a valid number!", exception6.getMessage());

    }
    
    @Test
    public void TemperatureConverter_Test_All_Methods_Return_formattedNumber() {
        //Arrange
        String celsius = "36,39";
        String kelvin = "320,52";
        String fahrenheit = "320,87";

        //Act
        Double value1 = temperatureConverter.formattedNumber(celsius);
        Double value2 = temperatureConverter.formattedNumber(kelvin);
        Double value3 = temperatureConverter.formattedNumber(fahrenheit);

        //Assert
        assertNotNull(value1);
        assertNotNull(value2);
        assertNotNull(value3);

        assertEquals("36.39", value1.toString());
        assertEquals("320.52", value2.toString());
        assertEquals("320.87", value3.toString());

    }
    
    @Test
    public void TemperatureConverter_Test_All_Methods_Return_isNullOrEmpty() {
        //Arrange
        String celsius = "";
        String kelvin = null;
        String fahrenheit = "something";

        //Act
        boolean value1 = applicationUtils.isNullOrEmpty(celsius);
        boolean value2 = applicationUtils.isNullOrEmpty(kelvin);
        boolean value3 = applicationUtils.isNullOrEmpty(fahrenheit);

        //Assert
        assertNotNull(value1);
        assertNotNull(value2);
        assertNotNull(value3);
        
        assertTrue(value1);
        assertTrue(value2);
        assertFalse(value3);

    }
    
     @Test
    public void TemperatureConverter_Test_All_Methods_Return_FormatType() {
        //Arrange
        String sair1 = "4 - Sair";
        String sair2 = "Sair";
        String sair3 = "4";
        
        String kelvin1 = "1 - Kelvin";
        String kelvin2 = "Kelvin";
        String kelvin3 = "1";        
        
        String celsius1 = "2 - Celsius";
        String celsius2 = "Celsius";
        String celsius3 = "2";
        
        String fahrenheit1 = "3 - Fahrenheit";
        String fahrenheit2 = "Fahrenheit";
        String fahrenheit3 = "3";

        //Act
        String value1 = applicationUtils.formatType(sair1);
        String value2 = applicationUtils.formatType(sair2);
        String value3 = applicationUtils.formatType(sair3);
        
        String value4 = applicationUtils.formatType(kelvin1);
        String value5 = applicationUtils.formatType(kelvin2);
        String value6 = applicationUtils.formatType(kelvin3);
        
        String value7 = applicationUtils.formatType(celsius1);
        String value8 = applicationUtils.formatType(celsius2);
        String value9 = applicationUtils.formatType(celsius3);
        
        String value10 = applicationUtils.formatType(fahrenheit1);
        String value11 = applicationUtils.formatType(fahrenheit2);
        String value12 = applicationUtils.formatType(fahrenheit3);

        //Assert
        assertNotNull(value1);
        assertNotNull(value2);
        assertNotNull(value3);
        assertNotNull(value4);
        assertNotNull(value5);
        assertNotNull(value6);
        assertNotNull(value7);
        assertNotNull(value8);
        assertNotNull(value9);
        assertNotNull(value10);
        assertNotNull(value11);
        assertNotNull(value12);        
        
        assertEquals("exit", value1);
        assertEquals("exit", value2);
        assertEquals("exit", value3);
        
        assertEquals("Kelvin", value4);
        assertEquals("Kelvin", value5);
        assertEquals("Kelvin", value6);
        
        assertEquals("Celsius", value7);
        assertEquals("Celsius", value8);
        assertEquals("Celsius", value9);
        
        assertEquals("Fahrenheit", value10);
        assertEquals("Fahrenheit", value11);
        assertEquals("Fahrenheit", value12);

    }

}
