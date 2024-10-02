/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int n = 150; // In ra dãy Fibonacci với 45 phần tử
        int[] arr = new int[n];

        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

        // Gọi phương thức đệ quy để tính Fibonacci và lưu kết quả trong mảng
        int[] resultArray = fibonacciCalculator.fibonacciCalculator(arr, 0);

        System.out.println("The 45 sequence fibonacci:");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i != resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
