
package com.conversion.project.resources;

/**
 *
 * @author mathe
 */
public class ApplicationUtils {
    
    TemperatureConverter temperatureConverter = new TemperatureConverter();
<<<<<<< HEAD
=======
    CousinPrimeValidation cousinPrimeValidation = new CousinPrimeValidation();
>>>>>>> master

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
<<<<<<< HEAD
=======
    
    public String chooseTratament(String value){
        String result;
        
        if (isNullOrEmpty(value)) {
            return null;
        }
        
        boolean funcValue = cousinPrimeValidation.validateNumber(value);
        
        if(funcValue){
            result = "The value " + value + " is a prime number.";
        }else{
            result = "The value " + value + " is not a prime number.";
        }
        
        return result;
    }
>>>>>>> master

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
<<<<<<< HEAD
=======
    
    public String choose(String value) {
        
        String option = value.toLowerCase();
        
        switch (option) {
            case "sair":
            case "exit":
            case "Exit":
            case "3":
            case "3 - sair":
                return "exit";
            case "Temperature Converter":
            case "temperature converter":
            case "temperatureconverter":
            case "1":
            case "1 - Temperature Converter":
                return "Temperature Converter";
            case "Validate Prime Number":
            case "validate prime number":
            case "validateprimenumber":
            case "2":
            case "2 - Validate Prime Number":
                return "Prime Number";
            default:
                break;
        }
        return null;
    }
>>>>>>> master
}
