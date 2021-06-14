package com.example.rmiclient;

import org.springframework.beans.factory.annotation.Autowired;

public class MedicationPlanRPCBean {

    @Autowired
    private MedicationPlanRpcService medicationPlanRpcService;

    public void addMedicationPlan(){
        System.out.println("--adding medicationPlan");
        MedicationPlanRPC medicationPlanRPC=new MedicationPlanRPC();
        medicationPlanRPC.setMedicationList("Nufofen,Parasinus");
        medicationPlanRPC.setIntervals("10 octombrie-10 noiembrie");
        medicationPlanRPC.setPeriod(1);
        medicationPlanRpcService.getMedicationPlanRPC(medicationPlanRPC);
    }
}
