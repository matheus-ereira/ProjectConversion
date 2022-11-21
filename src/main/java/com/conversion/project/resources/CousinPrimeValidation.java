package com.conversion.project.resources;

/**
 *
 * @author matheus
 */
public class CousinPrimeValidation {

    
    public boolean validateNumber(String number) {

        Integer cousinPrimeNumber;
        
        if (number == null) return false;
        
        try{
            cousinPrimeNumber = formattedNumber(number);
        }catch(NumberFormatException e){
            throw new NumberFormatException("it is necessary to pass a valid number!");
        }
        
        if (cousinPrimeNumber == 0 || cousinPrimeNumber == 1 || cousinPrimeNumber == 4) {            
            return false;
        }
        
        for (int x = 2; x < cousinPrimeNumber / 2; x++) {
            if (cousinPrimeNumber % x == 0){
                return false;
            }            
        }
        
        return true;
    }
    
    public Integer formattedNumber(String value) throws NumberFormatException{

        String valueFormatted = value.replaceAll(",", ".");        
        return Integer.valueOf(valueFormatted);
    }
}
