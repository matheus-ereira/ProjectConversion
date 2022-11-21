package com.conversion.project;

import com.conversion.project.resources.ApplicationUtils;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class ProjectApplication {

    public static void main(String[] args) {
        ApplicationUtils applicationUtils = new ApplicationUtils();

        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("-----------------------------------------WELCOME TO THE TEMPERATURE CONVERTER AND PRIME NUMBER VALIDATOR-----------------------------------------------------");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
            String option = "nothing to do";

            do {
                System.out.println("\n"
                        + "Please enter function to be used. \n"
                        + "1 - Temperature Converter\n"
                        + "2 - Validate Prime Number\n"
                        + "3 - Exist"
                        + "\n");
                String var = reader.next();
                String choose = applicationUtils.choose(var);
                
                if(choose.equals("Temperature Converter")){
                    
                    System.out.println("\n"
                        + "Hello, enter input format. \n"
                        + "1 - Kelvin\n"
                        + "2 - Celsius\n"
                        + "3 - Fahrenheit\n"
                        + "4 - Exist"
                        + "\n");
                    String varTemp = reader.next();
                    String option1 = applicationUtils.formatType(varTemp);

                    if (applicationUtils.isNullOrEmpty(option1) || option1.equals("Exit") || option1.equals("exit")) {
                        option = "exit";
                        continue;
                    }

                    System.out.println("\n"
                            + "Enter the value to be converted: ");
                    String value = reader.next();

                    System.out.println("\n"
                            + "Please enter output format. \n"
                            + "1 - Kelvin\n"
                            + "2 - Celsius\n"
                            + "3 - Fahrenheit\n"
                            + "4 - Exist"
                            + "\n");
                    varTemp = reader.next();
                    String option2 = applicationUtils.formatType(varTemp);

                    if (applicationUtils.isNullOrEmpty(option2) || option2.equals("Exit") || option2.equals("exit")) {
                        option = "exit";
                        continue;
                    }

                    String result = null;

                    try {
                        result = applicationUtils.conversionTratament(option1, option2, value);
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("\n"
                                + numberFormatException.getMessage());
                        System.out.println("\n"
                                + "Enter a valid value!");
                    } catch (ArithmeticException arithmeticException) {
                        System.out.println("\n"
                                + arithmeticException.getMessage());
                        break;
                    }

                    if (applicationUtils.isNullOrEmpty(result)){
                        System.out.println("\n"
                            + "Enter a valid option");
                        continue;
                    }

                    System.out.println("\n"
                            + "The converted value is: " + result + " " + option2);
                    
            }else if(choose.equals("Prime Number")){
                System.out.println("\n"
                        + "hello enter a number or type exit. \n");
                String value = reader.next();
                
                if (applicationUtils.isNullOrEmpty(value) || value.equals("Exit") || value.equals("exit")) {
                        option = "exit";
                        continue;
                    }
                                
                String result = null;
                
                try {
                        result = applicationUtils.chooseTratament(value);
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("\n"
                                + numberFormatException.getMessage());
                        System.out.println("\n"
                                + "Enter a valid value!");
                    }
                
                    System.out.println("\n"
                            + result);               
                }
            } while (!option.equals("exit"));

            System.out.println("\n"
                              +"---------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------END-------------------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
