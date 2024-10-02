/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.History;
import model.Worker;

/**
 *
 * @author Admin
 */
public class HistoryManagement {
    private List<History> listHistory = new ArrayList<>();

    public HistoryManagement() {
    }
    
    public void addHistory(History history){
        listHistory.add(history);
    }
    public List<History> getListHistory(){
        return listHistory;
    }
    
}
