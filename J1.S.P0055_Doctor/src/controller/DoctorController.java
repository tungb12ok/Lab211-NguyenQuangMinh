/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import model.Doctor;
import validate.Validation;
import view.DoctorView;

public class DoctorController {

    private HashMap<String, Doctor> doctorDatabase = new HashMap<>();
    private DoctorView doctorView = new DoctorView();
    private Validation validation = new Validation();

    public void addDoctor() {
        Doctor doctor = doctorView.inputDoctorDetails();
        if (doctorDatabase.containsKey(doctor.getCode())) {
            doctorView.displayMessage("Doctor code already exists!");
        } else {
            doctorDatabase.put(doctor.getCode(), doctor);
            doctorView.displayMessage("Doctor added successfully!");
        }
    }

    public void updateDoctor() {
        String code = new Validation().checkEmpty("Enter doctor code to update: ");
        if (doctorDatabase.containsKey(code)) {
            Doctor updatedDoctor = doctorView.inputDoctorDetails();
            doctorDatabase.put(code, updatedDoctor);
            doctorView.displayMessage("Doctor updated successfully!");
        } else {
            doctorView.displayMessage("Doctor code does not exist.");
        }
    }

    public void deleteDoctor() {
        String code = new Validation().checkEmpty("Enter doctor code to delete: ");
        if (doctorDatabase.containsKey(code)) {
            doctorDatabase.remove(code);
            doctorView.displayMessage("Doctor deleted successfully!");
        } else {
            doctorView.displayMessage("Doctor code does not exist.");
        }
    }

    public void searchDoctor() {
        String code = validation.stringInput("Enter doctor code to search (leave empty to list all): ");

        if (code.isEmpty()) {
            if (doctorDatabase.isEmpty()) {
                doctorView.displayMessage("No doctors available in the system.");
            } else {
                doctorView.displayDoctorList(doctorDatabase); // Show all doctors
            }
        } else {
            if (doctorDatabase.containsKey(code)) {
                Doctor doctor = doctorDatabase.get(code);
                doctorView.displayDoctor(doctor);
            } else {
                doctorView.displayMessage("Doctor code does not exist.");
            }
        }
    }

    public void showMenu() {
        System.out.println("1. Add Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Search Doctor");
        System.out.println("5. Exit");
    }

    public void start() {
        while (true) {
            showMenu();
            int choice = validation.checkIntLimit("Enter choice:", 1, 5);

            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    updateDoctor();
                    break;
                case 3:
                    deleteDoctor();
                    break;
                case 4:
                    searchDoctor();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
