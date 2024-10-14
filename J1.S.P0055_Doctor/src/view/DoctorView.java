/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Doctor;
import validate.Validation;
import java.util.HashMap;

public class DoctorView {

    private Validation validation = new Validation();
    
    public Doctor inputDoctorDetails() {
        String code = validation.checkEmpty("Enter doctor code: ");
        String name = validation.checkEmpty("Enter doctor name: ");
        String specialization = validation.checkEmpty("Enter specialization: ");
        int availability = validation.checkPositiveNumber("Enter availability (hours/week): ");
        
        return new Doctor(code, name, specialization, availability);
    }

    public void displayDoctor(Doctor doctor) {
        System.out.printf("%-10s %-15s %-15s %-10d\n", 
                          doctor.getCode(), 
                          doctor.getName(), 
                          doctor.getSpecialization(), 
                          doctor.getAvailability());
    }

    public void displayDoctorList(HashMap<String, Doctor> doctors) {
        System.out.println("--------- Result ------------");
        System.out.printf("%-10s %-15s %-15s %-10s\n", 
                          "Code", "Name", "Specialization", "Availability");
        for (Doctor doctor : doctors.values()) {
            displayDoctor(doctor);
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
