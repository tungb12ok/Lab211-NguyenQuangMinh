/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validate;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {
    // biến cục bộ
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

    public int checkPositiveNumber(String mess, String messError) {
        while (true) {
            int input = Integer.parseInt(checkEmpty(mess, messError));

            if (input > 0) {
                return input;
            }else{
                System.out.println(messError);
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
