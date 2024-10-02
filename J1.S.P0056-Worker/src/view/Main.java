/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.WorkerServices;
import validate.Validation;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        WorkerServices workerServices = new WorkerServices();
        Validation validation = new Validation();

        while (true) {
            System.out.println("1.Add Worker\n"
                    + "2.Up salary\n"
                    + "3.Down salary\n"
                    + "4.Display Information salary\n"
                    + "5.Exit");
            int choice = validation.checkIntLimit("Enter choice: ", 1, 5);

            switch (choice) {
                case 1:
                    workerServices.addWorker();
                    break;
                case 2:
                    workerServices.UpDownSalary(1);
                    break;
                case 3:
                    workerServices.UpDownSalary(2);
                    break;
                case 4:
                    workerServices.DisplayWorker();
                    break;
                case 5:
                    return;
            }
        }
    }
}
