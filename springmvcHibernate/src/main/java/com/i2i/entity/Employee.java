package com.i2i.entity;

import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@MappedSuperclass
public class Employee{


    private String employeeId;

    @NotNull
    private String employeeName;

    @NotNull
    private String employeeEmail;
    @NotNull
    private long employeeMobileNumber;

    @NotNull
    private LocalDate employeeDateOfJoin;

    @NotNull
    private LocalDate employeeDateOfBirth;

    private int isActiveEmployee;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public long getEmployeeMobileNumber() {
        return employeeMobileNumber;
    }

    public void setEmployeeMobileNumber(long employeeMobileNumber) {
        this.employeeMobileNumber = employeeMobileNumber;
    }

    public LocalDate getEmployeeDateOfJoin() {
        return employeeDateOfJoin;
    }

    public void setEmployeeDateOfJoin(String employeeDateOfJoin) {

        this.employeeDateOfJoin = LocalDate.parse(employeeDateOfJoin);}


    public LocalDate getEmployeeDateOfBirth() {
        return employeeDateOfBirth;
    }

    public void setEmployeeDateOfBirth(String employeeDateOfBirth) {
        this.employeeDateOfBirth = LocalDate.parse(employeeDateOfBirth);
    }

    public int getIsActiveEmployee() {
        return isActiveEmployee;
    }

    public void setIsActiveEmployee(int isActiveEmployee) {
        this.isActiveEmployee = isActiveEmployee;
    }

    public int getAgeFromDateOfBirth() {
        LocalDate currentDate = LocalDate.now();
        if (employeeDateOfBirth != null) {
            return (Period.between(employeeDateOfBirth, currentDate).getYears());
        } else {
            return 0;
        }
    }

    public int getExperienceFromDateOfJoin() {
        LocalDate currentDate = LocalDate.now();
        if (employeeDateOfJoin != null) {
            return (Period.between(employeeDateOfJoin, currentDate).getYears());
        } else {
            return 0;
        }
    }
}
