package com.silvee.vo;

import javax.validation.constraints.NotNull;

public class CreateUserVO {
    @NotNull(message = "username can not be null")
    private String firstName;
    private String lastName;
    private Integer salary;

    //getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer mmr) {
        this.salary = salary;
    }
}