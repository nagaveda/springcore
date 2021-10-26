package com.nagaveda.spring.springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;


public class Prescription {
    private int id;
    private String patientName;
    private List<String> medicines;

    public int getId() {
        return id;
    }

    @Required
    public void setId(int id) {
        this.id = id;
    }
    public String getPatientName() {
        return patientName;
    }

    @Required
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public List<String> getMedicnes() {
        return medicines;
    }

    @Required
    public void setmedicines(List<String> medicines) {
        this.medicines = medicines;
    }

    @Override
    public String toString() {
        return "Prescription [id=" + id + ", medicines=" + medicines + ", patientName=" + patientName + "]";
    }
    
}
