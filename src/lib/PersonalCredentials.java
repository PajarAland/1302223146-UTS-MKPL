/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.time.LocalDate;

/**
 *
 * @author alienware
 */
public class PersonalCredentials {
    public String employeeId;
    public String firstName;
    public String lastName;
    public String idNumber;
    public String address;
    public LocalDate joinDate;
    public boolean isForeigner;
    public Gender gender;
    
    //primitive obsession
    public enum Gender {
        MALE, FEMALE
    }

    public PersonalCredentials(String employeeId, String firstName, String lastName, String idNumber,
                        String address, LocalDate joinDate, boolean isForeigner, Gender gender) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.joinDate = joinDate;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }
}
