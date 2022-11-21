package com.conversion.project.resources;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author mathe
 */
public class TemperatureConverter {

    /**
    * Method responsible for converting the temperature from Celsius to Fahrenheit
    *
    * @param celsius temperature in celsius
    * @return returns the temperature in Fahrenheit
    */
    public String celsiusToFahrenheit(String celsius) {

        Double result;
        Double celsiusNumber;
        
        if (celsius == null) return null;
        
        try{
            celsiusNumber = formattedNumber(celsius);
        }catch(NumberFormatException e){
            throw new NumberFormatException("it is necessary to pass a valid number!");
        }
        result = ((celsiusNumber * (9.0 / 5)) + 32);
        /**
        * Validação para zero absoluto, valor minimo permitido *
        */
        if (result < -459.67) {
            throw new ArithmeticException("result cannot be greater than absolute zero!");
        }
        /**
        * Devido a problemas encontrados nos testes, foi necessario implementar
        * uma classe que faz o tratamento de arredondamento para cima nos 3
        * primeiros digitos das casas decimais
        */
        BigDecimal decimal = new BigDecimal(result).setScale(3, RoundingMode.HALF_EVEN);
        return Float.toString(decimal.floatValue());
    }

    /**
    * Method responsible for converting the temperature from Fahrenheit to Celsius
    *
    * @param fahrenheit temperature in fahrenheit
    * @return returns the temperature in Celsius
    */
    public String fahrenheitToCelsius(String fahrenheit) {

        Double result;
        Double fahrenheitNumber;
        
        if (fahrenheit == null)return null;
        
        try{
            fahrenheitNumber = formattedNumber(fahrenheit);
        }catch(NumberFormatException e){
            throw new NumberFormatException("it is necessary to pass a valid number!");
        }
        
        result = (((fahrenheitNumber) - 32) * 5) / 9;
        if (result < -273.15) {
            throw new ArithmeticException("result cannot be greater than absolute zero!");
        }
        BigDecimal decimal = new BigDecimal(result).setScale(3, RoundingMode.HALF_EVEN);
        return Double.toString(decimal.doubleValue());
    }

    /**
    * Method responsible for converting the temperature from Celsius to Kelvin
    *
    * @param celsius temperature in celsius
    * @return returns the temperature in Kelvin
    */
    public String celsiusToKelvin(String celsius) {

        Double result;
        Double celsiusNumber;
        
        if (celsius == null)return null;
        
        try{
            celsiusNumber = formattedNumber(celsius);
        }catch(NumberFormatException e){
            throw new NumberFormatException("it is necessary to pass a valid number!");
        }
        
        result = ((celsiusNumber + 273.15));
        if (result < 0) {
            throw new ArithmeticException("result cannot be greater than absolute zero!");
        }
        BigDecimal decimal = new BigDecimal(result).setScale(3, RoundingMode.HALF_EVEN);
        return Double.toString(decimal.doubleValue());
    }

    /**
    * Method responsible for converting the temperature from Kelvin to Celsius
    *
    * @param kelvin temperature in kelvin
    * @return returns the temperature in Celsius
    */
    public String kelvinToCelsius(String kelvin) {

        Double result;
        Double kelvinNumber;
        
        if (kelvin == null)return null;
        
        try{
            kelvinNumber = formattedNumber(kelvin);
        }catch(NumberFormatException e){
            throw new NumberFormatException("it is necessary to pass a valid number!");
        }
        
        result = ((kelvinNumber - 273.15));
        if (result < -273.15) {
            throw new ArithmeticException("result cannot be greater than absolute zero!");
        }
        BigDecimal decimal = new BigDecimal(result).setScale(3, RoundingMode.HALF_EVEN);
        return Double.toString(decimal.doubleValue());
    }

    /**
    * Method responsible for converting the temperature from Fahrenheit to Kelvin
    *
    * @param fahrenheit temperature in fahrenheit
    * @return returns the temperature in Kelvin
    */
    public String fahrenheitToKelvin(String fahrenheit) {

        Double result;
        Double fahrenheitNumber;
        
        if (fahrenheit == null)return null;
        
        try{
            fahrenheitNumber = formattedNumber(fahrenheit);
        }catch(NumberFormatException e){
            throw new NumberFormatException("it is necessary to pass a valid number!");
        }
        
        /** Em conversão direta, o zero absoluto de fahrenheit para kelvin retorna um valor negativo.
        * Para contornar este problema, é preciso converter primeiro de fahrenheit para celsius
        * e depois de celsius para kelvin, assim conseguimos o zero absoluto em kelvin.
        **/
        if (fahrenheitNumber.equals(-459.67)){
            String celsius = fahrenheitToCelsius(fahrenheit);
            String absoluteZero = celsiusToKelvin(celsius);
            result = Double.valueOf(absoluteZero);
        }else{            
            result = 273.15 + (((fahrenheitNumber - 32.0) * (5.0 / 9.0)));            
        }
        if (result < 0) {
                throw new ArithmeticException("result cannot be greater than absolute zero!");
            }
        BigDecimal decimal = new BigDecimal(result).setScale(3, RoundingMode.HALF_EVEN);
        return Double.toString(decimal.doubleValue());
    }

    /**
    * Method responsible for converting the temperature from Kelvin to Fahrenheit
    *
    * @param kelvin temperature in kelvin
    * @return returns the temperature in Fahrenheit
    */
    public String kelvinToFahrenheit(String kelvin) {

        Double result;
        Double kelvinNumber;
        
        if (kelvin == null)return null;
        
        try{
            kelvinNumber = formattedNumber(kelvin);
        }catch(NumberFormatException e){
            throw new NumberFormatException("it is necessary to pass a valid number!");
        }
        
        result = ((kelvinNumber - 273.15) * 1.8) + 32;
        if (result < -459.67) {
            throw new ArithmeticException("result cannot be greater than absolute zero!");
        }
        BigDecimal decimal = new BigDecimal(result).setScale(3, RoundingMode.HALF_EVEN);
        return Double.toString(decimal.doubleValue());
    }
    
    public Double formattedNumber(String value) throws NumberFormatException{

        String valueFormatted = value.replaceAll(",", ".");        
        return Double.valueOf(valueFormatted);
    }
}
