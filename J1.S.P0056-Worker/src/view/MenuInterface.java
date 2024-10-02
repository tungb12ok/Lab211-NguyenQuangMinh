/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


/**
 *
 * @author Admin
 */
public class MenuInterface {

    Validation validation = new Validation();

    public int showMenu() {
        System.out.println("1.Add Worker\n"
                + "2.Up salary\n"
                + "3.Down salary\n"
                + "4.Display Information salary\n"
                + "5.Exit");
        return validation.checkIntLimit("Enter choice:", 1, 5);
    }
}
