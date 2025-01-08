/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0061_calculatorshapeprogram;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {

    public Scanner scanner = new Scanner(System.in);

    public String checkEmpty(String mess, String messError) {
        System.out.println(mess);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println(messError);
            } else {
                return input;
            }
        }
    }

    public double checkPositiveNumber(String mess, String messError) {
            while (true) {
                try {
                    double input = Double.parseDouble(checkEmpty(mess, messError));
                    if (input > 0) {
                        return input;
                    } else {
                        System.out.println(messError);
                    }
                } catch (Exception e) {
                    System.out.println("Must be integer!");
                }
            }
        }
    // nhấn shift + f6 để run main ở class Validation
    public static void main(String[] args) {
        Validation validation = new Validation();

        String a = validation.checkEmpty("Enter a:", "Not empty!");

        System.out.println("a = " + a);
    }
}