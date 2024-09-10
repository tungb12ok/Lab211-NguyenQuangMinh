/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linearSearchProgram;

/**
 *
 * @author Admin
 */
public class ArrayInteraction {

    // Tự động tạo 1 array bao gôm các số ngẫu nhiên
    public int[] generateArray(int numberOfArray) {
        int[] arr = new int[numberOfArray];
//        for (int i : arr) {
//            i = (int) Math.random();
//        }
        // mỗi một lượt +1
        // 
        // với mỗi phần tử của mảng gắn với một số random
        for (int i = 0; i < arr.length; i++) {
            // Math.random() * (numberOfArray + 1) -> 1 <=  random  <= numberOfRandom
            arr[i] = (int) (Math.random() * (numberOfArray + 1));
        }
        return arr;
    }

    public void displayArray(int[] arr) {
        System.out.print("The array: [");
        // bắt đầu in ra số
        for (int i = 0; i < arr.length; i++) {
            // in các số trong mảng
            System.out.print(arr[i]);
            // 
                if(i != arr.length - 1){
                    System.out.print(", ");
                }
        }
        
        System.out.println("]");
    }
    // tìm kiếm với thuật toán linearSearch
    public int search(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        // không tìm thấy
        return -1;
    }

}
