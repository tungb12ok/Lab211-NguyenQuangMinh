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

    public int[] generateArray(int numberOfArray) {
        int[] arr = new int[numberOfArray];
//        for (int i : arr) {
//            i = (int) Math.random();
//        }
        // mỗi một lượt +1
        // 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (numberOfArray + 1));
        }
        return arr;
    }

    public void displayArray(int[] arr) {
        System.out.print("The array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public int search(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
