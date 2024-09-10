
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * method main nó nằm ở linearSearchProgram nơi chương trình bắt đầu chạy
 * Ý nghĩa: đặt tên phải có ý nghĩa
 * Static: khi nào dùng khi các biến, method cần được khởi tạo cùng với chương trình
 * @author Admin
 */
public class TestClass {
    public static void main(String[] args) {
        // new: từ khóa thể hiện đây là một đối tượng mới
        TestClass linearSearchProgram = new TestClass();
        Scanner sc = new Scanner(System.in);
        
        linearSearchProgram.test();
    }
    
    /**
     * public: access modify
     * static: vùng tĩnh
     * int: kiểu trả về
     * test: tên method
     * @return 
     */
    public int test(){
        System.out.println("123");
        return  1;
    }
    
}
