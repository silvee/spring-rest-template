package com.silvee.vo;


/**
 * ValueObject classes used to specify classes that contain only that data that can be shown to users
 */
public class UserVO {
    private Long userId;
    private String firstName;
    private String lastName;
    private Integer salary;

    //getters and setters

    public Long getUserId() {      return userId;    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
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
