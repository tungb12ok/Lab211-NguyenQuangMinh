/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class FibonacciCalculator {
    // Phương thức tính Fibonacci liên tục qua các phần tử của mảng

    public int[] fibonacciCalculator(int[] arr, int index) {
        // Nếu đã đến cuối mảng, trả về mảng kết quả
        if (index >= arr.length) {
            return arr;
        }

        // Nếu index là 0 hoặc 1, giá trị Fibonacci tại index là chính nó
        if (index == 0) {
            arr[index] = 0;
        } else if (index == 1) {
            arr[index] = 1;
        } else {
            // Tính giá trị Fibonacci tại index dựa trên hai phần tử trước đó
            arr[index] = arr[index - 1] + arr[index - 2];
        }

        // Gọi đệ quy cho phần tử tiếp theo
        return fibonacciCalculator(arr, index + 1);
    }
}
