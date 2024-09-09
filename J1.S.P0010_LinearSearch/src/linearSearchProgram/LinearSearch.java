/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linearSearchProgram;

import validate.Validation;

/**
 *
 * @author Admin
 */
public class LinearSearch {

    public static void main(String[] args) {
        Validation validation = new Validation();
        ArrayInteraction interaction = new ArrayInteraction();

        int numberOfArray = validation.checkPositiveNumber("Enter number of array:", "Input must be positive number!");
        int searchValue = validation.checkPositiveNumber("Enter search value:", "Input must be positive number!");
        int[] arr = interaction.generateArray(numberOfArray);
        int index = interaction.search(arr, searchValue);
        interaction.displayArray(arr);
        if (index == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("Found " + searchValue + " at index: " + index);
        }
    }
}
