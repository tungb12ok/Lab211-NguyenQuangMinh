/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class History extends Worker {

    private boolean status;
    private String date;

    public History() {
    }

    public History(boolean status, String date) {
        this.status = status;
        this.date = date;
    }

    public History(boolean status, String date, String id, String name, int age, double salary, String workLocation) {
        super(id, name, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String statusDisplay = this.status == true ? "UP" : "DOWN";
        return super.toString() + String.format("%-15s%-15s", statusDisplay, this.date);
    }
}
