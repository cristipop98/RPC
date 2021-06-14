package com.example.rmiclient;

import java.io.Serializable;
import java.util.UUID;


public class MedicationPlanRPC implements Serializable {

    private UUID id;


    private String medicationList;


    private String intervals;


    private int period;

    public MedicationPlanRPC(){
    }

    public MedicationPlanRPC(String medicationList,String intervals,int period){
        this.medicationList=medicationList;
        this.intervals=intervals;
        this.period=period;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(String medicationList) {
        this.medicationList = medicationList;
    }

    public String getIntervals() {
        return intervals;
    }

    public void setIntervals(String intervals) {
        this.intervals = intervals;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "MedicationPlanRPC{" +
                "id=" + id +
                ", medicationList='" + medicationList + '\'' +
                ", intervals='" + intervals + '\'' +
                ", period=" + period +
                '}';
    }
}