/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linearSearchProgram;

import validate.Validation;

/**
 * gợi ý code: ctrl + space
 * for: for sau đó ctrl + space
 * if
 * print: sout ctrl + space
 * @author Admin
 */
public class LinearSearch {

    public static void main(String[] args) {
        // tạo object để sử dụng các method trong class đó
        Validation validation = new Validation();
        ArrayInteraction interaction = new ArrayInteraction();
        
        // in và nhập input numberOfArray và validate
        int numberOfArray = validation.checkPositiveNumber("Enter number of array:", "Input must be positive number!");
        // in và nhập input searchValue và validate
        int searchValue = validation.checkPositiveNumber("Enter search value:", "Input must be positive number!");
        // tạo array hứng khi gọi generateArray -> array int[] - tạo mảng với các số ngẫu nhiên
        int[] arr = interaction.generateArray(numberOfArray);
        // sau khi có array này -> tìm kiếm - > search -> kết quả (index: vị trí của nó trong mảng đấy)
        int index = interaction.search(arr, searchValue);
        // hiển thị array
        interaction.displayArray(arr);
        // Hiển thị kết quả 
        // test thử này
        if (index == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("Found " + searchValue + " at index: " + index);
        }
    }
}
