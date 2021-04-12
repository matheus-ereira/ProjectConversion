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
            System.out.println("-----------------------------------------BEM-VINDO AO CONVERSOR DE TEMPERATURA DA BITWAY-----------------------------------------------------");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
            String option = "nothing to do";

            do {
                System.out.println("\n"
                        + "Olá, digite formato de entrada. \n"
                        + "1 - Kelvin\n"
                        + "2 - Celsius\n"
                        + "3 - Fahrenheit\n"
                        + "4 - Sair"
                        + "\n");
                String varTemp = reader.next();
                String option1 = applicationUtils.formatType(varTemp);

                if (applicationUtils.isNullOrEmpty(option1) || option1.equals("exit")) {
                    option = "exit";
                    continue;
                }

                System.out.println("\n"
                        + "Digite o valor a ser convertido: ");
                String value = reader.next();

                System.out.println("\n"
                        + "Por favor, digite formato de saida. \n"
                        + "1 - Kelvin\n"
                        + "2 - Celsius\n"
                        + "3 - Fahrenheit\n"
                        + "4 - Sair"
                        + "\n");
                varTemp = reader.next();
                String option2 = applicationUtils.formatType(varTemp);

                if (applicationUtils.isNullOrEmpty(option2) || option2.equals("exit")) {
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
                            + "Digite um valor valido!");
                } catch (ArithmeticException arithmeticException) {
                    System.out.println("\n"
                            + arithmeticException.getMessage());
                    break;
                }

                if (applicationUtils.isNullOrEmpty(result)){
                    System.out.println("\n"
                        + "Digite uma opção valida");
                    continue;
                }
                
                System.out.println("\n"
                        + "O valor convertido é: " + result + " " + option2);

            } while (!option.equals("exit"));

            System.out.println("\n"
                    + "---------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------FIM-------------------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
