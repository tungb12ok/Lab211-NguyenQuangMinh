/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.WorkerServices;
import view.Validation;
import view.MenuInterface;
import view.Validation;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        WorkerServices workerServices = new WorkerServices();
        Validation validation = new Validation();
        MenuInterface  menuInterface = new MenuInterface();

        while (true) {
            int choice = menuInterface.showMenu();

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
