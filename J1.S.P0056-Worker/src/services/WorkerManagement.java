/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Worker;

/**
 * Các method getId, getAll, add, update, delete
 * @author Admin
 */
public class WorkerManagement {
    private List<Worker> listWorker = new  ArrayList<>();

    public WorkerManagement() {
        
    }
    
    public Worker getId(String id){
        for (Worker worker : listWorker) {
            if(worker.getId().equals(id)){
                return worker;
            }
        }
        return null;
    }
    public List<Worker> getAll(){
        return listWorker;
    }
    
    public void add(Worker worker){
        listWorker.add(worker);
    }
    public void updateSalary(String id, Worker workerUpdate){
        Worker workerCurent = getId(id);
        workerCurent.setSalary(workerUpdate.getSalary());
    }  
}
