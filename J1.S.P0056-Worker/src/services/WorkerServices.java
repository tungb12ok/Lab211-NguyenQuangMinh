/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.History;
import model.Worker;
import view.Validation;

/**
 *
 * @author Admin
 */
public class WorkerServices {

    Validation validation = new Validation();
    WorkerManagement workerManagement;
    HistoryManagement historyManagement;

    public WorkerServices() {
        workerManagement = new WorkerManagement();
        historyManagement = new HistoryManagement();
    }

    public void addWorker() {
        System.out.println("--------- Add Worker ----------");
        String id = validation.checkEmpty("Enter code:");
        String name = validation.checkEmpty("Enter name:");
        int age = validation.checkIntLimit("Enter age:", 18, 50);
        double salary = validation.checkSalaryPositiveNumber("Enter salary:");
        String location = validation.checkEmpty("Enter work location:");
        if (workerManagement.getId(id) == null) {
            workerManagement.add(new Worker(id, name, age, salary, location));
        } else {
            System.out.println("Code exited!");
        }
    }

    public void UpDownSalary(int mode) {
        System.out.println("------- Up/Down Salary --------");
        String code = validation.checkEmpty("Enter Code:");

        Worker worker = workerManagement.getId(code);
        if (worker == null) {
            System.out.println("Code does not exits!");
            return;
        }

        double salary = validation.checkSalaryPositiveNumber("Enter Salary:");

        switch (mode) {
            // Up
            case 1:
                // set l?i luong hi?n t?i
                worker.setSalary(worker.getSalary() + salary);
                History historyUp = new History(true, validation.getCurrentDay(), worker.getId(), worker.getName(), worker.getAge(), worker.getSalary(), worker.getWorkLocation());
                historyManagement.addHistory(historyUp);
                break;
            // Down
            case 2:
                if (salary > worker.getSalary()) {
                    System.out.println("Salary must be less than current salary");
                } else {
                    worker.setSalary(worker.getSalary() - salary);
                    History historyDown = new History(false, validation.getCurrentDay(), worker.getId(), worker.getName(), worker.getAge(), worker.getSalary(), worker.getWorkLocation());
                    historyManagement.addHistory(historyDown);
                }
                break;
        }
    }

    public void DisplayWorker() {
        List<History> listH = historyManagement.getListHistory();
        System.out.println("--------------------Display Information Salary-----------------------");
        System.out.format("%-5s%-15s%-15s%-15s%-15s%-15s", "Code", "Name", "Age", "Salary", "Status", "Date");
        System.out.println("");
        for (History history : listH) {
            System.out.println(history);
        }
    }

}
