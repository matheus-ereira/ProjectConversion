
package com.conversion.project.resources;

/**
 *
 * @author mathe
 */
public class ApplicationUtils {
    
    TemperatureConverter temperatureConverter = new TemperatureConverter();

    public String conversionTratament(String option1, String option2, String value) throws NumberFormatException, ArithmeticException{

        String result = null;
        
        if (isNullOrEmpty(option1) || isNullOrEmpty(option2) || isNullOrEmpty(value)) {
            return null;
        }

        //Kelvin conversion
        if (formatType(option1).equals("Kelvin") && formatType(option2).equals("Celsius")) {
            result = temperatureConverter.kelvinToCelsius(value);
        }else if (formatType(option1).equals("Kelvin") && formatType(option2).equals("Fahrenheit")){
            result = temperatureConverter.kelvinToFahrenheit(value);
        }//Celsius conversion
        else if (formatType(option1).equals("Celsius") && formatType(option2).equals("Kelvin")){            
            result = temperatureConverter.celsiusToKelvin(value);
        }else if (formatType(option1).equals("Celsius") && formatType(option2).equals("Fahrenheit")){
            result = temperatureConverter.celsiusToFahrenheit(value);
        }//Fahrenheit conversion
        else if (formatType(option1).equals("Fahrenheit") && formatType(option2).equals("Celsius")){
            result = temperatureConverter.fahrenheitToCelsius(value);
        }else if (formatType(option1).equals("Fahrenheit") && formatType(option2).equals("Kelvin")){
            result = temperatureConverter.fahrenheitToKelvin(value);
        }       
        
        return result;
    }

    public boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }

    public String formatType(String value) {
        
        String option = value.toLowerCase();
        
        switch (option) {
            case "sair":
            case "4":
            case "4 - sair":
                return "exit";
            case "kelvin":
            case "1":
            case "1 - kelvin":
                return "Kelvin";
            case "celsius":
            case "2":
            case "2 - celsius":
                return "Celsius";
            case "fahrenheit":
            case "3":
            case "3 - fahrenheit":
                return "Fahrenheit";
            default:
                break;
        }
        return null;
    }
}
