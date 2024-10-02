/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {

    // biến cục bộ
    public Scanner scanner = new Scanner(System.in);

    public String checkEmpty(String mess) {
        System.out.println(mess);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Not empty!");
            } else {
                return input;
            }
        }
    }

    public int checkPositiveNumber(String mess) {
        while (true) {
            try {
                int input = Integer.parseInt(checkEmpty(mess));
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("Input must be than 0!");
                }
            } catch (Exception e) {
                System.out.println("Must be integer!");
            }
        }
    }
    public double checkSalaryPositiveNumber(String mess) {
        while (true) {
            try {
                double input = Double.parseDouble(checkEmpty(mess));
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("Input must be than 0!");
                }
            } catch (Exception e) {
                System.out.println("Must be Double!");
            }
        }
    }

    public int checkIntLimit(String mess, int min, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(checkEmpty(mess));
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.err.println("Input must in range: " + min + "->" + max);
                }
            } catch (Exception e) {
                System.err.println("Must be integer!");
            }
        }
    }
    public String getCurrentDay() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate currentDate = LocalDate.now();
        return currentDate.format(formatter);
    }
    // nhấn shift + f6 để run main ở class Validation
    public static void main(String[] args) {
        Validation validation = new Validation();
        System.out.println("Day: "+validation.getCurrentDay());
    }
}
