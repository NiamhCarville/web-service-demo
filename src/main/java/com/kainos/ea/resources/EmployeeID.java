package com.kainos.ea.resources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeID {

    //SETS EMPLOYEE ID TO METHODS I CAN CALL
    private int EmployeeID;
    public int getEmployeeID() { return EmployeeID; }
    public void setEmployeeID(int text) { this.EmployeeID = text; }
    @JsonCreator
    public EmployeeID(@JsonProperty("int") int input) {
        this.setEmployeeID(input);
    }
}
